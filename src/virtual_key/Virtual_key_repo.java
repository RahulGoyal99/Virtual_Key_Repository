package virtual_key;

import java.util.Scanner;
import java.io.IOException;

public class Virtual_key_repo {

	public static void main(String[] args) throws IOException {
		int ch = 0, choice = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\t**********************\n");
		System.out.println("\t Welcome to LOCKED.com ");
		System.out.println("\t**********************");
		System.out.println("\t**********************");
		System.out.println(" Developer:\t Rahul Goyal \n ");

		while (true) {
			System.out.println("Please choose the options to do operations in file :");
			System.out.println("1. List the existing files in the directory");
			System.out.println("2. Choose the operation you want to do.");
			System.out.println("3. Exit Application");
			try {
				ch = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Null Exception occurred");
			}

			switch (ch) {
			case 1:
				Operations_repo.listFiles();
				break;
			case 2:

				System.out.println("Please choose one of the following options :");
				System.out.println("1. Add a File into the directory");
				System.out.println("2. Delete a File fromm the directory");
				System.out.println("3. Search for a File from the directory");
				try {
					choice = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Null Exception occurred");
				}
				switch (choice) {
				case 1:
// Creation of a file 
					System.out.println("Enter the name of a file to be created: ");
					String fileCreate = sc.next();

//Create file function called
					Operations_repo.createFile(fileCreate);
					break;

				case 2:
// deletion of a file 
					System.out.print("Enter the name of a file to be deleted: ");
					String fileDelete = sc.next();

//Delete file function called
					Operations_repo.deleteFile(fileDelete);
					break;
				case 3:
// Search for a file 
					System.out.println("Enetr the name of a file to be searched: ");
					String fileSearch = sc.next();

//search file function called
					Operations_repo.searchFile(fileSearch);
					break;

				default:

					System.out.println("\n Opps! Invalid options selected Redo process choose correct options\n");
					break;
				}

				break;
			case 3:

// exiting the application
				sc.close();
				System.out.println("\n Good to have you here. Thanks for choosing us.!!!");
				System.exit(1);
				break;

			default:
				// In the case of unprecedented input execute this
				System.out
						.println("\nOpps! Invalid options selected Redo process choose correct options range of 1-3\n");
				break;

			}
		}

	}

}
