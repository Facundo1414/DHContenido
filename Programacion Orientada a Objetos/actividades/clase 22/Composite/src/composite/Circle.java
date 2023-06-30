package composite;

public class Circle extends Dot{
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Radius = " + radius);
    }
}
