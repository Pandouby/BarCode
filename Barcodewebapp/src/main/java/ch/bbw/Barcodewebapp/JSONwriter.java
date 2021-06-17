package ch.bbw.Barcodewebapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JSONwriter {

    public  void createFileIfNotExits(User user){
        String yourFile = "Barcodewebapp/src/main/resources/Timestamps/"+user.getFirstname()+user.getFirstname()+".txt";
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
