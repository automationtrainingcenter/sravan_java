package basics;
/*
 * primitive and non primitive
 * Boolean 
 * Numeric:
 * 		byte	Byte
 * 		short	Short
 * 		int		Integer
 * 		long	Long
 * 		float 	Float
 * 		double	Double
 * Character
 * 		char	Character		
 * 
 * non primitive
 * Array
 * String
 * 
 */

public class DataTypesDemo {
	
	public static void main(String[] args) {
		boolean b = true;
		System.out.println("boolean value is "+b);
		
		System.out.println("****************************************");
		byte by = 123;
		System.out.println("byte value is "+by);
		System.out.println("max value of byte is "+Byte.MAX_VALUE);
		System.out.println("min value of byte is "+Byte.MIN_VALUE);
		System.out.println("size of byte is "+Byte.SIZE);
		
		System.out.println("****************************************");
		short sh = 1234;
		System.out.println("short value is "+sh);
		System.out.println("max value of short is "+Short.MAX_VALUE);
		System.out.println("min value of short is "+Short.MIN_VALUE);
		System.out.println("size of short is "+Short.SIZE);
		
		System.out.println("****************************************");
		int i = 1234567;
		System.out.println("int value is "+i);
		System.out.println("max value of int is "+Integer.MAX_VALUE);
		System.out.println("min value of int is "+Integer.MIN_VALUE);
		System.out.println("size of int is "+Integer.SIZE);
		
		System.out.println("****************************************");
		long l = 123456789876l;
		System.out.println("long value is "+l);
		System.out.println("max value of long is "+Long.MAX_VALUE);
		System.out.println("min value of long is "+Long.MIN_VALUE);
		System.out.println("size of long is "+Long.SIZE);
		
		System.out.println("****************************************");
		float f = 12.34f;
		System.out.println("float value is "+f);
		System.out.println("max value of float is "+Float.MAX_VALUE);
		System.out.println("min value of float is "+Float.MIN_VALUE);
		System.out.println("size of float is "+Float.SIZE);
		
		System.out.println("****************************************");
		double d = 2124.23324;
		System.out.println("double value is "+d);
		System.out.println("max value of double is "+Double.MAX_VALUE);
		System.out.println("min value of double is "+Double.MIN_VALUE);
		System.out.println("size of double is "+Double.SIZE);
		
		System.out.println("****************************************");
		char ch = 'a';
		System.out.println("character value is "+ch);
		System.out.println("max value of character is "+Character.MAX_VALUE);
		System.out.println("min value of character is "+Character.MIN_VALUE);
		System.out.println("size of character is "+Character.SIZE);
		
		
		short st = by; //up casting
		
		st = 130;
		//down casting
//		lower_type var_name = (lower_type) upper_type_var
		byte bi = (byte) st;
		System.out.println(bi);
		
//		primitive to wrapper conversion - auto boxing
		int inw = 102;
//		Integer inp = new Integer(inw);		
		Integer inp = Integer.valueOf(inw);
		String s = "1234";
		Integer.parseInt(s);
		inp.toString();
//		wrapper to primitive conversion - unboxing
		Float fp = new Float(21.32f);
		float fw = fp.floatValue();
		String s1 = "12.1234";
		Float.parseFloat(s1);
		
	}
	

}
