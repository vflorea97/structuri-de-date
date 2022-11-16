package ro.mycode.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void load() {
        String model1 = "Masini.txt";
        String model2 = "Persoane.txt";

        Controller controller = new Controller(model2);

        controller.afisare();

    }
}