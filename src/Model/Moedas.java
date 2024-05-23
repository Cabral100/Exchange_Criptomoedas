package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Moedas{
    private double cotacao;

    /**
     *
     */
    public Moedas() {
    }

    /**
     *
     * @return
     */
    public double getCotacao() {
        return cotacao;
    }

    /**
     *
     * @param cotacao
     */
    public void setCotacao(double cotacao) {
        this.cotacao = cotacao;
    }
    
    /**
     *
     * @param cotacao
     */
    public Moedas(double cotacao){
        this.cotacao = cotacao;
    }

}
