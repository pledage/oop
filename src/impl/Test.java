package impl;

import java.util.ArrayList;
import java.util.Iterator;



/**
 * 캐스팅
 * @author smart12
 *
 */

public class Test {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("HI");
		al.add("JAVA");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
		
	}

}
