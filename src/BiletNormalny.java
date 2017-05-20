/**
 * Created by LK on 2017-05-20.
 */
public class BiletNormalny extends Bilet{

    static String rodzaj = "Normalny";
    static double cena = 1.6;
    static String data = "21.05.21"; //TODO pobranie daty


    public BiletNormalny() {
        super(rodzaj, cena, data);
    }
}
