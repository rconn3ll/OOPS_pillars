import java.math.BigInteger;
public class Earth extends Planet {
    public Earth() {
        setName("Earth");
        setMoons(1);
        setOrderFromSun(3);
        setDiameter(12756);
        setMass(new BigInteger("5972190000000000000000000"));
    }
}
