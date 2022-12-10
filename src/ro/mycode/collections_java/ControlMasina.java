package ro.mycode.collections_java;

import ro.mycode.Model.Masina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControlMasina {

    private List<Masina> masinaList;

    public ControlMasina() {
        masinaList = new ArrayList<>();
    }
    public void afisare(){
        Iterator<Masina> masinaIterator = masinaList.iterator();
        while (masinaIterator.hasNext()){
            Masina masina = masinaIterator.next();
            System.out.println(masina);
        }
    }
    public void add(Masina masina) {
        Iterator<Masina> masinaIterator = masinaList.iterator();
        if (!masinaIterator.hasNext()){
            masinaList.add(masina);
        }else{
            masinaList.add(masina);
        }
    }
    public void remove(Masina masina){
        Iterator<Masina> masinaIterator = masinaList.iterator();
        while (masinaIterator.hasNext()){
            if (masinaIterator.next().equals(masina)){
                masinaIterator.remove();
            }
        }
    }
    public Masina celMaiNouAn(){
        Iterator<Masina> masinaIterator = masinaList.iterator();

        Masina maxim=masinaIterator.next();

        while (masinaIterator.hasNext()){

            Masina m=masinaIterator.next();

            if(m.getAn()>maxim.getAn()){

                maxim=m;
            }
        }
        return maxim;
    }

    public void ordineAn(){
        Iterator<Masina> masinaIterator = masinaList.iterator();
        boolean run;
        do {
            run = true;
            for (int i = 0; i < masinaList.size() - 1; i++) {
                if (masinaList.get(i).getAn() > masinaList.get(i + 1).getAn()) {
                    Masina element = masinaList.get(i);
                    masinaList.set(i, masinaList.get(i + 1));
                    masinaList.set(i + 1, element);
                    run = false;
                }
            }
        }
        while (!run && masinaIterator.hasNext());
    }

    public void ordineAlfabetica(){
        Iterator<Masina> masinaIterator = masinaList.iterator();
        boolean run;
        do {
            run = true;
            for (int i = 0; i < masinaList.size() - 1; i++) {
                if (masinaList.get(i).getModel().compareTo(masinaList.get(i + 1).getModel()) > 0) {
                    Masina element = masinaList.get(i);
                    masinaList.set(i, masinaList.get(i + 1));
                    masinaList.set(i + 1, element);
                    run = false;
                }
            }
        }
        while (!run && masinaIterator.hasNext());

    }
    public int [] ani () {
        Iterator<Masina> masinaIterator = masinaList.iterator();
        int [] ani = new int[masinaList.size()];
        int ct = 0;
        while (masinaIterator.hasNext()){
            ani[ct] = masinaIterator.next().getAn();
            ct++;
        }
        return ani;
    }
    public int anApropiat (int anDorit){
        int index = 0;
        int diferenta = Math.abs(ani()[0] - anDorit);
        for (int i = 1; i < ani().length; i++){
            int diferenta2 = Math.abs(ani()[i] - anDorit);
            if (diferenta2 < diferenta){
                index = i;
                diferenta = diferenta2;
            }
        }
        return ani()[index];
    }

    public ArrayList<Masina> geamuriElectrice(){
        Iterator<Masina> masinaIterator = masinaList.iterator();
        ArrayList<Masina> masini = new ArrayList<>();
        while (masinaIterator.hasNext()){
            Masina masina = masinaIterator.next();
            if (masina.isGeamuriElectrice()){
                masini.add(masina);
            }
        }
        return masini;

    }
    public ArrayList<Masina> maiNoiDe2010(){
        Iterator<Masina> masinaIterator = masinaList.iterator();
        ArrayList<Masina> masini = new ArrayList<>();
        while (masinaIterator.hasNext()){
            Masina masina = masinaIterator.next();
            if (masina.getAn() >= 2010){
                masini.add(masina);
            }
        }
        return masini;

    }

}
