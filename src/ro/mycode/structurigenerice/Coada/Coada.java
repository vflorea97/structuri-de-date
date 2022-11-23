package ro.mycode.structurigenerice.Coada;

import ro.mycode.simple_inlantuite_persoana.Node;
import ro.mycode.structurigenerice.Nod;

public class Coada<K> {

    private Nod<K> head = null;


    public void afisare() {
        Nod<K> temp = head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void add(K k) {
        if (head == null) {
            head = new Nod<>(null, k);
        } else {
            Nod<K> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Nod<K> nod = new Nod<>(null, k);
            temp.setNext(nod);
        }
    }
    public K peek() {
        Nod<K> temp = head;
        while (temp == null){
            return null;
        }
        return temp.getData();
    }
    public void remove(){
        head = head.getNext();
    }
    public int size(){
        Nod<K> temp = head;
        int size = 0;
        while (temp != null){
            temp = temp.getNext();
            size++;
        }
        return size;
    }
    public boolean isEmpty(){
        if (size() == 0){
            return true;
        }
        return false;

    }


}
