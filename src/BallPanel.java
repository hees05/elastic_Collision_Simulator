import javax.swing.*;
import java.awt.*;

public class BallPanel extends JPanel {
    private final Ball ball;

    public BallPanel(Ball ball) {
        this.ball = ball;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);  // Set the color of the ball
        g.fillOval(ball.getX(), ball.getY(), ball.getRadius() * 2, ball.getRadius() * 2);  // Draw the ball
    }
}
