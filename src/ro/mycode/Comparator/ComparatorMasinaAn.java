package ro.mycode.Comparator;

import ro.mycode.Model.Masina;

import java.util.Comparator;

public class ComparatorMasinaAn implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {
        if (o1.getAn() > o2.getAn()){
            return 1;
        }else if (o1.getAn() < o2.getAn()){
            return -1;
        }else{
            return 0;
        }
    }
}
