package ro.mycode.Controller;

import org.junit.jupiter.api.Test;
import ro.mycode.Model.Masina;
import ro.mycode.Model.Persoane;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void load() {
        String model1 = "Masini.txt";
        String model2 = "Persoane.txt";

        Controller controller = new Controller(model1);

        controller.afisare();

    }

    @Test
    void save() {
        String model1 = "Masini.txt";
        String model2 = "Persoane.txt";

        Controller<Masina> controller = new Controller<>(model1);
        Masina masina = new Masina("Logan", "Dacia", 2010, true, "Benzina", 1.6);
        Masina masina1 = new Masina("A3", "Audi", 2012, true, "Motorina", 1.8);
        Masina masina2 = new Masina("X5", "BMW", 2018, true, "Motorina", 1.8);
        Masina masina3 = new Masina("2008", "Peugeot", 2020, true, "Benzina", 1.6);
        controller.add(masina);
        controller.add(masina1);
        controller.add(masina2);
        controller.add(masina3);
        controller.save(model1);

        controller.afisare();

    }

    @Test
    void remove() {
        String model1 = "Masini.txt";
        String model2 = "Persoane.txt";

        Controller<Persoane> controller = new Controller<>(model2,"new");
        Persoane persoane = new Persoane("Vali",20);
        Persoane persoane1 = new Persoane("Matei",27);
        Persoane persoane2 = new Persoane("Alex",14);
        Persoane persoane3 = new Persoane("Mihai",18);
        controller.add(persoane);
        controller.add(persoane1);
        controller.add(persoane2);
        controller.add(persoane3);

        controller.remove(persoane);
        controller.remove(persoane2);

        controller.afisare();
    }
}