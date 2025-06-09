import java.util.*;
class Cube {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENTER THE SCREEN NUM (1,2,3,4)");
        int screennum=obj.nextInt();
        obj.nextLine();
        System.out.println("ENTER THE TIMING(7-10)(10-1)(1-4) ");
        String time=obj.nextLine();
        switch(screennum){
            case 1:
                switch(time){
                    case "7-10":
                        System.out.println("Mission: Impossible - The Final Reckoning ");
                        break;
                    case "10-1":
                        System.out.println("Sinners ");
                        break;
                    case "1-4":
                        System.out.println("Lilo & Stitch");
                }
                break;
            case 2:
                switch(time){
                    case "7-10":
                        System.out.println("Fountain of Youth  ");
                        break;
                    case "10-1":
                        System.out.println("Captain America: Brave New World ");
                        break;
                    case "1-4":
                        System.out.println("Mountainhead");
                }
                break;
            case 3:
                switch(time){
                    case "7-10":
                        System.out.println("Karate Kid: Legends  ");
                        break;
                    case "10-1":
                        System.out.println("Aftersun ");
                        break;
                    case "1-4":
                        System.out.println("The Batman");
                }
                break;
            case 4:
                 switch(time){
                    case "7-10":
                        System.out.println("Lilo & Stitch  ");
                        break;
                    case "10-1":
                        System.out.println("Top Gun: Maverick ");
                        break;
                    case "1-4":
                        System.out.println("Glass Onion");
                }
                break;
            default:
                System.out.println("INVALID INPUT");



        }


    }
}