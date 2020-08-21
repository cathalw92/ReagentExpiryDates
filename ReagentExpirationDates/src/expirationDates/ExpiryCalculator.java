package expirationDates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class ExpiryCalculator {
    // setting up date format
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
 // Method that outputs reagent name and the expiry date
    public static void outputReagentExpiry(String reagentName, int daysToExpiry) {
     
        Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, daysToExpiry);
        Date currentDatePlusExpiry = c.getTime();
        System.out.println(reagentName + " will expire on " + dateFormat.format(currentDatePlusExpiry));
    }
}
