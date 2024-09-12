package chapter15;
// ==상속 & 다형성==
// 도서(Book) 클래스를 상속받는 전자책(EBook), 종이책(PaperBook) 클래스 정
public class Ebook extends Book{
	private String downloadLink;
	
	public Ebook(String title, String author, int isbn, String downloadLink) {
		super(title, author, isbn);
		this.downloadLink = downloadLink;
	}
	
	// 전자책 대여 시 다운로드 링크를 출력
	@Override
	public void borrowBook() throws BookAlreadyBorrowedExceoption{
		super.borrowBook();
		System.out.println("다운로드 링크: " + downloadLink);
	}
}
