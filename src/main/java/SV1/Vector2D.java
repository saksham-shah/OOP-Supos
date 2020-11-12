package SV1;

import java.util.Vector;

public class Vector2D {
    private float x;
    private float y;

    Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector2D other) {
        x += other.x;
        y += other.y;
    }

    public float dot(Vector2D other) {
        return x * other.x + y * other.y;
    }

    public void normalise() {
        float mag = magnitude();
        x /= mag;
        y /= mag;
    }

    public float magnitude() {
        return (float)Math.sqrt(x * x + y * y);
    }
}
