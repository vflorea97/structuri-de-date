package ro.mycode.structurigenerice;

import ro.mycode.structurigenerice.Nod;

public class Stiva<K> {

    private Nod<K> head = null;

    public void push(K k){
        if (head == null){
            head = new Nod<>(null, k);
        }else {
            Nod<K> nod = new Nod<>();
            nod.setData(k);
            nod.setNext(head);
            head = nod;
        }
    }

    public void pop(){
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
    public K peek(){
        Nod<K> temp = head;
        while (temp != null){
            temp = temp.getNext();
        }
        return temp.getData();
    }
}
