package ro.mycode.collections_java;

import ro.mycode.Model.Masina;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class ExempleInterfataQueue {

    public static void ex1() {
        Masina masina = new Masina("Logan","Dacia",2010,false,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2008,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("Zero","Jeep",2005,false,"Motorina",2.0);

        Queue<Masina> masini = new ArrayDeque<>();
        masini.offer(masina);
        masini.offer(masina1);
        masini.offer(masina2);
        masini.offer(masina3);
        masini.offer(masina4);

        Iterator<Masina> masinaIterator = masini.iterator();
        while (masinaIterator.hasNext()){
            Masina masinaM = masinaIterator.next();
            System.out.println(masinaM);
        }
    }
    public static void ex2(){
        Masina masina = new Masina("Logan","Dacia",2010,false,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2008,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("Zero","Jeep",2005,false,"Motorina",2.0);

        Queue<Masina> masini = new ArrayDeque<>();
        masini.offer(masina);
        masini.offer(masina1);
        masini.offer(masina2);
        masini.offer(masina3);
        masini.offer(masina4);

        Masina masina5 = masini.peek();

    }

}
