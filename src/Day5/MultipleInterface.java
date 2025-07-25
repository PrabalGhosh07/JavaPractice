package Day5;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}


public class MultipleInterface implements A,B{

	public void show() {
        System.out.println("show() method for A and B");
    }

    public static void main(String[] args) {
        MultipleInterface obj = new MultipleInterface();

        obj.show();

        A aRef = obj;
        B bRef = obj;

        aRef.show();
        bRef.show();
    }

}
