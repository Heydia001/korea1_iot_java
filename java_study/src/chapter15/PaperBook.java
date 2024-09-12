package chapter15;
// ==상속 & 다형성==
// 도서(Book) 클래스를 상속받는 전자책(EBook), 종이책(PaperBook) 클래스 정의
public class PaperBook extends Book{
	private int NumberOfPages;
	
	public PaperBook(String title, String author, int isbn, int NumberOfPages) {
		super(title, author, isbn);
		this.NumberOfPages = NumberOfPages;
	}
	
	// 전자책 대여 시 다운로드 링크를 출력
	@Override
	public void borrowBook() throws BookAlreadyBorrowedExceoption{
		super.borrowBook();
		System.out.println("종이책은 대면 대여만 가능합니다.");
	}
}
