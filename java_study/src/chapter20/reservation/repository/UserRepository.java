package chapter20.reservation.repository;

import java.util.ArrayList;
import java.util.List;
import chapter20.reservation.model.User;

// 사용자 데이터 저장소 클래스
public class UserRepository {
	private List<User> users; // 사용자 목록
	
	public UserRepository() {
		this.users = new ArrayList<User>();
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public User findById(String userId) {
		for(User user : users) {
			if(user.getUserId().equals(userId)) {
				return user;
			}
		}
		return null;
	}
}
