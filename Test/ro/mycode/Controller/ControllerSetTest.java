package ro.mycode.Controller;

import org.junit.jupiter.api.Test;
import ro.mycode.Comparator.ComparatorMasinaFirma;
import ro.mycode.Model.Masina;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class ControllerSetTest {

    @Test
    void afisare() {
        ControllerSet controllerSet = new ControllerSet();

        controllerSet.afisare();
    }

    @Test
    void save() {
        ControllerSet controllerSet = new ControllerSet("new");
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);

        controllerSet.add(masina);
        controllerSet.add(masina1);
        controllerSet.add(masina2);
        controllerSet.add(masina3);
        controllerSet.add(masina4);

        controllerSet.afisare();
    }

    @Test
    void celMaiNouAn() {
        ControllerSet controllerSet = new ControllerSet("new");
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);

        controllerSet.add(masina);
        controllerSet.add(masina1);
        controllerSet.add(masina2);
        controllerSet.add(masina3);
        controllerSet.add(masina4);

        Masina masina5 = controllerSet.celMaiNouAn();
        assertEquals(masina5,masina2);

    }

    @Test
    void celMaiVechiAn() {
        ControllerSet controllerSet = new ControllerSet("new");
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);

        controllerSet.add(masina);
        controllerSet.add(masina1);
        controllerSet.add(masina2);
        controllerSet.add(masina3);
        controllerSet.add(masina4);

        Masina masina5 = controllerSet.celMaiVechiAn();
        assertEquals(masina5,masina4);
    }
}