package chapter07;
	
class Student {
	private String name;
	private int age;
	private int score; // 점수 필드
	// getter & setter 메서드 -> 캡슐화 되어 있는 데이터에 접근
	// : 메서드 형식을 get 변수명, set 변수명으로 지정하는 것을 권장
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		
		if (score < 0 || score > 100) {
			System.out.println("유효하지 않은 점수입니다.");
		}  else {
			this.score = score;
			System.out.println(this.score);
		}
	}
}


public class C_Encapsulation {
	public static void main(String[] args) {
		Student std1 = new Student();
//		std1.name = "김다혜"; - Error
		std1.setName("김다혜");
		std1.setAge(90);
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		
		std1.setAge(-10); // 유효하지 않은 나이입니다.
		
		std1.setScore(-100);
		System.out.println(std1.getScore()); 
	}
}
