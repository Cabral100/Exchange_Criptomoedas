package Model;
/**
 *
 * @author unifpvalim
 */
public class Moedas{
    private double cotacao,taxacompra,taxavenda;

    public Moedas() {
    }

    public double getCotacao() {
        return cotacao;
    }

    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }
    
    public Moedas(double cotacao){
        this.cotacao = cotacao;
    }

    public Moedas(double cotacao,double taxacompra, double taxavenda) {
        this.cotacao = cotacao;
        this.taxacompra = taxacompra;
        this.taxavenda = taxavenda;
    }

}
