
/**
 * Created by LK on 2017-05-20.
 */
public class Bilet {
    String rodzaj;
    double cena;
    String data;


    public Bilet(String rodzaj, double cena, String data) {
        this.rodzaj = rodzaj;
        this.cena = cena;
        this.data = data;           //TODO pobranie dzisiejszej daty
    }

    public Bilet() {
        this.rodzaj = "60 minutowy";
        this.cena = 3;
        this.data = "21.20.2015";   //TODO pobranie dzisiejszej daty
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "rodzaj='" + rodzaj + '\'' +
                ", cena=" + cena +
                ", data='" + data + '\'' +
                '}';
    }
}
