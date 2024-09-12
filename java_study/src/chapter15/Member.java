package chapter15;
import chapter15.Book;
import java.time.LocalDate;
import java.util.*;

// == Member 클래스==
// 멤버 아이디(memberId), 회원이름(name), 책 대여 목록(List<Loan> loans = new )
// borrowBook(Book book), returnBook(Book book)
// >> void 반환 타입
public class Member {
	private String memberId;
	private String name;
	private List<Loan> loans;
	
	public Member(String memberId, String name){
		this.memberId = memberId;
		this.name = name;
		this.loans = new ArrayList<Loan>(); 
	}

	public void borrowBook(Book book) throws BookAlreadyBorrowedExceoption{
		book.borrowBook(); // 책 대여 시도
		Loan loan = new Loan(this, book, LocalDate.now());
		loans.add(loan); // 대여 목록에 추가
		System.out.println(name + "회원이 " + book.getTitle() + "(을)를 대여하였습니다.");
	}
	
	public void returnBook(Book book){
		book.returnBook(); // 책 반납 시도
		// removeIf()
		// : 리스트 메서드, 조건을 만족하는 요소를 리스트에서 제거, 조건은 람다식을 사용하여 정의
		loans.removeIf(loan -> loan.getBook().equals(book)); // 대여목록에서 제거
		System.out.println(name + "회원이 " + book.getTitle() + "을(를) 반납하였습니다");
	}
	
}
