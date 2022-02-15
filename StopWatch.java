public class StopWatch 
{
   private long startTime;
   private long endTime;

   public void stopWatch() 
   {
      this.startTime = System.nanoTime();
   }

   public void start() 
   {
      this.startTime = System.nanoTime();
   }
   
   public void stop() 
   {
      this.endTime = System.nanoTime();
   }
   
   public double getElapsedTime() 
   {
      return (this.endTime - this.startTime) / 1000000.0;
   }

}