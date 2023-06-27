package liskovs_substitution_principle;

public class Rectangle2 {
    public int width;
    public int height;

    public Rectangle2() {

    }

    public Rectangle2(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle2 [width=" + width + ", height=" + height + "]";
    }

    public boolean isSquare() {
        return width == height;
    }

}
