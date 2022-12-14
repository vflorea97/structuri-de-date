package ro.mycode.Comparator;

import ro.mycode.Model.Masina;

import java.util.Comparator;

public class ComparatorMasinaMotor implements Comparator<Masina> {
    @Override
    public int compare(Masina o1, Masina o2) {
        if (o1.getMotor() >= o2.getMotor()){
            return 1;
        }else if (o1.getMotor() <= o2.getMotor()) {
            return -1;
        }else {
            return 0;
        }
    }
}
