package cn.bytewalk.dpj.creational.prototype.shapes;

import java.util.Objects;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 17:44
 */
public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    public boolean equals(Object object) {
        if (!(object instanceof Shape)) {
            return false;
        }
        Shape shape = (Shape) object;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }

}
