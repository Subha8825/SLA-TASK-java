import java.util.*;
public class Days{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE YEAR");
        int year=obj.nextInt();
        System.out.println("ENTER THE MONTH");
        int month=obj.nextInt();
        int day=0;
        if(month==2){
            if((year%4==0 && year%100!=0)||year%400==0){
                System.out.println("29 days");
            }
            else{
                System.out.println("28 days");
            }

        }
        else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("31 days");
        }
        else if(month==4||month==6||month==9||month==11){
            System.out.println("30 days");
            
        }
        else{
            System.out.println("Invalid Month");
        }

    }
}
