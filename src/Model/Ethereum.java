package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Ethereum extends Moedas{
    
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
        return 0.02;
    }

    /**
     *
     * @param cotacao
     */
    public Ethereum(double cotacao) {
        super(cotacao);
    }
 
}
