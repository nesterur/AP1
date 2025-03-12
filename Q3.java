import java.util.Scanner;

public class Q3 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira seu peso:");
        float peso = ler.nextFloat();


        System.out.println("Insira sua altura:");
        float altura = ler.nextFloat();
        ler.close();


        System.out.println("O seu MMC é: " + peso/(altura*altura) );


    }
}
