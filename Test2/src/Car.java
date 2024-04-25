import java.util.Set;
import java.util.HashSet;


public class Car {

    private String immatriculation;
    private String marque;

    public Car(String immatriculation, String marque) {
        this.immatriculation = immatriculation;
        this.marque = marque;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return this.immatriculation.equals(car.immatriculation);
    }


}
