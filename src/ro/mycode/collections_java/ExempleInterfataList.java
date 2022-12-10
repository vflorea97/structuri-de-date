package ro.mycode.collections_java;

import ro.mycode.Model.Masina;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExempleInterfataList {


    public  static  void ex1(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2020,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2012,true,"Benzina",1.6);
        Masina masina4 = new Masina("aa","bb",2025,true,"g",1.7);

        List<Masina > masini= new ArrayList<>();
        masini.add(masina);
        masini.add(masina1);
        masini.add(masina2);
        masini.add(masina3);
        masini.add(masina4);

        Iterator<Masina> masinaIterator=masini.iterator();


        while (masinaIterator.hasNext()){

             Masina m=masinaIterator.next();

            System.out.println(m);
        }

    }
}
