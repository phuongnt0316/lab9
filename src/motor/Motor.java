package motor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Motor implements IMotor{
    String code;//ma xe
    String name;//ten loai xe
    double capacity;//dung tich xi lanh
    int num;//kieu truyen luc la so may
    @Override
    public void inputInfor() {
        System.out.println("Nhap: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Code: ");
        code=sc.nextLine();
        System.out.println("Name:");
        name=sc.nextLine();
        System.out.println("capacity");
        capacity=Double.parseDouble(sc.nextLine());
        System.out.println("Num:");
        num=Integer.parseInt(sc.nextLine());

    }

    @Override
    public void displayInfor() {
        System.out.print(code+"\t"+name+"\t"+capacity+"\t"+num+"\t");


    }

    @Override
    public void changeInfor() {

    }
}
