package org.nhnacademy.ballworld;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
    Point   location;
    int     height;
    double  radius;
    Color   color;

    public Ball(Point location, double radius, Color color, int height) {
        this.location = location;
        this.height = height;
        this.radius = radius;
        this.color = color;
    }

    public Ball(Point locPoint, double raduis, int height) {
        this(locPoint, raduis, Color.BLACK, height);
    }

    public Point getLocation() {
        return  location;
    }

    public double getRadius() {
        return  radius;
    }

    public Color getColor() {
        return  color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Region getRegion() {
        return  new Region(location.x - radius, location.y - radius, 2 * radius, 2 * radius);
    }

    public void draw(Graphics graphics) {
        Color oldColor = graphics.getColor();

        graphics.setColor(color);
        graphics.fillOval((int) (location.getX() - radius), (int) (height - location.getY() - radius), (int) (2 * radius), (int) (2 * radius));

        graphics.setColor(oldColor);
    }
}
