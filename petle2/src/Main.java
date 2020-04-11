public class Main {

    public static void main(String[] args) {
        //petla
        int i = 10;
        while (i < 0) {
            System.out.println(i);
            i--;
        }
        System.out.println();

        //pętla do-while wykona sie jeden raz
        i = 10;
        do {
            System.out.println(i);
        } while (--i < 0);
        }
}
