package ua.opnu.list;
import java.util.Comparator;
public class GradeSorter implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return Double.compare(((Student)o1).getAverageGrade(), ((Student)o2).getAverageGrade());
    }
}