package SV4;

import java.util.List;

public class Group implements Drawable {
    private final List<Drawable> shapes;

    public Group(List<Drawable> shapes) {
        this.shapes = List.copyOf(shapes);
    }

    @Override
    public void draw() {
        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
