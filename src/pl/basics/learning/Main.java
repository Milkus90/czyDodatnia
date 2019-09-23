package pl.basics.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj temperature: ");
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        if (ifPositive(temperature)){
            System.out.println("Podana temperatura jest dodatnia. ;)");
        } else System.out.println("Podana temperatura jest ujemna. :(");

    }


    static boolean ifPositive (int number){
        return number >= 0;
    }
}
