package GroupProjectPersonalErik;

import comp127graphics.*;
import comp127graphics.Point;

import java.awt.*;
import java.util.List;
import java.util.Random;

/**
 * The class for melee enemies which chase the player and deal damage on contact
 */
public class Spiky extends characters{

    private static final Color
            strokeColor = new Color(244, 0, 0),
            fillColor = new Color(244, 0, 0);

    /**
     * Constructs the visualization of the spiky enemy
     */
    @Override
    protected void buildGraphics() {
        Random rand = new Random();
        setxOffset(rand.nextInt(700));
        setyOffset(rand.nextInt(700));
        setSpeed(4);
        GraphicsGroup SpikyShape= new GraphicsGroup();
        List<Point> starPoints = getStarPoints();
        Path poly = new Path(starPoints);
        poly.setFillColor(Color.RED);
        poly.setStrokeColor(Color.RED);
        SpikyShape.add(poly);
        comp127graphics.Ellipse body = new Ellipse(-20,-20, 40, 40);
        body.setStrokeColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        SpikyShape.add(body);
        setHealth(2);
        getGraphics().add(SpikyShape);

    }

    /**
     * Returns a list of positions on the enemy where the game checks for the player
     * @return The list of enemy contact points
     */
    public java.util.List<Point> getStarPoints() {
        return List.of(
                new Point(58.78/3,   80.9/3),
                new Point(0.0/3,     40.0/3),
                new Point(-58.78/3,  80.9/3),
                new Point(-38.04/3,  12.36/3),
                new Point(-95.11/3, -30.9/3),
                new Point(-23.51/3, -32.36/3),
                new Point(0.0/3,  -100.0/3),
                new Point(23.51/3,  -32.36/3),
                new Point(95.11/3,  -30.9/3),
                new Point(38.04/3,   12.36/3));
    }

}
