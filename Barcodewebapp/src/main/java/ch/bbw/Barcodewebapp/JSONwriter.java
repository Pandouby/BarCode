package ch.bbw.Barcodewebapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JSONwriter {

    public static void createFileIfNotExits(User user){
        String yourFile = "/Users/silvandubach/Desktop/Timestamps/"+user.getFirstname()+user.getLastname()+".txt";
        File tmpDir = new File(yourFile);
        boolean exists = tmpDir.exists();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(user.getLastLoggedIn());
        try {

            if (!exists) {
                FileOutputStream fos = new FileOutputStream(yourFile);

            }
            try {
                FileWriter myWriter = new FileWriter("/Users/silvandubach/Desktop/Timestamps/"+user.getFirstname()+user.getLastname()+".txt", true);
                myWriter.write(strDate + "\n");
                myWriter.close();
            } catch (IOException e) {

            }


        } catch (Exception e){

        }
    }



}
