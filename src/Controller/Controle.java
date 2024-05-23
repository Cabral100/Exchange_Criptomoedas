package Controller;
import DAO.Conexao;
import DAO.UsuarioDAO;
import Model.Bitcoin;
import Model.CriptoAdicional1;
import Model.CriptoAdicional2;
import Model.Ethereum;
import Model.Investidor;
import Model.Ripple;
import View.ComprarCripto;
import View.ComprarCripto2;
import View.ComprarCripto3;
import View.Cotacoes;
import View.Saldo;
import View.VenderCripto;
import View.VenderCripto2;
import View.VenderCripto3;
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
 * @author uniflduarte
 * @author unifpvalim
 */
public class Controle {
    
    Investidor pessoa;
    
    /**
     *
     * @param pessoa
     */
    public Controle(Investidor pessoa){
        this.pessoa = pessoa;
        
    }
    
    /**
     *
     * @return
     */
    public String data(){
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm");
        return  sdf.format(data);
    }
    
    /**
     *
     * @throws SQLException
     */
    public void Cotacoes() throws SQLException{
        
        if(this.Contador() == 3){
            
            DecimalFormat df = new DecimalFormat("0.000");
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
            Cotacoes cotacoes = new Cotacoes(pessoa,this);
            cotacoes.setVisible(true);
            this.SalvarCot("M1", 1);
            this.SalvarCot("M2", 2);
            this.SalvarCot("M3", 3);
            String cotbittxt = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
            String cotethetxt = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
            String cotriptxt = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
            cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                     "\n\nNova cotação RIPPLE: " + cotriptxt);
            
        }if(this.Contador() == 4){
            if(this.idMoeda().equals("M4")){               
                DecimalFormat df = new DecimalFormat("0.000");        
                double cotbit = pessoa.getCarteira().getMoedas().get(1).getCotacao(),
                        cotethe = pessoa.getCarteira().getMoedas().get(2).getCotacao(),
                        cotripple = pessoa.getCarteira().getMoedas().get(3).getCotacao(),
                        cotmoeda1 = pessoa.getCarteira().getMoedas().get(4).getCotacao();
                Random AleBitcoin = new Random();
                Random AleEthe = new Random();
                Random AleRipple = new Random();
                Random AleMoeda1 = new Random();
                int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),valorripple = AleRipple.nextInt(2),valormoeda1 = AleMoeda1.nextInt(2);
                if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
                if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
                if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
                if(valormoeda1 == 1){cotmoeda1 = cotmoeda1 + cotmoeda1*(0.05);}else{cotmoeda1 = cotmoeda1 - cotmoeda1*(0.05);}
                pessoa.getCarteira().getMoedas().get(1).setCotacao(cotbit);
                pessoa.getCarteira().getMoedas().get(2).setCotacao(cotethe);
                pessoa.getCarteira().getMoedas().get(3).setCotacao(cotripple);
                pessoa.getCarteira().getMoedas().get(4).setCotacao(cotmoeda1);
                Cotacoes cotacoes = new Cotacoes(pessoa,this);
                cotacoes.setVisible(true);
                this.SalvarCot("M1", 1);
                this.SalvarCot("M2", 2);
                this.SalvarCot("M3", 3);
                this.SalvarCot("M4", 4);
                String cotbittxt = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
                String cotethetxt = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
                String cotriptxt = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
                String cotmoeda1txt = df.format(pessoa.getCarteira().getMoedas().get(4).getCotacao()).replace(',', '.');
                CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                     "\n\nNova cotação RIPPLE: " + cotriptxt + "\n\nNova cotação " + moeda1.getNome() + ": " + cotmoeda1txt);
                
                
            }if(this.idMoeda().equals("M5")){                
                    DecimalFormat df = new DecimalFormat("0.000");        
                    double cotbit = pessoa.getCarteira().getMoedas().get(1).getCotacao(),
                            cotethe = pessoa.getCarteira().getMoedas().get(2).getCotacao(),
                            cotripple = pessoa.getCarteira().getMoedas().get(3).getCotacao(),
                            cotmoeda2 = pessoa.getCarteira().getMoedas().get(5).getCotacao();
                    Random AleBitcoin = new Random();
                    Random AleEthe = new Random();
                    Random AleRipple = new Random();
                    Random AleMoeda2 = new Random();
                    int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),valorripple = AleRipple.nextInt(2),valormoeda2 = AleMoeda2.nextInt(2);
                    if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
                    if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
                    if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
                    if(valormoeda2 == 1){cotmoeda2 = cotmoeda2 + cotmoeda2*(0.05);}else{cotmoeda2 = cotmoeda2 - cotmoeda2*(0.05);}
                    pessoa.getCarteira().getMoedas().get(1).setCotacao(cotbit);
                    pessoa.getCarteira().getMoedas().get(2).setCotacao(cotethe);
                    pessoa.getCarteira().getMoedas().get(3).setCotacao(cotripple);
                    pessoa.getCarteira().getMoedas().get(5).setCotacao(cotmoeda2);
                    Cotacoes cotacoes = new Cotacoes(pessoa,this);
                    cotacoes.setVisible(true);
                    this.SalvarCot("M1", 1);
                    this.SalvarCot("M2", 2);
                    this.SalvarCot("M3", 3);
                    this.SalvarCot("M5", 5);
                    String cotbittxt = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
                    String cotethetxt = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
                    String cotriptxt = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
                    String cotmoeda2txt = df.format(pessoa.getCarteira().getMoedas().get(5).getCotacao()).replace(',', '.');
                    CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                    cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                         "\n\nNova cotação RIPPLE: " + cotriptxt + "\n\nNova cotação " + moeda2.getNome() + ": " + cotmoeda2txt);
            }
        }if(this.Contador() == 5){
            
                    DecimalFormat df = new DecimalFormat("0.000");        
                    double cotbit = pessoa.getCarteira().getMoedas().get(1).getCotacao(),
                            cotethe = pessoa.getCarteira().getMoedas().get(2).getCotacao(),
                            cotripple = pessoa.getCarteira().getMoedas().get(3).getCotacao(),
                            cotmoeda1 = pessoa.getCarteira().getMoedas().get(4).getCotacao(),
                            cotmoeda2 = pessoa.getCarteira().getMoedas().get(5).getCotacao();
                    Random AleBitcoin = new Random();
                    Random AleEthe = new Random();
                    Random AleRipple = new Random();
                    Random AleMoeda1 = new Random();
                    Random AleMoeda2 = new Random();
                    int valorbit = AleBitcoin.nextInt(2),valorethe = AleEthe.nextInt(2),
                            valorripple = AleRipple.nextInt(2),valormoeda1 = AleMoeda1.nextInt(2),valormoeda2 = AleMoeda2.nextInt(2);
                    if(valorbit == 1){cotbit = cotbit + cotbit*(0.05);}else{cotbit = cotbit - cotbit*(0.05);}
                    if(valorethe == 1){cotethe = cotethe + cotethe*(0.05);}else{cotethe = cotethe - cotethe*(0.05);}
                    if(valorripple == 1){cotripple = cotripple + cotripple*(0.05);}else{cotripple = cotripple - cotripple*(0.05);}
                    if(valormoeda1 == 1){cotmoeda1 = cotmoeda1 + cotmoeda1*(0.05);}else{cotmoeda1 = cotmoeda1 - cotmoeda1*(0.05);}
                    if(valormoeda2 == 1){cotmoeda2 = cotmoeda2 + cotmoeda2*(0.05);}else{cotmoeda2 = cotmoeda2 - cotmoeda2*(0.05);}
                    
                    pessoa.getCarteira().getMoedas().get(1).setCotacao(cotbit);
                    pessoa.getCarteira().getMoedas().get(2).setCotacao(cotethe);
                    pessoa.getCarteira().getMoedas().get(3).setCotacao(cotripple);
                    pessoa.getCarteira().getMoedas().get(4).setCotacao(cotmoeda1);
                    pessoa.getCarteira().getMoedas().get(5).setCotacao(cotmoeda2);
                    Cotacoes cotacoes = new Cotacoes(pessoa,this);
                    cotacoes.setVisible(true);
                    this.SalvarCot("M1", 1);
                    this.SalvarCot("M2", 2);
                    this.SalvarCot("M3", 3);
                    this.SalvarCot("M4", 4);
                    this.SalvarCot("M5", 5);
                    String cotbittxt = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
                    String cotethetxt = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
                    String cotriptxt = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
                    String cotmoeda2txt = df.format(pessoa.getCarteira().getMoedas().get(5).getCotacao()).replace(',', '.');
                    CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                    String cotmoeda1txt = df.format(pessoa.getCarteira().getMoedas().get(4).getCotacao()).replace(',', '.');
                    CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                    cotacoes.TxtPaneCotacoes.setText("\n\nNova cotação BITCOIN: " + cotbittxt + "\n\nNova cotação ETHEREUM: " + cotethetxt + 
                                         "\n\nNova cotação RIPPLE: " + cotriptxt + "\n\nNova cotação " + moeda1.getNome() + ": " + cotmoeda1txt +
                                         "\n\nNova cotação " + moeda2.getNome() + ": " + cotmoeda2txt);
            
        }

    }
    
    /**
     *
     * @param quantidade
     */
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
        }else if(pessoa.getExtrato().getNomeMoeda().equals("Ethereum")){
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
        }else if(pessoa.getExtrato().getNomeMoeda().equals("Ripple")){
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
        }else if(pessoa.getExtrato().getNomeMoeda().equals(((CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4)).getNome())){
            CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
            if(quantidade <= pessoa.getSaldomoeda1()){
                double vender = quantidade * pessoa.getCarteira().getMoedas().get(4).getCotacao();
                venderfinal = vender - vender*moeda1.getTaxaVenda();
                pessoa.setSaldoreal(pessoa.getSaldoreal() + venderfinal);
                pessoa.setSaldomoeda1(pessoa.getSaldomoeda1() - quantidade);
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                try{
                    ExtratoMenos(quantidade);
                }catch(SQLException e){
                }   
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);
            }
        }else if(pessoa.getExtrato().getNomeMoeda().equals(((CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5)).getNome())){
            CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
            if(quantidade <= pessoa.getSaldomoeda2()){         
                double vender = quantidade * pessoa.getCarteira().getMoedas().get(5).getCotacao();
                venderfinal = vender - vender*moeda2.getTaxaVenda();
                pessoa.setSaldoreal(pessoa.getSaldoreal() + venderfinal);
                pessoa.setSaldomoeda2(pessoa.getSaldomoeda2() - quantidade);
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                try{
                    ExtratoMenos(quantidade);
                }catch(SQLException e){
                }   
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);
            }
        }else if(pessoa.getExtrato().getNomeMoeda().equals("")){
            JOptionPane.showMessageDialog(null,"Erro na escolha de moeda!!","ERROR",ERROR_MESSAGE);
        }
    }
    
    /**
     *
     * @param quantidade
     */
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
        }else if(pessoa.getExtrato().getNomeMoeda().equals("Ethereum")){
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
        }else if(pessoa.getExtrato().getNomeMoeda().equals("Ripple")){
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
        }else if(pessoa.getExtrato().getNomeMoeda().equals(((CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4)).getNome())){
            CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
            double comprar = quantidade * pessoa.getCarteira().getMoedas().get(4).getCotacao();
            comprarfinal = comprar + comprar*moeda1.getTaxaCompra();
            if(comprarfinal <= pessoa.getSaldoreal()){
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                pessoa.setSaldomoeda1(pessoa.getSaldomoeda1() + quantidade);
                pessoa.setSaldoreal(pessoa.getSaldoreal() - comprarfinal);
                try{
                    ExtratoMais(quantidade);
                }catch(SQLException e){   
                }
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);

            }
        }else if(pessoa.getExtrato().getNomeMoeda().equals(((CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5)).getNome())){
            CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
            double comprar = quantidade * pessoa.getCarteira().getMoedas().get(5).getCotacao();
            comprarfinal = comprar + comprar*moeda2.getTaxaCompra();
            if(comprarfinal <= pessoa.getSaldoreal()){
                JOptionPane.showMessageDialog(null,"Ação Realizada!" , "Sucesso", INFORMATION_MESSAGE);
                pessoa.setSaldomoeda2(pessoa.getSaldomoeda2() + quantidade);
                pessoa.setSaldoreal(pessoa.getSaldoreal() - comprarfinal);
                try{
                    ExtratoMais(quantidade);
                }catch(SQLException e){   
                }
            }else{
                JOptionPane.showMessageDialog(null,"Saldo insuficiente!","Saldo",ERROR_MESSAGE);

            }
        }else if(pessoa.getExtrato().getNomeMoeda().equals("")){
            JOptionPane.showMessageDialog(null,"Erro na escolha de moeda!!","ERROR",ERROR_MESSAGE);

        }
    }
    
    /**
     *
     */
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
    
    /**
     *
     * @param id
     * @param indice
     */
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
    
    /**
     *
     * @param quantidade
     */
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
    
    /**
     *
     * @param quantidade
     */
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
    
    /**
     *
     * @param quantidade
     * @throws SQLException
     */
    public void ExtratoMais(double quantidade) throws SQLException{
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        UsuarioDAO dao = new UsuarioDAO(conn);
        
        dao.inserirExtrato(pessoa,"+",quantidade);
    }
    
    /**
     *
     * @param quantidade
     * @throws SQLException
     */
    public void ExtratoMenos(double quantidade) throws SQLException{
        Conexao conexao = new Conexao();
        Connection conn = conexao.getConnection();
        UsuarioDAO dao = new UsuarioDAO(conn);
        
        dao.inserirExtrato(pessoa,"-",quantidade);
    }
    
    /**
     *
     * @param senha
     * @return
     * @throws SQLException
     */
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
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public int Contador() throws SQLException{
        int linhas = 0;
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            linhas = dao.countRow();
        }catch(SQLException e){
        System.out.println(e);
        }
        return linhas;
    }
    
    /**
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public String NomeCripto(String id) throws SQLException{
        String resultado = "";
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            resultado = dao.Nomecripto(id);
        }catch(SQLException e){
        System.out.println(e);
        }
        return resultado;
    }
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public String idMoeda() throws SQLException{
        String resultado = "";
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            resultado = dao.idMoeda();
        }catch(SQLException e){
        System.out.println(e);
        }
        return resultado;
    }
    
    /**
     *
     * @param saldo
     * @throws SQLException
     */
    public void Saldo1(Saldo saldo) throws SQLException{
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String reais = df.format(pessoa.getSaldoreal()).replace(',', '.');
            String bitcoin = df.format(pessoa.getSaldobtc()).replace(',', '.');
            String ethereum = df.format(pessoa.getSaldoethe()).replace(',', '.');
            String ripple = df.format(pessoa.getSaldorip()).replace(',', '.');

            saldo.TxtAreaSaldo.setText("Nome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf() +
            "\n\nReais: " + reais + "\nBitcoin: " + bitcoin + "\nEthereum: " + ethereum +
            "\nRipple: " + ripple);
    }
    
    /**
     *
     * @param saldo
     * @throws SQLException
     */
    public void Saldo2(Saldo saldo) throws SQLException{
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String reais = df.format(pessoa.getSaldoreal()).replace(',', '.');
            String bitcoin = df.format(pessoa.getSaldobtc()).replace(',', '.');
            String ethereum = df.format(pessoa.getSaldoethe()).replace(',', '.');
            String ripple = df.format(pessoa.getSaldorip()).replace(',', '.');

            if(dao.idMoeda().equals("M4")){
                String moeda1 = df.format(pessoa.getSaldomoeda1()).replace(',', '.');
                saldo.TxtAreaSaldo.setText("Nome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf() +
                "\n\nReais: " + reais + "\nBitcoin: " + bitcoin + "\nEthereum: " + ethereum +
                "\nRipple: " + ripple + "\n" + dao.Nomecripto("M4") + ": " + moeda1);
            }if(dao.idMoeda().equals("M5")){
                String moeda2 = df.format(pessoa.getSaldomoeda2()).replace(',', '.');
                System.out.println(pessoa.getSaldomoeda2());
                saldo.TxtAreaSaldo.setText("Nome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf() +
                "\n\nReais: " + reais + "\nBitcoin: " + bitcoin + "\nEthereum: " + ethereum +
                "\nRipple: " + ripple + "\n" + dao.Nomecripto("M5") + ": " + moeda2); 
            }
        }catch(SQLException e){
            System.out.println(e);
        }     
    }
    
    /**
     *
     * @param saldo
     * @throws SQLException
     */
    public void Saldo3(Saldo saldo) throws SQLException{
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String reais = df.format(pessoa.getSaldoreal()).replace(',', '.');
            String bitcoin = df.format(pessoa.getSaldobtc()).replace(',', '.');
            String ethereum = df.format(pessoa.getSaldoethe()).replace(',', '.');
            String ripple = df.format(pessoa.getSaldorip()).replace(',', '.');
            String moeda1 = df.format(pessoa.getSaldomoeda1()).replace(',', '.');
            String moeda2 = df.format(pessoa.getSaldomoeda2()).replace(',', '.');

            saldo.TxtAreaSaldo.setText("Nome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf() +
            "\n\nReais: " + reais + "\nBitcoin: " + bitcoin + "\nEthereum: " + ethereum +
            "\nRipple: " + ripple + "\n" + dao.Nomecripto("M4") + ": " + moeda1 + "\n" + 
            dao.Nomecripto("M5") + ": " + moeda2);
            
            
        }catch(SQLException e){
            System.out.println(e);
        } 
    }
    
    /**
     *
     * @throws SQLException
     */
    public void RBVender() throws SQLException{
        try {
            if(this.Contador() == 3){
                VenderCripto vender = new VenderCripto(pessoa,this);
                vender.setVisible(true);
            }else if(this.Contador() == 4 && this.idMoeda().equals("M4")){
                CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                VenderCripto2 comprar = new VenderCripto2(pessoa,this);
                comprar.RadioBtMoeda1.setText(moeda1.getNome());
                comprar.setVisible(true);
            }else if(this.Contador() == 4 && this.idMoeda().equals("M5")){
                CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                VenderCripto2 comprar = new VenderCripto2(pessoa,this);
                comprar.RadioBtMoeda1.setText(moeda2.getNome());
                comprar.setVisible(true);
            }else if(this.Contador() == 5){
                CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                VenderCripto3 vender = new VenderCripto3(pessoa,this);
                vender.RadioBtMoeda1.setText(moeda1.getNome());
                vender.RadioBtMoeda2.setText(moeda2.getNome());
                vender.setVisible(true);
            }else{
                System.out.println("ERRO");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    /**
     *
     * @throws SQLException
     */
    public void RBComprar() throws SQLException{
        try {
            if(this.Contador() == 3){
                ComprarCripto comprar = new ComprarCripto(pessoa,this);
                comprar.setVisible(true);
            }else if(this.Contador() == 4 && this.idMoeda().equals("M4")){
                CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                ComprarCripto2 comprar = new ComprarCripto2(pessoa,this);
                comprar.RadioBtMoeda1.setText(moeda1.getNome());
                comprar.setVisible(true);
            }else if(this.Contador() == 4 && this.idMoeda().equals("M5")){
                CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                ComprarCripto2 comprar = new ComprarCripto2(pessoa,this);
                comprar.RadioBtMoeda1.setText(moeda2.getNome());
                comprar.setVisible(true);
            }else if(this.Contador() == 5){
                CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                ComprarCripto3 comprar = new ComprarCripto3(pessoa,this);
                comprar.RadioBtMoeda1.setText(moeda1.getNome());
                comprar.RadioBtMoeda2.setText(moeda2.getNome());
                comprar.setVisible(true);
            }else{
                System.out.println("ERRO");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    /**
     *
     * @param jfcomprar
     * @throws SQLException
     */
    public void TxtComprar1(ComprarCripto2 jfcomprar) throws SQLException{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String cotbit = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
            String cotethe = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
            String cotrip = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
            
            if(dao.idMoeda().equals("M4")){
                String cotmoeda1 = df.format(pessoa.getCarteira().getMoedas().get(4).getCotacao()).replace(',', '.');
                CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                jfcomprar.TextAreaCotacoes.setText("Cotação BITCOIN: " + cotbit + "\nCotação ETHEREUM: " + cotethe + 
                                     "\nCotação RIPPLE: " + cotrip + "\nCotação " + moeda1.getNome() + ": " + cotmoeda1);
            }else if(dao.idMoeda().equals("M5")){
                String cotmoeda2 = df.format(pessoa.getCarteira().getMoedas().get(5).getCotacao()).replace(',', '.');
                CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                jfcomprar.TextAreaCotacoes.setText("Cotação BITCOIN: " + cotbit + "\nCotação ETHEREUM: " + cotethe + 
                                     "\nCotação RIPPLE: " + cotrip + "\nCotação " + moeda2.getNome() + ": " + cotmoeda2);
            }         
    }
    
    /**
     *
     * @param jfcomprar
     * @throws SQLException
     */
    public void TxtComprar2(ComprarCripto3 jfcomprar) throws SQLException{
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String cotbit = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
            String cotethe = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
            String cotrip = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
            String cotmoeda1 = df.format(pessoa.getCarteira().getMoedas().get(4).getCotacao()).replace(',', '.');
            String cotmoeda2 = df.format(pessoa.getCarteira().getMoedas().get(5).getCotacao()).replace(',', '.');
            CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
            CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
            jfcomprar.TextAreaCotacoes.setText("Cotação BITCOIN: " + cotbit + "\nCotação ETHEREUM: " + cotethe + 
                                     "\nCotação RIPPLE: " + cotrip + "\nCotação " + moeda1.getNome() + ": " + cotmoeda1 +
                                     "\nCotacao " + moeda2.getNome() + ": " + cotmoeda2);

            
    }
    
    /**
     *
     * @param jfcomprar
     * @throws SQLException
     */
    public void TxtVender1(VenderCripto2 jfcomprar) throws SQLException{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String cotbit = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
            String cotethe = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
            String cotrip = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
            
            if(dao.idMoeda().equals("M4")){
                String cotmoeda1 = df.format(pessoa.getCarteira().getMoedas().get(4).getCotacao()).replace(',', '.');
                CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
                jfcomprar.TextAreaCotacoes.setText("Cotação BITCOIN: " + cotbit + "\nCotação ETHEREUM: " + cotethe + 
                                     "\nCotação RIPPLE: " + cotrip + "\nCotação " + moeda1.getNome() + ": " + cotmoeda1);
            }else if(dao.idMoeda().equals("M5")){
                String cotmoeda2 = df.format(pessoa.getCarteira().getMoedas().get(5).getCotacao()).replace(',', '.');
                CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
                jfcomprar.TextAreaCotacoes.setText("Cotação BITCOIN: " + cotbit + "\nCotação ETHEREUM: " + cotethe + 
                                     "\nCotação RIPPLE: " + cotrip + "\nCotação " + moeda2.getNome() + ": " + cotmoeda2);
            }         
    }
    
    /**
     *
     * @param jfcomprar
     * @throws SQLException
     */
    public void TxtVender2(VenderCripto3 jfcomprar) throws SQLException{
            JOptionPane.showMessageDialog(null,"Senha correta!" , "Sucesso", INFORMATION_MESSAGE);
            DecimalFormat df = new DecimalFormat("#0.000");
            String cotbit = df.format(pessoa.getCarteira().getMoedas().get(1).getCotacao()).replace(',', '.');
            String cotethe = df.format(pessoa.getCarteira().getMoedas().get(2).getCotacao()).replace(',', '.');
            String cotrip = df.format(pessoa.getCarteira().getMoedas().get(3).getCotacao()).replace(',', '.');
            String cotmoeda1 = df.format(pessoa.getCarteira().getMoedas().get(4).getCotacao()).replace(',', '.');
            String cotmoeda2 = df.format(pessoa.getCarteira().getMoedas().get(5).getCotacao()).replace(',', '.');
            CriptoAdicional1 moeda1 = (CriptoAdicional1) pessoa.getCarteira().getMoedas().get(4);
            CriptoAdicional2 moeda2 = (CriptoAdicional2) pessoa.getCarteira().getMoedas().get(5);
            jfcomprar.TextAreaCotacoes.setText("Cotação BITCOIN: " + cotbit + "\nCotação ETHEREUM: " + cotethe + 
                                     "\nCotação RIPPLE: " + cotrip + "\nCotação " + moeda1.getNome() + ": " + cotmoeda1 +
                                     "\nCotacao " + moeda2.getNome() + ": " + cotmoeda2);

            
    }
    
}
