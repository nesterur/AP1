import java.util.Scanner;

public class Q2 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a temperatura em graus Celsius:");
        float temp = ler.nextFloat();
        ler.close();

        System.out.println("A temperatura em Fahrenheit equivale a: " + ((temp*1.8)+32) +"F°" );


    }
}
