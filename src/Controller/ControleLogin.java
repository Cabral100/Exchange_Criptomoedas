package Controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import Model.Bitcoin;
import Model.Carteira;
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
        Conexao conexao = new Conexao();
        Investidor pessoa = new Investidor(null,login.getTxtCpf().getText(),login.getTxtSenha().getText());
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
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
                Menu menu = new Menu(pessoafinal);
                menu.setVisible(true);
            } else{
                JOptionPane.showMessageDialog(login, "Login falhou!");
            }
        } catch(SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(login, "Erro de conexao!");
        }
    }
    
}
