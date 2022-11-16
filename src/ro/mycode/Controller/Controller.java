package ro.mycode.Controller;

import ro.mycode.Model.Masina;
import ro.mycode.Model.Persoane;
import ro.mycode.structurigenerice.List;

import java.io.File;
import java.util.Scanner;

public class Controller<U> {

    private List<U> list;

    public Controller(String model){
        list = new List<>();
        this.load(model);
    }

    public void load(String model) {
        try {
            File file = new File("D:\\mycode\\Structuri de Date\\StructuriDeDate\\src\\ro\\mycode\\Data\\" + model);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                if (model.equals("Masini.txt")) {
                    String text = scanner.nextLine();
                    Masina masina = new Masina(text);
                    U u = (U) masina;
                    this.list.addEnd(u);
                }else if(model.equals("Persoane.txt")){
                    String text = scanner.nextLine();
                    Persoane persoane = new Persoane(text);
                    U u = (U)persoane;
                    this.list.addEnd(u);
                }
                scanner.close();
            }

        }catch (Exception e){

        }
    }

    public void afisare(){
        for (int i = 0; i < list.size(); i++){
            System.out.println("aaaa");
        }
    }
}
