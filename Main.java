import java.util.*;

public class Main {

    public static <T> String Iam(T objekt){
        return ("Podany obiekt to " +objekt.getClass().getSimpleName());
    }
    public static <T> void Wyswietl(T... args){
        System.out.println("Lista {");
        for(T arg : args){
            System.out.println(arg);
        }
        System.out.println("}");
    }
    public static void CenaZestawu(Zestaw zestaw){
        System.out.println("Cena zestawu z procesorem od "+zestaw.toString()+ " to " +zestaw.getCena()+ " $");
    }

    public static void main(String... args) {
        System.out.println("       Zadanie 1");
        System.out.println("-----------------------");

        int n = 5;
        System.out.println(Iam(n));
        double f = 5.f;
        System.out.println(Iam(f));
        String l = new String();
        System.out.println(Iam(l));

        System.out.println("-----------------------");
        System.out.println("       Zadanie 2");
        System.out.println("-----------------------");

        String[] tekst = {"Ala", "ma", "kota"};
        Wyswietl(tekst);
        Wyswietl("a", "kot", "ma", "Ale");
        Wyswietl(1,2,3,4,5,6,7,8,9,10);

        System.out.println("-----------------------");
        System.out.println("       Zadanie 3");
        System.out.println("-----------------------");

        Tale tale = new Tale();
        tale.ToBase();
        System.out.println();
        Spoon spoon = new Spoon();
        spoon.ToBase();

        System.out.println("-----------------------");
        System.out.println("       Zadanie 4");
        System.out.println("-----------------------");

        spoon.SplashWaterOn();
        spoon.Take();
        tale.SplashWaterOn();

        System.out.println("-----------------------");
        System.out.println("       Zadanie 5");
        System.out.println("-----------------------");

        CenaZestawu(Zestaw.Intel);
        CenaZestawu(Zestaw.AMD);
        CenaZestawu(Zestaw.IBM);

        System.out.println("-----------------------");
        System.out.println("       Zadanie 6");
        System.out.println("-----------------------");

        List<Double> liczby = new ArrayList<>();
        Random rng = new Random();
        int LiczbaElementow = rng.nextInt(40)+1;

        Random generator = new Random();

        for(int i = 0; i < LiczbaElementow; i++){
            liczby.add(generator.nextDouble()*100);
        }

        Collections.sort(liczby);
        System.out.println("Kolekcja : {");
        double suma = 0;
        for(int i = 0; i < LiczbaElementow; i++){
            System.out.print(liczby.get(i) + " ");
            suma += liczby.get(i);
        }
        System.out.println("}");
        System.out.println("Średnia : "+ (suma/LiczbaElementow));

        double M;

        if(LiczbaElementow % 2 == 0){
            int nm = (LiczbaElementow / 2);
            int nd = (LiczbaElementow / 2) + 1;
            M = (liczby.get(nm) + liczby.get(nd)) / 2;
        } else {
            M = liczby.get((int)((LiczbaElementow/2) + 0.5));
        }
        System.out.println("Mediana : "+ M);

        System.out.println("-----------------------");
    }
}
