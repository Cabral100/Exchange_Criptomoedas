package Model;
/**
 *
 * @author unifpvalim
 */
public class Investidor extends Pessoa{
    private double saldobtc, saldoreal, saldoethe, saldorip;
    private Carteira carteira;
    private ExtratoModel extrato;

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
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
