public 
class Hello_World { // public implies that the information in the class is available to all other classes 


	// Create a class variable which is accessible to any other function or class inside this class
	// Static : allows to other classes to acccess this class
	static String st_rand = "Random String";


	// Final : Does not change
	static final double d_PI = 3.1415; // All caps for constant is a java practice


	public static void // public allows all classes to use the function. Static : only a class can call for this function to execute. The class in this case is the Hello_World
	main(String[] args) { // main must be present in the class, it is where the execution starts. main must accept an array of strings as argument inputs

		// Print things!!
		System.out.println("Hello World!!"); // Object System.out for printing
		System.out.println(st_rand);
		System.out.println(d_PI); // The object can print any data type

		// Create variables : Must be declared before using
		int n_1 = 11, n_2 = 1, n_3 = n_1 + n_2*3; // Inline, with/without initialization and can be contingent
		/*
		Printing before initializing gives an error-- "error: variable n_2 might not have been initialized"
		*/
		System.out.println(n_1);
		System.out.println(n_2);
		System.out.println(n_3);
		/*
		Java does not care about whitespaces. It decodes sentences based on ;
		*/

		// Primitive types
		byte bt_max = 127; // Max value of byte
		byte bt_min = -128;
		short sh_max = 32767;
		short sh_min = -32768;
		int n_max = 2100000000; // Somewhere around this, not exact
		long l_max = 9220000000000000000L; // Somewhere around this, not exact. Must end with L
		float f_ = 3.14F; // To tell float, use F. ~6 decimal precision
		double d_ = 3.141543235D; // To tell double, use D. D is default, so can be skipped. ~15 decimal precision
		boolean b_true = true;
		boolean b_false = false;
		char ch_65 = 65; // Characters can be having int initializations and assignments. Similar to C++
		char ch_98 = 98;
		char ch_A = 'A';
		System.out.println("Character at ASCII 65 : " + ch_65);
		System.out.println("Character at ASCII 98 : " + ch_98);
		System.out.println("Character A : " + ch_A);

		// Maximum and minimum : Check the syntax to do that!! There are different keywords for each type
		System.out.println("Byte Max Value : " + Byte.MAX_VALUE);
		System.out.println("Byte Min Value : " + Byte.MIN_VALUE);
		System.out.println("Short Max Value : " + Short.MAX_VALUE);
		System.out.println("Short Min Value : " + Short.MIN_VALUE);
		System.out.println("Integer Max Value : " + Integer.MAX_VALUE);
		System.out.println("Integer Min Value : " + Integer.MIN_VALUE);
		System.out.println("Long Max Value : " + Long.MAX_VALUE);
		System.out.println("Long Min Value : " + Long.MIN_VALUE);
		System.out.println("Float Max Value : " + Float.MAX_VALUE);
		System.out.println("Float Min Value : " + Float.MIN_VALUE);
		System.out.println("Double Max Value : " + Double.MAX_VALUE);
		System.out.println("Double Min Value : " + Double.MIN_VALUE);
		System.out.println("Character Max Value : " + Character.MAX_VALUE);
		System.out.println("Character Min Value : " + Character.MIN_VALUE);
		System.out.println("Boolean True Value : " + b_true);
		System.out.println("Boolean False Value : " + b_false);

		// Strings
		String st_1 = "I am Eeshan! This is my first Java Program!";
		String st_2 = "Hello World!!";
		System.out.println("String_1 : " + st_1);
		System.out.println("String_2 : " + st_2);
		String st_3 = st_1 + " " + st_2;
		System.out.println("String_3 = String_1 + \" \" + String_2 : " + st_3);
		
		// Type casting to String
		String st_bt_2_st = Byte.toString(bt_max);
		String st_sh_2_st = Short.toString(sh_max);
		String st_n_2_st = Integer.toString(n_max);
		String st_l_2_st = Long.toString(l_max);
		String st_f_2_st = Float.toString(f_);
		String st_d_2_st = Double.toString(d_);
		String st_b_2_st = Boolean.toString(b_true);
		System.out.println(st_bt_2_st);
		System.out.println(st_sh_2_st);
		System.out.println(st_n_2_st);
		System.out.println(st_l_2_st);
		System.out.println(st_f_2_st);
		System.out.println(st_d_2_st);
		System.out.println(st_b_2_st);

		// Primitive to primitive cast : Similar to C++. If HUGE double converted to int, then it holds the max (or the min) extreme
		double d_1 = 3452537.324e-1;
		System.out.println("Double : " + d_1 + " Typecast to Integer : " + (int)d_1); // Truncation
		/*
		Cast works for (byte), (short), (long), (double). For float, char and boolean, the cast does NOT work!
		*/

		// Cast string to primitives
		byte bt__ = Byte.parseByte(st_bt_2_st);
		short sh__ = Short.parseShort(st_sh_2_st);
		int n__ = Integer.parseInt(st_n_2_st);
		long l__ = Long.parseLong(st_l_2_st);
		float f__ = Float.parseFloat(st_f_2_st);
		double d__ = Double.parseDouble(st_d_2_st);
		boolean b__ = Boolean.parseBoolean(st_b_2_st);
		System.out.println(bt__);
		System.out.println(sh__);
		System.out.println(n__);
		System.out.println(l__);
		System.out.println(f__);
		System.out.println(d__);
		System.out.println(b__);

	}


}