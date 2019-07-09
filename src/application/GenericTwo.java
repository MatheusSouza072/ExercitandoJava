package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.GenericProducts;
import services.CalculationService;

public class GenericTwo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<GenericProducts> list = new ArrayList<>();

		String path = "/home/maximiliano/Documentos/Matheus/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new GenericProducts(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			GenericProducts x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}