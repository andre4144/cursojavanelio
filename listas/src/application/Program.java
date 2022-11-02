package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("maria");
		list.add("alex");
		list.add("bob");
		list.add("ana");
		list.add(2, "marco");

		System.out.println(list.size());

		for (String obj : list) {
			System.out.println(obj);
		}

		System.out.println("----------------------");
		list.removeIf(obj -> obj.charAt(0) == 'm');

		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println("------------");

		System.out.println("Index of Bob:" + list.indexOf("bob"));
		System.out.println("Index of Bob:" + list.indexOf("marco"));

		System.out.println("------------");
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'a').collect(Collectors.toList());
		for (String obj : result) {
			System.out.println(obj);
		}
		
		String name = list.stream().filter(obj -> obj.charAt(0) == 'a').findFirst().orElse(null);
		
		
		

	}

}
