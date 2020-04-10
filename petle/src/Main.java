public class Main {

    public static void main(String[] args) {
        //for
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //while
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        //do
        i = 1;
        do {
            System.out.print(i + " ");
        }
        while (i++ < 10); //lub while(++i<11);
        System.out.println();

        //foreach
        int tab[] = {1,2,3,4,5,6,7,8,9,10};
        for(int l : tab) {
            System.out.print(l + " ");
        }
    }
}

