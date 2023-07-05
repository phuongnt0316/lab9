package country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country implements Icountry{
    private String countryName;
    double area;
    long numberPerson;
    @Override
    public void input() {
        System.out.println("Nhap thong tin");
        Scanner sc=new Scanner(System.in);
        countryName=sc.nextLine();
        area=Double.parseDouble(sc.nextLine());

    }

    @Override
    public void display() {

    }

    @Override
    public float everageArea(double area, long numberPerson) {
        return 0;
    }
}
