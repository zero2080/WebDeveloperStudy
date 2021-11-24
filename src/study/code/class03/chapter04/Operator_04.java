package study.code.class02.chapter02;

public class Operator_04 {
    public static void main(String[] args) {
        //비트연산
        int a = 5; // 101
        int b = 11;//1011

        System.out.printf("10진수 a = %d \n",a);
        System.out.printf("2진수 a = %s \n",Integer.toBinaryString(a));
        System.out.printf("10진수 b = %d \n",b);
        System.out.printf("2진수 b = %s \n",Integer.toBinaryString(b));
        
        /**
         * ~비트 연산
         * 2진수 5  : ~   101
         * ------------------
         * 11111111111111111111111111111010
         */
        System.out.println("========= ~ 비트 연산 ========");
        System.out.println("\t10진수 : ~a = " +(~a));
        System.out.println("\t 2진수 : ~a = " +Integer.toBinaryString(~a));

        /**
         * 2진수 5  :     101
         * 2진수 11 : |  1011
         * ------------------
         * =             1111
         */
        System.out.println("========= | 비트 연산 ========");
        System.out.println("\t10진수 : a|b = " +(a|b));
        System.out.println("\t 2진수 : a|b = " +Integer.toBinaryString(a|b));
        
        /**
         * 2진수 5  :     101
         * 2진수 11 : &  1011
         * ------------------
         * =             0001
         */
        System.out.println("========= & 비트 연산 ========");
        System.out.println("\t10진수 : a&b = " +(a&b));
        System.out.println("\t 2진수 : a&b = " +Integer.toBinaryString(b&a));
        
        /**
         * 2진수 5  :     101
         * 2진수 11 : ^  1011
         * ------------------
         * =             1110
         */
        System.out.println("========= ^ 비트 연산 ========");
        System.out.println("\t10진수 : a^b = " +(a^b));
        System.out.println("\t 2진수 : a^b = " +Integer.toBinaryString(b^a));
        
        /**
         * 2진수 5  :   101
         * shift연산:   <<2 
         * ----------------
         *            10100
         */
        System.out.println("========= << 비트 연산 ========");
        System.out.println("\t10진수 : a<<2 = " +(a<<2));
        System.out.println("\t 2진수 : a<<2 = " +Integer.toBinaryString(a<<2));
        
        /**
         * 2진수 5  :   101
         * shift연산:   >>2 
         * ----------------
         *                1
         */
        System.out.println("========= >> 비트 연산 ========");
        System.out.println("\t10진수 : a>>2 = " +(a>>2));
        System.out.println("\t 2진수 : a>>2 = " +Integer.toBinaryString(a>>2));
       
        /**
         * 2진수 11  :   1011
         * shift연산:    >>>2 
         * ------------------
         *                 10
         */
        System.out.println("========= >>> 비트 연산 ========");
        System.out.println("\t10진수 : b>>>2 = " +(b>>>2));
        System.out.println("\t 2진수 : b>>>2 = " +Integer.toBinaryString(b>>2));


    }
}
