package Controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import Model.Bitcoin;
import Model.Carteira;
import Model.CriptoAdicional1;
import Model.CriptoAdicional2;
import Model.Ethereum;
import Model.ExtratoModel;
import Model.Investidor;
import Model.Moedas;
import Model.Real;
import Model.Ripple;
import View.Login;
import View.Menu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author valim
 */
public class ControleLogin {
    private Login login;
    
    public ControleLogin(Login login){
        this.login = login;
    }
    
    public void LoginUsuario(){
        int linhas = 0;
        Conexao conexao = new Conexao();
        String cpf = login.getTxtCpf().getText();
        String senha = login.getTxtSenha().getText();
        cpf = cpf.replaceAll("[.-]", "");
        if (cpf.length() != 11 || !Pattern.matches("\\d{6}", senha)) {
            JOptionPane.showMessageDialog(login, "CPF ou senha inválidos. O CPF deve ter 11 dígitos e a senha deve ter 6 dígitos.");
            return;
        }
        
        Investidor pessoa = new Investidor(null,login.getTxtCpf().getText(),login.getTxtSenha().getText());
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            linhas = dao.countRow();     
            System.out.println(linhas);
            if(linhas == 3){
                try{
                    ResultSet res = dao.consultar(pessoa);
                    ResultSet res2 = dao.consultarCot("M1");
                    ResultSet res3 = dao.consultarCot("M2");
                    ResultSet res4 = dao.consultarCot("M3");
                    if(res.next()){
                        JOptionPane.showMessageDialog(login, "Login feito!");
                        String nome = res.getString("nome");
                        double reais = res.getDouble("reais");
                        double bitcoin = res.getDouble("bitcoin");
                        double ethe = res.getDouble("ethe");
                        double ripple = res.getDouble("ripple");
                        double cotbtc = res2.getDouble("cotacao");
                        double cotethe = res3.getDouble("cotacao");
                        double cotrip = res4.getDouble("cotacao");
                        ArrayList<Moedas> moedas = new ArrayList<Moedas>();
                        moedas.add(new Real(0));
                        moedas.add(new Bitcoin(cotbtc));
                        moedas.add(new Ethereum(cotethe));
                        moedas.add(new Ripple(cotrip));
                        Carteira carteira = new Carteira(moedas);
                        ExtratoModel extrato = new ExtratoModel();
                        Investidor pessoafinal = new Investidor(bitcoin,reais,ethe,ripple,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText(),carteira,extrato);
                        login.setVisible(false);
                        System.out.println(dao.countRow());
                        Menu menu = new Menu(pessoafinal);
                        menu.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(login, "Login falhou!");
                    }
                }catch(SQLException e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(login, "Erro de conexao!");
                }   
            }else if(linhas == 4){
                if(dao.idMoeda().equals("M4")){           
                    try{
                        ResultSet res = dao.consultar(pessoa);
                        ResultSet res2 = dao.consultarCot("M1");
                        ResultSet res3 = dao.consultarCot("M2");
                        ResultSet res4 = dao.consultarCot("M3");
                        ResultSet res5 = dao.consultarCot("M4");
                        ResultSet res7 = dao.consultarTaxacompra("M4");
                        ResultSet res8 = dao.consultarTaxavenda("M4");
                        if(res.next()){
                            JOptionPane.showMessageDialog(login, "Login feito!");
                            String nome = res.getString("nome");
                            double reais = res.getDouble("reais");
                            double bitcoin = res.getDouble("bitcoin");
                            double ethe = res.getDouble("ethe");
                            double ripple = res.getDouble("ripple");
                            double moeda1 = res.getDouble("moedaadd1");
                            double cotbtc = res2.getDouble("cotacao");
                            double cotethe = res3.getDouble("cotacao");
                            double cotrip = res4.getDouble("cotacao");
                            double cotcripadd1 = res5.getDouble("cotacao");
                            double taxacompra1 = res7.getDouble("taxacompra");
                            double taxavenda1 = res8.getDouble("taxavenda");
                            String nome1 = dao.Nomecripto("M4");
                            ArrayList<Moedas> moedas = new ArrayList<Moedas>();
                            moedas.add(new Real(0));
                            moedas.add(new Bitcoin(cotbtc));
                            moedas.add(new Ethereum(cotethe));
                            moedas.add(new Ripple(cotrip));
                            moedas.add(new CriptoAdicional1(cotcripadd1,taxacompra1,taxavenda1,nome1));
                            Carteira carteira = new Carteira(moedas);
                            ExtratoModel extrato = new ExtratoModel();
                            Investidor pessoafinal = new Investidor(bitcoin,reais,ethe,ripple,moeda1,carteira,extrato,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText());
                            login.setVisible(false);
                            System.out.println(dao.countRow());
                            Menu menu = new Menu(pessoafinal);
                            menu.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(login, "Login falhou!");
                        }
                    }catch(SQLException e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(login, "Erro de conexao!");
                    }
                }if(dao.idMoeda().equals("M5")){
                    try{
                        ResultSet res = dao.consultar(pessoa);
                        ResultSet res2 = dao.consultarCot("M1");
                        ResultSet res3 = dao.consultarCot("M2");
                        ResultSet res4 = dao.consultarCot("M3");
                        ResultSet res6 = dao.consultarCot("M5");
                        ResultSet res9 = dao.consultarTaxacompra("M5");
                        ResultSet res10 = dao.consultarTaxavenda("M5");
                        if(res.next()){
                            JOptionPane.showMessageDialog(login, "Login feito!");
                            String nome = res.getString("nome");
                            double reais = res.getDouble("reais");
                            double bitcoin = res.getDouble("bitcoin");
                            double ethe = res.getDouble("ethe");
                            double ripple = res.getDouble("ripple");
                            double moeda2 = res.getDouble("moedaadd2");
                            System.out.println(moeda2);
                            double cotbtc = res2.getDouble("cotacao");
                            double cotethe = res3.getDouble("cotacao");
                            double cotrip = res4.getDouble("cotacao");
                            double cotcripadd2 = res6.getDouble("cotacao");
                            double taxacompra2 = res9.getDouble("taxacompra");
                            double taxavenda2 = res10.getDouble("taxavenda");
                            String nome2 = dao.Nomecripto("M5");
                            ArrayList<Moedas> moedas = new ArrayList<Moedas>();
                            moedas.add(new Real(0));
                            moedas.add(new Bitcoin(cotbtc));
                            moedas.add(new Ethereum(cotethe));
                            moedas.add(new Ripple(cotrip));
                            moedas.add(new CriptoAdicional1(0,0,0,""));
                            moedas.add(new CriptoAdicional2(cotcripadd2,taxacompra2,taxavenda2,nome2));
                            Carteira carteira = new Carteira(moedas);
                            ExtratoModel extrato = new ExtratoModel();
                            Investidor pessoafinal = new Investidor(bitcoin,reais,ethe,ripple,moeda2,carteira,extrato,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText(),"contructormoeda2");
                            login.setVisible(false);
                            Menu menu = new Menu(pessoafinal);
                            menu.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(login, "Login falhou!");
                        }
                    }catch(SQLException e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(login, "Erro de conexao!");
                    }
                }
                
            }else if(linhas == 5){
                try{
                    ResultSet res = dao.consultar(pessoa);
                    ResultSet res2 = dao.consultarCot("M1");
                    ResultSet res3 = dao.consultarCot("M2");
                    ResultSet res4 = dao.consultarCot("M3");
                    ResultSet res5 = dao.consultarCot("M4");
                    ResultSet res6 = dao.consultarCot("M5");
                    ResultSet res7 = dao.consultarTaxacompra("M4");
                    ResultSet res8 = dao.consultarTaxavenda("M4");
                    ResultSet res9 = dao.consultarTaxacompra("M5");
                    ResultSet res10 = dao.consultarTaxavenda("M5");
                    if(res.next()){
                        JOptionPane.showMessageDialog(login, "Login feito!");
                        String nome = res.getString("nome");
                        double reais = res.getDouble("reais");
                        double bitcoin = res.getDouble("bitcoin");
                        double ethe = res.getDouble("ethe");
                        double ripple = res.getDouble("ripple");
                        double moeda1 = res.getDouble("moedaadd1");
                        double moeda2 = res.getDouble("moedaadd2");
                        double cotbtc = res2.getDouble("cotacao");
                        double cotethe = res3.getDouble("cotacao");
                        double cotrip = res4.getDouble("cotacao");
                        double cotcripadd1 = res5.getDouble("cotacao");
                        double cotcripadd2 = res6.getDouble("cotacao");
                        double taxacompra1 = res7.getDouble("taxacompra");
                        double taxavenda1 = res8.getDouble("taxavenda");
                        double taxacompra2 = res9.getDouble("taxacompra");
                        double taxavenda2 = res10.getDouble("taxavenda");
                        String nome1 = dao.Nomecripto("M4");
                        String nome2 = dao.Nomecripto("M5");
                        ArrayList<Moedas> moedas = new ArrayList<Moedas>();
                        moedas.add(new Real(0));
                        moedas.add(new Bitcoin(cotbtc));
                        moedas.add(new Ethereum(cotethe));
                        moedas.add(new Ripple(cotrip));
                        moedas.add(new CriptoAdicional1(cotcripadd1,taxacompra1,taxavenda1,nome1));
                        moedas.add(new CriptoAdicional2(cotcripadd2,taxacompra2,taxavenda2,nome2));
                        Carteira carteira = new Carteira(moedas);
                        ExtratoModel extrato = new ExtratoModel();
                        Investidor pessoafinal = new Investidor(bitcoin,reais,ethe,ripple,moeda1,moeda2,carteira,extrato,nome,login.getTxtCpf().getText(),login.getTxtSenha().getText());
                        login.setVisible(false);
                        System.out.println();
                        Menu menu = new Menu(pessoafinal);
                        menu.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(login, "Login falhou!");
                    }
                }catch(SQLException e){
                    System.out.println(e);
                    JOptionPane.showMessageDialog(login, "Erro de conexao!");
                }
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }        
    }
}
