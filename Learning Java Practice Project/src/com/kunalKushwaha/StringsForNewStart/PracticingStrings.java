package com.kunalKushwaha.StringsForNewStart;

public class PracticingStrings {
    public static void main(String[] args) {
        /*
        String s1="Welcome";
        String s2="Welcome";//It doesn't create a new instance
        */
        String s = new String("Welcome");//creates two objects and one reference variable

        String s1="java";//creating string by Java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //return the character at the index
        System.out.println(s1.charAt(2));

        //return the length of the string
        System.out.println(s1.length());


        //Formatting the string
        String name="sonoo";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %.2f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0
/*
https://www.javatpoint.com/java-string-format

%a	floating point (except BigDecimal)	Returns Hex output of floating point number.
%b	Any type	"true" if non-null, "false" if null
%c	character	Unicode character
%d	integer (incl. byte, short, int, long, bigint)	Decimal Integer
%e	floating point	decimal number in scientific notation
%f	floating point	decimal number
%g	floating point	decimal number, possibly in scientific notation depending on the precision and value.
%h	any type	Hex String of value from hashCode() method.
%n	none	Platform-specific line separator.
%o	integer (incl. byte, short, int, long, bigint)	Octal number
%s	any type	String value
%t	Date/Time (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
%x	integer (incl. byte, short, int, long, bigint)
Hex string.
 */
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);

        String str1 = String.format("%d", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

    }
}
