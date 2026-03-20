public class Main{
	public static void main(String[] args){
		Book a = new Book("Mein kaft","Adopt Healer",3.99);
		Book b = new Book("Duong Kach Menh", "Ho Chi Minh", 2.88);
		Book c = new Book("Mein kaft","Adopt Healer",3.98);
		Book d = new Book("Mein kaft","Adopt Healer",3.99);
		System.out.println(a.Equals(b));
		System.out.println(a.Equals(c));
		System.out.println(a.Equals(d));
	}
}