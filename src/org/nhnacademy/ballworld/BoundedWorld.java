package org.nhnacademy.ballworld;

public class BoundedWorld extends MovableBallWorld {
    Region leftWall;
    Region rightWall;
    Region topWall;
    Region bottomWall;

    public BoundedWorld(BallWorldView view) {
        super(view);
        leftWall = new Region(-view.getVirtualWidth() - 1.0, 0, view.getVirtualWidth(), view.getVirtualHeight());
        rightWall = new Region(view.getVirtualWidth() + 1.0, 0, view.getVirtualWidth(), view.getVirtualHeight());
        topWall = new Region(0, view.getVirtualHeight() + 1.0, view.getVirtualWidth(), view.getVirtualHeight());
        bottomWall = new Region(0, -view.getVirtualHeight() - 1.0, view.getVirtualWidth(), view.getVirtualHeight());
    }


    @Override
    public void next() {
        for(Ball ball : balls) {
            if (ball instanceof MovableBall) {
                MovableBall movableBall = (MovableBall)ball;

                movableBall.move();

                if (leftWall.isCollision(movableBall.getRegion()) || rightWall.isCollision(movableBall.getRegion())) {
                    movableBall.turnX();
                }

                if (topWall.isCollision(movableBall.getRegion()) || bottomWall.isCollision(movableBall.getRegion())) {
                    movableBall.turnY();
                }
            }
        }
    }
}
