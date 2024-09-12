package chapter15;

// 사용자 정의 예외
// : 책이 이미 대여중일 때 발생하는 얘외 제외
public class BookAlreadyBorrowedExceoption extends RuntimeException{
	public BookAlreadyBorrowedExceoption(String message) {
		super(message);
	}
}
