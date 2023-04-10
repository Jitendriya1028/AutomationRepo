package Selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Result {
	
	public static void main(String[] args) {
	
		
		BufferedReader dr = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = dr.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(input);
	}

}
