import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * AIT-TR, cohort 42.1, Java Basic, Lesson #31
 *
 * @version 25-Mar-24
 */
public class HW31 extends JFrame {
    private Random random;
    private final Color[] COLORS = {Color.red, Color.green, Color.blue, Color.yellow, Color.magenta};
    private int SHAPE_COUNT = 100;
    private int shapeForm;

    public static void main(String[] args) {
        new HW31();
    }

    public HW31()  {
        setTitle("Hello, Swing!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);

        random = new Random();

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);

        JButton btnCircle = new JButton("Circle");
        JButton btnRectangles = new JButton("Rectangles");
        JButton btnTriangles = new JButton("Triangles ");
        JButton btnExit = new JButton("Exit");

        btnCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeForm = 1;
                canvas.repaint();
            }
        });

        btnRectangles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeForm = 2;
                canvas.repaint();
            }
        });

        btnTriangles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeForm = 3;
                canvas.repaint();
            }
        });

        btnExit.addActionListener(e -> System.exit(0));

        Panel btnPanel = new Panel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(btnCircle);
        btnPanel.add(btnRectangles);
        btnPanel.add(btnTriangles);
        btnPanel.add(btnExit);

        add(btnPanel, BorderLayout.SOUTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (int i = 0; i < SHAPE_COUNT; i++) {
                if (shapeForm == 1) {
                    int d = random.nextInt(20) + 60;
                    int x = random.nextInt(getWidth() - d);
                    int y = random.nextInt(getHeight() - d);
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.fillOval(x, y, d, d);
                    g.setColor(Color.black);
                    g.drawOval(x, y, d, d);
                }
                if (shapeForm == 2) {
                    int width = random.nextInt(20) + 100;
                    int height = random.nextInt(20) + 50;
                    int x = random.nextInt(getWidth() - width);
                    int y = random.nextInt(getHeight() - height);
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.fillRect(x, y, width, height);
                    g.setColor(Color.black);
                    g.drawRect(x, y, width, height);
                }
                if (shapeForm == 3) {
                    int length = random.nextInt(20) + 80;
                    int h = (int)(length * Math.sqrt(3) / 2);
                    int x1 = random.nextInt(getWidth() - length);
                    int y1 = random.nextInt(getHeight() - length);
                    int x2 = x1 + length;
                    int y2 = y1;
                    int x3 = x2 / 2;
                    int y3 = y2 +h;
                    Color color = COLORS[random.nextInt(COLORS.length)];
                    g.setColor(color);
                    g.drawLine(x1, y1, x2, y2);
                    g.drawLine(x1, y1, x3, y3);
                    g.drawLine(x3, y3, x2, y2);
                }

//                switch (shapeForm) {
//                    case CIRCLES: {
//                        int d = random.nextInt(20) + 60;
//                        int x = random.nextInt(getWidth() - d);
//                        int y = random.nextInt(getHeight() - d);
//                        Color color = COLORS[random.nextInt(COLORS.length)];
//                        g.setColor(color);
//                        g.fillOval(x, y, d, d);
//                        g.setColor(Color.black);
//                        g.drawOval(x, y, d, d);
//                        break;
//                    }
//                    case RECTANGLES: {
//                        int width = random.nextInt(20) + 100;
//                        int height = random.nextInt(20) + 50;
//                        int x = random.nextInt(getWidth() - width);
//                        int y = random.nextInt(getHeight() - height);
//                        Color color = COLORS[random.nextInt(COLORS.length)];
//                        g.setColor(color);
//                        g.fillRect(x, y, width, height);
//                        g.setColor(Color.black);
//                        g.drawRect(x, y, width, height);
//                        break;
//                    }
//                    case TRIANGLES: {
//                        int length = random.nextInt(20) + 80;
//                        int h = (int) (length * Math.sqrt(3) / 2);
//                        int x1 = random.nextInt(getWidth() - length);
//                        int y1 = random.nextInt(getHeight() - length);
//                        int x2 = x1 + length;
//                        int y2 = y1;
//                        int x3 = x2 / 2;
//                        int y3 = y2 + h;
//                        Color color = COLORS[random.nextInt(COLORS.length)];
//                        g.setColor(color);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.drawLine(x1, y1, x3, y3);
//                        g.drawLine(x3, y3, x2, y2);
//                        break;
//                    }
//                }


            }
        }
    }



//    public void paint(Graphics g, ShapeForm shapeForm, JPanel canvas) {
//        for (int i = 0; i < SHAPE_COUNT; i++) {
//            switch (shapeForm) {
//                case CIRCLES: {
//                    int d = random.nextInt(20) + 60;
//                    int x = random.nextInt(canvas.getWidth() - d);
//                    int y = random.nextInt(canvas.getHeight() - d);
//                    Color color = COLORS[random.nextInt(COLORS.length)];
//                    g.setColor(color);
//                    g.fillOval(x, y, d, d);
//                    g.setColor(Color.black);
//                    g.drawOval(x, y, d, d);
//                    break;
//                }
//                case RECTANGLES: {
//                    int width = random.nextInt(20) + 100;
//                    int height = random.nextInt(20) + 50;
//                    int x = random.nextInt(canvas.getWidth() - width);
//                    int y = random.nextInt(canvas.getHeight() - height);
//                    Color color = COLORS[random.nextInt(COLORS.length)];
//                    g.setColor(color);
//                    g.fillRect(x, y, width, height);
//                    g.setColor(Color.black);
//                    g.drawRect(x, y, width, height);
//                    break;
//                }
//                case TRIANGLES: {
//                    int length = random.nextInt(20) + 80;
//                    int h = (int) (length * Math.sqrt(3) / 2);
//                    int x1 = random.nextInt(canvas.getWidth() - length);
//                    int y1 = random.nextInt(canvas.getHeight() - length);
//                    int x2 = x1 + length;
//                    int y2 = y1;
//                    int x3 = x2 / 2;
//                    int y3 = y2 + h;
//                    Color color = COLORS[random.nextInt(COLORS.length)];
//                    g.setColor(color);
//                    g.drawLine(x1, y1, x2, y2);
//                    g.drawLine(x1, y1, x3, y3);
//                    g.drawLine(x3, y3, x2, y2);
//                    break;
//                }
//            }
//        }
//    }


}
