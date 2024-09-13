package chapter15;

import java.util.List;

// Main 클래스
// : 프로그램 실행 클래스
public class Main {
	// main 메서드
	// : 해당 메서드가 존재해야만 자바 프로그램 실행 가능(콘솔)
	public static void main(String[] args) {
		// ===프로젝트 개요===
		// <도서관리 시스템>
		
		// 1. 클래스 & 객체 사용한 프로젝트 구조 데이터 설정
		// 1) 클래스: 도서 (Book), 회원(Member), 대여(Loan), 
		
		// == Book 클래스 ==
		// 책 제목(title), 저자(author), 책 고유 번호(isbn), 대여 여부(isAvailable)
		// 책 대여 호출(borrowBook), 책 반납 호출(returnBook)
		// >> void 반환 타입
		
		// == Member 클래스==
		// 멤버 아이디(memberId), 회원이름(name), 책 대여 목록(List<Loan> loans = new )
		// borrowBook(Book book), returnBook(Book book)
		// >> void 반환 타입
		
		// == Loan class =
		// Member 클래스의 인스턴스
		// Book 클래스의 인스턴스
		
		Library library = new Library();
		
		Book book1 = new PaperBook("Java", "김다혜", 2134, 150);
		Book book2 = new PaperBook("파이썬", "홍길동", 2345, 150);
		Book book3 = new PaperBook("C언어", "강감찬", 4562, 150);
		
		Book book4 = new Ebook("안녕", "유관순", 123 , "www.example.com");
		Book book5 = new Ebook("반가워", "김도결", 123 , "www.example.com");
		Book book6 = new Ebook("hello", "아무개", 123 , "www.example.com");
		Book book7 = new Ebook("hi", "김소빈", 123 , "www.example.com");
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		library.addBook(book6);
		library.addBook(book7);
		
		
		Member member1 = new Member("001", "박성욱");
		Member member2 = new Member("002", "윤안나");
		Member member3 = new Member("003", "조승범");
		Member member4 = new Member("004", "진상영");
		
		try {
			member1.borrowBook(book1);
			member1.borrowBook(book2);
			
			member1.borrowBook(book6);
			
			member2.borrowBook(book7);
			
			member3.borrowBook(book7);
			
		} catch (BookAlreadyBorrowedExceoption e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("제목으로 Hi 책 검색");
		List<Book> foundBooksByTitle = library.searchbooksByTitle("hi");
		for (Book book : foundBooksByTitle) {
			System.out.println(book.getTitle() + " / " + book.getAuthor());
		}
		
		List<Book> foundBooksByAuthor = library.searchbooksByAuthor("홍길동");
		for (Book book : foundBooksByAuthor) {
			System.out.println(book.getTitle() + " / " + book.getAuthor());
		}
	}
}
