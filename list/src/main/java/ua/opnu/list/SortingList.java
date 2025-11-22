package ua.opnu.list;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortingList extends JFrame {
    private ArrayList<Student> students = new ArrayList<>();
    private DefaultListModel<Student> listModel = new DefaultListModel<>();

    private boolean isNameAsc = true;
    private boolean isSurnameAsc = true;
    private boolean isGradeAsc = true;

    public SortingList() {
        super("Студенти");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        initData();
        updateList();

        JList<Student> list = new JList<>(listModel);
        add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JButton btnName = new JButton("Ім'я");
        JButton btnSurname = new JButton("Прізвище");
        JButton btnGrade = new JButton("Бал");

        btnName.addActionListener(e -> {
            students.sort(new NameSorter());
            if (!isNameAsc) Collections.reverse(students);
            isNameAsc = !isNameAsc;

            isSurnameAsc = true;
            isGradeAsc = true;

            updateList();
        });

        btnSurname.addActionListener(e -> {
            students.sort(new SurnameSorter()); // Тобі треба створити цей клас (див. вище)
            if (!isSurnameAsc) Collections.reverse(students);
            isSurnameAsc = !isSurnameAsc;

            isNameAsc = true;
            isGradeAsc = true;

            updateList();
        });

        btnGrade.addActionListener(e -> {
            students.sort(new GradeSorter()); // Тобі треба створити цей клас (див. вище)
            if (!isGradeAsc) Collections.reverse(students);
            isGradeAsc = !isGradeAsc;

            isNameAsc = true;
            isSurnameAsc = true;

            updateList();
        });

        panel.add(btnName);
        panel.add(btnSurname);
        panel.add(btnGrade);
        add(panel, BorderLayout.NORTH);
    }

    private void initData() {
        students.add(new Student("Ivan", "Petrenko", 4.5));
        students.add(new Student("Oksana", "Shevchenko", 5.0));
        students.add(new Student("Petro", "Boyko", 3.8));
        students.add(new Student("Maria", "Koval", 4.2));
        students.add(new Student("Andriy", "Melnyk", 3.2));
    }

    private void updateList() {
        listModel.clear();
        for (Student s : students) listModel.addElement(s);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SortingList().setVisible(true);
        });
    }
}