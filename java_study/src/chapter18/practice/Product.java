package chapter18.practice;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString

public class Product {
	private final String name;
	private final double price;
	private final String description;
}
