package ro.mycode.structurigenerice;

public class Multime<K extends Comparable<K>>{

    protected Nod<K> head = null;


//    private

    public void afisare(){
        Nod<K> temp = head;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
//    public int size(){
//        Nod<K> temp = head;
//        int size = 0;
//        while (temp != null){
//            temp = temp.getNext();
//            size++;
//        }
//        return size;
//    }
//    public K get(int i){
//        Nod<K> temp = head;
//        int contor = 0;
//        while (temp != null && i != contor){
//            temp = temp.getNext();
//            contor++;
//        }
//        return temp != null ? temp.data : null;
//    }
//    public void set(K k,int i) {
//        Nod<K> temp = head;
//        int contor = 0;
//        while (temp != null && i != contor) {
//            temp = temp.getNext();
//            contor++;
//        }
//        temp.setData(k);
//    }
    public void add(K k){
        if (head == null){
            head = new Nod<>(null, k);
        }else{
            Nod<K> nou = new Nod<>();
            Nod <K> temp = head;
            Nod<K> prev=temp;
            while (temp != null&&temp.getData().compareTo(k)<0) {
                prev = temp;
                temp = temp.getNext();
            }

            if(temp==head){
                nou.setNext(head);
                head=nou;
            }else {
                nou.setNext(prev.getNext());
                prev.setNext(nou);
                nou.setData(k);
            }
        }
    }
    public int indexOf(K k){
        Nod<K> temp = head;
        int i = 0;
        while (temp != null){
            if (temp.getData().equals(k)){
                return i;
            }
            temp = temp.getNext();
            i++;
        }
        return -1;
    }
    public void remove(K k){

        Nod<K> temp = head;
        Nod<K> prev = temp;
        while (temp != null && temp.getData().equals(k)==false){
            prev = temp;
            temp = temp.getNext();
        }

        if (temp == head){
            head = head.getNext();
        }else {
            prev.setNext(temp.getNext());
        }
    }


}
//as face un while  prin care sa ajung la pozitia de inserat while(

//12 34 45 ? 123 4343 2133