package Model;
/**
 *
 * @author unifpvalim
 * @author uniflduarte
 */
public class Ripple extends Moedas implements Tarifacao{
    @Override
    public double getTaxaCompra(){
        return 0.01;
    }
    @Override
    public double getTaxaVenda(){
        return 0.01;
    }

    public Ripple(double cotacao) {
        super(cotacao);
    }


}
