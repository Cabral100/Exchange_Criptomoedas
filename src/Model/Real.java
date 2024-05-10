package Model;
/**
 *
 * @author unifpvalim
 * @author uniflduarte
 * 
 */
public class Real extends Moedas implements Tarifacao{
    
    @Override
    public double getTaxaCompra(){
        return 0.00;
    }
    
    @Override
    public double getTaxaVenda(){
        return 0.00;
    }

    public Real(double cotacao) {
        super(cotacao);
    }

}
