public class Samalet extends Afto {
    private int krelya;
    private int wheel;
    private int turbeen;

    public Samalet(int krelya, int wheel, int turbeen,String aftoName, String koozov) {
super(aftoName,koozov);
        this.krelya = krelya;
        this.wheel = wheel;
        this.turbeen = turbeen;
    }

    @Override
    public String toString() {
        return "Samalet{" +
                "krelya=" + krelya +
                ", wheel=" + wheel +
                ", turbeen=" + turbeen +
                '}';
    }
}
