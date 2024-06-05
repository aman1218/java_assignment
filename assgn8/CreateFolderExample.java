package ASSGN8;

import java.io.File;

public class CreateFolderExample {
    public static void main(String[] args) {
        String folderPath = "D:HalaMadrid"; // Specify the folder name and path

        File folder = new File(folderPath);

        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Folder created successfully!");
            } else {
                System.err.println("Failed to create folder.");
            }
        } else {
            System.err.println("Folder already exists.");
        }
    }
}
