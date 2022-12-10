package ro.mycode.simple_inlantuite_masina;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;

class ListaTest {

    @Test
    void addStart() {

        Masina masina = new Masina("Spring1","Dacia",2021,true,"Electric",1);
        Masina masina1 = new Masina("Spring2","Dacia",2021,true,"Electric",1);
        Masina masina2 = new Masina("Spring3","Dacia",2021,true,"Electric",1);
        Masina masina3 = new Masina("Spring4","Dacia",2021,true,"Electric",1);
        Masina masina4 = new Masina("Spring5","Dacia",2021,true,"Electric",1);
        Masina masina5 = new Masina("Spring6","Dacia",2021,true,"Electric",1);
        Masina masina6 = new Masina("Spring7","Dacia",2021,true,"Electric",1);


//        Lista lista= new Lista();
//
//        lista.addStart(masina);
//        lista.addStart(masina1);
//        lista.addStart(masina2);
//        lista.addStart(masina3);
//        lista.addStart(masina4);
//        lista.addStart(masina5);
//        lista.addStart(masina6);

        Lista lista1 = new Lista();
        lista1.addToEnd(masina);
        lista1.addToEnd(masina1);
        lista1.addToEnd(masina2);
        lista1.addToEnd(masina5);


        lista1.addElementPePozitie(2,masina3);
        lista1.removeElementPozitie(0);

        lista1.afisare();








    }


    @Test
    public void erase() {

        Masina masina = new Masina("Spring1","Dacia",2021,true,"Electric",1);
        Masina masina1 = new Masina("Spring2","Dacia",2021,true,"Electric",1);
        Masina masina2 = new Masina("Spring3","Dacia",2021,true,"Electric",1);
        Masina masina3 = new Masina("Spring4","Dacia",2021,true,"Electric",1);
        Masina masina4 = new Masina("Spring5","Dacia",2021,true,"Electric",1);

        Lista lista = new Lista();
        lista.addToEnd(masina);
        lista.addToEnd(masina1);
        lista.addToEnd(masina2);
        lista.addToEnd(masina3);
        lista.addToEnd(masina4);

//        lista.addStart(masina);
//        lista.addStart(masina1);
//        lista.addStart(masina2);
//        lista.addStart(masina3);
//        lista.addStart(masina4);

        lista.afisare();

    }



}