import java.math.BigInteger;

public class Exchange {

    public BigInteger exec(Data data) {

        BigInteger primitive, a, b, prime;

        prime = data.getPrime();
        primitive = data.getRoot();
        a = data.getAlice_number();
        b = data.getBob_number();

        BigInteger aResult, bResult;

        aResult = primitive.modPow(a, prime);
        bResult = primitive.modPow(b, prime);

        BigInteger aKey, bKey;

        aKey = bResult.modPow(a, prime);
        bKey = aResult.modPow(b, prime);

        BigInteger privateKey = null;
        if(aKey.equals(bKey))
            privateKey = aKey;

        return privateKey;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
