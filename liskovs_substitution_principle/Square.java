package liskovs_substitution_principle;

public class Square extends Rectangle {

    public Square(int size) {
        width = height = size;
    }

    public Square() {}

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }


    
}
