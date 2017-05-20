/**
 * Created by LK on 2017-05-20.
 */
public class BiletomatNaKrakowskiej extends Biletomat {

    String miejsce;

    public BiletomatNaKrakowskiej(String miejsce) {
        this.miejsce = miejsce;
    }

    @Override
    public String toString() {
        return super.toString() + miejsce;
    }
}
