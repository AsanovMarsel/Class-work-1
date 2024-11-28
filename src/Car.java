public class Car extends Afto {
    private int wheel;
    private int door;
    private int far;


    public Car(int wheel, int door, int far, String aftoName, String koozov) {
        super(aftoName, koozov);
        this.wheel = wheel;
        this.door = door;
        this.far = far;

    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheel +
                ", door=" + door +
                ", far=" + far +
                '}';
    }
}

