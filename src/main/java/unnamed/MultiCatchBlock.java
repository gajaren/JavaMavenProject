package unnamed;
import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchBlock {

    public static void main(String args[]) {
        try {

        } catch (NullPointerException | ArithmeticException e) {

        } catch (Exception e) {

        }
    }


}
