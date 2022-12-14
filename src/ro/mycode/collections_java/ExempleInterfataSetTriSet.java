package ro.mycode.collections_java;

import ro.mycode.Model.Masina;

import java.util.Set;
import java.util.TreeSet;

public class ExempleInterfataSetTriSet {



     public  static  void add(){
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


     }
}
