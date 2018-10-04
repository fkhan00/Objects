public class Driver{
	public static void main(){
		Kitty a = new Kitty("Matcha", 3);

		System.out.println(a.getName() + " is "+a.getAge() + " years old.");

		a.makeOlder();
		System.out.println(a.getName() + " is "+a.getAge() + " years old.");

		a.makeOlder();
		a.changeName("Katya");
		System.out.println(a.getName() + " is "+a.getAge() + " years old.");

		System.out.println(a);

		Kitty  b =  new Kitty();
		System.out.println(b);

		System.out.println(b.getName() + " is " + b.getAge() + " years old.");
	}
}
