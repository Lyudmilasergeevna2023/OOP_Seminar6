package ISP;


/**
 * Класс описывает структуру объекта куб и имплементирует интерфейсы iVolume и iShape
 */
public class Cube implements iVolume, iShape {
    private int edge;

    public Cube(int edge) {
    this.edge = edge;
    }

    @Override
    public double area() {
    return 6 * edge * edge;
    }
    

    @Override
    public double volume() {
    return edge * edge * edge;
    }
}
