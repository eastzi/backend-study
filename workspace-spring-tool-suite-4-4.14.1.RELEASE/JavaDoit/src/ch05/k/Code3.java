package ch05.k;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code3 {
	
	static Person1 [] members = new Person1 [100];
	static int n = 0;
	
	public static void main(String[] args) {
	
		try {
			Scanner in = new Scanner(new File("input.txt")); //라이버리에 따로 저장된 txt파일 
			while(in.hasNext()) {
				String nm = in.next();
				String nb = in.next();
				
				members[n] = new Person1();
				members[n].name = nm;
				members[n].number = nb;
				n++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No data file");
			System.exit(1);
		}
		
		bubbleSort();
		
		for(int i = 0; i < n; i++) {
			System.out.println(members[i].name + " " + members[i].number);
		}
	}

	private static void bubbleSort() {
		
		for(int i = n-1; i > 0; i++) {
			for(int j = 0; j < i; j++) {
				if(members[j].name.compareTo(members[j+1].name) > 0) { //compareTo 문자열 비교 
					Person1 tmp = members[j];
					members[j] = members[j+1];
					members[j+1] = tmp;
					
				}
			}
		}
	} 

}
