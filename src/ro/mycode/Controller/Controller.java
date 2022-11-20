package ro.mycode.Controller;

import ro.mycode.Model.Masina;
import ro.mycode.Model.Persoane;
import ro.mycode.structurigenerice.List;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Controller<U> {

    private List<U> list;

    public Controller(String model){
        list = new List<>();
        this.load(model);
    }
    public Controller(String model, String text){
        list = new List<>();
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
            }
            scanner.close();

        }catch (Exception e){

        }
    }

    public void save(String model){
        try{
            File file = new File("D:\\mycode\\Structuri de Date\\StructuriDeDate\\src\\ro\\mycode\\Data\\" + model);
            if (model.equals("Masini.txt") || model.equals("Persoane.txt")) {
                FileWriter writer = new FileWriter(file);
                PrintWriter printWriter = new PrintWriter(writer);
                printWriter.print(this.toSave());
                printWriter.close();
            }

        }catch (Exception e){

        }
    }

    public String toSave(){
        String text = "";
        int i = 0;
        for (i = 0; i < list.size() - 1; i++){
            text += this.list.get(i) + "\n";
        }
        text += this.list.get(i);
        return text;

    }
    public void afisare(){
       this.list.afisare();

    }
    public void add(U u){
        this.list.addEnd(u);
    }
    public void remove(U u){
        this.list.removeObj(u);
    }


}
