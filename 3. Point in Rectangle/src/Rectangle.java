public class Rectangle {

    private Point bottomPoints;
    private Point topPoints;

    public Rectangle(Point bottomPoints, Point topPoints) {
        this.bottomPoints = bottomPoints;
        this.topPoints = topPoints;
    }


    public boolean contains(int x, int y){
        boolean isHorizontal = bottomPoints.getX() <= x
                && topPoints.getX() >= x;

        boolean isVertical = bottomPoints.getY() <= y
                && topPoints.getY() >= y;
        boolean last = isHorizontal && isVertical;
        return last;
    }
}

