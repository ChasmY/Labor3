import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static List<Produkt> list = new ArrayList<Produkt>();
    static List<Produkt> raising = new ArrayList<Produkt>();
    static List<Produkt> constant = new ArrayList<Produkt>();
    static List<Produkt> falling = new ArrayList<Produkt>();

    public static void add(){
        list.add(new Produkt("Lemn", 20, 10, 80, 35));
        list.add(new Produkt("Parchet", 5, 2, 9, 7));
        list.add(new Produkt("Canapea", 50, 31, 10, 6));
    }
    public static void sorting(){
        add();
        list.sort(Comparator.comparing(Produkt:: getAveragedemand));
    }

    public static void category(){
        add();
        for(Produkt prod : list) {
            if (prod.getAveragedemand() > 1) //steigend
                raising.add(prod);

            if (prod.getAveragedemand() < 1) //fallend
                falling.add(prod);

            if(prod.getAveragedemand() == 1) //constant
                constant.add(prod);
        }
    }

}

