package ro.mycode.Comparator;

import ro.mycode.Model.Masina;

import java.util.Comparator;

public class ComparatorMasinaModel implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {
        if (o1.getModel().compareTo(o2.getModel()) > 0){
            return 1;
        }else if (o1.getModel().compareTo(o2.getModel()) < 0){
            return -1;
        }else {
            return 0;
        }
    }
}
