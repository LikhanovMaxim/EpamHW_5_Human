import org.junit.Test;

import java.util.Arrays;
import java.util.Calendar;

import static junit.framework.TestCase.assertTrue;

public class HumanTest {
    @Test
    public void testGetNumbDoc() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1988, Calendar.OCTOBER, 18);
        Human petr = new Human("Petr", 1923, cal);
        assertTrue(petr.getNumbDoc() == 1923);
    }

    @Test
    public void testSetNumbDoc() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1988, Calendar.OCTOBER, 18);
        Human petr = new Human("Petr", 1923, cal);
        petr.setNumbDoc(2015);
        Human result = new Human("Petr", 2015, cal);
        assertTrue(petr.equals(result));
    }

    @Test
    public void testGetName() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1988, Calendar.OCTOBER, 18);
        Human petr = new Human("Petr", 1923, cal);
        assertTrue(petr.getName() == "Petr");
    }

    @Test
    public void testGetBirthday() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1988, Calendar.OCTOBER, 18);
        Human petr = new Human("Petr", 1923, cal);
        assertTrue(petr.getBirthday().equals(cal));
    }

    //    @Test
//    public void nullCompareTo() throws Exception {
//        Human firstNull = null;
//        Human secondNull = null;
//        assertTrue(firstNull.compareTo(secondNull) == 0);
//    }
    @Test
    public void nullCompareTo() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1994, Calendar.APRIL, 5);
        Human human = new Human("Masha", 6543, cal);
        Human compareNull = null;
        assertTrue(human.compareTo(compareNull) == 1);
    }

    @Test
    public void testCompareTo() throws Exception {
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
        Human[] arr = {max, petr, anna, alexandr, masha};
        Human[] result = {petr, anna, masha, max, alexandr};
        Arrays.sort(arr);
        assertTrue(Arrays.equals(arr, result));
    }

    @Test
    public void testToString() throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(1993, Calendar.OCTOBER, 18);
        Human max = new Human("Max", 1923, cal);
        String result = "Human{Max: Birthday - 18.10.1993. ID - 1923}";
        assertTrue(result.equals(max.toString()));
    }
}