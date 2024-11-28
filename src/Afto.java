public class Afto {
    private String AftoName;
    private String Koozov;


    public Afto(String aftoName, String koozov ) {
        AftoName = aftoName;
        Koozov = koozov;

    }

    @Override
    public String toString() {
        return "Afto{" +
                "AftoName='" + AftoName + '\'' +
                ", Koozov='" + Koozov + '\'' +

                '}';
    }
}
