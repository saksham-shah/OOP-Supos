package SV4;

public class FramedShape implements Drawable {
    private final Shape toDecorate;

    public FramedShape(Shape toDecorate) {
        this.toDecorate = toDecorate;
    }

    @Override
    public void draw() {
        System.out.println("The below shape has a frame!");
        toDecorate.draw();
    }
}
