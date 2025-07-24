package Day4;

public class TypeCasting {
	public static void main(String[] args) {
		int intValue = 10;
		double dbValue=23.36;
		float fValue = (float)intValue;
		int intFromDouble = (int)dbValue;
		System.out.println("Int Value : "+intValue);
		System.out.println("Int Value after float conversion : "+fValue);
		System.out.println("Double Value : "+dbValue);
		System.out.println("Double Value after Int Conversion : "+intValue);
	}

}
