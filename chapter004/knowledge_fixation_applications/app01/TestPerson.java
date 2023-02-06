public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person();

		p1.name = "Maria";
		p1.age = 25;

		p1.makesBirthday();
		p1.makesBirthday();

		System.out.printf("%s is %d years old.\n", p1.name, p1.age);
	}

}
