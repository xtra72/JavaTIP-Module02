package test;

import org.nhnacademy.ballworld.CannonBall;
import org.nhnacademy.ballworld.BoundedWorld;
import org.nhnacademy.ballworld.Point;
import org.nhnacademy.ballworld.Motion;
import org.nhnacademy.ballworld.BallWorldView;
import java.awt.Color;

public class TestBoundedBallWorld {
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld ballWorld = new BoundedWorld(new BallWorldView(500, 400));

        CannonBall ball = new CannonBall(new Point( 20, 20), 20.0, Color.BLUE);
        Motion motion = new Motion();
        motion.setDXDY(15, 15);
        ball.setMotion(motion);
        Motion gravity = new Motion();
        gravity.setDXDY(0, -9.8 / 10);
        ball.setAcceleration(gravity);
        ballWorld.add(ball);
        ballWorld.setInterval(100);
        ballWorld.run(1000);
    }
}
