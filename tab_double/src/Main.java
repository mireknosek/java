import java.util.Random;

public class Main {

    public static void main(String[] args) {
        double tablica[] = new double[10];
        Random generuj = new Random();

        int i = 0;
        do {
            tablica[i] = generuj.nextDouble();
            System.out.println(tablica[i]);
        } while (++i < 10);
        System.out.println();
        System.out.println("Parzyste indexy");
        for(i = 0; i < tablica.length; i++) {
            if(i%2 == 0) {
                System.out.println(i + ". " + tablica[i]);
                int l = (int)(tablica[i]*1000000000);
                if(l % 2 > 0) {
                    System.out.println();
                    System.out.println("Nieparzysta liczba (int): " + (l));
                    System.out.println();
                }
            }
        }

    }
}