import java.util.Calendar;

class Human implements Comparable<Human> {
    private final String name;
    private final Calendar birthday;
    private int id;

    Human(String name, int id, Calendar birthday) {
        if (name == null) {
            assert false : "Name = null!";
        }
        this.name = name;
        this.id = id;
        if (birthday == null) {
            assert false : "Birthday = null!";
        }
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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Human other = (Human) obj;
        return name.equals(other.getName()) && birthday.equals(other.getBirthday()) && id == other.getId();
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
