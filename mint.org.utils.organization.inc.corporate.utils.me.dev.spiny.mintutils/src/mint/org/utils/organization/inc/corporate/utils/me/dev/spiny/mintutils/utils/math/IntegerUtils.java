package mint.org.utils.organization.inc.corporate.utils.me.dev.spiny.mintutils.utils.math;

import java.io.IOException;
import java.util.HashMap;

public class IntegerUtils {

	public static boolean isThisNumberEven ( int thisIsOurInput ) throws IOException
	{
		try {
	final HashMap< Integer , Boolean > mapOfPossible = new HashMap<>();
	boolean True = false;
	for( int integer = Integer.MIN_VALUE;  integer < Integer.MAX_VALUE;  ++integer) {
		
		if(True == true) True = false; else True = true;
		
		mapOfPossible.put(integer, True);
		
	}
	
	for( Integer integer : mapOfPossible.keySet() ) {
		
	if( integer == thisIsOurInput ) return mapOfPossible.get( integer );
		
	}} catch (Exception e) {};
		
	return false;
	
	}
	
}
