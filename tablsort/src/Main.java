import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tab[] = new int[10];
        int tabIndex[] = new int[10];
        int i = 0;
        Random liczba = new Random();
        do {
            tab[i] = liczba.nextInt(10);
            System.out.println(i + ". " + tab[i]);
        }
        while (++i < 10);
        System.out.println();

        int l;
        int l1;
        int temp = tab[0];
        for (i = 0; i < 9; i++) {
            l = tab[i];
            l1 = tab[i + 1];
            if (l < l1 && l < temp) {
                temp = l;
            }
        }
        System.out.println("najmniejsza wartość: " + temp);

    }
}
