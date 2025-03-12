import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a temperatura em Fahrenheit:");
        float temp = ler.nextFloat();

        System.out.println("A temperatura em graus Celsius equivale a: " + (temp-   32)*5/9 +"C°" );



    }
}
