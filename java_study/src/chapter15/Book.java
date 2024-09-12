package chapter15;
// == Book 클래스 ==
// 책 제목(title), 저자(author), 책 고유 번호(isbn), 대여 여부(isAvailable)
// 책 대여 호출(borrowBook), 책 반납 호출(returnBook)
// >> void 반환 타입
public class Book {
	private String title;
	private String author;
	private int isbn;
	private boolean isAvailable;
	
	Book(String title, String author, int isbn){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		isAvailable = true;
	}
	
	// cf)메서드 명 옆의 throws 키워드
	// : 해당 메서드가 특정 예외를 던질 수 있음을 나타냄 (가능성)
	public void borrowBook() throws BookAlreadyBorrowedExceoption {
		if (!isAvailable) {
			throw new BookAlreadyBorrowedExceoption(this.title + "책은(는) 이미 대여중입니다.");
		}
		isAvailable = false;
		System.out.println(this.title + "책을 대여했습니다.");
	}
	
	public void returnBook() {
		isAvailable = true;
		System.out.println(this.title + "책을 반납하였습니다.");
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getIsbn() {
		return isbn;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
	
}
