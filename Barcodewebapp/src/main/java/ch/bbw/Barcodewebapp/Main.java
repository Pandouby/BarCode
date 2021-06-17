package ch.bbw.Barcodewebapp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JSONwriter jsoNwriter = new JSONwriter();
        jsoNwriter.createFileIfNotExits("Yves", "Huber");
        Controller controller = new Controller();

        User test = new User("Yves", "Huber", 9, 72);
        System.out.println(controller.encode(test));

        String code = "Silvan.Dubach.6.4";

        User user = controller.decode(code);
        System.out.println(user.getFirstname());
    }
}
