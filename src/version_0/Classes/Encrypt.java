package version_0.Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
public class Encrypt{

    private Random rd = new Random(  );
    private String message;
    private  long p_key;
    private  long q_key;
    private FileInputStream file;
    private String result;
    //Constructors
    public  Encrypt(String message, long P_KEY, long Q_KEY){


        this.message = message;
        this.p_key = P_KEY;
        this.q_key = Q_KEY;
    }

    public Encrypt (File messageFile, long P_KEY, long Q_KEY) {


        try{
            this.file = new FileInputStream( messageFile );
        }catch (FileNotFoundException | SecurityException e){
            e.printStackTrace();
        }


    }

    public String EncryptMessage(){

        long n = this.p_key + this.q_key;

        long e = (long) rd.nextInt((int) n) - 1;

        for (int i=0; i < message.length(); i++){
            int charNum = getNumberForChar(message.charAt( i ));
            System.out.println(charNum);
            this.result = this.result + charNum;
        }

        return this.result;
    }
    //TODO make encrypted file
    public void EncryptedFile(){
        return;
    }
    //AUXILIAR FUNCTIONS
    //TODO ANA func FOR U <3
    public static String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 'A' - 1)) : null;
    }
    public static int getNumberForChar(char ch) {
        return Character.getNumericValue(ch) - 9;
    }
    //Geters and setters
    public String getMessage() {
        return message;
    }

    public String getResult() {
        return result;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFile(FileInputStream file) {
        this.file = file;
    }


}