package movingObjects;

public class TestMovable {

    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(10,20,2,3);

        System.out.println("Point Before Moving : "+p);
        
        p.moveUp();
        p.moveRight();
        
        System.out.println("Point After Moving : "+p);

        System.out.println();

        MovableCircle c = new MovableCircle(5,5,1,1,10);

        System.out.println("Circle Before Moving : "+c);
        
        c.moveDown();
        c.moveLeft();
        
        System.out.println("Circle After Moving : "+c);
    }
}
