package ro.mycode.structurigenerice;

import org.junit.jupiter.api.Test;
import ro.mycode.Comparator.ComparatorMasinaAn;
import ro.mycode.Comparator.ComparatorMasinaModel;
import ro.mycode.Model.Masina;

import static org.junit.jupiter.api.Assertions.*;

class MultimeComparatorTest {

    @Test
    void add() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        MultimeComparator<Masina> multimeComparator = new MultimeComparator(new ComparatorMasinaModel());

        multimeComparator.add(masina);
        multimeComparator.add(masina1);
        multimeComparator.add(masina2);
        multimeComparator.add(masina3);
        multimeComparator.add(masina4);

        multimeComparator.afisare();
    }

    @Test
    void remove() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        MultimeComparator<Masina> multimeComparator = new MultimeComparator(new ComparatorMasinaModel());

        multimeComparator.add(masina);
        multimeComparator.add(masina1);
        multimeComparator.add(masina2);
        multimeComparator.add(masina3);
        multimeComparator.add(masina4);

        multimeComparator.remove(masina3);
        multimeComparator.remove(masina);

        multimeComparator.afisare();
    }
}