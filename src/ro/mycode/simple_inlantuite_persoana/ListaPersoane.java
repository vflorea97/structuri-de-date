package ro.mycode.simple_inlantuite_persoana;

import ro.mycode.Model.Persoane;

import java.util.ArrayList;

public class ListaPersoane {

    private Node head = null;

    public void addStart(Persoane p){
        if (head == null){

            head = new Node(p, null);
        }else {
            Node node = new Node();
            node.setPersoane(p);
            node.setNext(head);
            head = node;
        }
    }

    public void addEnd(Persoane p) {
        if (head == null){

            head = new Node(p, null);
        }else{
            Node nou = head;
            while (nou != null){
                nou = nou.getNext();
            }
        }
    }
}
