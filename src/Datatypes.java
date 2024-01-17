public class Datatypes {
    public static void main(String[]args){

        // dit zijn Integer datatypen
        byte voorbeeldByte = 127;
        short vbShort = 32767;
        long vbLong = 2147483647;

        // datatype: Floating point
        float vbFloat = 5.71234567f;
        double vbDouble = 10.123456789012345d;

        // datatype: Boolean true/false
        boolean isJefCool = false;

        //datatype char: 1 karakter
        char vbChar = 'j';

        //ASCII waardes https://www.w3schools.com/charsets/ref_html_ascii.asp
        char eenCharASCII = 78;
        char tweeCharASCII = 111;
        char drieCharASCII = 118;
        char vierCharASCII = 105;
        System.out.println(eenCharASCII);
        System.out.println(tweeCharASCII);
        System.out.println(drieCharASCII);
        System.out.println(vierCharASCII);

        System.out.println( voorbeeldByte + " " + vbShort + " " + vbLong + " " + vbFloat + " " + vbDouble );
        System.out.println(isJefCool);
        System.out.println(vbChar);
    }
}
