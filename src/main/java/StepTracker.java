import java.util.ArrayList;
public class StepTracker{
 private int myMin, mydays, totalsteps,activedays;
 public StepTracker(int minSteps){
  myMin = minSteps;
  mydays = 0;
  activedays = 0;
  totalsteps = 0;
 }
 public void addDailySteps(int x){
  totalsteps +=x;
  mydays++;
  if(x >= myMin){
   activedays++;
 }
 public int activeDays(){
  return activedays;
 }
  public double averageSteps(){
   if(mydays == 0){
    return 0;
   }
  return (double) totalsteps/mydays;
   
} 
