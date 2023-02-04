package test;

import org.nhnacademy.ballworld.MovableBall;
import org.nhnacademy.ballworld.MovableBallWorld;
import org.nhnacademy.ballworld.Point;
import java.awt.Color;

public class TestMovableBallWorld {
    public static void main(String[] args) throws InterruptedException {
        MovableBallWorld ballWorld = new MovableBallWorld(500, 400);

        MovableBall ball = new MovableBall(new Point(50, 50), 50.0, Color.BLUE);
        ball.setMotion(20, 45);
        ballWorld.add(ball);

        ballWorld.setVisible(true);
        ballWorld.run(25);
    }
}
