
/**
 * Write a description of class Appointment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Appointment
{
    private String name;
    private String day;
    private double duration;
    
    public Appointment () {}
    
    public void setName(String name) {
      this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
     public void setDay(String day) {
      this.day = day;
    }
    
    public String getDay() {
        return this.day;
    }
   
     public void setDuration(double duration) {
      this.duration = duration;
    }
    
    public Double getDuration() {
        return this.duration;
    }
   
   
    
}
