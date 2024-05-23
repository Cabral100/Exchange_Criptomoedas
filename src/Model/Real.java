package Model;
/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Real extends Moedas{
    
    /**
     *
     * @return
     */
    public double getTaxaCompra(){
        return 0.00;
    }
    
    /**
     *
     * @return
     */
    public double getTaxaVenda(){
        return 0.00;
    }

    /**
     *
     * @param cotacao
     */
    public Real(double cotacao) {
        super(cotacao);
    }

}
