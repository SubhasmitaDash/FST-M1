package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14{
    public static void main(String[] args) throws IOException {


        File file = new File("C:\\Users\\002NFL744\\Documents\\UPS.txt");  //Creating a new text File
        boolean status = file.createNewFile();
        if(status){   //Checkinh if file is created or not
            System.out.println("File created successfully");
        }
        else {
            System.out.println("File already exist");
        }
        //Get File Object
        File fileUtil = FileUtils.getFile("C:\\Users\\002NFL744\\Documents\\UPS.txt");
        System.out.println("data in file: "+FileUtils.readFileToString(fileUtil, "UFT8"));

        //Create directory
        File destDir = new File("resources");
        //Copy file to directory
        FileUtils.copyFileToDirectory(file, destDir);

        //Get file from new directory
        File newFile = FileUtils.getFile(destDir, "newfile.txt");
        //Read data from file
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        //Print it
        System.out.println("Data in new file: " + newFileData);

           }


}

