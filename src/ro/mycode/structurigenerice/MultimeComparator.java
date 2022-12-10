package ro.mycode.structurigenerice;

import java.util.Comparator;

public class MultimeComparator<K extends Comparable<K>> extends Multime<K>{

    private Comparator<K> comparator;

    public MultimeComparator(Comparator<K> comparator) {
        this.comparator = comparator;
    }

    @Override
    public void afisare() {
        super.afisare();
    }


    @Override
    public void add(K k){
        if (head == null){
            head = new Nod<>(null, k);
        }else{
            Nod<K> nou = new Nod<>();
            Nod <K> temp = head;
            Nod<K> prev=temp;
            while (temp != null && comparator.compare(temp.getData(), k)<0) {
                prev = temp;
                temp = temp.getNext();
            }

            if(temp==head){
                nou.setNext(head);
                nou.setData(k);
                head=nou;
            }else {
                nou.setNext(prev.getNext());
                prev.setNext(nou);
                nou.setData(k);
            }
        }
    }

    @Override
    public void remove(K k) {
        Nod<K> temp = head;
        Nod<K> prev = temp;
        while (temp != null && comparator.compare(temp.getData(), k) < 0){
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == head){
            head = head.getNext();
        }else{
            prev.setNext(temp.getNext());
        }
    }
}
