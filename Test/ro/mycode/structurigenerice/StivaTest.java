package ro.mycode.structurigenerice;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;
import ro.mycode.structurigenerice.Stiva;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StivaTest {

    @Test
    void push() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Stack<Masina> masinas = new Stack<>();
        masinas.push(masina);
        masinas.push(masina1);
        masinas.push(masina2);
        masinas.push(masina3);

        System.out.println(masinas.toString());
    }
    @Test
    void pop() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Stack<Masina> masinas = new Stack<>();
        masinas.push(masina);
        masinas.push(masina1);
        masinas.push(masina2);
        masinas.push(masina3);

        masinas.pop();

        System.out.println(masinas.toString());
    }

    @Test
    void size() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Stack<Masina> masinas = new Stack<>();
        masinas.push(masina);
        masinas.push(masina1);
        masinas.push(masina2);
        masinas.push(masina3);

        int size = masinas.size();

        assertEquals(4,size);

    }

    @Test
    void isEmpty() {
        Stack<Masina> masinas = new Stack<>();

        boolean isEmpty = masinas.isEmpty();

        assertEquals(true,isEmpty);
    }

    @Test
    void peek() {
        Masina masina = new Masina("Logan","Dacia",2010,true,"Benzina",1.6);
        Masina masina1 = new Masina("A3","Audi",2012,true,"Motorina",1.8);
        Masina masina2 = new Masina("X5","BMW",2018,true,"Motorina",1.8);
        Masina masina3 = new Masina("2008","Peugeot",2020,true,"Benzina",1.6);

        Stack<Masina> masinas = new Stack<>();
        masinas.push(masina);
        masinas.push(masina1);
        masinas.push(masina2);
        masinas.push(masina3);

        Masina masina4 = masinas.peek();

        assertEquals(masina3,masina4);
        System.out.println(masinas.toString());

    }
    @Test
    void  pb(){
        //sa verificam daca un text este corect balantat folosind stiva
        //"asdsad(asdadsa)asdasd)("
        String text = "Ana (()()(are)(mai multe)) mere {[]}({})[]decat Andrei";

        Stiva<Character> characterStiva = new Stiva<>();

        boolean flag=true;
         for(int i=0;i<text.length();i++){
             if(text.charAt(i)=='(' || text.charAt(i) == '[' || text.charAt(i) == '{'){

                 characterStiva.push(text.charAt(i));
             }else if(text.charAt(i)==')' || text.charAt(i) == ']' || text.charAt(i) == '}'){

                    if(characterStiva.isEmpty()){
                        flag=false;
                    }else{

                        characterStiva.pop();
                    }
             }
         }
         if(characterStiva.isEmpty()&&flag==true){
             System.out.println("textul este corect balantat");
         }else{
             System.out.println("Nu este balantat");
         }
    }
}