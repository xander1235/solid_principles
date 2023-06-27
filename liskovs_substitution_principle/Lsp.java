package liskovs_substitution_principle;


/*
 * Liskovs principle says that you should be able to substitute the sub-class for a base class wihout breaking in anyway
 */
public class Lsp {

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        Demo.useIt(rc);

        //Violates the liskovs substitution rule
        Rectangle sq = new Square(5);
        Demo.useIt(sq);

        /*
         * So in these type of cases we actually don't need the Square object, 
         * we just need the detection in the rectangle class to check it is a Square or not
         * 
         * public boolean isSquare() {
         *      return width == height;
         * }
         * 
         * we just need to implement the above method in the rectangle
         * See the below Rectangle2
         */
        Rectangle2 rc2 = new Rectangle2(2, 3);
        System.out.println(rc2.isSquare());
        rc2.setHeight(2);   
        System.out.println(rc2.isSquare());


        /*
         * We can also use the Factory design pattern
         */
        Rectangle rc3 = RectangleFactory.newRectangle(2, 3);
        Rectangle sq2 = RectangleFactory.newSquare(5);
        System.out.println(rc3.getArea());
        System.out.println(sq2.getArea());



        /*
         * Note: It's really up to us how to handle this.
         * But my kind of illustration here, what I'm  trying to show you is that the risk of substitution principle, if you 
         * violate it, will result in incorrect  code through inheritance.
         * 
         * If you inherit the class and suddenly inherited class behaves in such a different way that you've broken the way in which
         * they use it method works
         */
    }
    
}

class Demo {
    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Expected area of " + (width*10) + " , got " + rectangle.getArea());
    }
}

class RectangleFactory {
    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    } 

    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    } 
}