package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário).
		 * Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que
		 * foram digitados. 
		 * Todo produto possui nome e preço. Produtos importados
		 * possuem uma taxa de alfândega, e produtos usados possuem data de fabricação.
		 * Estes dados específicos devem ser acrescentados na etiqueta de preço conforme
		 * exemplo (próxima página). Para produtos importados, a taxa e alfândega deve
		 * ser acrescentada ao preço final do produto. 
		 * 
		 * Favor implementar o programa
		 * conforme projeto ao lado.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		List<Product> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i +  " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char c = sc.next().toLowerCase().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if ( c == 'c') {
				list.add(new Product(name, price));
			}
			else if(c == 'u') {
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.nextLine();
				list.add(new UsedProduct(name, price, sdf.parse(date)));
			}
			else if(c == 'i') {
				System.out.print("Customs Fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		
		sc.close();
	}

}
