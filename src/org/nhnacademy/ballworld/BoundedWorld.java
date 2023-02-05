package org.nhnacademy.ballworld;

public class BoundedWorld extends MovableBallWorld {

    public BoundedWorld(int width, int height) {
        super(width, height);
    }

    /**
     * BoundedWorld의 영역 반환.
     * @return
     */
    public Region getRegion(double radius) {
        return  new Region(2*radius, 2*radius, getWidth() - 4*radius, getHeight() - 4*radius);
    }

    @Override
    public void next() {
        for(Ball ball : balls) {
            if (ball instanceof MovableBall) {
                MovableBall movableBall = (MovableBall)ball;

                movableBall.move();

                if (!getRegion(movableBall.getRadius()).isCollision(movableBall.getRegion())) {
                    if ((movableBall.getLocation().getX() < movableBall.getRadius())
                            || (getWidth() - movableBall.getRadius() < movableBall.getLocation().getX())) {
                        movableBall.turnX();
                    }

                    if ((movableBall.getLocation().getY() < movableBall.getRadius())
                            || (getHeight() - movableBall.getRadius() < movableBall.getLocation().getY())) {
                        movableBall.turnY();
                    }
                }
            }
        }
    }
}
