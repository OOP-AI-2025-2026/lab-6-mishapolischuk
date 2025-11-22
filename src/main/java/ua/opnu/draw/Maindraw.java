package ua.opnu.draw;

import javax.swing.SwingUtilities;

public class Maindraw {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DrawFrame().setVisible(true);
        });
    }
}