package vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vehicles implements IVehicle{

    String maker;
    String model;
    Double price;
    @Override
    public void input() {

    }

    @Override
    public void display() {

    }
}
