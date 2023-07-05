package country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import motor.yamaha.Jupiter;
import motor.yamaha.Serius;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsiaCountry extends Country {
    private String location;//vitri dia ly


    public static void main(String[] args) {
        do {
            List<AsiaCountry> lista = new ArrayList<AsiaCountry>();
            int n;
            System.out.println(" Chon chuc nang 1-5:");
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            boolean cont = true;
            switch (n) {
                case 1:
                    System.out.println();

                default:
                    System.out.println("Nhap lai: ");
                    break;
            }
        }
    }
}





