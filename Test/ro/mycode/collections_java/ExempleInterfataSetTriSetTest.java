package ro.mycode.collections_java;

import org.junit.jupiter.api.Test;
import ro.mycode.Comparator.ComparatorMasinaAn;
import ro.mycode.Comparator.ComparatorMasinaFirma;
import ro.mycode.Comparator.ComparatorMasinaModel;
import ro.mycode.Comparator.ComparatorMasinaMotor;
import ro.mycode.Model.Masina;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ExempleInterfataSetTriSetTest {

    @Test
    public void add() {
        Masina masina = new Masina("Logan","Dacia",2010,false,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2008,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("Zero","Jeep",2005,false,"Motorina",2.0);

        Set<Masina> masiniList = new TreeSet<>();
        masiniList.add(masina);
        masiniList.add(masina1);
        masiniList.add(masina2);
        masiniList.add(masina3);
        masiniList.add(masina4);

       Iterator<Masina> iterable=masiniList.iterator();

       while (iterable.hasNext()){
           Masina masinaM = iterable.next();
           System.out.println(masinaM);

       }
    }

    @Test
    public void comparatorMasinaAn() {
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);

        Set<Masina> masiniList = new TreeSet<>(new ComparatorMasinaModel());
        masiniList.add(masina);
        masiniList.add(masina1);
        masiniList.add(masina2);
        masiniList.add(masina3);
        masiniList.add(masina4);

        Iterator<Masina> iterable = masiniList.iterator();

        while (iterable.hasNext()) {
            Masina masinaM = iterable.next();
            System.out.println(masinaM);
        }
    }

    @Test
    public void comparatorMasinaFirma() {
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);

        Set<Masina> masiniList = new TreeSet<>(new ComparatorMasinaFirma());
        masiniList.add(masina);
        masiniList.add(masina1);
        masiniList.add(masina2);
        masiniList.add(masina3);
        masiniList.add(masina4);

        Iterator<Masina> iterable = masiniList.iterator();

        while (iterable.hasNext()) {
            Masina masinaM = iterable.next();
            System.out.println(masinaM);
        }
    }

    @Test
    public void comparatorMasinaMotor() {
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);

        Set<Masina> masiniList = new TreeSet<>(new ComparatorMasinaMotor());
        masiniList.add(masina);
        masiniList.add(masina1);
        masiniList.add(masina2);
        masiniList.add(masina3);
        masiniList.add(masina4);

        Iterator<Masina> iterable = masiniList.iterator();

        while (iterable.hasNext()) {
            Masina masinaM = iterable.next();
            System.out.println(masinaM);
        }
    }

}