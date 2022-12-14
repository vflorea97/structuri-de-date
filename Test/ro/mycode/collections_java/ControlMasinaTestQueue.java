package ro.mycode.collections_java;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ControlMasinaTestQueue {

    @Test
    public void test1() {
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

        int size = masini.size();
        for (int i = 0; i < size; i++){
            Masina m = masini.peek();
            masini.poll();
            System.out.println(m);
        }
    }

    @Test
    public void peek() {
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
        System.out.println(masina5.toString());

    }

    @Test
    public void pull() {
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

        masini.poll();

    }

    @Test
    public void  exempluTextBalantatFolosindStivaDinJava(){
        //sa se verifice daca un text este corect balantat folosind o stiva

        String text = "Am (fost{[ cu ]} alti oameni[ la mare])";

        Queue<Character> caractere = new ArrayDeque<>();
        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{'){
                caractere.offer(text.charAt(i));
            }else if(text.charAt(i) == ')' || text.charAt(i) == ']' || text.charAt(i) == '}'){
                caractere.poll();
            }
        }
        if (caractere.isEmpty()){
            System.out.println("text balantat");
        }else{
            System.out.println("text nebalantat");
        }
    }

    @Test
    public void ex2Inversare() {

        String text = "Ana are cele mai multe mere din clasa";
        String text2 = "";

        Deque<Character> caractere = new ArrayDeque<>();

        for (int i = text.length() - 1; i >= 0; i--){
            caractere.offer(text.charAt(i));
            text2 += caractere.peek();
            caractere.remove();
        }
        System.out.println(text2);
    }




}