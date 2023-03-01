package projeler;

import java.util.Scanner;

public class ucakbileti {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age,distance,type;
		System.out.println("Your age:");
		age=scan.nextInt();
		
		System.out.println("Distance(km):");
		distance=scan.nextInt();
		
		System.out.println("Travel type( 1=one way , 2=round trip):");
		type=scan.nextInt();
		double normalPrice= distance*0.3;
		double typeDiscount;
			System.out.println("Price:" + normalPrice);
			
		 if(age<12){
			normalPrice=normalPrice -(normalPrice*0.5);
			System.out.println("Discounted price:" + normalPrice);
		}
		else if(12<=age && age<=24){
			normalPrice=normalPrice-(normalPrice*0.10);
			System.out.println("Discounted price:" + normalPrice);
			
		}
		else if(age>65){
			normalPrice=normalPrice-(normalPrice*0.3);
			System.out.println("Discounted price:" + normalPrice);
			
		}
		if(type==2) {
			typeDiscount=normalPrice-(normalPrice*0.2);
			System.out.println("Total price:" + typeDiscount);
			
		}
	}

}

