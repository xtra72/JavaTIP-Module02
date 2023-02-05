package test;

import org.nhnacademy.ballworld.CannonBall;
import org.nhnacademy.ballworld.BoundedWorld;
import org.nhnacademy.ballworld.Point;
import org.nhnacademy.ballworld.Motion;
import java.awt.Color;

public class TestBoundedBallWorld {
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld ballWorld = new BoundedWorld(500, 400);

        CannonBall ball = new CannonBall(new Point( 20, 20), 20.0, Color.BLUE, ballWorld.getHeight());
        ball.setMotion(new Motion(20, 45));
        ball.setGravity(9.8 / 10);
        ballWorld.add(ball);
        ballWorld.setInterval(100);
        ballWorld.setVisible(true);
        ballWorld.run(1000);
    }
}
