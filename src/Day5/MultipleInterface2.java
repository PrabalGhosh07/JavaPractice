package Day5;

interface X {
	static void show() {
		System.out.println("Static show() from Interface A");
	}
}
interface Y{
	static void show() {
		System.out.println("Static show() from Interface B");
	}
}
interface Z{
	static void show() {
		System.out.println("Static show() from Interface C");
	}
}
public class MultipleInterface2 implements X,Y,Z {
	public static void main(String[] args) {
		X.show();
		Y.show();
		Z.show();
	}

}
