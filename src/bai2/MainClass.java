package bai2;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class MainClass {
    public void NhapDuLieu(){
        NhapLieu nhap=new NhapLieu();
        System.out.println("NHap so nguyen");
        System.out.println("Value="+nhap.inputInt());
        System.out.println("Nhap so thuc");
        System.out.println("Value="+nhap.inputFloat());
        System.out.println("Nhap so chuoi");
        System.out.println("Value="+nhap.inputString());

    }
    private class NhapLieu{
        public String inputString(){
            Scanner sc=new Scanner(System.in);
            return sc.nextLine();

        }
        public int inputInt(){
            Scanner sc=new Scanner(System.in);
            do{
                try{
                    int number=Integer.parseInt(sc.nextLine());
                    return number;
                } catch (Exception e) {
                    System.out.println("Vui long nhap so nguyen");
                }
            }while (true);
        }
        public float inputFloat(){
            Scanner sc=new Scanner(System.in);
            do{
                try{
                    float number=Float.parseFloat(sc.nextLine());
                    return number;
                } catch (Exception e) {
                    System.out.println("Vui long nhap so thuc");
                }
            }while (true);
        }

    }


    public static void main(String[] args) {
        MainClass main=new MainClass();
        main.NhapDuLieu();
    }
}
