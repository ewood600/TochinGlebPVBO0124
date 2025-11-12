package package10;

public class NameComparator implements Comparator{

    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
