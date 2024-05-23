package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Ripple extends Moedas{
    
    /**
     *
     * @return
     */
    public double getTaxaCompra(){
        return 0.01;
    }
    
    /**
     *
     * @return
     */
    public double getTaxaVenda(){
        return 0.01;
    }

    /**
     *
     * @param cotacao
     */
    public Ripple(double cotacao) {
        super(cotacao);
    }


}
