package vehicle;

import java.util.Scanner;

public class Car extends Vehicles{
    String color;
    public void input(){
        System.out.println("Nhap Car: ");
        Scanner sc=new Scanner(System.in);
        this.maker=sc.nextLine();
        this.model=sc.nextLine();
        this.price=Double.parseDouble(sc.nextLine());
        this.color=sc.nextLine();

    }

    public void display() {

        System.out.println(this.maker+"\t"+this.model+"\t"+this.price+"\t"+this.color);

    }
}
