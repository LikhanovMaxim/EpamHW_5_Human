import java.util.Calendar;

class Human implements Comparable {
    private final String name;
    private final Calendar birthday;
    private int numbDoc;

    Human(String name, int numbDoc, Calendar birthday) {
        this.name = name;
        this.numbDoc = numbDoc;
        this.birthday = (Calendar) birthday.clone();
    }

    public int getNumbDoc() {
        return numbDoc;
    }

    public void setNumbDoc(int id) {
        this.numbDoc = id;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return (Calendar) birthday.clone();
    }

    @Override
    public int compareTo(Object o) {
        Human compHuman = (Human) o;
//        if (this == null && compHuman == null) {  //no work
//            return 0;
//        }
//        if (this == null) {
//            return -1;
//        }
        if (compHuman == null) {
            return 1;
        }
        int compBirthday = -birthday.compareTo(compHuman.getBirthday());
        if (compBirthday != 0) {
            return compBirthday;
        } else {
            return (numbDoc - compHuman.getNumbDoc());
        }
    }

    @Override
    public boolean equals(Object o) {
        Human secondHuman = (Human) o;
        if (name.equals(secondHuman.getName()) && birthday.equals(secondHuman.getBirthday()) && numbDoc == secondHuman.getNumbDoc()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        int year = birthday.get(birthday.YEAR);
        int month = birthday.get(birthday.MONTH) + 1;
        int day = birthday.get(birthday.DATE);
        String print = "Human{" + name;
        print += ": Birthday - " + day + "." + month + "." + year;
        print += ". ID - " + numbDoc;
        print += "}";
        return print;
    }
}
