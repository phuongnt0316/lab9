package country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import motor.yamaha.Jupiter;
import motor.yamaha.Serius;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsiaCountry extends Country{
    private String location;//vitri dia ly

    int n;

    public static void main(String[] args) {
        do{
            List<AsiaCountry> lista = new ArrayList<AsiaCountry>();
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
