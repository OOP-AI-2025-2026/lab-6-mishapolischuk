package ua.opnu.list;

public class Student {
    private String name;
    private String surname;
    private double averageGrade;

    public Student(String name, String surname, double averageGrade) {
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public double getAverageGrade() { return averageGrade; }

    @Override
    public String toString() {
        return name + " " + surname + " (Бал: " + averageGrade + ")";
    }
}