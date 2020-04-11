import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String a = "a";
        final String b = "b";
        final String c = "c";

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj znak: ");
        String znak = scan.nextLine();

    // zad. 1
//        switch (znak) {
//            case a:
//                System.out.println(a);
//                break;
//            case b:
//                System.out.println(b);
//                break;
//            case c:
//                System.out.println(c);
//            default:
//                System.out.println("Nie ma takiej literki");
//        }
//zad. 2
        switch(znak) {
            case a:
                System.out.println(a);
                break;
            case c:
                System.out.println(c);
                break;
            default:
                System.out.println(a + '\n' + b);
        }
    }
}
