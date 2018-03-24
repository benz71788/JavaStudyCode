package array;

public class BookTest {
	
	public static void main(String[] args) {
		Book bookArray[] = new Book[5];
		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Novel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Novel", "cloven hoof", 50000, 15);
		
		double total = 0;
		for(int i = 0; i < bookArray.length; i++) {
			System.out.print(bookArray[i].getCategory() + "\t");
			System.out.print(bookArray[i].getBookName() + "\t");
			System.out.print(bookArray[i].getBookPrice() + "원\t");
			System.out.print(bookArray[i].getBookDiscountRate() + "%\n");
			
			total += bookArray[i].getBookPrice();
		}
		
		System.out.println("\n책 가격의 합: " + total + "원");
	}

}
