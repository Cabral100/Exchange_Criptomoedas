package Model;

/**
 *
 * @author valim
 */
public class CriptoAdicional1 extends Moedas implements Tarifacao{
    private double taxacompra,taxavenda;
    String nome;
    
    
    @Override
    public double getTaxaCompra() {
        return taxacompra;
    }

    @Override
    public double getTaxaVenda() {
        return taxavenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTaxacompra() {
        return taxacompra;
    }

    public void setTaxacompra(double taxacompra) {
        this.taxacompra = taxacompra;
    }

    public double getTaxavenda() {
        return taxavenda;
    }

    public void setTaxavenda(double taxavenda) {
        this.taxavenda = taxavenda;
    }

    public CriptoAdicional1(double cotacao, double taxacompra, double taxavenda,String nome) {
        super(cotacao);
        this.taxacompra = taxacompra;
        this.taxavenda = taxavenda;
        this.nome = nome;
    }
}
