package ro.mycode.Controller;

import ro.mycode.Model.Masina;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ControllerSet {

    private Set<Masina> masini;

    public ControllerSet() {
        masini = new TreeSet<>();
        this.load();
    }
    public ControllerSet(String text){
        masini = new TreeSet<>();
    }
    public void load() {
        try {
            File file = new File("D:\\mycode\\Structuri de Date\\StructuriDeDate\\src\\ro\\mycode\\Data\\Masini.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String text = scanner.nextLine();
                Masina masina = new Masina(text);
                this.masini.add(masina);
            }
            scanner.close();
        }catch (Exception e){

        }
    }
    public void save(){
        try {
            File file = new File("D:\\mycode\\Structuri de Date\\StructuriDeDate\\src\\ro\\mycode\\Data\\Masini.txt");
            FileWriter writer = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.print(this.toSave());
            printWriter.close();
        }catch (Exception e){

        }
    }
    public String toSave(){
        String text = "";
        Iterator<Masina> masinaIterator = masini.iterator();
        while (masinaIterator.hasNext()){
            text += masinaIterator.next().toString() + "\n";
        }
        return text;
    }
    public void afisare(){
        Iterator<Masina> masinaIterator = masini.iterator();
        while (masinaIterator.hasNext()){
            System.out.println(masinaIterator.next().toString());
        }
    }
    public void add(Masina masina) {
        Iterator<Masina> masinaIterator = masini.iterator();
        if (!masinaIterator.hasNext()){
            masini.add(masina);
        }else{
            masini.add(masina);
        }
    }
    public Masina celMaiNouAn() {
        Iterator<Masina> masinaIterator = masini.iterator();
        Masina maxAn = masinaIterator.next();
        while (masinaIterator.hasNext()){
            Masina masinaM = masinaIterator.next();
            if(masinaM.getAn() > maxAn.getAn()){
                maxAn = masinaM;
            }
        }
        return maxAn;
    }
    public Masina celMaiVechiAn() {
        Iterator<Masina> masinaIterator = masini.iterator();
        Masina minAn = masinaIterator.next();
        while (masinaIterator.hasNext()){
            Masina masinaM = masinaIterator.next();
            if (masinaM.getAn() < minAn.getAn()){
                minAn = masinaM;
            }
        }
        return minAn;
    }
}
