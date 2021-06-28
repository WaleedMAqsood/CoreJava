
class Gen<T> {
	T obj;

	Gen(T obj) {
		this.obj = obj;
	}

	public T getObject() {

		return this.obj;
	}
}

public class GenericClassProgram {
	public static void main(String[] args) {

		Gen<Integer> obj = new Gen<Integer>(15);
		System.out.println(obj.getObject());
		Gen<String> obj2 = new Gen<String>("do");
		obj2.getObject();
		System.out.println(obj2.getObject());

	}
}
