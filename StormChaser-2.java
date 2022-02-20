/*
 * Class:   StormChaser.java
 * Purpose: Main program to read hurricane data file, create Storm objects,
 *          and keep those that are category 3 or higher.
 */

import java.io.*;
import java.util.Scanner;

public class StormChaser {
    public static void main(String[] args)
    {
      // Constants
    final int MAX_STORMS = 300;

      // array of Storms
    Storm CurrentStorm;      // storm returned by GetStorm
    int nStorms = 0;         // number in array List
    int totalStorms = 0;     // total number of storms in the input file
    Scanner fileInput;
    
   // Openning hurricane data file
   try{
   System.out.println("Openning hurricane data file...");
   fileInput = new Scanner(new File("hurricanedata1950to2015.txt"));
   }
   catch(FileNotFoundException e){
       System.err.println("FileNotFoundException: " + e.getMessage());
       return;
   }
   System.out.println( "File opened successfully...");
   System.out.println( "Reading file..." );
   
   // Read Storm data from file until EOF
   while(  ) 
   {
       CurrentStorm = GetStorm(fileInput);
	++totalStorms;
        // If Storm i category 3 or higher, add to the array
	if(  )
	{
            
            nStorms++;
	}
    }
    System.out.println( "Number of storms: " + totalStorms );
    System.out.println( "Hurricanes with category 3 and above: " + nStorms );
    DisplayStorms( "First Twenty Storms", List, 20 );
    Sort( List, nStorms );
    DisplayStorms( "Top Twenty Storms", List, 20 );
    fileInput.close();
}

public static Storm GetStorm( Scanner in ) 
{
    // Create constants as array indexes for data elements
    
    
    // Declare variables
            
    Storm NewStorm; 
    
    // Read the Storm header information
    
    
    // Tokenize the header

        
    // Read first row of Storm data
    
        
    // Tokenize the Storm data
    String[] dataElements = data.split(",");
        
    // Extract the data elements
    beginDate = Integer.parseInt(dataElements[BEGINDATE].trim());
    wind = Integer.parseInt(dataElements[WIND].trim());
    pressure = Integer.parseInt(dataElements[PRESSURE].trim());
    duration = 6;    
    
    // Create Storm object
    NewStorm = new Storm(stormid, beginDate, duration, name, wind, pressure);    
        
    for( int i = 1; i <  ; i++ ) 
    {
        // Read next row of Storm data
        data = in.nextLine();
        
        // Tokenize the Storm data
        dataElements = data.split(",");
        
        // Extract the data elements
        
        
        // Update Storm object
        
    }
    // Return the new storm object
    return NewStorm;      
}

public static void DisplayStorms( String title, Storm[] List, int NStorms ) 
{
    // display NStorms storms
    // print some title and column headings
    System.out.println(title);
    System.out.println(
   "           Begin    Duration                        Maximum     Minimum  ");
    System.out.println(
   "Storm ID   Date      (hours)    Name    Category  Winds (mph) Press. (mb)");
    System.out.println(
   "-------------------------------------------------------------------------");
    for( int k = 0; k < NStorms; k++ )
    {
        // Print out one Storm
        
    }
    System.out.println ("\n");
}

public static void Sort( Storm StormList[], int n ) 
{
    // bubble sort the list of Storms
    int pass = 0, k, switches;
    Storm temp;
    switches = 1;
    while( switches != 0 ) 
    {
	switches = 0;
	pass++;
	for( k = 0; k < n - pass; k++ ) 
	{
		if( StormList[k].getCategory() < StormList[k+1].getCategory() )
		{
                    temp = StormList[k];
                    StormList[k] = StormList[k+1];
                    StormList[k+1] = temp;
                    switches = 1;
		}
	}
    }
}
}