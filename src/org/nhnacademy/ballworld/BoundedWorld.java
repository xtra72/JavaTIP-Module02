package org.nhnacademy.ballworld;

public class BoundedWorld extends MovableBallWorld {
    Region area;

    public BoundedWorld(int width, int height) {
        super(width, height);
    }

    /**
     * BoundedWorld의 영역 반환.
     * @return
     */
    public Region getRegion() {
        return  new Region(0, 0, getWidth(), getHeight());
    }

    @Override
    public void next() {
        for(Ball ball : balls) {
            if (ball instanceof MovableBall) {
                MovableBall movableBall = (MovableBall)ball;

                movableBall.move();

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
