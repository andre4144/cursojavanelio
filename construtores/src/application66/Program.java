package application66;

import java.util.Locale;
import java.util.Scanner;

import entities66.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price ");
		double price = sc.nextDouble();
		
		
		Product product = new Product(name, price);
		
		
		product.setName("computer");
		System.out.println("Uptade name: " + product.getName());
		
		product.setPrice(1200);
		System.out.println("Update price: " + product.getPrice());
		
		
		System.out.println("uptade quantity: " + product.getQuantity() );
		
		
		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println(product);

		sc.close();
	}

}
