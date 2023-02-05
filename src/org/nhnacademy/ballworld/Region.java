package org.nhnacademy.ballworld;

import java.awt.Rectangle;

/**
 * awt.Rectangle의 기능을 사용하면서 용도를 명확하기 위해 이름만 변경.
 */
public class Region extends Rectangle {
    public Region() {
        super();
    }

    public Region(double x, double y, double width, double height) {
        super((int) x, (int) y, (int) width, (int) height);
    }

    public boolean isCollision(Region region) {
        return  intersects(region);
    }
}
