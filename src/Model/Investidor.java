package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Investidor extends Pessoa{
    private double saldobtc, saldoreal, saldoethe, saldorip,saldomoeda1,saldomoeda2;
    private Carteira carteira;
    private ExtratoModel extrato;
    private String contructorpsaldomoeda2;

    /**
     *
     * @return
     */
    public Carteira getCarteira() {
        return carteira;
    }

    /**
     *
     * @param carteira
     */
    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    /**
     *
     * @return
     */
    public String getContructorpsaldomoeda2() {
        return contructorpsaldomoeda2;
    }

    /**
     *
     * @param contructorpsaldomoeda2
     */
    public void setContructorpsaldomoeda2(String contructorpsaldomoeda2) {
        this.contructorpsaldomoeda2 = contructorpsaldomoeda2;
    }

    /**
     *
     * @return
     */
    public double getSaldomoeda1() {
        return saldomoeda1;
    }

    /**
     *
     * @param saldomoeda1
     */
    public void setSaldomoeda1(double saldomoeda1) {
        this.saldomoeda1 = saldomoeda1;
    }

    /**
     *
     * @return
     */
    public double getSaldomoeda2() {
        return saldomoeda2;
    }

    /**
     *
     * @param saldomoeda2
     */
    public void setSaldomoeda2(double saldomoeda2) {
        this.saldomoeda2 = saldomoeda2;
    }

    /**
     *
     * @return
     */
    public ExtratoModel getExtrato() {
        return extrato;
    }

    /**
     *
     * @param extrato
     */
    public void setExtrato(ExtratoModel extrato) {
        this.extrato = extrato;
    }

    /**
     *
     * @return
     */
    public double getSaldobtc() {
        return saldobtc;
    }

    /**
     *
     * @param saldobtc
     */
    public void setSaldobtc(double saldobtc) {
        this.saldobtc = saldobtc;
    }

    /**
     *
     * @return
     */
    public double getSaldoreal() {
        return saldoreal;
    }

    /**
     *
     * @param saldoreal
     */
    public void setSaldoreal(double saldoreal) {
        this.saldoreal = saldoreal;
    }

    /**
     *
     * @return
     */
    public double getSaldoethe() {
        return saldoethe;
    }

    /**
     *
     * @param saldoethe
     */
    public void setSaldoethe(double saldoethe) {
        this.saldoethe = saldoethe;
    }

    /**
     *
     * @return
     */
    public double getSaldorip() {
        return saldorip;
    }

    /**
     *
     * @param saldorip
     */
    public void setSaldorip(double saldorip) {
        this.saldorip = saldorip;
    }

    /**
     *
     * @param saldobtc
     * @param saldoreal
     * @param saldoethe
     * @param saldorip
     * @param saldomoeda1
     * @param saldomoeda2
     * @param carteira
     * @param extrato
     * @param nome
     * @param cpf
     * @param senha
     */
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

    /**
     *
     * @param saldobtc
     * @param saldoreal
     * @param saldoethe
     * @param saldorip
     * @param saldomoeda2
     * @param carteira
     * @param extrato
     * @param nome
     * @param cpf
     * @param senha
     * @param contructorpsaldomoeda2
     */
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
    
    /**
     *
     * @param saldobtc
     * @param saldoreal
     * @param saldoethe
     * @param saldorip
     * @param saldomoeda1
     * @param carteira
     * @param extrato
     * @param nome
     * @param cpf
     * @param senha
     */
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

    /**
     *
     * @param saldobtc
     * @param saldoreal
     * @param saldoethe
     * @param saldorip
     * @param nome
     * @param cpf
     * @param senha
     * @param carteira
     * @param extrato
     */
    public Investidor(double saldobtc, double saldoreal, double saldoethe, double saldorip, String nome, String cpf,String senha,Carteira carteira,ExtratoModel extrato) {
        super(nome, cpf,senha);
        this.saldobtc = saldobtc;
        this.saldoreal = saldoreal;
        this.saldoethe = saldoethe;
        this.saldorip = saldorip;
        this.carteira = carteira;
        this.extrato = extrato;
    }
    
    /**
     *
     * @param nome
     * @param cpf
     * @param senha
     */
    public Investidor(String nome, String cpf, String senha) {
        super(nome, cpf, senha);
    }
    
    

}
