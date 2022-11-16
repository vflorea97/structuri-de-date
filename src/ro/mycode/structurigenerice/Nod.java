package ro.mycode.structurigenerice;

import ro.mycode.Model.Masina;

public class Nod<T>{
    Nod<T> next;
    T data;

    public Nod(Nod<T> next, T data) {
        this.next = next;
        this.data = data;
    }

    public Nod() {
    }

    public Nod<T> getNext() {
        return next;
    }

    public void setNext(Nod<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
