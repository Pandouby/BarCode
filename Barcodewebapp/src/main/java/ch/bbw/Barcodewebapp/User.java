package ch.bbw.Barcodewebapp;

import java.util.Date;

public class User {
    private String firstname;
    private String lastname;

    private Date lastLoggedIn;
    private Date lastLoggedOut;

    private int department;
    private int clearance;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(Date lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    public Date getLastLoggedOut() {
        return lastLoggedOut;
    }

    public void setLastLoggedOut(Date lastLoggedOut) {
        this.lastLoggedOut = lastLoggedOut;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getClearance() {
        return clearance;
    }

    public void setClearance(int clearance) {
        this.clearance = clearance;
    }
}
