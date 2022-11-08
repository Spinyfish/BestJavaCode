package mint.org.utils.organization.inc.corporate.utils.me.dev.spiny.mintutils.main;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

import mint.org.utils.organization.inc.corporate.utils.me.dev.spiny.mintutils.utils.bool.BooleannUtils;

public class Main {

	public static void main(String[] args) throws IOException {
		main Do = null;
		final object<BooleannUtils> o = new object<BooleannUtils>(new BooleannUtils()); //Singeltin
		final BooleannUtils ob = (BooleannUtils) object.instance;
		
		for(Method thisMethod : ob.getClass().getMethods()) {
			
			if(!thisMethod.getName().equals("getOppositeOfBoolean")) continue;
			Do = b -> {
				try {
					return (boolean) MethodHandles.lookup().unreflect(thisMethod).invokeWithArguments(b);
				} catch (final Throwable e) {}
				return b;
			};
		}
		if(Do == null) return;

		System.out.println(Do.doThing(true));
		System.out.println(Do.doThing(false));
	}
	
	interface main {
		
		boolean doThing(boolean b);
		
	}
	
	static class object<O> {
		
		public static Object instance;
		
		public object(Object o) {
			this.instance = o;
		}
		
		public object<O> getInstance() {
			
			return this;
			
		}
		
	}

}
