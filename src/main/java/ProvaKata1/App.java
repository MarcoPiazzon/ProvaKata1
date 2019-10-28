package ProvaKata1;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        String str = "a12b4c";
        System.out.println(AtoN(str));
    }//end main

    public static String AtoN(String str) {
        String ris = "";
        ArrayList<String> stringa = new ArrayList<String>();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            String s = Character.toString(letter);
            if (isInteger(s) && i < str.length() - 1) {
                char letter1 = str.charAt(i + 1);
                String s1 = Character.toString(letter1);
                if (isInteger(s1)) {
                    stringa.add(s.concat(s1));
                    i++;
                    continue;
                }
            }
            stringa.add(s);
        }//end for

        String[] arr = new String[stringa.size()];
        int number = 0;
        for (int i = 0; i < stringa.size(); i++) {
            arr[i] = stringa.get(i);
            if (isInteger(arr[i])) {
                number = Integer.valueOf(arr[i]);
            } else {
                char value = arr[i].charAt(0);
                number = Integer.valueOf(value);
            }
            switch (number) {
                case 1:
                    ris += "a";
                    break;
                case 2:
                    ris += "b";
                    break;
                case 3:
                    ris += "c";
                    break;
                case 4:
                    ris += "d";
                    break;
                case 5:
                    ris += "e";
                    break;
                case 6:
                    ris += "f";
                    break;
                case 7:
                    ris += "g";
                    break;
                case 8:
                    ris += "h";
                    break;
                case 9:
                    ris += "i";
                    break;
                case 10:
                    ris += "j";
                    break;
                case 11:
                    ris += "k";
                    break;
                case 12:
                    ris += "l";
                    break;
                case 13:
                    ris += "m";
                    break;
                case 14:
                    ris += "n";
                    break;
                case 15:
                    ris += "o";
                    break;
                case 16:
                    ris += "p";
                    break;
                case 17:
                    ris += "q";
                    break;
                case 18:
                    ris += "r";
                    break;
                case 19:
                    ris += "s";
                    break;
                case 20:
                    ris += "t";
                    break;
                case 21:
                    ris += "u";
                    break;
                case 22:
                    ris += "v";
                    break;
                case 23:
                    ris += "w";
                    break;
                case 24:
                    ris += "x";
                    break;
                case 25:
                    ris += "y";
                    break;
                case 26:
                    ris += "z";
                    break;
                case 97:
                    ris += "1";
                    break;
                case 98:
                    ris += "2";
                    break;
                case 99:
                    ris += "3";
                    break;
                case 100:
                    ris += "4";
                    break;
                case 101:
                    ris += "5";
                    break;
                case 102:
                    ris += "6";
                    break;
                case 103:
                    ris += "7";
                    break;
                case 104:
                    ris += "8";
                    break;
                case 105:
                    ris += "9";
                    break;
                case 106:
                    ris += "10";
                    break;
                case 107:
                    ris += "11";
                    break;
                case 108:
                    ris += "12";
                    break;
                case 109:
                    ris += "13";
                    break;
                case 110:
                    ris += "14";
                    break;
                case 111:
                    ris += "15";
                    break;
                case 112:
                    ris += "16";
                    break;
                case 113:
                    ris += "17";
                    break;
                case 114:
                    ris += "18";
                    break;
                case 115:
                    ris += "19";
                    break;
                case 116:
                    ris += "20";
                    break;
                case 117:
                    ris += "21";
                    break;
                case 118:
                    ris += "22";
                    break;
                case 119:
                    ris += "23";
                    break;
                case 120:
                    ris += "24";
                    break;
                case 121:
                    ris += "25";
                    break;
                case 122:
                    ris += "26";
                    break;
            }
        }//end for

        return ris;
    }//end AtoN

    public static boolean isInteger(String str) {
        char c = str.charAt(0);
        if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }//end isInteger

}//end class
