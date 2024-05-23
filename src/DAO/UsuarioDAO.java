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
 * @author uniflduarte
 * @author unifpvalim
 */
public class UsuarioDAO {
    private Connection conn;
    
    /**
     *
     * @param conn
     */
    public UsuarioDAO(Connection conn){
        this.conn = conn;
    }
    
    /**
     *
     * @return
     */
    public String data(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return  sdf.format(data);
    }
    
    /**
     *
     * @param pessoa
     * @return
     * @throws SQLException
     */
    public ResultSet consultar(Investidor pessoa) throws SQLException{
        ResultSet resultado = null;
        if(this.countRow() == 3){
            String sql = "select nome,cpf,senha,reais,bitcoin,ethe,ripple from usuario.informacoes where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pessoa.getCpf());
            statement.setString(2, pessoa.getSenha());
            statement.execute();
            resultado = statement.getResultSet();
        }if(this.countRow() == 4 && this.idMoeda().equals("M4")){
            String sql = "select nome,cpf,senha,reais,bitcoin,ethe,ripple,moedaadd1 from usuario.informacoes where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pessoa.getCpf());
            statement.setString(2, pessoa.getSenha());
            statement.execute();
            resultado = statement.getResultSet();
        }if(this.countRow() == 4 && this.idMoeda().equals("M5")){
            String sql = "select nome,cpf,senha,reais,bitcoin,ethe,ripple,moedaadd2 from usuario.informacoes where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pessoa.getCpf());
            statement.setString(2, pessoa.getSenha());
            statement.execute();
            resultado = statement.getResultSet();
        }if(this.countRow() == 5){
            String sql = "select * from usuario.informacoes where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, pessoa.getCpf());
            statement.setString(2, pessoa.getSenha());
            statement.execute();
            resultado = statement.getResultSet();
        }
        return resultado;
    }
    
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public ResultSet consultarCot(String id) throws SQLException{
        String sql = "select cotacao from administrador.criptomoedas where id = ?";
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
    
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public ResultSet consultarTaxacompra(String id) throws SQLException{
        String sql = "select taxacompra from administrador.criptomoedas where id = ?";
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
    
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public ResultSet consultarTaxavenda(String id) throws SQLException{
        String sql = "select taxavenda from administrador.criptomoedas where id = ?";
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
    
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public String Nomecripto(String id) throws SQLException{
        String moeda = "";
        String sql = "select moeda from administrador.criptomoedas where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,id);
        try(ResultSet result = statement.executeQuery()){
            if(result.next()){
                moeda = result.getString("moeda");
            }else{
                return null;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return moeda;
    }
    
    /**
     *
     * @param pessoa
     * @param mm
     * @param quantidade
     * @throws SQLException
     */
    public void inserirExtrato(Investidor pessoa, String mm, double quantidade) throws SQLException {
        if(this.countRow() == 3){
            String sql = "INSERT INTO usuario.extrato(cpf, data, tipo, valor, moeda ,cotacao, taxa, \"real\", btc, ethe, rip) "
                + "VALUES ('"+pessoa.getCpf()+"','" +data()+ "','"+mm+"','"+quantidade+"','"
                +   pessoa.getExtrato().getNomeMoeda()+"','"+pessoa.getExtrato().getCotgeral()+"',"
                + "'"+pessoa.getExtrato().getTaxageral()+"','"+pessoa.getSaldoreal()+"','"+pessoa.getSaldobtc()+"',"
                + "'"+pessoa.getSaldoethe()+"','"+pessoa.getSaldorip()+"');";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }if(this.countRow() == 4){
            if(this.idMoeda().equals("M4")){              
                String sql = "INSERT INTO usuario.extrato(cpf, data, tipo, valor, moeda ,cotacao, taxa, \"real\", btc, ethe, rip,nomemn1,moedanova1) "
                + "VALUES ('"+pessoa.getCpf()+"','" +data()+ "','"+mm+"','"+quantidade+"','"
                +   pessoa.getExtrato().getNomeMoeda()+"','"+pessoa.getExtrato().getCotgeral()+"',"
                + "'"+pessoa.getExtrato().getTaxageral()+"','"+pessoa.getSaldoreal()+"','"+pessoa.getSaldobtc()+"',"
                + "'"+pessoa.getSaldoethe()+"','"+pessoa.getSaldorip()+"','" + this.Nomecripto("M4") +"','"+pessoa.getSaldomoeda1()+"');";

                PreparedStatement statement = conn.prepareStatement(sql);
                statement.execute();
            }if(this.idMoeda().equals("M5")){
                String sql = "INSERT INTO usuario.extrato(cpf, data, tipo, valor, moeda ,cotacao, taxa, \"real\", btc, ethe, rip,nomemn2,moedanova2) "
                + "VALUES ('"+pessoa.getCpf()+"','" +data()+ "','"+mm+"','"+quantidade+"','"
                +   pessoa.getExtrato().getNomeMoeda()+"','"+pessoa.getExtrato().getCotgeral()+"',"
                + "'"+pessoa.getExtrato().getTaxageral()+"','"+pessoa.getSaldoreal()+"','"+pessoa.getSaldobtc()+"',"
                + "'"+pessoa.getSaldoethe()+"','"+pessoa.getSaldorip()+"','"+ this.Nomecripto("M5") +"','"+pessoa.getSaldomoeda2()+"');";

                PreparedStatement statement = conn.prepareStatement(sql);
                statement.execute();
            }
        }if(this.countRow() == 5){
                String sql = "INSERT INTO usuario.extrato(cpf, data, tipo, valor, moeda ,cotacao, taxa, \"real\", btc, ethe, rip,nomemn1,moedanova1,nomemn2,moedanova2) "
                + "VALUES ('"+pessoa.getCpf()+"','" +data()+ "','"+mm+"','"+quantidade+"','"
                +   pessoa.getExtrato().getNomeMoeda()+"','"+pessoa.getExtrato().getCotgeral()+"',"
                + "'"+pessoa.getExtrato().getTaxageral()+"','"+pessoa.getSaldoreal()+"','"+pessoa.getSaldobtc()+"',"
                + "'"+pessoa.getSaldoethe()+"','"+pessoa.getSaldorip()+"','"+ this.Nomecripto("M4") +"','"+pessoa.getSaldomoeda1()
                +"','"+this.Nomecripto("M5")+"','"+pessoa.getSaldomoeda2()+"');";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.execute();
        }
        
}

    /**
     *
     * @param pessoa
     * @throws SQLException
     */
    public void inserir(Investidor pessoa) throws SQLException{
        String sql = "insert into usuario.informacoes(nome, cpf, senha) values ('" +
                        pessoa.getNome() + "', '" +
                        pessoa.getCpf() + "', '" +
                        pessoa.getSenha() + "')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    /**
     *
     * @param pessoa
     * @throws SQLException
     */
    public void excluir(Investidor pessoa) throws SQLException{
        String sql = "delete from usuario.informacoes where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, pessoa.getCpf());
        statement.execute();
        conn.close();
    }
    
    /**
     *
     * @param pessoa
     * @throws SQLException
     */
    public void atualizar(Investidor pessoa) throws SQLException{
        if(this.countRow() == 3){
            String sql = "update usuario.informacoes set reais = ?, bitcoin = ?, ethe = ?, ripple = ? where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, pessoa.getSaldoreal());
            statement.setDouble(2, pessoa.getSaldobtc());
            statement.setDouble(3, pessoa.getSaldoethe());
            statement.setDouble(4, pessoa.getSaldorip());
            statement.setString(5, pessoa.getCpf());
            statement.setString(6, pessoa.getSenha());
            statement.execute();        
        }if(this.countRow() == 4 && this.idMoeda().equals("M4")){
            String sql = "update usuario.informacoes set reais = ?, bitcoin = ?, ethe = ?, ripple = ?,moedaadd1 = ? where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, pessoa.getSaldoreal());
            statement.setDouble(2, pessoa.getSaldobtc());
            statement.setDouble(3, pessoa.getSaldoethe());
            statement.setDouble(4, pessoa.getSaldorip());
            statement.setDouble(5, pessoa.getSaldomoeda1());
            statement.setString(6, pessoa.getCpf());
            statement.setString(7, pessoa.getSenha());
            statement.execute();        
        }if(this.countRow() == 4 && this.idMoeda().equals("M5")){
            String sql = "update usuario.informacoes set reais = ?, bitcoin = ?, ethe = ?, ripple = ?, moedaadd2 = ? where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, pessoa.getSaldoreal());
            statement.setDouble(2, pessoa.getSaldobtc());
            statement.setDouble(3, pessoa.getSaldoethe());
            statement.setDouble(4, pessoa.getSaldorip());
            statement.setDouble(5, pessoa.getSaldomoeda2());
            statement.setString(6, pessoa.getCpf());
            statement.setString(7, pessoa.getSenha());
            statement.execute();        
        }
        if(this.countRow() == 5){
            String sql = "update usuario.informacoes set reais = ?, bitcoin = ?, ethe = ?, ripple = ?,moedaadd1 = ?, moedaadd2 = ? where cpf = ? and senha = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, pessoa.getSaldoreal());
            statement.setDouble(2, pessoa.getSaldobtc());
            statement.setDouble(3, pessoa.getSaldoethe());
            statement.setDouble(4, pessoa.getSaldorip());
            statement.setDouble(5, pessoa.getSaldomoeda1());
            statement.setDouble(6, pessoa.getSaldomoeda2());
            statement.setString(7, pessoa.getCpf());
            statement.setString(8, pessoa.getSenha());
            statement.execute();        
        }
        
        conn.close();
        
    }
    
    /**
     *
     * @throws SQLException
     */
    public void ordenartable() throws SQLException{
        String sql = "SELECT * FROM administrador.criptomoedas ORDER BY CAST(SUBSTRING(id FROM 2) AS INTEGER)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
    }
    
    /**
     *
     * @param pessoa
     * @param id
     * @param indice
     * @throws SQLException
     */
    public void atualizarCot(Investidor pessoa,String id,int indice) throws SQLException{
        String sql = "update administrador.criptomoedas set cotacao = ? where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, pessoa.getCarteira().getMoedas().get(indice).getCotacao());
        statement.setString(2,id);
        statement.execute();
        this.ordenartable();
        conn.close();
    }
    
    /**
     *
     * @param pessoa
     * @return
     * @throws SQLException
     */
    public String consultarExtrato(Investidor pessoa) throws SQLException{
        StringBuilder resultado = new StringBuilder();
        resultado.append("Nome: ").append(pessoa.getNome()).append("\nCPF: ").append(pessoa.getCpf()).append("\n\n");
        String sql = "select data,tipo,valor,moeda,cotacao,taxa,real,btc,ethe,rip,nomemn1,moedanova1,nomemn2,moedanova2 FROM usuario.extrato WHERE cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,pessoa.getCpf());
        try(ResultSet result = statement.executeQuery()){
            DecimalFormat df = new DecimalFormat("#0.00");
            while(result.next()){
                    Double moeda1 = null;
                    Double moeda2 = null;
                    String nomemn1 = result.getString("nomemn1");
                    String nomemn2 = result.getString("nomemn2");
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
                    moeda1 = result.getDouble("moedanova1");
                    if(result.wasNull()){
                        moeda1 = null;
                    }
                    moeda2 = result.getDouble("moedanova2");
                    if(result.wasNull()){
                        moeda2 = null;
                    }

                    /*------------------------------------------------*/

                    String valorF = df.format(valor).replace(',', '.');
                    String cotacaoF = df.format(cotacao).replace(',', '.');
                    String taxaF = df.format(taxa).replace(',', '.');
                    String realF = df.format(real).replace(',', '.');
                    String btcF = df.format(btc).replace(',', '.');
                    String etheF = df.format(ethe).replace(',', '.');
                    String ripF = df.format(rip).replace(',', '.');

                    if(moeda1 == null && moeda2 == null){
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                .append("\n");
                            }if(moeda1 != null && moeda2 == null){
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                .append(" ").append(" ").append(nomemn1).append(" ").append(moeda1).append("\n");
                            }if(moeda1 == null && moeda2 != null){
                                String moeda2F = df.format(moeda2).replace(',','.');
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                .append(" ").append(" ").append(nomemn2).append(" ").append(moeda2F).append("\n");
                            }if(moeda1 != null && moeda2!= null){
                                String moeda1F = df.format(moeda1).replace(',','.');
                                String moeda2F = df.format(moeda2).replace(',','.');
                                resultado.append(data).append("  ").append(tipo).append(valorF).append(" ").append(moeda)
                                    .append("  CT: ").append(cotacaoF).append("  TX: ").append(taxaF).append("  REAL: ").append(realF)
                                    .append("  BTC: ").append(btcF).append("  ETH: ").append(etheF).append("  XRP: ").append(ripF)
                                    .append(" ").append(" ").append(nomemn1).append(": ").append(moeda1F).append("  ").append(nomemn2)
                                    .append(": ").append(moeda2F).append("\n");
                            }
                }
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return resultado.toString();
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public int countRow() throws SQLException{
        int linhas = 0;
        
        String sql = "SELECT COUNT(*) FROM administrador.criptomoedas";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet result = statement.executeQuery();
        if(result.next()){
            linhas = result.getInt(1);
        }else{
            
        }
        
        return linhas;
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public String idMoeda() throws SQLException{
        String resultado = "";
        
        String sql = "SELECT id from administrador.criptomoedas WHERE id = ? or id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,"M4");
        statement.setString(2,"M5");
        ResultSet result = statement.executeQuery();
        if(result.next()){
            resultado = result.getString(1);
        }else{
            
        }
        return resultado;
    }
    
}
