import java.util.Scanner;

public class Q5 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a base do triângulo:");
        float base = ler.nextFloat();


        System.out.println("Insira a altura do triângulo:");
        float altura = ler.nextFloat();
        ler.close();


        System.out.println("A área do triângulo é: " + (base*altura)/2 );


    }
}
