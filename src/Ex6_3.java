
public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Cade.width= " + Card.width);
		System.out.println("Cade.height= " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 4;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println();
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ") " );
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ") " );
		System.out.println();
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		
		c1.width = 50;
		c1.height = 80;
		System.out.println();
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ") " );
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ") " );
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}


