// Area =  3.14159 * raio*raio //

import java.util.Scanner;

class Main {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        double PI = 3.14159;
        System.out.printf("A=%.4f\n", raio*raio*PI);
        input.close();
    }
}