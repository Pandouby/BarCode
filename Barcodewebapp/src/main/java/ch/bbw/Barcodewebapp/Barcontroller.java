package ch.bbw.Barcodewebapp;

public class Barcontroller {

    public User decode(String code) {
        String[] values = code.split("\\.", -1);
        User user = new User();

        user.setFirstname(values[0]);
        user.setLastname(values[1]);
        user.setDepartment(Integer.parseInt(values[2]));
        user.setClearance(Integer.parseInt(values[3]));
        return user;
    }

    public String encode(User user) {
        String code = "";
        code += user.getFirstname() + ".";
        code += user.getLastname() + ".";
        code += user.getDepartment() + ".";
        code += user.getClearance();
        return code;
    }
}
