package version_0.Classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Encrypt{


    private String message;
    private FileInputStream file;
    //Constructors
    public Encrypt() {
    }

    public  Encrypt(String message){

        this.message = message;
    }

    public Encrypt (File messageFile) {


        try{
            this.file = new FileInputStream( messageFile );
        }catch (FileNotFoundException | SecurityException e){
            e.printStackTrace();
        }


    }

    public String EncryptMessage(){
        return "";
    }
    //TODO make encrypted file
    public void EncryptedFile(){
        return;
    }

    //Geters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFile(FileInputStream file) {
        this.file = file;
    }


}