package Fyling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        File filey = new File("Fyling/text.txt");

        if (filey.exists()) {
            System.out.println(
                    "File exists! Its called" + filey.getName() + " and its " + filey.length() + " bytes long.");
        } else {
            System.out.println("File does not exist!\nCreating file...");
            try {
                filey.createNewFile();
            } catch (Exception e) {
                System.out.println("Error creating file!");
            }
        }

        Scanner option = new Scanner(System.in);
        System.out.println("What do you want to do with the file?\n1. Input\n2. Rename\n3. Move\n4. Copy\n5. Exit");
        int choice = Integer.parseInt(option.nextLine());

        switch (choice) {
            case 1:
                System.out.println("What do you want to write to the file?");
                String input = option.nextLine();
                try {
                    // Add data to new line
                    FileWriter writer = new FileWriter("Fyling/text.txt", true);
                    writer.write(input + "\n"); // \n is last because it will add a new line to the end of the file
                    writer.close();
                } catch (Exception e) {
                    System.out.println("Error writing to file!");
                }
                break;
            case 2:
                System.out.println("What do you want to rename the file to?");
                String newname = option.nextLine();
                filey.renameTo(new File(newname));
                break;
            case 3:
                System.out.println("Where do you want to move the file to?");
                String newpath = option.nextLine();
                filey.renameTo(new File(newpath));
                break;
            case 4:
                System.out.println("Where do you want to copy the file to?");
                String newcopy = option.nextLine();
                // To copy a file you need to create a new file and copy the data from the old
                // file to the new file
                File newfile = new File(newcopy);
                try {
                    Scanner reader = new Scanner(filey); // Scanner can read files too
                    FileWriter writer = new FileWriter(newfile);
                    while (reader.hasNextLine()) {
                        String data = reader.nextLine();
                        writer.write(data + "\n");
                    }
                    reader.close();
                    writer.close();
                } catch (Exception e) {
                    System.out.println("Error copying file!");
                }
            case 5:
            System.out.println("Well, it was nice knowing you...");
            break;
            default:
            break;
        }
        
        option.close();
    }
}
