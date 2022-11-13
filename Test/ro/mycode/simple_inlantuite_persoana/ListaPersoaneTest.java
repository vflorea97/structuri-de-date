package ro.mycode.simple_inlantuite_persoana;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Persoane;

import static org.junit.jupiter.api.Assertions.*;

class ListaPersoaneTest {

    @Test
    void addStart() {

        Persoane persoane = new Persoane("Mihai",12);
        Persoane persoane1 = new Persoane("Alex",15);
        Persoane persoane2 = new Persoane("Horia",23);

        ListaPersoane listaPersoane = new ListaPersoane();
        listaPersoane.addStart(persoane);
        listaPersoane.addStart(persoane1);
        listaPersoane.addStart(persoane2);


    }
}