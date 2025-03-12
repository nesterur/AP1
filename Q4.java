import java.util.Scanner;

public class Q4 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o número:");
        int num = ler.nextInt();
        ler.close();


        System.out.println("O valor ao quadrado é: " + (num*num));
        System.out.println("O valor ao cubo é: " + (num*num*num));


    }
}