package ch.bbw.Barcodewebapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class JSONwriter {

    public  void createFileIfNotExits(String firstname, String lastname){
        String yourFile = "Barcodewebapp/src/main/resources/Timestamps/"+firstname+lastname+".txt";
        File tmpDir = new File(yourFile);
        boolean exists = tmpDir.exists();
        try {

            if (!exists) {
                FileOutputStream fos = new FileOutputStream(yourFile);
                fos.flush();
                fos.close();
            }
        } catch (Exception e){

        }
    }



}
