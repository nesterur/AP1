import java.util.Scanner;


public class Q6 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a:");
        int a = ler.nextInt();


        System.out.println("Insira b:");
        int b = ler.nextInt();

        System.out.println("Insira c:");
        int c = ler.nextInt();
        ler.close();

        int delta = (b*b - 4*a*c);

        System.out.println("O delta é: " + delta );


    }
}
