package movingObjects;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint centerPoint;
	
	public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius) {
		this.radius = radius;
		this.centerPoint = new MovablePoint(x,y,xSpeed,ySpeed);
	}

	@Override
	public void moveUp() {
		centerPoint.moveUp();
	}

	@Override
	public void moveDown() {
		centerPoint.moveDown();
		
	}

	@Override
	public void moveLeft() {
		centerPoint.moveLeft();
	}

	@Override
	public void moveRight() {
		centerPoint.moveRight();
	}
	
	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", centerPoint=" + centerPoint + "]";
	}

	
}
