package Model;
/**
 *
 * @author unifpvalim
 * @author uniflduarte
 */
public class Ethereum extends Moedas implements Tarifacao{
    
    
    @Override
    public double getTaxaCompra(){
        return 0.01;
    }
    
    @Override
    public double getTaxaVenda(){
        return 0.02;
    }

    public Ethereum(double cotacao) {
        super(cotacao);
    }

    public Ethereum(double cotacao, double taxacompra, double taxavenda) {
        super(cotacao, taxacompra, taxavenda);
    }  
}
