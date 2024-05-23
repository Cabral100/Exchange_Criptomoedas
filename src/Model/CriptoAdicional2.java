package Model;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class CriptoAdicional2 extends Moedas implements Tarifacao{
    private double taxacompra,taxavenda;
    private String nome;
    
    /**
     *
     * @return
     */
    @Override
    public double getTaxaCompra() {
        return taxacompra;
    }

    /**
     *
     * @return
     */
    @Override
    public double getTaxaVenda() {
        return taxavenda;
    }

    /**
     *
     * @return
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return
     */
    public double getTaxacompra() {
        return taxacompra;
    }

    /**
     *
     * @param taxacompra
     */
    public void setTaxacompra(double taxacompra) {
        this.taxacompra = taxacompra;
    }

    /**
     *
     * @return
     */
    public double getTaxavenda() {
        return taxavenda;
    }

    /**
     *
     * @param taxavenda
     */
    public void setTaxavenda(double taxavenda) {
        this.taxavenda = taxavenda;
    }

    /**
     *
     * @param cotacao
     * @param taxacompra
     * @param taxavenda
     * @param nome
     */
    public CriptoAdicional2(double cotacao, double taxacompra, double taxavenda,String nome) {
        super(cotacao);
        this.taxacompra = taxacompra;
        this.taxavenda = taxavenda;
        this.nome = nome;
    }

}
