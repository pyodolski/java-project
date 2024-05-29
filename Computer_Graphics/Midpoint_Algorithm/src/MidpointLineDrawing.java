import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class MidpointLineDrawing extends JPanel {

    private int x0, y0, x1, y1;
    private int tx = 0, ty = 0;
    private int currentX, currentY, d, dx, dy, incrementY;
    private Timer timer, translateTimer;
    private BasicStroke stroke = new BasicStroke(2);

    public MidpointLineDrawing(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        initMidpointLine();
        setBackground(Color.WHITE);
    }

    private void initMidpointLine() {
        currentX = x0;
        currentY = y0;
        dx = x1 - x0;
        dy = y1 - y0;
        d = 2 * dy - dx;
        incrementY = (dy < 0) ? -1 : 1;
        dy = Math.abs(dy);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.setStroke(stroke);
        drawCurrentLine(g2d);
    }

    private void drawCurrentLine(Graphics2D g2d) {
        int x = x0 + tx, y = y0 + ty;
        int endX = currentX + tx;
        int localD = d;

        while (x <= endX) {
            g2d.draw(new Line2D.Float(x, y, x, y));

            x++;
            if (localD < 0) {
                localD = localD + 2 * dy;
            } else {
                y += incrementY;
                localD += 2 * (dy - dx);
            }
        }
    }

    public void startDrawing() {
        if (timer != null) {
            timer.stop();
        }
        initMidpointLine();
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentX >= x1) {
                    timer.stop();
                } else {
                    currentX++;
                    if (d < 0) {
                        d = d + 2 * dy;
                    } else {
                        currentY += incrementY;
                        d += 2 * (dy - dx);
                    }
                    repaint();
                }
            }
        });
        timer.start();
    }

    public void translate(int targetTx, int targetTy) {
        if (translateTimer != null) {
            translateTimer.stop();
        }

        translateTimer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tx == targetTx && ty == targetTy) {
                    translateTimer.stop();
                } else {
                    if (tx < targetTx) tx++;
                    if (tx > targetTx) tx--;
                    if (ty < targetTy) ty++;
                    if (ty > targetTy) ty--;
                    repaint();
                }
            }
        });
        translateTimer.start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Midpoint Line Drawing with Translation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int x0 = 50, y0 = 50, x1 = 450, y1 = 150;
        MidpointLineDrawing panel = new MidpointLineDrawing(x0, y0, x1, y1);

        JPanel controls = new JPanel();
        controls.setBackground(Color.LIGHT_GRAY);
        controls.setBorder(BorderFactory.createTitledBorder("Controls"));

        JLabel txLabel = new JLabel("Translate X:");
        JLabel tyLabel = new JLabel("Translate Y:");
        JTextField txField = new JTextField(5);
        JTextField tyField = new JTextField(5);
        JButton translateButton = new JButton("Translate");
        JButton drawButton = new JButton("Draw Line");

        txLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        tyLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        txField.setFont(new Font("Arial", Font.PLAIN, 14));
        tyField.setFont(new Font("Arial", Font.PLAIN, 14));
        translateButton.setFont(new Font("Arial", Font.BOLD, 14));
        drawButton.setFont(new Font("Arial", Font.BOLD, 14));

        translateButton.setBackground(new Color(70, 130, 180));
        translateButton.setForeground(Color.BLACK);
        drawButton.setBackground(new Color(70, 130, 180));
        drawButton.setForeground(Color.BLACK);

        translateButton.setFocusPainted(false);
        drawButton.setFocusPainted(false);

        GroupLayout layout = new GroupLayout(controls);
        controls.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(txLabel)
                        .addComponent(tyLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(txField)
                        .addComponent(tyField)
                        .addComponent(translateButton)
                        .addComponent(drawButton))
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txLabel)
                        .addComponent(txField))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(tyLabel)
                        .addComponent(tyField))
                .addComponent(translateButton)
                .addComponent(drawButton)
        );

        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int tx = Integer.parseInt(txField.getText());
                    int ty = Integer.parseInt(tyField.getText());
                    panel.translate(tx, ty);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integer values for translation.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.startDrawing();
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(controls, BorderLayout.SOUTH);

        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
