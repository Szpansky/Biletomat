/**
 * Created by LK on 2017-05-20.
 */
public class Pieniadz {
    String waluta;
    double ilosc;
    String rodzaj;


    public Pieniadz(String waluta, double ilosc, String rodzaj) {
        this.waluta = waluta;
        this.ilosc = ilosc;
        this.rodzaj = rodzaj;
    }

    public Pieniadz() {
        this.waluta = "Zl";
        this.ilosc = 0;
        this.rodzaj = "Gotowka";
    }

    @Override
    public String toString() {
        return "Pieniadz{" +
                "waluta='" + waluta + '\'' +
                ", ilosc=" + ilosc +
                ", rodzaj='" + rodzaj + '\'' +
                '}';
    }
}
