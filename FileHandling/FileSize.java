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

class FileSize implements Runnable
{
	private long ByteCount = 0;
	public String filePath;
	public FileSize(String fp)
      {
		filePath=fp;
	}
	public void run()
      {
	    Path path = Paths.get(filePath);
	    try 
          {
		ByteCount = Files.size(path);
	    }
	    catch(Exception e)
          {
	    	e.printStackTrace();
	    }
	    System.out.print((int)ByteCount + " ");
     }
}