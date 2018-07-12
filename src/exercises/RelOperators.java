package exercises;


public class RelOperators {
	
	public static int myNumberA;
	public static int myNumberB;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myNumberA = -32;
		myNumberB = 2;
		
		if(myNumberA > myNumberB)
		{
			System.out.println(myNumberA + " est plus grand que " + myNumberB);
		}
		else if(myNumberA < myNumberB)
		{
			System.out.println(myNumberB + " est plus grand que " + myNumberA);
		}
		else
		{
			System.out.println(myNumberA + " est egal a " + myNumberB);
		}
	}

}
