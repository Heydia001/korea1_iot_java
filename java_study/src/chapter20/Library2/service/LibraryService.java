package chapter20.Library2.service;

import chapter20.Library2.model.Book;
import chapter20.Library2.model.User;
import chapter20.Library2.repository.BookRepository;
import chapter20.Library2.repository.UserRepository;

public class LibraryService {
	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();
	
	
	public void addBook(Book book) {
		bookRepository.addBook(book);
	}

	public void registerUser(User user) {
		userRepository.addUser(user);
	}

	public void borrowBook(String userId, String bookTitle) {
		User user = userRepository.findUserById(userId);
		Book book = bookRepository.findByBookTitle(bookTitle);
		
		if(user != null && book != null && !book.isBorrowed()) {
			book.setBorrowed(true);
			System.out.println(user.getName() + "님이" + book.getTitle() + "을(를) 대여하였습니다.");
		} else {
			System.out.println("대여 no");
		}
	}
	
	public void returnBooks(String title) {
		Book book = bookRepository.findByBookTitle(title);
		if(book != null && book.isBorrowed()) {
			book.setBorrowed(false);
			System.out.println(book.getTitle() + "이가 반납 되었습니다. ");
		} else {
			System.out.println("반납 불가: 해당 도서는 대여 중이 아닙니다.");
		}
	}

	public void listAllBooks() {
		for(Book book : bookRepository.findAllBooks()) {
			System.out.println(book.getTitle() + " - " + (book.isBorrowed() ? "대여 중" : "대여 가능"));
		}
	}
	
	public void listAllUsers() {
		for(User user: userRepository.findAllUser()) {
			System.out.println(user.getUserId() +": " + user.getName());
		}
	}

}
