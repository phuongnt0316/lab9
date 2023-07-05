package motor.yamaha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Yamaha {
    public static void main(String[] args) {
        int n;
        System.out.println("MENU: ");
        System.out.println("1. Input");
        System.out.println("2. Display");
        System.out.println("3. Sort");
        System.out.println("4. Search");
        System.out.println("5. Exit");
        Scanner sc=new Scanner(System.in);
        boolean cont=true;
        List<Jupiter> listjp = new ArrayList<Jupiter>();
        List<Serius> listsr = new ArrayList<Serius>();
        do{
            System.out.println(" Chon chuc nang 1-5:");
            n=Integer.parseInt(sc.nextLine());
            switch (n){
                case 1:
                    System.out.println("Nhap thong tin 3 xe Jupiter:");
                    for (int i = 0; i <3 ; i++) {
                        Jupiter jp=new Jupiter();
                        jp.inputInfor();
                        listjp.add(jp);
                    }
                    for (int i = 0; i <3 ; i++) {
                        Serius sr=new Serius();
                        sr.inputInfor();
                        listsr.add(sr);
                    }
                    break;
                case 2:
                    System.out.println("Hien thi Jupiter");
                    for(Jupiter item:listjp){
                        item.displayInfor();
                    }
                    for(Serius item:listsr){
                        item.displayInfor();
                    }
                    break;
                case 3:
                    System.out.println("Danh sach truoc sap xep");
                    System.out.println("Hien thi Xe");
                    for(Jupiter item:listjp){
                        item.displayInfor();
                    }
                    Collections.sort(listjp,(x, y)->{return (int) (x.warranty-y.warranty);});
                    for(Jupiter item:listjp){
                        item.displayInfor();
                    }
                    break;
                case 4:
                    String key;
                    System.out.println("Nhap tu khoa tim kiem:");
                    key=sc.nextLine();
                    boolean f=false;
                    for(Jupiter item:listjp){
                        if(item.getName().contains(key)){
                            item.displayInfor();
                            f=true;
                        }
                    }
                    if(!f){
                        System.out.println("Khong tim thay!");

                    }
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

