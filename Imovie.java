interface Imovie 
{
    public void setRating(double rating);
    public void setView(int view);
    public void setLike(int like);
    public void setDislike(int dislike);
    public void watch();
    public void comment(boolean isLike);
    public void calculateRating();
}
