import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		if(num>=0) {
			System.out.println("Positive Number");
		}
		else {
		System.out.println("Negative Number");
		}
    }
}
