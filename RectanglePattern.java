package Lab05a.src;

import java.util.Scanner;

/**
 * Lab05a - Print a Rectangular Pattern
 * @author Eylul Badem
 * @version 23.11.2020
*/ 
public class Lab05a
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Variables
        
        final String y = "y";
        final String Y = "Y";
        final String YES = "YES";
        final String yes = "yes";
        final String Yes = "Yes";
        String answer = "y";
        
        // Program Code
    
        while ( answer.equals( yes ) || answer.equals( y ) || answer.equals( Y ) || answer.equals( YES ) || answer.equals( Yes ))
        {
            // 1-Ask for and get the character from the user
            System.out.println( "character?");
            String character = scan.next();
            
            // 2-Ask for and get the width from the user
            System.out.println( "width?");
            int width = scan.nextInt();
            
            // 3-Ask for and get the height from the user
            System.out.println( "height?");
            int height = scan.nextInt();
            
            // 4-Ask for and get the thickness from the user
            System.out.println( "thickness?");
            int thickness = scan.nextInt();
            
            // 5.1-Output an appropriate error message (& stop) if any of the values are invalid
            if ( height <= 0 || width <= 0 || thickness <= 0)
            {
                System.out.println( "Error: all values must be positive!");
            }
            // 5.2-Display the rectangle but print a warning message if it does not have a hole in the middle!
            else if ( thickness >= height / 2 || thickness >= width / 2)
            {
                System.out.println( "Oops... no hole!");
            }
                        
            System.out.println();
            
            // 6-Print out the upper side of the pattern
            for ( int line=0; line < thickness; line = line + 1 )
            { 
               for ( int count=0; count < width; count = count + 1 )
               {
                  System.out.print( character);
               }
               System.out.println();
            }
            
            // 7-Print out the middle part of the pattern (the part with spaces)
            for ( int line=0; line < height-(thickness*2); line = line + 1 )
            { 
               for ( int count=0; count < thickness; count = count +1 )
               {
                  System.out.print( character);
               }
               for ( int count=0; count < width-(thickness*2); count = count +1 )
               {
                   System.out.print(" ");
               }
               for ( int count=0; count < thickness; count = count +1 )
               {
                   System.out.print( character);
               }
               System.out.println();
            }
        
            // 8-Print out the lower side of the pattern
            for ( int line=0; line < thickness; line = line + 1 )
            { 
               for ( int count=0; count < width; count = count +1 )
               {
                  System.out.print( character);
               }
               System.out.println();
            }
            
            // 9-Ask the user if they wish to create another pattern and, if the user responds 'y' do so
            System.out.println();
            System.out.println( "do you want to create another pattern?");
            answer = scan.next();
        } 
       
        // 10-Print out a goodbye message if the user says no
        System.out.println( "goodbye then!");
        
        scan.close();
    }
    
}
