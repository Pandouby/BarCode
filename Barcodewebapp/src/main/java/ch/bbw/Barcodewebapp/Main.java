package ch.bbw.Barcodewebapp;

public class Main {
    public static void main(String[] args) {
        JSONwriter jsoNwriter = new JSONwriter();
        User yves = new User("Yves", "Huber", 2, 32);
        jsoNwriter.createFileIfNotExits(yves);
        Barcontroller controller = new Barcontroller();

        User test = new User("Yves", "Huber", 9, 72);
        System.out.println(controller.encode(test));

        String code = "Silvan.Dubach.6.4";

        User user = controller.decode(code);
        System.out.println(user.getFirstname());
    }
}
