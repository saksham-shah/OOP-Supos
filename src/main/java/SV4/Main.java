package SV4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drawable> shapes = List.of(
                new Circle(),
                new Group(List.of(new Rectangle(), new Circle())),
                new Rectangle(),
                new Rectangle()
        );

        for (Drawable shape : shapes) {
            shape.draw();
        }
    }
}
