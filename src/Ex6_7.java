
class Data2{int x;}

class Ex6_7 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		chang(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void chang(Data2 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
