package vidu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        System.out.println("shape:");
        Scanner sc=new Scanner(System.in);
        shape=sc.nextLine();
        int r=2;

            switch (shape){
                case "circle":objShape=new Circle();
                objShape.calculate(2);
                break;
                case "rectangle":objShape=new Rectangle();
                objShape.calculate(2);
                break;
                default:
                    System.out.println("Sai ten shape");
            }


    }
}
