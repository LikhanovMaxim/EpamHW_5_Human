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

//    public boolean checkCorrect() {
//        if (this == null || name == null || birthday == null) {
//            return false;
//        } else {
//            return true;
//        }
//    }

    @Override
    public int compareTo(Object o) {
        Human compHuman = (Human) o;
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
