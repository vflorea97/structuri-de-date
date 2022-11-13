package ro.mycode.simple_inlantuite_masina;

import ro.mycode.Model.Masina;

import java.util.ArrayList;

public class Lista{

    private  Node head=null;

    void addStart(Masina m){
        if(head==null){

            head= new Node(m,null);

        }else{
            Node nou= new Node();
            nou.setMasina(m);
            nou.setNext(head);
            head=nou;
        }
    }

    public  Node iterator(){

        return  this.head;
    }

    //void afisare
    public void afisare (){

        Node temp=head;

        while (temp!=null){

            System.out.println(temp.getMasina());
            temp=temp.getNext();
        }

    }

    //todo:add sfarsit
    public void addToEnd(Masina m){
        if (head == null){

            head = new Node(m, null);
        }else {

            Node temp=head;

            while (temp.getNext()!=null){

                temp=temp.getNext();
            }
            Node nou=new Node(m,null);

            temp.setNext(nou);
        }
    }

    //todo:fuctie ce adauga pe  anumita pozitie

    public void addElementPePozitie(int poz, Masina m){

        if(poz==0) {

            this.addStart(m);
        }else {
            Node aux = head;
            int ct = 0;
            while (aux != null && poz - 1 != ct) {
                aux = aux.getNext();
                ct++;
            }
            Node nou = new Node();
            nou.setMasina(m);
            nou.setNext(aux.getNext());
            aux.setNext(nou);
        }
    }

    public int size (){

        int ct=0;
        Node aux=head;
        while (aux!=null){
            aux = aux.getNext();
            ct++;
        }

        return ct;
    }

    //delete first

    public void removeStart(){

        head=head.getNext();

    }

    //delete last node
    public void removeLastNode(){

        Node temp=head;
        while (temp.getNext().getNext()!=null){

            temp=temp.getNext();
        }
        temp.setNext(null);
    }


    public void removeElementPozitie(int poz){

        if (poz == 0){
            removeStart();
        }else{
            Node temp = head;
            int poz1 = 0;
            while (temp != null &&poz1!=poz-1){
                temp=temp.getNext();
                poz1++;
            }

            temp.setNext(temp.getNext().getNext());
        }


    }

}
