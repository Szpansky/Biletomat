/**
 * Created by LK on 2017-05-20.
 */
public class Main {

    static Biletomat biletomat;
    static Pieniadz pieniadz;
    static Pieniadz karta;
    static Bilet normalny;
    static Bilet ulgowy;
    static BiletomatNaKrakowskiej krakowska;
    static BiletNormalny normalny2;


    public static void main(String[] args) {



        pieniadz = new Pieniadz("Zlotowki", 100, "Gotowka");
        karta = new Pieniadz("Euro", 50, "Karta");
        biletomat = new Biletomat();

        krakowska = new BiletomatNaKrakowskiej("krakowska");



        System.out.println("Kupowanie biletu normalnego");
        System.out.println("Platnosci: " + pieniadz.toString());
        normalny = new Bilet("normalny" ,1.4,"20.05.2017");
        krakowska.addBilet(normalny);
        pieniadz = krakowska.zaplac(pieniadz, normalny);
        System.out.println("Stan po tranzackji =" + pieniadz.toString() + "\n");




        System.out.println("Kupowanie biletu normalnego");
        System.out.println("Platnosci: " + pieniadz.toString());
        normalny = new Bilet("normalny" ,1.4,"20.05.2017");
        biletomat.addBilet(normalny);
        pieniadz = biletomat.zaplac(pieniadz, normalny);
        System.out.println("Stan po tranzackji =" + pieniadz.toString() + "\n");


        System.out.println("Kupowanie biletu normalnego");
        System.out.println("Platnosci: " + karta.toString());
        normalny = new Bilet("normalny" ,1.4,"20.05.2017");
        biletomat.addBilet(normalny);
        karta = biletomat.zaplac(karta, normalny);
        System.out.println("Stan po tranzackji =" + karta.toString() + "\n");


        System.out.println("Kupowanie biletu ulgowego");
        System.out.println("Platnosci: " + pieniadz.toString());
        ulgowy = new Bilet("normalny" ,1,"21.05.2017");
        biletomat.addBilet(ulgowy);
        pieniadz =biletomat.zaplac(pieniadz, ulgowy);
        System.out.println("Stan po tranzackji =" + pieniadz.toString() + "\n");




        System.out.println("Kupowanie biletu normalnego");
        System.out.println("Platnosci: " + pieniadz.toString());
        normalny2 = new BiletNormalny();
        biletomat.addBilet(normalny2);
        pieniadz = biletomat.zaplac(pieniadz, normalny2);
        System.out.println("Stan po tranzackji =" + pieniadz.toString() + "\n");




        System.out.println(biletomat.toString());
        System.out.println(biletomat.toString("21.05.2017"));


        System.out.println(krakowska.toString());
        System.out.println(krakowska.toString("21.05.2017"));

    }


}
