interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle (width: " + width + ", height: " + height + ")";
    }
}

public class ResizableDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Original Rectangle: " + rectangle);
        // Resize the rectangle
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(25);
        System.out.println("Resized Rectangle: " + rectangle);
    }
}
