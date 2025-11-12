package package10;

public class GPAComparator implements Comparator{

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(a.getGPA(), b.getGPA());
    }
}
