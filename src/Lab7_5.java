import java.util.ArrayList;
import java.util.List;

class User {
	private String productName;
	private int price;

	public User(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productname) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class Lab7_5 {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("Cadbury", 100));
		users.add(new User("Namkeen", 50));
		users.add(new User("Soft Drinks", 100));

		users.forEach(user -> {
			System.out.println("Product Name : " + user.getProductName() + ", Price : " + user.getPrice());
		});
	}
}