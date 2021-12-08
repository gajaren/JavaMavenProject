package unnamed;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class TryingMethod {

    public static void main(String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm a", Locale.US);
        try {
            sdf.parse("29-Sep-2021 06:01 PM");
        } catch (ParseException e) {
            System.out.println("NOT valid.");
        }
    }
}
