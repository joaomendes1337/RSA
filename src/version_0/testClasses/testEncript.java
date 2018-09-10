package version_0.testClasses;

import version_0.Classes.Encrypt;
import version_0.Classes.GenerateKeys;

public class testEncript {


    GenerateKeys keys = new  GenerateKeys(5);
    Encrypt asd = new Encrypt("HELLO WORLD", keys.getP_key(), keys.getQ_key());



}
