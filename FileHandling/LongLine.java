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

class LongLine implements Runnable
{
	private static int MIN_VALUE = 0;
	public static BufferedReader reader = null;
	public String filePath;
	public LongLine(String fp) 
      {
		filePath=fp;
	}
	public void run()
      {
       int length=0,max=MIN_VALUE;
       File file = new File(filePath);
       try 
       {
         FileInputStream fileStream = new FileInputStream(file);
         InputStreamReader input = new InputStreamReader(fileStream);
         reader = new BufferedReader(input);
         String data=reader.readLine();
         while(data!=null) 
         {
  	     if(data.length()>max)
  	     max=data.length();
  	     data=reader.readLine();
         }
         length=max;
        }
        catch(Exception e)
        {
    	   e.printStackTrace();
        }
        System.out.print(length + " ");
	}
}