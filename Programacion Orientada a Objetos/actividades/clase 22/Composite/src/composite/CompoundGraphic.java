package composite;

import java.util.ArrayList;

public class CompoundGraphic implements Graphic{
    private ArrayList<Graphic> childrenOfGraphic;

    public CompoundGraphic() {
        this.childrenOfGraphic = new ArrayList<>();
    }

    public void addChild(Graphic child){
        childrenOfGraphic.add(child);
    }
    public void removeChild(Graphic child){
        childrenOfGraphic.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child: childrenOfGraphic) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic child: childrenOfGraphic) {
            child.draw();
        }
    }
}
