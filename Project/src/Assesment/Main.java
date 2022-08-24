package Assesment;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		welcomeScreen();
		try {
			menuDriven();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public static void welcomeScreen() {
		System.out.println("Application Name : LOCKED ME \n");
		System.out.println("Developer Details: Developed by Konijeti Kavya Sri \n");
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		BusinessLevelOperations obj = new BusinessLevelOperations();
		int option;
		do {
		System.out.println("Enter your choice which you want to select: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=sc.nextInt();
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			int ch;
		do {
			System.out.println("Enter your choice for Business level operation");
			System.out.println("\t1. Add a file to the existing directory list");
			System.out.println("\t2. Delete a user specified file from the  directory list");
			System.out.println("\t3. Search a File from the Directory");
			System.out.println("\t4. Exit from Business-level Operations menu");
			
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				obj.addFile();
				break;
			case 2:
				obj.deleteFile();
				break;
			case 3:
				obj.searchFile();
				break;
			case 4:
				System.out.println("Exited from the Business Level operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		//System.out.println("Press 0 to continue");
		}while(option!=3);
		
	}
}
