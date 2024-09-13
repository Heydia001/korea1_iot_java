package chapter15;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Library {
	private Map<String, Book> books;
	
	public Library() {
		this.books = new HashMap<String, Book>();
	}
	
	// 책 추가 메서드
	public void addBook(Book book) {
		books.put(book.getTitle(), book);
		System.out.println(book.getTitle() + "이(가) 도서관에 추가 되었습니다.");
	}
	// 제목으로 책 검색
	// 람다 표현식 & 스트림 API
	public List<Book> searchbooksByTitle(String title) {
		return books.values().stream()
				.filter(book -> book.getTitle().equalsIgnoreCase(title))
				.collect(Collectors.toList());
	}
	
	// 저자로 책 검색
	public List<Book> searchbooksByAuthor(String author) {
		return books.values().stream()
				.filter(book -> book.getAuthor().equalsIgnoreCase(author))
				.collect(Collectors.toList());
	}
	// 도서관 데이터를 저장하는 메서드
	
	
	// 도서관 데이터를 로드하는 메서드
	
}
