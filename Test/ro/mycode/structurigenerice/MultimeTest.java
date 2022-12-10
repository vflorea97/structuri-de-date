package ro.mycode.structurigenerice;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;

import static org.junit.jupiter.api.Assertions.*;

class MultimeTest {

    @Test
    void add() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        Multime<Masina> masinaMultime = new Multime<>();
        masinaMultime.add(masina);
        masinaMultime.add(masina1);
        masinaMultime.add(masina2);
        masinaMultime.add(masina3);
        masinaMultime.add(masina4);

        masinaMultime.afisare();
    }

    @Test
    void remove() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        Multime<Masina> masinaMultime = new Multime<>();
        masinaMultime.add(masina);
        masinaMultime.add(masina1);
        masinaMultime.add(masina2);
        masinaMultime.add(masina3);
        masinaMultime.add(masina4);
        masinaMultime.afisare();
        System.out.println();

        masinaMultime.remove(masina3);

        masinaMultime.afisare();

    }
}