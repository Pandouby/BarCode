package ch.bbw.Barcodewebapp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JSONwriter jsoNwriter = new JSONwriter();
        jsoNwriter.createFileIfNotExits("Yves","Huber");

        String code = "Silvan.Dubach.06.24";
        Controller controller = new Controller();

        User user = new User();

    }
}
