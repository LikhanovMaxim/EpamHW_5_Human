import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import static junit.framework.TestCase.assertTrue;

public class SortNameInAlphabTest {
    @Test
    public void testCompare() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1993, Calendar.OCTOBER, 18);
        Date date = cal.getTime();
        Human max = new Human("Max", 1923, date);
        cal.set(1999, Calendar.OCTOBER, 18);
        date = cal.getTime();
        Human petr = new Human("Petr", 1234, date);
        cal.set(1994, Calendar.APRIL, 5);
        date = cal.getTime();
        Human anna = new Human("Anna", 2354, date);
        cal.set(1988, Calendar.JULY, 5);
        date = cal.getTime();
        Human alexandr = new Human("Alexandr", 2134, date);
        cal.set(1994, Calendar.APRIL, 5);
        date = cal.getTime();
        Human masha = new Human("Masha", 6543, date);
        Human[] arr = {alexandr, masha, petr, anna, max};
        Human[] result = {alexandr, anna, masha, max, petr};
        Arrays.sort(arr, new SortNameInAlphab());
//        for (int i = 0; i < arr.length; i++) {
//            arr[i].print();
//        }
        assertTrue(Arrays.equals(arr, result));
    }
}