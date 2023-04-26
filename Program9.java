// Write a program in java to accept three numbers and check whether they are Pythagorean triplets or not

class Program{
	public static void main(String[] args){
		int a=3;
		int b=3;
		int c=5;
		int x,y,z;

		x=c*c;
		y=b*b;
		z=a*a;
		if(x==y+z || z=x+y || y=z+x){
			x=y+z;
			System.out.println("its pythagorean triplet");
		}
		else
			System.out.println("its not pythagorean triplet");

	}
}
