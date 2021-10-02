import java.util.Scanner;

public class add_two_numbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		float b;
		float sum;
		String str;
		boolean flag = true;
		while(flag){
			System.out.print("Do you want two float numbers?Y/N ");
			str = sc.next();
			if(str.equals("Y")){
				flag = true;
				System.out.print("Please input a float \"a\":");
				a = sc.nextFloat();
				System.out.print("Please input a float \"b\":");
				b = sc.nextFloat();
				sum = a + b;
				System.out.println("a + b = " + sum);
			} else if (str.equals("N")){
				flag = false;
			}
		}
		sc.close();
	}
}
