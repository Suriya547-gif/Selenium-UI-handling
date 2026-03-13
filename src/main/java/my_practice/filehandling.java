package my_practice;
//FILE HANDLING IN JAVA :
    //File handling means doing some operations like creating files, reading files, 
//deleting files, writing files and checking file existence
     //File handling is achieved through classes and interfaces
//Those classes and interfaces are contained by two packages 
//Those 2 packages are java.io and java.nio.file

//java.io.File :: A CLASS 
  //This is a file class
  //This class represents a file path
  //This class provides methods for creating file, deleting file,
  //-renaming file, check file existence, getting path information




import java.io.File;//importing package ... this package contains class to do file operations

//CHECKING FILE EXISTENCE :
public class filehandling {
    public static void main(String[] args) {
        File myFile = new File("example.txt");//obj creation //example.txt is a file name
        if (myFile.exists()) { //exists method is used to check whether a file is available or not
            System.out.println("File exists: " + myFile.getName()); //getName() to get a file name
        } else {
            System.out.println("File does not exist.");
        }
        
        //Java uses streams for reading file and writing file
        
    }
}