package Day5;

interface E {
	void show();
}
interface F{
	void show() ;
}
interface G{
	 void show() ;
}

public class Multipleinterface3 implements E,F,G{
	@Override
	public void show() {
		System.out.println("Show method");
	}
	public static void main(String[] args) {
		MultipleInterface obj= new MultipleInterface();
		obj.show();
		obj.show();
		obj.show();
	}

}
