package assignment;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(int width, int height){
        this.setWidth(width);
        this.setHeight(height);
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

    public int Area(){
      return width * height;
    }
    public int Perimeter(){
        return 2 * (width + height);
    }
}
