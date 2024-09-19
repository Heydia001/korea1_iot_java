package chapter18.practice;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Customer {
	private final String name;
	private final String email;
	private final Address address;
	
	@Builder
	@Getter
	@ToString
	// 중첩 객체 (고객 객페 내의 주소 데이터 설정)
	public static class Address{
		private String street;
		private String city;
		private String postalCode;
		
	}
}
