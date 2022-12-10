package ro.mycode.structurigenerice;

import org.junit.jupiter.api.Test;
import ro.mycode.Comparator.ComparatorMasinaAn;
import ro.mycode.Model.Masina;
import ro.mycode.Model.Persoane;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void addStartMasini() {

        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addEnd(masina);
        masinaList.addEnd(masina1);
        masinaList.addEnd(masina2);
        masinaList.addEnd(masina3);

        masinaList.afisare();
    }

    @Test
    void addStartPersoane(){

        Persoane persoane = new Persoane("Vali",20);
        Persoane persoane1 = new Persoane("Matei",27);
        Persoane persoane2 = new Persoane("Alex",14);
        Persoane persoane3 = new Persoane("Mihai",18);

        List<Persoane> persoaneList = new List<>();
        persoaneList.addStart(persoane);
        persoaneList.addStart(persoane1);
        persoaneList.addStart(persoane2);
        persoaneList.addStart(persoane3);

    }

    @Test
    void afisare() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addStart(masina);
        masinaList.addStart(masina1);
        masinaList.addStart(masina2);
        masinaList.addStart(masina3);

        masinaList.afisare();
    }

    @Test
    void removePoz(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addEnd(masina);
        masinaList.addEnd(masina1);
        masinaList.addEnd(masina2);
        masinaList.addEnd(masina3);

        masinaList.removePoz(2);
        assertEquals(masina3,masinaList.get(2));

    }

    @Test
    void removeObj(){
        Persoane persoane = new Persoane("Vali",20);
        Persoane persoane1 = new Persoane("Matei",27);
        Persoane persoane2 = new Persoane("Alex",14);
        Persoane persoane3 = new Persoane("Mihai",18);

        List<Persoane> persoaneList = new List<>();
        persoaneList.addEnd(persoane);
        persoaneList.addEnd(persoane1);
        persoaneList.addEnd(persoane2);
        persoaneList.addEnd(persoane3);

        persoaneList.removeObj(persoane);

        assertEquals(persoane1,persoaneList.get(0));
    }

    @Test
    void contains(){
        Persoane persoane = new Persoane("Vali",20);
        Persoane persoane1 = new Persoane("Matei",27);
        Persoane persoane2 = new Persoane("Alex",14);
        Persoane persoane3 = new Persoane("Mihai",18);

        List<Persoane> persoaneList = new List<>();
        persoaneList.addStart(persoane);
        persoaneList.addStart(persoane1);
        persoaneList.addStart(persoane2);
        persoaneList.addStart(persoane3);

        boolean tru = persoaneList.contains(persoane);
        boolean tru1 = persoaneList.contains(persoane1);
        boolean tru2 = persoaneList.contains(persoane2);
        boolean tru3 = persoaneList.contains(persoane3);

        assertEquals(true,tru);
        assertEquals(true,tru1);
        assertEquals(true,tru2);
        assertEquals(true,tru3);
    }

    @Test
    void isEmpty(){
        Persoane persoane = new Persoane("Vali",20);
        Persoane persoane1 = new Persoane("Matei",27);
        Persoane persoane2 = new Persoane("Alex",14);
        Persoane persoane3 = new Persoane("Mihai",18);

        List<Persoane> persoaneList = new List<>();
        persoaneList.addStart(persoane);
        persoaneList.addStart(persoane1);
        persoaneList.addStart(persoane2);
        persoaneList.addStart(persoane3);

        List<Masina> masinaList = new List<>();

        boolean list1 = persoaneList.isEmpty();
        boolean list2 = masinaList.isEmpty();

        assertEquals(false,list1);
        assertEquals(true,list2);

    }

    @Test
    void indexOf(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addEnd(masina);
        masinaList.addEnd(masina1);
        masinaList.addEnd(masina2);
        masinaList.addEnd(masina3);

        int poz = masinaList.indexOf(masina);
        int poz1 = masinaList.indexOf(masina1);
        int poz2 = masinaList.indexOf(masina2);
        int poz3 = masinaList.indexOf(masina3);

        assertEquals(0,poz);
        assertEquals(1,poz1);
        assertEquals(2,poz2);
        assertEquals(3,poz3);
    }

    @Test
    void get(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addEnd(masina);
        masinaList.addEnd(masina1);
        masinaList.addEnd(masina2);
        masinaList.addEnd(masina3);

        assertEquals(masina,masinaList.get(0));
        assertEquals(masina1,masinaList.get(1));
        assertEquals(masina2,masinaList.get(2));
        assertEquals(masina3,masinaList.get(3));
    }

    @Test
    public void set() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addEnd(masina);
        masinaList.addEnd(masina1);
        masinaList.addEnd(masina2);
        masinaList.addEnd(masina3);

        masinaList.set(masina2, 0);
        assertEquals(masinaList.get(0),masina2);

        masinaList.set(masina2, 1);
        assertEquals(masinaList.get(1),masina2);

        masinaList.set(masina2, 2);
        assertEquals(masinaList.get(2),masina2);

        masinaList.set(masina2, 3);
        assertEquals(masinaList.get(3),masina2);
    }

    @Test
    public void sort() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);
        Masina masina4 = new Masina("PAC","PACPAC",2010,true,"Benzina",1.6);
        Masina masina5 = new Masina("Poc","BMW",2003,false,"Motorina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addEnd(masina);
        masinaList.addEnd(masina1);
        masinaList.addEnd(masina2);
        masinaList.addEnd(masina3);
        masinaList.addEnd(masina4);
        masinaList.addEnd(masina5);

        masinaList.sort();

        assertEquals(masina3,masinaList.get(0));
        assertEquals(masina2,masinaList.get(5));

    }

    @Test
    public void sortComparator() {
        ComparatorMasinaAn comparatorMasinaAn = new ComparatorMasinaAn();

        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);
        Masina masina4 = new Masina("PAC","PACPAC",2010,true,"Benzina",1.6);
        Masina masina5 = new Masina("Poc","BMW",2003,false,"Motorina",1.6);

        List<Masina> masinaList = new List<>();
        masinaList.addEnd(masina);
        masinaList.addEnd(masina1);
        masinaList.addEnd(masina2);
        masinaList.addEnd(masina3);
        masinaList.addEnd(masina4);
        masinaList.addEnd(masina5);

        masinaList.sort(comparatorMasinaAn);

        assertEquals(masina5,masinaList.get(0));
        assertEquals(masina3,masinaList.get(5));

    }
}