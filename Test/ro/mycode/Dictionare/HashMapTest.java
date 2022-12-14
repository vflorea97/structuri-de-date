package ro.mycode.Dictionare;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class HashMapTest {

    @Test
    void ex1() {
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);


        Map<String, Masina> map = new java.util.HashMap<>();

        map.put("Andrei", masina);//cheia este andrei
        map.put("Mihai", masina1);
        map.put("Alin", masina2);
        map.put("Alex", masina3);
        map.put("Marian", masina4);

        //toate cheile

        Set<String> keys = map.keySet();

        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
    }

    @Test
    public void toateValorile() {
        Masina masina = new Masina("Logan", "Dacia", 2010, false, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2008, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2012, true, "Benzina", 1.6);
        Masina masina4 = new Masina("Zero", "Jeep", 2005, false, "Motorina", 2.0);


        Map<String, Masina> map = new java.util.HashMap<>();

        map.put("Andrei", masina);//cheia este andrei
        map.put("Mihai", masina1);
        map.put("Alin", masina2);
        map.put("Alex", masina3);
        map.put("Marian", masina4);

        //toate cheile

        Set<String> keys = map.keySet();

        Iterator<String> iterator = keys.iterator();

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Set<Map.Entry<String, Masina>> entries = map.entrySet();

        Iterator<Map.Entry<String, Masina>> entryIterator = entries.iterator();

        while (entryIterator.hasNext()) {


            Map.Entry<String,Masina> entry=entryIterator.next();
            System.out.println(entry.getKey() + " are masina " + entry.getValue());
        }
    }
}
