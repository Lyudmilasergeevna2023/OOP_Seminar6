package OCP;

/**
 * Класс описывает структуру автобус и является наследником класса Vehicle
 */
public class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);        
    }

    /**
     * Метод для вычисления допустимой скорости автобуса
     * @return максимальная допустимая скорость
     */
    @Override
    public double calculateAllowedSpeed() {
        return super.calculateAllowedSpeed() * 0.6;
    }    
}
