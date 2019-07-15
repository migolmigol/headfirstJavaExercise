package jump2java.chap3;

public class Number {

    public static void main(String args[]){
        number();

    }

    public static void number(){

        /* ============= *
         *      정수      *
         * ============== */
        int integerPositive = 2147483647;
        int integerNegative = -2147483647;

        //  자바는 아직도 스트링 인터폴레이션 이 안 되나? 빡치네.
        // https://redfin.engineering/java-string-concatenation-which-way-is-best-8f590a7d22a8
        String intBuilder = new StringBuilder()
                .append(integerNegative)
                .append(" ~ ").append(integerPositive)
                .toString();
        System.out.println(intBuilder);

        /* ============= *
        *      실수      *
        * ============== */

        // 후표 해야함.
        long longNumber = 123456L;
        float floatNumber = 1.23456F;

        // 더블은 기본이라 D 빼도 됨
        double dNumber1 = 1234.3D;
        double dNumber2 = 1234.3;
        // D > F 라 넣을 수 있음
        double dNumber3 = 123.456F;
        // 지수 표기 가능함 e3 는 10의 3승. 123 * (10*10*10)
        double dNumber4 = 123e3;


        /* ============= *
         *      진수      *
         * ============== */

        // 8 진수
        int octal = 023; // 십진수 19. 2 *8(8 의 1승) + 3*1(8의 0승)
        // 16진수
        int hex = 0xC; // 십진수 12. 0, 1, 2, ... 9, A(10), B(11), C(!2)

    }


}
