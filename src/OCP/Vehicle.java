package OCP;

/**
 * Класс описывает структуру абстрактного транспортного средства
 */
abstract class Vehicle {
    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
    this.maxSpeed = maxSpeed;
    this.type = type;
    }

    /**
     * Метод возвращает максимальную скорость транспортного средства
     */
    public int getMaxSpeed() {
    return this.maxSpeed;
    }

    /**
     * Метод возвращает тип транспортного средства
     */
    public String getType() {
    return this.type;
    }


    /**
     * Метод для вычисления допустимой скорости транспорта
     * @return максимальная допустимая скорость
     */
    public double calculateAllowedSpeed() {
        return maxSpeed * 1.0;
    }

}
