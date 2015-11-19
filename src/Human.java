import java.util.Date;

class Human implements Comparable {
    private final String name;
    private int numbDoc;
    private final Date birthday;

//    public void print() {
//        SimpleDateFormat format = new SimpleDateFormat("dd.MM.YYYY");
//        System.out.println(name + ". Birthday - " + format.format(birthday) + ". Number document - " + numbDoc);
//    }

    Human(String name, int numbDoc, Date birthday) {
        this.name = name;
        this.numbDoc = numbDoc;
        this.birthday = birthday;
    }

    public int getNumbDoc() {
        return numbDoc;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

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
}
