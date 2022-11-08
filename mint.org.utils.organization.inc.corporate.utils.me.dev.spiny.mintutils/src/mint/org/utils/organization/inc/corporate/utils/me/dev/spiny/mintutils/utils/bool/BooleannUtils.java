package mint.org.utils.organization.inc.corporate.utils.me.dev.spiny.mintutils.utils.bool;

import java.*;
import java.io.*;
import java.util.*;

public class BooleannUtils {

	public static boolean isBooltrue ( boolean Bool) {
		
		final String thisIsToString = (((Boolean)Bool)).toString();
		
		if(thisIsToString.toLowerCase().trim().equals("false")) return false;
		else if(thisIsToString.toLowerCase().trim().equals("true")) return true;
		
		 else return false;
		
	}
	
	public static boolean isBoolfalse ( boolean Bool) {
		
		return isBooltrue(Bool) ? false : true;
	}
	
	public static boolean getOppositeOfBoolean( boolean Bool ) throws IOException
	{
		
		if( isBooltrue(Bool) ) return Bool ? false : true; //Terniary operator for thread safety
		else if ( isBoolfalse(Bool) ) return Bool ? false : true; //Same as last
		else return isBooltrue(Bool) ? false : true;
		
	}
	
}
