package Threads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class CharCount implements Runnable
{
	public static BufferedReader reader = null;
	public String filePath;
	public CharCount(String fp)
      {
		filePath=fp;
	}
	public void run() 
      {
	 int CharCount=0;
       File file = new File(filePath);
       try 
       {
         FileInputStream fileStream = new FileInputStream(file);
         InputStreamReader input = new InputStreamReader(fileStream);
         reader = new BufferedReader(input);
         String data=reader.readLine();      
         while(data!= null)
         {
          String words[] = data.split(" ");
          for(String word : words)
          {
            CharCount=CharCount+word.length();
          }
          data=reader.readLine();
         }   
        }
        catch(Exception e)
        {
    	    e.printStackTrace();
        }
        System.out.print(CharCount + " ");
	}
}