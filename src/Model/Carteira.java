package Model;

import java.util.ArrayList;

/**
 *
 * @author unifpvalim
 */
public class Carteira{
    private ArrayList<Moedas> moedas ;

    public ArrayList<Moedas> getMoedas() {
        return moedas;
    }

    public void setMoedas(ArrayList<Moedas> moedas) {
        this.moedas = moedas;
    }

    public Carteira(ArrayList<Moedas> moedas) {
        this.moedas = moedas;
    }
}
