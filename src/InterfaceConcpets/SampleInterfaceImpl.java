package InterfaceConcpets;

public class SampleInterfaceImpl {

	public static void main(String[] args) {
		SampleInterface mul = (a, b) -> a * b;
		System.out.print(mul.multiply(10, 20));

	}

}
