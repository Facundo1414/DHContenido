package composite;

public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot(12,2);
        dot1.move(2,3);

        Dot dot2 = new Dot(1,2);

        Circle circle = new Circle(12,2,3);
        circle.move(2,2);

        CompoundGraphic compoundGraphic = new CompoundGraphic();
        compoundGraphic.addChild(dot1);
        compoundGraphic.addChild(dot2);
        compoundGraphic.addChild(circle);
        compoundGraphic.move(1,1);
        compoundGraphic.draw();

        try {
        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load(ImageEditor.Circle,10,10);
        imageEditor.load(ImageEditor.Dot,10,10);

        }catch (RuntimeException e){
            System.out.println(e.getCause());
        }









    }
}
