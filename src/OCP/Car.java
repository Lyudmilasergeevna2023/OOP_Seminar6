package OCP;

/**
 * Класс описывает структуру автомобиль и является наследником класса Vehicle
 */
public class Car extends Vehicle{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    /**
     * Метод для вычисления допустимой скорости автомобиля
     * @return максимальная допустимая скорость
     */
    @Override
    public double calculateAllowedSpeed() {
        return super.calculateAllowedSpeed() * 0.8;
    }    
}
