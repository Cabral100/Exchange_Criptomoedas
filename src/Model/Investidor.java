package Model;
/**
 *
 * @author unifpvalim
 */
public class Investidor extends Pessoa{
    private double saldobtc, saldoreal, saldoethe, saldorip,saldomoeda1,saldomoeda2;
    private Carteira carteira;
    private ExtratoModel extrato;
    private String contructorpsaldomoeda2;

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    public String getContructorpsaldomoeda2() {
        return contructorpsaldomoeda2;
    }

    public void setContructorpsaldomoeda2(String contructorpsaldomoeda2) {
        this.contructorpsaldomoeda2 = contructorpsaldomoeda2;
    }

    public double getSaldomoeda1() {
        return saldomoeda1;
    }

    public void setSaldomoeda1(double saldomoeda1) {
        this.saldomoeda1 = saldomoeda1;
    }

    public double getSaldomoeda2() {
        return saldomoeda2;
    }

    public void setSaldomoeda2(double saldomoeda2) {
        this.saldomoeda2 = saldomoeda2;
    }

    public ExtratoModel getExtrato() {
        return extrato;
    }

    public void setExtrato(ExtratoModel extrato) {
        this.extrato = extrato;
    }

    public double getSaldobtc() {
        return saldobtc;
    }

    public void setSaldobtc(double saldobtc) {
        this.saldobtc = saldobtc;
    }

    public double getSaldoreal() {
        return saldoreal;
    }

    public void setSaldoreal(double saldoreal) {
        this.saldoreal = saldoreal;
    }

    public double getSaldoethe() {
        return saldoethe;
    }

    public void setSaldoethe(double saldoethe) {
        this.saldoethe = saldoethe;
    }

    public double getSaldorip() {
        return saldorip;
    }

    public void setSaldorip(double saldorip) {
        this.saldorip = saldorip;
    }

    public Investidor(double saldobtc, double saldoreal, double saldoethe, double saldorip, double saldomoeda1, double saldomoeda2, Carteira carteira, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.saldobtc = saldobtc;
        this.saldoreal = saldoreal;
        this.saldoethe = saldoethe;
        this.saldorip = saldorip;
        this.saldomoeda1 = saldomoeda1;
        this.saldomoeda2 = saldomoeda2;
        this.carteira = carteira;
        this.extrato = extrato;
    }

    public Investidor(double saldobtc, double saldoreal, double saldoethe, double saldorip, double saldomoeda2, Carteira carteira, ExtratoModel extrato,String nome, String cpf, String senha, String contructorpsaldomoeda2) {
        super(nome, cpf, senha);
        this.saldobtc = saldobtc;
        this.saldoreal = saldoreal;
        this.saldoethe = saldoethe;
        this.saldorip = saldorip;
        this.saldomoeda2 = saldomoeda2;
        this.carteira = carteira;
        this.extrato = extrato;
        this.contructorpsaldomoeda2 = contructorpsaldomoeda2;
    }
    
    

    public Investidor(double saldobtc, double saldoreal, double saldoethe, double saldorip, double saldomoeda1, Carteira carteira, ExtratoModel extrato, String nome, String cpf, String senha) {
        super(nome, cpf, senha);
        this.saldobtc = saldobtc;
        this.saldoreal = saldoreal;
        this.saldoethe = saldoethe;
        this.saldorip = saldorip;
        this.saldomoeda1 = saldomoeda1;
        this.carteira = carteira;
        this.extrato = extrato;
    }

    
    
    public Investidor(double saldobtc, double saldoreal, double saldoethe, double saldorip, String nome, String cpf,String senha,Carteira carteira,ExtratoModel extrato) {
        super(nome, cpf,senha);
        this.saldobtc = saldobtc;
        this.saldoreal = saldoreal;
        this.saldoethe = saldoethe;
        this.saldorip = saldorip;
        this.carteira = carteira;
        this.extrato = extrato;
    }
    
    

    public Investidor(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }
    
    

}
