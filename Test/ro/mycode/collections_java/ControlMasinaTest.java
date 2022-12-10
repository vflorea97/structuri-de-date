package ro.mycode.collections_java;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ControlMasinaTest {

    @Test
    void afisare() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        controlMasina.afisare();

    }

    @Test
    void remove() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        controlMasina.remove(masina4);

        controlMasina.afisare();

    }

    @Test
    void celMaiNouAn() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        System.out.println(controlMasina.celMaiNouAn());

    }

    @Test
    public void oridneAn(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","Fiat",2025,true,"GPL",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        controlMasina.ordineAn();

        controlMasina.afisare();
    }

    @Test
    public void ordineAlfabetica(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        controlMasina.ordineAlfabetica();

        controlMasina.afisare();

    }

    @Test
    public void anApropiat(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        int i = controlMasina.anApropiat(2015);

        assertEquals(masina2.getAn(),i);
    }

    @Test
    public void geamuriElectrice(){
        Masina masina = new Masina("Logan","Dacia",2010,false,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,false,"g",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        ArrayList<Masina> masini = controlMasina.geamuriElectrice();

        assertEquals(masina1,masini.get(0));
        assertEquals(masina2,masini.get(1));
        assertEquals(masina3,masini.get(2));

    }

    @Test
    public void maiNoiDe2010() {
        Masina masina = new Masina("Logan","Dacia",2010,false,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2008,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2005,false,"g",1.7);

        ControlMasina controlMasina = new ControlMasina();
        controlMasina.add(masina);
        controlMasina.add(masina1);
        controlMasina.add(masina2);
        controlMasina.add(masina3);
        controlMasina.add(masina4);

        ArrayList<Masina> masini = controlMasina.maiNoiDe2010();

        for (int i = 0; i < masini.size(); i++){
            System.out.println(masini.get(i));
        }

    }
}