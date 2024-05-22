package Model;
/**
 *
 * @author unifpvalim
 */
public class Ripple extends Moedas{
    
    public double getTaxaCompra(){
        return 0.01;
    }
    
    public double getTaxaVenda(){
        return 0.01;
    }

    public Ripple(double cotacao) {
        super(cotacao);
    }


}
