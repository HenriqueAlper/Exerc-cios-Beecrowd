import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int NumberOne = input.nextInt();
        int NumberTwo = input.nextInt();
        System.out.println("X = " + (NumberOne + NumberTwo));
        input.close();
    }

}
