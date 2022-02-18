class RegularPolygon
{
    private int NumberOfSides;
    private double SideLength;
    private double CenterX;
    private double CenterY;

    //Constructor
    RegularPolygon() 
    {
        NumberOfSides = 3;
        SideLength = 1;
        CenterX = 0;
        CenterY = 0;
    }

    RegularPolygon(int numberOfSides, double sideLength) 
    {
        this();
        SideLength = sideLength;
        NumberOfSides = numberOfSides;
    }

    RegularPolygon(int numberOfSides, double sideLength, double x, double y) 
    {
        this(numberOfSides, sideLength);
        CenterX = x;
        CenterY = y;
    }

    //Accessor
    public int getNumberOfSides() 
    {
        return NumberOfSides;
    }

    public double getSideLength() 
    {
        return SideLength;
    }

    public double getCenterY() 
    {
        return CenterY;
    }

    public double getCenterX() 
    {
        return CenterX;
    }

    public double getPerimeter()
    {
        return NumberOfSides * SideLength;
    }

    public double getArea() 
    {
        return (NumberOfSides * SideLength * SideLength) / (4.0 * Math.tan(Math.PI / NumberOfSides));
    }

    //Mutator
    public void setSideLength(double sideLength) 
    {
        SideLength = sideLength;
    }

    public void setNumberOfSides(int numberOfSides) 
    {
        NumberOfSides = numberOfSides;
    }

    public void setCenterY(double centerY) 
    {
        CenterY = centerY;
    }

    public void setCenterX(double centerX) 
    {
        CenterX = centerX;
    }
}
