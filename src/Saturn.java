import java.math.BigInteger;

public class Saturn extends Planet {
    public Saturn() {
        setName("Saturn");
        setMoons(146);
        setOrderFromSun(6);
        setDiameter(116464);
        setMass(new BigInteger("568300000000000000000000000"));
    }

    public void planetMessage() {
        System.out.println("Saturn is my favorite planet!");
    }
}
