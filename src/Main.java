import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a Ball object
        Ball ball = new Ball(50, 50, 25);  // Initial position (x=50, y=50) and radius 25

        // Create a BallPanel and pass the ball object
        BallPanel ballPanel = new BallPanel(ball);

        // Create a JFrame (your single screen)
        JFrame frame = new JFrame("Ball Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);  // Set the size of the screen

        // Add the BallPanel to the JFrame
        frame.add(ballPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
