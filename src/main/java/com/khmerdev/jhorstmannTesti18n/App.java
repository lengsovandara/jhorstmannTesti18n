package com.khmerdev.jhorstmannTesti18n;

import java.util.Locale;

import net.jhorstmann.i18n.I18N;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	Locale locale = new Locale("fr");
    	Locale.setDefault(locale);
        System.out.println( "Hello World!" );
        System.out.println( I18N.tr("Hello World!"));        
    }
}
