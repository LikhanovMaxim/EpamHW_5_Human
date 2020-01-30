import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;

import static junit.framework.TestCase.assertTrue;

public class SortNameInAlphabTest {
    @Test
    public void testCompare() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1993, Calendar.OCTOBER, 18);
        Human max = new Human("Max", 1923, cal);
        cal.set(1999, Calendar.OCTOBER, 18);
        Human petr = new Human("Petr", 1234, cal);
        cal.set(1994, Calendar.APRIL, 5);
        Human anna = new Human("Anna", 2354, cal);
        cal.set(1988, Calendar.JULY, 5);
        Human alexandr = new Human("Alexandr", 2134, cal);
        cal.set(1994, Calendar.APRIL, 5);
        Human masha = new Human("Masha", 6543, cal);
        Human[] arr = {alexandr, masha, petr, anna, max};
        Human[] result = {alexandr, anna, masha, max, petr};
        Arrays.sort(arr, new SortNameInAlphab());
        assertTrue(Arrays.equals(arr, result));
    }
}