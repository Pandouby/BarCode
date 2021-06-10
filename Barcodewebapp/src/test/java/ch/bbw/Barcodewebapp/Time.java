package ch.bbw.Barcodewebapp;

import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
    static public Date gettime(){
        Date time = new GregorianCalendar().getTime();

        return time;
    }
}
