package DS;

public class ArrayListMain {

	public static void main(String[] args) {
		ArrayListImplementation<Integer> arr = new ArrayListImplementation<>();
		arr.add(0, 12);
		System.out.println(arr.toString());
		arr.remove(0);
		System.out.println(arr.toString());
	}

}
