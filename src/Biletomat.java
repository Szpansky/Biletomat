import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;

/**
 * Created by LK on 2017-05-20.
 */
public class Biletomat implements Tranzakcja{

    ArrayList<Bilet> bilety = new ArrayList<>();


    @Override
    public Pieniadz zaplac(Pieniadz pieniadz, Bilet bilet) {

        if (pieniadz.ilosc < bilet.cena) return pieniadz;
        else {

            double potranzakcji;
            potranzakcji = pieniadz.ilosc - bilet.cena;
            pieniadz.ilosc = potranzakcji;
            return pieniadz;
        }

    }


    @Override
    public String toString() {
        return "ilosc biletow = "
 +                bilety.size() +
                " Biletomat{" +
                "bilety=" + bilety +
                '}' ;
    }

    public String toString(String data) {

        int ilosc=0;

        for (int i=0 ; i < bilety.size(); i++){
            if (bilety.get(i).data == data){
                ilosc ++;
            }
        }

        return "ilosc biletow z dnia "+ data +" = "+ ilosc;

    }


    public void addBilet(Bilet bilet) {
        this.bilety.add(bilet);
    }

}
