package ro.mycode.Controller;

import ro.mycode.Model.Masina;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControllerMasinaMap {

    private Map<String, Masina> masinaMap;

    public ControllerMasinaMap(){
        masinaMap = new HashMap<>();
        this.load();
    }
    public void load() {
        try {
            File file = new File("D:\\mycode\\Structuri de Date\\StructuriDeDate\\src\\ro\\mycode\\Data\\Masini.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String text = scanner.nextLine();
                masinaMap.put(text.split(",")[0],new Masina(text));
            }

        }catch (Exception e){

        }
    }
    public void save() {
        try {
            File file = new File("D:\\mycode\\Structuri de Date\\StructuriDeDate\\src\\ro\\mycode\\Data\\Masini.txt");


        }catch (Exception e){

        }
    }
}
