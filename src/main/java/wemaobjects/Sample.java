package wemaobjects;

import java.util.Scanner;

public class Sample {

    public int addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.close();
        System.out.println(number1 + number2);
        return number1 + number2;
    }

    public static void main(String[] args) {
        Sample wemaObjectClass = new Sample();
        int total = wemaObjectClass.addTwoNumbers();
        System.out.println(total);
    }
}
