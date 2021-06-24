package ch.bbw.Barcodewebapp;

import java.util.ArrayList;

public class Sessionusers {
    ArrayList<String> users = new ArrayList<>();

    public boolean isregisterd(String firstname, String lastname){
        for(String user : users) {
            String combined = firstname + "." + lastname;
            System.out.println("checked " + combined);
            System.out.println("has " + user);
            if (user.equals(combined)){
                return true;
            }
        }
        return false;
    }
    public void registeruser(String firstname, String lastname){
        String combined = firstname + "." + lastname;
        System.out.println("registerd " + combined);
        users.add(combined);
    }
}
