
package ro.mycode.structurigenerice;
import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;
import ro.mycode.structurigenerice.Coada;

import static org.junit.jupiter.api.Assertions.*;

class CoadaTest {

    @Test
    void add() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Coada<Masina> masinas = new Coada<>();
        masinas.add(masina);
        masinas.add(masina1);
        masinas.add(masina2);
        masinas.add(masina3);

        masinas.afisare();

    }

    @Test
    void peek() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Coada<Masina> masinas = new Coada<>();
        masinas.add(masina);
        masinas.add(masina1);
        masinas.add(masina2);
        masinas.add(masina3);

        Masina masina4 = masinas.peek();

        assertEquals(masina,masina4);
    }

    @Test
    public void remove(){
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Coada<Masina> masinas = new Coada<>();
        masinas.add(masina);
        masinas.add(masina1);
        masinas.add(masina2);
        masinas.add(masina3);

        masinas.remove();
        masinas.remove();
        masinas.afisare();

    }
    @Test
    void size() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Coada<Masina> masinas = new Coada<>();
        masinas.add(masina);
        masinas.add(masina1);
        masinas.add(masina2);
        masinas.add(masina3);

        int size = masinas.size();

        assertEquals(4,size);

    }

    @Test
    void isEmpty() {
        Coada<Masina> masinas = new Coada<>();

        boolean isEmpty = masinas.isEmpty();

        assertEquals(true,isEmpty);
    }
    //sa se inverseze un string folosind coada

    @Test
    public void problemaCoada() {

        String text = "Am fost la munte si mi-a placut";
        String text1 = "";

        Coada<Character> characterCoada = new Coada<>();

        for (int i = text.length() - 1; i >= 0; i--){
            characterCoada.add(text.charAt(i));
            text1 += characterCoada.peek();
            characterCoada.remove();
        }
        System.out.println(text1);
    }
}