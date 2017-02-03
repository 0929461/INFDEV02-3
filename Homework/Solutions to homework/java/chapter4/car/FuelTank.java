package chapter4.car;

import java.time.Duration;

public interface FuelTank extends Component{
    float getFuelAmount();

    void addFuel(float amount);
    float pumpFuel(Duration duration);
}
