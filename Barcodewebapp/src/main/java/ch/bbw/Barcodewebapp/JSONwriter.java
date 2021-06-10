package ch.bbw.Barcodewebapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JSONwriter {

    public  void createFileIfNotExits(String firstname, String lastname){
        try {

            File myFile = new File("Timestamps/"+firstname,lastname+".JSON");
            if (myFile.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
