// Write a program to check day number(1-7)and print the corresponding day of week

class Program{
	public static void main(String[]args){
		int N=7;

		if(N==1){
			System.out.println("Monday");
		}
		else if(N==2){
			System.out.println("Tuesday");
		}
		else if(N==3){
			System.out.println("Wednesday");
		}
		else if(N==4){
			System.out.println("Thursday");
		}
		else if(N==5){
			System.out.println("Friday");
		}
		else if(N==6){
			System.out.println("Saturday");
		}
		else if(N==7){
			System.out.println("Sunday");
		}
		else
			System.out.println("invalid day number");
	}
}
