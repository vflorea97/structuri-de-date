package ro.mycode.Comparator;

import ro.mycode.Model.Masina;

import java.util.Comparator;

public class ComparatorMasinaFirma implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {
        if (o1.getFirma().compareTo(o2.getFirma()) > 0){
            return 1;
        }else if (o1.getFirma().compareTo(o2.getFirma()) < 0){
            return -1;
        }else {
            return 0;
        }
    }
}
