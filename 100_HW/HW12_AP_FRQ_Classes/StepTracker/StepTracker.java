public class StepTracker{
    private int steps;
    private int days;
    private int minSteps;
    private int activeDays;
    
    public StepTracker(int s){
       steps = 0;
       days = 0; 
       minSteps = s;
       activeDays = 0;
    }
    public void addDailySteps(s){
        steps += s;
        days++;
        if(s>=minSteps){
            activeDays++;
        }
    }   
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        if(days == 0){
            return 0.0;
        }
        return(double)totalSteps/days;
    }





}