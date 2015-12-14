import java.util.Calendar;

class Human implements Comparable<Human> {
    private final String name;
    private final Calendar birthday;
    private int id;

    Human(String name, int id, Calendar birthday) {
        this.name = name;
        this.id = id;
        this.birthday = (Calendar) birthday.clone();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthday() {
        return (Calendar) birthday.clone();
    }

    @Override
    public int compareTo(Human other) {
        if (other == null) {
            return 1;
        }
        int compBirthday = other.getBirthday().compareTo(birthday);
        if (compBirthday != 0) {
            return compBirthday;
        } else {
            return (id - other.getId());
        }
    }

    @Override
    public boolean equals(Object o) {
        Human secondHuman = (Human) o;
        if (name.equals(secondHuman.getName()) && birthday.equals(secondHuman.getBirthday()) && id == secondHuman.getId()) {
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
        print += ". ID - " + id;
        print += "}";
        return print;
    }
}
