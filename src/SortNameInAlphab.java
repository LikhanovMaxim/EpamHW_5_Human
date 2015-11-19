import java.util.Comparator;

class SortNameInAlphab implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        Human firstHuman = (Human) o1;
        Human secondHuman = (Human) o2;
        return firstHuman.getName().compareTo(secondHuman.getName());
    }

}
