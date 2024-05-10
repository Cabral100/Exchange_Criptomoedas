package Model;
/**
 *
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
    
    @Override
    public double getTaxaVenda(){
        return 0.03;
    }

    public Bitcoin(double cotacao) {
        super(cotacao);
    }  
}
