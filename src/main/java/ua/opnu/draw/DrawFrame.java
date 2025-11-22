package ua.opnu.draw;

import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    private PaintSurface paintSurface;

    public DrawFrame() {
        super("Draw App (Abstract Class)");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        JPanel btnPanel = new JPanel();
        JButton btnRect = new BigTextButton("Rectangle");
        JButton btnEllipse = new BigTextButton("Ellipse");
        JButton btnClear = new BigTextButton("Clear");

        btnPanel.add(btnRect);
        btnPanel.add(btnEllipse);
        btnPanel.add(btnClear);

        paintSurface = new PaintSurface();

        btnRect.addActionListener(e -> paintSurface.setCurrentShapeType("Rectangle"));
        btnEllipse.addActionListener(e -> paintSurface.setCurrentShapeType("Ellipse"));
        btnClear.addActionListener(e -> paintSurface.clearDrawing());

        add(btnPanel, BorderLayout.NORTH);
        add(paintSurface, BorderLayout.CENTER);
    }
}