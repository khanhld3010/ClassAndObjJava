package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numberA = Double.parseDouble(input("Nhập vào số a")) ;
        double numberB = Double.parseDouble(input("Nhập vào số b")) ;
        double numberC = Double.parseDouble(input("Nhập vào số c")) ;
        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA,numberB,numberC);
        if (quadraticEquation.getDiscriminant() >0){
            System.out.println("The equation has two roots: "+quadraticEquation.getRoot1()+ " and "
                                                    + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has one root: "+quadraticEquation.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
    public static String input(String str){
        Scanner scanner = new Scanner(System.in);
        System.out.println(str);
        String input = scanner.nextLine();
        return input;
    }
}
