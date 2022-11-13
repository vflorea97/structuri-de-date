package ro.mycode.simple_inlantuite_persoana;

import ro.mycode.Model.Persoane;

public class Node {

    private Persoane persoane;
    private Node next;

    public Node(Persoane persoane, Node next) {
        this.persoane = persoane;
        this.next = next;
    }

    public Node() {
    }

    public Persoane getPersoane() {
        return persoane;
    }

    public void setPersoane(Persoane persoane) {
        this.persoane = persoane;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
