package test;

import java.awt.Color;
import org.nhnacademy.ballworld.Ball;
import org.nhnacademy.ballworld.BoundedWorld;
import org.nhnacademy.ballworld.MovableBall;
import org.nhnacademy.ballworld.Point;

/**
 * 테스트 코드.
 */
public class TestBoundedWorld {
    /**
     * 테스트 메인.
     *
     * @param args 사용하지 않음
     * @throws InterruptedException 처리하지 않음.
     */
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld ballWorld = new BoundedWorld(500, 400);

        Ball immovableBall = new Ball(new Point(450, 350), 10.0, Color.RED);
        ballWorld.add(immovableBall);

        MovableBall movableBall = new MovableBall(new Point(50, 50), 10.0, Color.BLUE);
        movableBall.setMotion(20, 45);
        ballWorld.add(movableBall);

        ballWorld.setInterval(10);
        ballWorld.setVisible(true);
        ballWorld.run(25);
    }
}
