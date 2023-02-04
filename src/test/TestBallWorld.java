package test;

import org.nhnacademy.ballworld.Ball;
import org.nhnacademy.ballworld.BallWorld;
import org.nhnacademy.ballworld.Point;
import java.awt.Color;

public class TestBallWorld {
    public static void main(String[] args) {
        BallWorld ballWorld = new BallWorld(500, 400);

        ballWorld.add(new Ball(new Point(50, 50), 50.0, Color.BLUE));

        ballWorld.setVisible(true);
    }
}
