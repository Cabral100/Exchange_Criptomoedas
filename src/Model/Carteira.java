package Model;

import java.util.ArrayList;

/**
 *
 * @author uniflduarte
 * @author unifpvalim
 */
public class Carteira{
    private ArrayList<Moedas> moedas ;

    /**
     *
     * @return
     */
    public ArrayList<Moedas> getMoedas() {
        return moedas;
    }

    /**
     *
     * @param moedas
     */
    public void setMoedas(ArrayList<Moedas> moedas) {
        this.moedas = moedas;
    }

    /**
     *
     * @param moedas
     */
    public Carteira(ArrayList<Moedas> moedas) {
        this.moedas = moedas;
    }
}
