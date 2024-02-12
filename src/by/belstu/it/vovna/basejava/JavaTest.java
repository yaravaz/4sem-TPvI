package by.belstu.it.vovna.basejava;

import static java.lang.Math.*;

public class JavaTest {
    static int sint;
    final int CONST1 = 1;               // константа
    public final int CONST2 = 2;        // публичная константа
    public static final int CONST3 = 3; // публичная статическая константа
    public static void main(String[] args) {
        char symbol = 'c';
        int numb = 3000;
        short shor = 100;
        byte byt = 12;
        long loo = 123456;
        boolean bool = true;

        var result = "sdf" + numb;                      // String + int
        result = "sdf" + symbol;                        // String + char
        result = "sdf" + 12.234d;                       // String + double
        byt += numb;                                    // byte = byte + int
        int sofa = (int)(loo + 123.34d);                // int = long + double
        loo = (long)(numb + 2147483647) & 0xFFFFFFFFL;  // long = int + 2147483647

        System.out.println(sint); // 0

        bool = true && false;
        bool = true ^ false;

        //bool = true + bool;//Ошибка
        long water = 9223372036854775807L;
        long fire = 0x7fff_ffff_fffL;

        char first = 'a';
        char sec = '\u0061';
        char third = 97;

        var all = first + sec + third;
        System.out.println(all); // 291
        System.out.println(3.45 % 2.4); // 1.0500000000000003
        System.out.println(1.0/0.0); // Infinity
        System.out.println(0.0/0.0); // Nan
        System.out.println(log(-345)); // Nan
        System.out.println(Float.intBitsToFloat(0x7F800000)); // Infinity
        System.out.println(Float.intBitsToFloat(0xFF800000)); // -Infinity

        System.out.println("" + Math.PI + " " + round(Math.PI));
        System.out.println("" + Math.E + " " + round(Math.E));
        System.out.println(Math.min(Math.PI, Math.E));
        System.out.println(Math.random());

        Boolean objBool = new Boolean(false);
        Character objChar = new Character('f');
        Integer objInt = new Integer(12);
        Byte objByte = new Byte((byte)2);
        Short objShort = new Short((short)3);
        Long objLong = new Long(345L);
        Double objDouble = new Double(23.45d);

        objInt = objInt + objByte;
        objLong = objLong * objShort;
        objDouble = objDouble / objInt;
        objBool = objBool && true;
        objInt = objInt >> 2;
        objLong = objLong >>> 3;

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        Integer boxing = 10;
        int unboxing = (int)boxing;
        Byte boxing2 = 2;
        byte unboxing2 = (byte)boxing2;

        Integer newInt = Integer.parseInt("234");
        String hexString = Integer.toHexString(123);
        String numberString = newInt.toString();

        System.out.println(Integer.compare(5, 10));
        System.out.println(Integer.toBinaryString(31));
        System.out.println(Integer.bitCount(31));

        System.out.println(Double.isNaN(unboxing));

        String s34 = "2345";
        int int1 = Integer.parseInt(s34);
        int int2 = Integer.valueOf(s34);
        int int3 = new Integer(s34);
        System.out.println($"");
    }
}

