package Controller;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Model.Bitcoin;
import Model.Ethereum;
import Model.Investidor;
import Model.Ripple;
import View.Cotacoes;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
/**
 *
 * @author valim
 * @author uniflduarte
 */
public class Controle {
    
    Investidor pessoa;
    
    public Controle(Investidor pessoa){
        this.pessoa = pessoa;
        
    }
    
    public String data(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm");
        return  sdf.format(data);
    }
    
    public void Cotacoes(){
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        double cotbit = pessoa.getCarteira().getMoedas().get(1).getCotacao(),
                cotethe = pessoa.getCarteira().getMoedas().get(2).getCotacao(),
                cotripple = pessoa.getCarteira().getMoedas().get(3).getCotacao();
        
        Random AleBitcoin = new Random();
        Random AleEthe = new Random();
        Random AleRipple = new Random();

        int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),valorripple = AleRipple.nextInt(2);
        
        if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
        if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
        if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
        
        pessoa.getCarteira().getMoedas().get(1).setCotacao(cotbit);
        pessoa.getCarteira().getMoedas().get(2).setCotacao(cotethe);
        pessoa.getCarteira().getMoedas().get(3).setCotacao(cotripple);
           
        Cotacoes cotacoes = new Cotacoes(pessoa);
        cotacoes.setVisible(true);
        
        this.SalvarCot("M1", 1);
        this.SalvarCot("M2", 2);
        this.SalvarCot("M3", 3);
    }
    
    public void Vender(double quantidade){
        double venderfinal = 0;
        /*---------------------------------------------------*/
        /*---------------------------------------------------*/
        /*---------------------------------------------------*/
        if(pessoa.getExtrato().getNomeMoeda().equals("Bitcoin")){
            if(quantidade <= pessoa.getSaldobtc()){
                Bitcoin bitcoinObj = (Bitcoin) pessoa.getCarteira().getMoedas().get(1);
                double vender = quantidade * pessoa.getCarteira().getMoedas().get(1).getCotacao();
                venderfinal = vender - vender*bitcoinObj.getTaxaVenda();
                pessoa.setSaldoreal(pessoa.getSaldoreal() + venderfinal);
                pessoa.setSaldobtc(pessoa.getSaldobtc() - quantidade);
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                try{
                    ExtratoMenos(quantidade);
                }catch(SQLException e){
                }   
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);
            }
        }if(pessoa.getExtrato().getNomeMoeda().equals("Ethereum")){
            if(quantidade <= pessoa.getSaldoethe()){
                Ethereum etheObj = (Ethereum) pessoa.getCarteira().getMoedas().get(2);
                double vender = quantidade * pessoa.getCarteira().getMoedas().get(2).getCotacao();
                venderfinal = vender - vender*etheObj.getTaxaVenda();
                pessoa.setSaldoreal(pessoa.getSaldoreal() + venderfinal);
                pessoa.setSaldoethe(pessoa.getSaldoethe() - quantidade);
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                try{
                    ExtratoMenos(quantidade);
                }catch(SQLException e){
                }
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);
            }
        }if(pessoa.getExtrato().getNomeMoeda().equals("Ripple")){
            if(quantidade <= pessoa.getSaldorip()){
                Ripple rippleObj = (Ripple) pessoa.getCarteira().getMoedas().get(3);
                double vender = quantidade * pessoa.getCarteira().getMoedas().get(3).getCotacao();
                venderfinal = vender - vender*rippleObj.getTaxaVenda();
                pessoa.setSaldoreal(pessoa.getSaldoreal() + venderfinal);
                pessoa.setSaldorip(pessoa.getSaldorip() - quantidade);
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                try{
                    ExtratoMenos(quantidade);
                }catch(SQLException e){
                }
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);
            }
        }if(pessoa.getExtrato().getNomeMoeda().equals("")){
            JOptionPane.showMessageDialog(null,"Erro na escolha de moeda!!","ERROR",ERROR_MESSAGE);
        }
    }
    
    public void Comprar(double quantidade){
        double comprarfinal = 0;
        if(pessoa.getExtrato().getNomeMoeda().equals("Bitcoin")){
            Bitcoin bitcoinObj = (Bitcoin) pessoa.getCarteira().getMoedas().get(1);
            double comprar = quantidade * pessoa.getCarteira().getMoedas().get(1).getCotacao();
            comprarfinal = comprar + comprar*bitcoinObj.getTaxaCompra();
            if(comprarfinal <= pessoa.getSaldoreal()){
                pessoa.setSaldobtc(pessoa.getSaldobtc() + quantidade);
                pessoa.setSaldoreal(pessoa.getSaldoreal() - comprarfinal);
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                try{
                    ExtratoMais(quantidade);
                }catch(SQLException e){   
                }
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);
            }
        }if(pessoa.getExtrato().getNomeMoeda().equals("Ethereum")){
            Ethereum etheObj = (Ethereum) pessoa.getCarteira().getMoedas().get(2);
            double comprar = quantidade * pessoa.getCarteira().getMoedas().get(2).getCotacao();
            comprarfinal = comprar + comprar*etheObj.getTaxaCompra();
            if(comprarfinal <= pessoa.getSaldoreal()){
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                pessoa.setSaldoethe(pessoa.getSaldoethe() + quantidade);
                pessoa.setSaldoreal(pessoa.getSaldoreal() - comprarfinal);
                try{
                    ExtratoMais(quantidade);
                }catch(SQLException e){   
                }
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);
            }
        }if(pessoa.getExtrato().getNomeMoeda().equals("Ripple")){
            Ripple rippleObj = (Ripple) pessoa.getCarteira().getMoedas().get(3);
            double comprar = quantidade * pessoa.getCarteira().getMoedas().get(3).getCotacao();
            comprarfinal = comprar + comprar*rippleObj.getTaxaCompra();
            if(comprarfinal <= pessoa.getSaldoreal()){
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                pessoa.setSaldorip(pessoa.getSaldorip() + quantidade);
                pessoa.setSaldoreal(pessoa.getSaldoreal() - comprarfinal);
                try{
                    ExtratoMais(quantidade);
                }catch(SQLException e){   
                }
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);

            }
        }if(pessoa.getExtrato().getNomeMoeda().equals("")){
            JOptionPane.showMessageDialog(null,"Erro na escolha de moeda!!","ERROR",ERROR_MESSAGE);

        }
    }
    
    public void Salvar(){
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.atualizar(pessoa);
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Erro de conexão!","Connection",ERROR_MESSAGE);
    }
    }
    
    public void SalvarCot(String id,int indice){
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.atualizarCot(pessoa, id, indice);
        }catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"Erro de conexão!","Connection",ERROR_MESSAGE);
        }
    }
    
    public void Depositar(double quantidade){
        pessoa.setSaldoreal(pessoa.getSaldoreal() + quantidade);
        JOptionPane.showMessageDialog(null,"Deposito realizado!","Sucesso!",INFORMATION_MESSAGE);
        pessoa.getExtrato().setNomeMoeda("Reais");
        pessoa.getExtrato().setCotgeral(0);
        pessoa.getExtrato().setTaxageral(0); 
        try{
            ExtratoMais(quantidade);
        }catch(SQLException e){   
        }
    }
    
    public void Sacar(double quantidade){
        if(quantidade <= pessoa.getSaldoreal()){
            pessoa.setSaldoreal(pessoa.getSaldoreal() - quantidade);
            pessoa.getExtrato().setNomeMoeda("Reais");
            pessoa.getExtrato().setCotgeral(0);
            pessoa.getExtrato().setTaxageral(0); 
        try{
            ExtratoMenos(quantidade);
        }catch(SQLException e){   
        }
            JOptionPane.showMessageDialog(null,"Saque realizado!","SAQUE",INFORMATION_MESSAGE);  
        }else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente!","NEGATIVO",ERROR_MESSAGE);
        }
    }
    
    public void ExtratoMais(double quantidade) throws SQLException{
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        UsuarioDAO dao = new UsuarioDAO(conn);
        
        dao.inserirExtrato(pessoa,"+",quantidade);
    }
    
    public void ExtratoMenos(double quantidade) throws SQLException{
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        UsuarioDAO dao = new UsuarioDAO(conn);
        
        dao.inserirExtrato(pessoa,"-",quantidade);
    }
    
    public String Extrato(String senha) throws SQLException{    
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        UsuarioDAO dao = new UsuarioDAO(conn);
        String Results = "";
        
        if(senha.equals(pessoa.getSenha())){
            Results = dao.consultarExtrato(pessoa);
        }else{
            JOptionPane.showMessageDialog(null,"Senha Incorreta!","SENHA",ERROR_MESSAGE);
        }

        return Results;
    }
    
}
