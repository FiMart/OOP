public abstract class Movie implements Imovie
{
    private double Rating;
    private int view;
    private int like = 0;
    private int dislike = 0;

    // Constuctor
    public Movie() 
    {
        
    }

    public Movie(int view, int like, int dislike) 
    {
        this.view = view;
        this.like = like;
        this.dislike = dislike;
    }

    // Accessors
    public double getRating() 
    {
        return this.Rating;
    }

    // Mutator
    public void setRating(double Rating) 
    {
        this.Rating = Rating;
    }

    public int getView() 
    {
        return this.view;
    }

    public void setView(int view) 
    {
        this.view = view;
    }

    public int getLike() 
    {
        return this.like;
    }

    public void setLike(int like) 
    {
        this.like = like;
    }

    public int getDislike() 
    {
        return this.dislike;
    }

    public void setDislike(int dislike) 
    {
        this.dislike = dislike;
    }

    public void watch()
    {
        ++view;
    }

    public void comment(boolean isLike)
    {
            if(isLike) 
            {
                ++like;
            }
            else 
            {
                ++dislike;
            }
    }

    public void calculateRating()
    {
        Rating = ((double)like / view) * 10;
    }

    abstract public String movieOut(int day,String month,int year);
    abstract public String nationalityOfmovie(String nationality);

    @Override
    public String toString() 
    {
        return "[Rating = " + String.format("%.1f",getRating()) + " " + ", View = " + getView() + " " + ", Like = " + getLike() + " " + ", Dislike = " + getDislike() + "]";
    }
}
