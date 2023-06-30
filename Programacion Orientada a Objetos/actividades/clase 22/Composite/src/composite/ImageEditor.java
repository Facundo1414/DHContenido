package composite;

import java.util.ArrayList;

public class ImageEditor {
    private CompoundGraphic compoundGraphic = new CompoundGraphic();
    static String Dot = "Dot";
    static String Circle = "Circle";


    public ImageEditor() {}

    public void load(String code,int x, int y){
        switch (code){
            case "Dot":
                compoundGraphic.addChild(new Dot(x,y));
            case "Circle":
                compoundGraphic.addChild(new Circle(x,y,10));
            default:
                throw new RuntimeException();
        }

    }

    public void groupSelected(ArrayList<Graphic> components){
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic component: components) {
            group.addChild(component);
        }
        compoundGraphic.addChild(group);
        compoundGraphic.draw();
    }
}
