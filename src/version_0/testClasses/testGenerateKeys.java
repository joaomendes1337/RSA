package version_0.testClasses;

import version_0.Classes.GenerateKeys;

public class testGenerateKeys {
    public static void main(String[] args) {
        //GenerateKeys keyGenerator = new GenerateKeys( 3 );
        //System.out.println(keyGenerator.getP_key());

        GenerateKeys key = new GenerateKeys( 1024 );
        System.out.println(key.getQ_key());
        System.out.println(key.getP_key());
    }
}
