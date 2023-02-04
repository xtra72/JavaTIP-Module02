package test;

import org.nhnacademy.ballworld.MovableBall;
import org.nhnacademy.ballworld.BoundedWorld;
import org.nhnacademy.ballworld.Point;
import org.nhnacademy.ballworld.Motion;
import java.awt.Color;

public class TestBoundedBallWorld {
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld ballWorld = new BoundedWorld(500, 400);

        MovableBall ball = new MovableBall(new Point(50, 50), 10.0, Color.BLUE);
        ball.setMotion(new Motion(20, 45));
        ballWorld.add(ball);
        ballWorld.setInterval(10);
        ballWorld.setVisible(true);
        ballWorld.run(25);
    }
}
