import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int tab[] = new int[10];
        int i = 0;
        Random generuj = new Random();

        while (i < 10) {
            tab[i] = generuj.nextInt(10);
            System.out.println(i + ". " + tab[i]);
            i++;
        }
        boolean i1 = true;
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tab[j] == i && i1 == true) {
                    i1 = false;
                    System.out.println("Najmniejszy element to: " + i + ", index: " + j);
                }
            }
        }
    }
}




