import java.math.BigInteger;

@lombok.Data
public class Data {

    private BigInteger prime;
    private BigInteger root;
    private BigInteger alice_number;
    private BigInteger bob_number;

    public Data(BigInteger prime, BigInteger root, BigInteger alice, BigInteger bob) {
        this.prime = prime;
        this.root = root;
        this.alice_number = alice;
        this.bob_number = bob;
    }
    /*
    public BigInteger getPrime() {
        return prime;
    }

    public BigInteger getRoot() {
        return root;
    }

    public BigInteger getAlice_number() {
        return alice_number;
    }

    public BigInteger getBob_number() {
        return bob_number;
    }
    */
}
