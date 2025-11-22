package ua.opnu.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class PaintSurface extends JPanel {
    private List<DrawShape> shapes = new ArrayList<>();
    private String currentShapeType = "Rectangle";
    private int startX, startY;

    public PaintSurface() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(600, 400));

        MouseAdapter adapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                DrawShape newShape = null;
                int endX = e.getX();
                int endY = e.getY();
                Color color = Color.BLUE;

                switch (currentShapeType) {
                    case "Rectangle":
                        newShape = new Rectangle(startX, startY, endX, endY, color);
                        break;
                    case "Ellipse":
                        newShape = new Ellipse(startX, startY, endX, endY, color);
                        break;
                }

                if (newShape != null) {
                    shapes.add(newShape);
                    repaint();
                }
            }
        };
        addMouseListener(adapter);
        addMouseMotionListener(adapter);
    }

    public void setCurrentShapeType(String type) {
        this.currentShapeType = type;
    }

    public void clearDrawing() {
        shapes.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (DrawShape shape : shapes) {
            shape.draw(g);
        }
    }
}