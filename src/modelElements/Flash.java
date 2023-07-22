package modelElements;

import modelElements.props.Color;
import modelElements.space.Angle3D;
import modelElements.space.Point3D;

public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;

    public Float power;

    public Flash(Point3D location, Angle3D angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public void rotate(Angle3D angle) {
        System.out.println("вращаем!");
    }

    public void move(Point3D location) {
        System.out.println("Двигаемcя в локации");
    }
}
