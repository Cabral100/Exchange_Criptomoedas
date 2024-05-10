package Model;
/**
 *
 * @author unifpvalim
 */
public class Ethereum extends Moedas{
    
    public double getTaxaCompra(){
        return 0.01;
    }
    
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
