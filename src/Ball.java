public class Ball
{
    //Ball's x,y coordinates, and the radius of the ball
    private int x;
    private int y;
    private int r; //radius

    //Defining the ball, 'i' stands for "input"
    public Ball(int xi, int yi, int ri) {
        this.x = xi;
        this.y = yi;
        this.r = ri;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getRadius()
    {
        return r;
    }

}
