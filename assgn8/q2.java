package ASSGN8;

import java.io.File;   

import java.io.FileNotFoundException;   

import java.util.Scanner; 

class ReadFromFile {  
    public static void main(String[] args) {  
        try {  
            
            File f1 = new File("D:Example.txt");    
            Scanner sc = new Scanner(f1);  
            while (sc.hasNextLine()) {  
                String fileData = sc.nextLine();  
                System.out.println(fileData);  
            }  
            sc.close();  
        } catch (FileNotFoundException e) {  
            System.out.println("Unexcpected error occurred!");   
        }  
    }  
}  