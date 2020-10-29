package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println();
        System.out.println("This program is running version" + App.class.getPackage().getImplementationVersion());
    }
}
