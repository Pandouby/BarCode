package ch.bbw.Barcodewebapp;

public class Controller {

    public String[] splitter(String code){
        String[] values = new String[6];
        values = code.split(".");
        return values;
    }

    public String merger(String[] values){
        String code = "";
        code += values[0] + ".";
        code += values[1] + ".";
        code += values[2] + ".";
        code += values[3] + ".";
        return code;
    }

    public void setValuesOfUser(User user, String[] values){
        user.setFirstname(values[0]);
        user.setLastname(values[1]);
        user.setClearance(Integer.parseInt(values[2]));
        user.setDepartment(Integer.parseInt(values[3]));
    }
}
