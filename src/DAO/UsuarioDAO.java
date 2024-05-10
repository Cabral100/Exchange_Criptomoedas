package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import Model.Investidor;
import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author valim
 */
public class UsuarioDAO {
    private Connection conn;
    
    public UsuarioDAO(Connection conn){
        this.conn = conn;
    }
    
    public String data(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return  sdf.format(data);
    }
    
    public ResultSet consultar(Investidor pessoa) throws SQLException{
        String sql = "select * from usuario.informacoes where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.setString(2, pessoa.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public ResultSet consultarCot(String id) throws SQLException{
        String sql = "select * from administrador.criptomoedas where id = ?";
        PreparedStatement statement = null;
        ResultSet resultado = null;
        try{
            statement = conn.prepareStatement(sql);
            statement.setString(1, id);
            statement.execute();
            resultado = statement.getResultSet();
            if (resultado.next()) {
            return resultado;
        } else {
            return null;
        }
        }catch(SQLException e){
            System.out.println(e);
        }
        return resultado;
    }
    
    public void inserirExtrato(Investidor pessoa, String mm, double quantidade) throws SQLException {
        String sql = "INSERT INTO usuario.extrato(cpf, data, tipo, valor, moeda ,cotacao, taxa, \"real\", btc, ethe, rip) "
                + "VALUES ('"+pessoa.getCpf()+"','" +data()+ "','"+mm+"','"+quantidade+"','"
                +   pessoa.getExtrato().getNomeMoeda()+"','"+pessoa.getExtrato().getCotgeral()+"',"
                + "'"+pessoa.getExtrato().getTaxageral()+"','"+pessoa.getSaldoreal()+"','"+pessoa.getSaldobtc()+"',"
                + "'"+pessoa.getSaldoethe()+"','"+pessoa.getSaldorip()+"');";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
}

    
    public void inserir(Investidor pessoa) throws SQLException{
        String sql = "insert into usuario.informacoes(nome, cpf, senha) values ('" +
                        pessoa.getNome() + "', '" +
                        pessoa.getCpf() + "', '" +
                        pessoa.getSenha() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public void excluir(Investidor pessoa) throws SQLException{
        String sql = "delete from usuario.informacoes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.execute();
        conn.close();
    }
    
    public void atualizar(Investidor pessoa) throws SQLException{
        String sql = "update usuario.informacoes set reais = ?, bitcoin = ?, ethe = ?, ripple = ? where cpf = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, pessoa.getSaldoreal());
        statement.setDouble(2, pessoa.getSaldobtc());
        statement.setDouble(3, pessoa.getSaldoethe());
        statement.setDouble(4, pessoa.getSaldorip());
        statement.setString(5, pessoa.getCpf());
        statement.setString(6, pessoa.getSenha());
        statement.execute();        
        ResultSet resultado = statement.getResultSet();
        conn.close();
    }
    
    public void atualizarCot(Investidor pessoa,String id,int indice) throws SQLException{
        String sql = "update administrador.criptomoedas set cotacao = ? where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, pessoa.getCarteira().getMoedas().get(indice).getCotacao());
        statement.setString(2,id);
        statement.execute();
        conn.close();
    }
    
    public String consultarExtrato(Investidor pessoa) throws SQLException{
        StringBuilder resultado = new StringBuilder();
        resultado.append("Nome: ").append(pessoa.getNome()).append("\nCPF: ").append(pessoa.getCpf()).append("\n\n");
        String sql = "select data,tipo,valor,moeda,cotacao,taxa,real,btc,ethe,rip FROM usuario.extrato WHERE cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,pessoa.getCpf());
        try(ResultSet result = statement.executeQuery()){
            DecimalFormat df = new DecimalFormat("#0.00");
            while(result.next()){
                String data = result.getString("data");
                String tipo = result.getString("tipo");
                double valor = result.getDouble("valor");
                String moeda = result.getString("moeda");
                double cotacao = result.getDouble("cotacao");
                double taxa = result.getDouble("taxa");
                double real = result.getDouble("real");
                double btc = result.getDouble("btc");
                double ethe = result.getDouble("ethe");
                double rip = result.getDouble("rip");
                
                /*------------------------------------------------*/
                
                String valorF = df.format(valor).replace(',', '.');
                String cotacaoF = df.format(cotacao).replace(',', '.');
                String taxaF = df.format(taxa).replace(',', '.');
                String realF = df.format(real).replace(',', '.');
                String btcF = df.format(btc).replace(',', '.');
                String etheF = df.format(ethe).replace(',', '.');
                String ripF = df.format(rip).replace(',', '.');
                
                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                        .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                        .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                        .append("\n");
            }
        }catch(SQLException e){
            System.out.println(e);
        }

        return resultado.toString();
    }
    
    
    
}
