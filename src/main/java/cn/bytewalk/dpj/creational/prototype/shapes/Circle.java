package cn.bytewalk.dpj.creational.prototype.shapes;

/**
 * @author: haoshichuan
 * @date: 2023/8/26 17:48
 */
public class Circle extends Shape {

    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) return false;
        Circle shape2 = (Circle) object;
        return shape2.radius == radius;
    }

}
