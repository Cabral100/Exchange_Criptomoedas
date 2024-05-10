package Model;
/**
 *
 * @author unifpvalim
 */
public class Real extends Moedas{
    
    public double getTaxaCompra(){
        return 0.00;
    }
    
    public double getTaxaVenda(){
        return 0.00;
    }

    public Real(double cotacao) {
        super(cotacao);
    }

}
