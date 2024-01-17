
package Lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {
    private static SimpleDateFormat sc = new SimpleDateFormat();
    public static Date parse(String text, String pattern) throws ParseException {
        sc.applyPattern(pattern);
        return sc.parse(text);
    }
    
    public static Date parse(String text) throws ParseException {
        return XDate.parse(text, "dd-MM-yyyy");
    }
    
    
    
}
