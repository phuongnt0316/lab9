package vehicle;

import java.util.Scanner;

public class Truck extends Vehicles{
    int truckload;
    public void input(){
        System.out.println("Nhap Truck: ");
        Scanner sc=new Scanner(System.in);
        this.maker=sc.nextLine();
        this.model=sc.nextLine();
        this.price=Double.parseDouble(sc.nextLine());
        this.truckload=Integer.parseInt(sc.nextLine());

    }

    public void display() {

        System.out.println(this.maker+"\t"+this.model+"\t"+this.price+"\t"+this.truckload);

    }
}
