package java8.designPattern.factory;

public enum Weekday
{

    SUN(0),MON(1);

   private int value;
   private Weekday(int value){
       this.value=value;
   }
   public static Weekday getNextDay(Weekday nowDay){
       int nextvalue=nowDay.value;
       if(++nextvalue==7){
           nextvalue=0;
       }
       return getWeekday(nextvalue);
   }

   public static Weekday getWeekday(int value){
       for(Weekday c:Weekday.values()){
           if(c.value==value)
               return c;
       }
       return null;
   }
}
class  Test{
    public static  void main(String [] args){
        System.out.println(Weekday.SUN);
        System.out.println(Weekday.getNextDay(Weekday.SUN));
    }
}