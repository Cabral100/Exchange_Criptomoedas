package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Bitcoin extends Moedas implements Tarifacao{
    
    /**
     *
     * @return
     */
    @Override
    public double getTaxaCompra(){
        return 0.02;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getTaxaVenda(){
        return 0.03;
    }

    /**
     *
     * @param cotacao
     */
    public Bitcoin(double cotacao) {
        super(cotacao);
    }  
}
