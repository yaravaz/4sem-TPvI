package by.belstu.it.vovna.basejava;

import java.util.Arrays;
import java.util.Objects;

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

        Boolean objBool = Boolean.valueOf(false);
        Character objChar = Character.valueOf('f');
        Integer objInt = Integer.valueOf(12);
        Byte objByte = Byte.valueOf((byte)2);
        Short objShort = Short.valueOf((short)3);
        Long objLong = Long.valueOf(345L);
        Double objDouble = Double.valueOf(23.45d);

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
        int int3 = Integer.valueOf(s34);
        System.out.println(String.format("%d %d %d",int1, int2, int3));
        byte[] bytes = s34.getBytes();
        System.out.println(new String(bytes));

        String str = "true";
        System.out.println(Boolean.parseBoolean(str));
        System.out.println(Boolean.valueOf(str));

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        str1 = null;

        //System.out.println(str1.equals(str2)); // Cannot invoke "String.equals(Object)"
        //System.out.println(str1.compareTo(str2));
        System.out.println(str1 == str2); // false

        String strToTest = "Hello, World, How, Are, You";
        System.out.println(Arrays.toString(strToTest.split(", ")));
        System.out.println(strToTest.contains("You"));
        System.out.println(strToTest.hashCode());
        System.out.println(strToTest.indexOf("How"));
        System.out.println(strToTest.length());
        System.out.println(strToTest.replace("How", "Who"));

        char[][] c1;
        char[] c2[];
        char c3[][];

        int[] c = new int[0];

        int index = 0;
        c1 = new char[3][];
        for (int i = 0; i < c1.length; i++) {
            c1[i] = new char[i+1];

        }
        for (int i = 0; i < c1.length; i++) {
            System.out.println(c1[i].length);
        }

        c2 = new char[][]{
                {'r', 't', 'y'},
                {'v', 'g'},
                {'r'}
        };
        c3 = new char[][]{
                {'r', 't', 'y'},
                {'v', 'g'},
                {'r'}
        };

        boolean comRez = c2 == c3;
        System.out.println(comRez);
        c2 = c3;
        for (char[] line : c2) {
            for (char el : line) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        comRez = c2 == c3;
        System.out.println(comRez);

        WrapperString wrap = new WrapperString("New String!!!!");
        wrap.replace('!', '?');
        System.out.println(wrap);

        WrapperString newString = new WrapperString("Another string!!!"){
            private String str2_0;

            public String getStr2_0() {
                return str2_0;
            }

            public void setStr2_0(String str2_0) {
                this.str2_0 = str2_0;
            }


            @Override
            public void replace(char oldchar, char newchar) {
                super.replace(oldchar, newchar);
            }

            public String delete(char newchar){
                char[] chars = str2_0.toCharArray();
                StringBuilder stringBuilder = new StringBuilder();
                for (char c : chars) {
                    if (c != newchar) {
                        stringBuilder.append(c);
                    }
                }
                str2_0 = stringBuilder.toString();
                return str2_0;
            }
        };

        newString.replace('?', '!');
        //System.out.println(newString.delete("!");


    }
}

