package vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n;
        System.out.println("MENU: ");
        System.out.println("1. Input");
        System.out.println("2. Display");
        System.out.println("3. Sort by price");
        System.out.println("4. Search by model");
        System.out.println("5. Exit");
        Scanner sc=new Scanner(System.in);
        boolean cont=true;
        List<Car> listcar = new ArrayList<Car>();
        List<Truck> listtruck = new ArrayList<Truck>();
        do{
            System.out.println(" Chon chuc nang 1-5:");
            n=Integer.parseInt(sc.nextLine());
            switch (n){
                case 1:
                    System.out.println("Nhap thong tin 3 Car:");
                    for (int i = 0; i <3 ; i++) {
                        Car car=new Car();
                        car.input();
                        listcar.add(car);
                    }
                    for (int i = 0; i <3 ; i++) {
                        Truck truck = new Truck();
                        truck.input();
                        listtruck.add(truck);
                    }
                    break;
                case 2:
                    System.out.println("Hien thi Car");
                    for(Car item:listcar){
                        item.display();
                    }
                    for(Truck item:listtruck){
                        item.display();
                    }
                    break;
                case 3:
                    System.out.println("Danh sach truoc sap xep");
                    System.out.println("Hien thi Car");
                    for(Car item:listcar){
                        item.display();
                    }
                    Collections.sort(listcar,(x, y)->{return (int) (x.price-y.price);});
                    for(Car item:listcar){
                        item.display();
                    }
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("Ket thuc!");
                    cont=false;
                    break;
                default:
                    System.out.println("Nhap lai: ");
                    break;
            }
        }while (cont);


    }
}
