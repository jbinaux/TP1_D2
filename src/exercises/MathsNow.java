package exercises;

public class MathsNow {

	public static int myNumberA;
    public static int myNumberB;
    public static int sum, mul;
    public static float div;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myNumberA = 25;
		myNumberB = 5;
		sum = myNumberA + myNumberB;
		mul = myNumberA * myNumberB;
		div = myNumberA / myNumberB;
		System.out.println(myNumberA + " + " + myNumberB + " = " + sum);
		System.out.println(myNumberA + " x " + myNumberB + " = " + mul);
		System.out.println(myNumberA + " / " + myNumberB + " = " + div);
	}

}
