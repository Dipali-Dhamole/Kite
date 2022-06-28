package Test;

public class StringBufferandBuilder {

	public static void main(String[] args) {
		
		
		String s = new String("Velocity");

		StringBuffer sb = new StringBuffer("Katraj");//mutable
		StringBuilder sbb = new 	StringBuilder("Pune");//immutable
		
		s.concat("Pune");
		
		sb.append("Pune");
		
		sbb.append("Maharashtra");
		
		System.out.println(s);//Velocity
		
		System.out.println(sb);
		
		System.out.println(sbb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
	}
}
