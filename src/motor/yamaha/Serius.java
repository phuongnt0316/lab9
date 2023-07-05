package motor.yamaha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import motor.Motor;

import java.util.Scanner;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Serius extends Motor {
    int warranty;//Thoigian bao hanh

    @Override
    public void inputInfor() {
        super.inputInfor();
        System.out.println("warranty:");
        Scanner sc=new Scanner(System.in);
        warranty=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
        System.out.println(warranty+"");
    }


}
