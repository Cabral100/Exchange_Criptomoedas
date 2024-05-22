package Model;
/**
 *
 * @author unifpvalim
 */
public class Moedas{
    private double cotacao;

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

}
