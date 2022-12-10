package ro.mycode.structurigenerice;

import java.util.Comparator;

public class List <U extends Comparable<U>>{

    private Nod<U> head=null;

    public void addStart(U u){
        if (head == null){
            head = new Nod<>(null, u);
        }else {
            Nod<U> nod = new Nod<>();
            nod.setData(u);
            nod.setNext(head);
            head = nod;
        }
    }
    public void addPoz(U u, int poz){
        if (poz == 0){
            addEnd(u);
        }else {
            Nod<U> temp = head;
            int contor = 0;
            while (temp != null && contor != poz - 1) {
                temp = temp.getNext();
                contor++;
            }
            Nod<U> nod = new Nod<>();
            nod.setData(u);
            nod.setNext(temp.getNext());
            temp.setNext(nod);
        }
    }
    public void removeStart(){
        head = head.getNext();
    }
    public void afisare() {
        Nod<U> temp = head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void addEnd(U u) {
        if (head == null) {
            head = new Nod<>(null, u);
        } else {
            Nod<U> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            Nod<U> nod = new Nod<>(null, u);
            temp.setNext(nod);
        }
    }
    public void removePoz(int poz){
        Nod<U> temp = head;
        int contor = 0;
        while (temp != null && contor != poz -1){
            temp = temp.getNext();
            contor++;
        }
        temp.setNext(temp.getNext().getNext());
    }
    public void removeObj(U u){
        int poz = indexOf(u);
        if (poz == 0){
            removeStart();
        }else {
            Nod<U> temp = head;
            int contor = 0;
            while (temp != null && contor != poz - 1) {
                temp = temp.getNext();
                contor++;
            }
            temp.setNext(temp.getNext().getNext());
        }
    }
    public boolean contains(U u){
        Nod<U> temp = head;
        while (temp != null){
            if (temp.getData().equals(u)){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    public boolean isEmpty(){
        if (size() == 0){
            return true;
        }
        return false;
    }
    public int indexOf(U u) {
        Nod<U> temp = head;
        int i = 0;
        while (temp != null){
            if (temp.getData().equals(u)){
                return i;
            }
            temp = temp.getNext();
            i++;
        }
        return -1;
    }
    public int size(){
        Nod<U> temp = head;
        int size = 0;
        while (temp != null){
            temp = temp.getNext();
            size++;
        }
        return size;
    }
    public U get(int i){
        Nod<U> temp = head;
        int contor = 0;
        while (temp != null && i != contor){
            temp = temp.getNext();
            contor++;
        }
        return temp != null ? temp.getData() : null;
    }
    public void set(U u, int i){
        Nod<U> temp = head;
        int contor = 0;
        while (temp != null && i != contor){
            temp = temp.getNext();
            contor++;
        }

        temp.setData(u);
    }
    //todo:sorteaza

    public void sort() {
        boolean flag;
        do {
            flag = true;
            for (int i = 0; i < size()-1; i++){

                 U prev=this.get(i);
                 U next=this.get(i+1);
                 if(prev.compareTo(next)>0){
                     U aux=prev;
                     set(next,i);
                     set(aux,i+1);

                     flag=false;

                 }
            }
        }
        while (!flag);
    }

    public void sort(Comparator<U> comparator){
        boolean flag;
        do {
            flag = true;
            for (int i = 0; i < size() - 1; i++){
                U prev = this.get(i);
                U next = this.get(i + 1);
                if (comparator.compare(prev, next) > 0){
                    U aux = prev;
                    set(next, i);
                    set(aux, i + 1);
                    flag = false;
                }
            }

        }while (!flag);
    }
}
