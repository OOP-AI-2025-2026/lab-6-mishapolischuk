package ua.opnu.list;
import java.util.Comparator;
public class SurnameSorter implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).getSurname().compareTo(((Student)o2).getSurname());
    }
}