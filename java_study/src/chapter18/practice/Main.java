package chapter18.practice;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Product pd1 = Product.builder()
				.name("삼성북 4")
				.price(1200.10)
				.description("네 번째 모델")
				.build();
		
		Product pd2 = Product.builder()
				.name("갤럭시 s24")
				.price(670.50)
				.description("삼성 핸드폰")
				.build();
		
		Customer.Address address1 = Customer.Address.builder()
				.street("전포대로")
				.city("부산")
				.postalCode("123456")
				.build();
		
		Customer customer1 = Customer.builder()
				.name("김다혜")
				.email("dev1")
				.address(address1)
				.build();
		
		List<Product> products = Arrays.asList(pd1, pd2);
		double totalPrice = Order.calcTotalPrice(products);
		
		System.out.println(totalPrice);
		
		Order order = Order.builder()
				.orderId("ORD1234")
				.customer(customer1)
				.products(products)
				.totalPrice(totalPrice)
				.build();
		
		System.out.println(order);
		
		// Order(orderId=ORD1234, 
		// customer=Customer(name=김다혜, email=dev1, 
		// address=Customer.Address(street=전포대로, city=부산, postalCode=123456)), 
		// products=[Product(name=삼성북 4, price=1200.1, description=네 번째 모델), 
		// Product(name=갤럭시 s24, price=670.5, description=삼성 핸드폰)], 
		// totalPrice=1870.6)
		
		

	}
}
