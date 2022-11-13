package ro.mycode.simple_inlantuite_masina;

import ro.mycode.Model.Masina;

public class Node {

    private Masina masina;
    private Node next;

    public Node(Masina masina, Node next) {
        this.masina = masina;
        this.next = next;
    }

    public Node() {
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
