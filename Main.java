//Andriy Zasypkin
//2016-03-17
//Practice 2013 - 04: Morse Code

import java.util.*;

public class Main {
  static Map<String,String> MORSE_MAP = new HashMap<String,String>() {{
    put(".-",   "A");
    put("-...", "B");
    put("-.-.", "C");
    put("-..",  "D");
    put(".",    "E");
    put("..-.", "F");
    put("--.",  "G");
    put("....", "H");
    put("..",   "I");
    put(".---", "J");
    put("-.-",  "K");
    put(".-..", "L");
    put("--",   "M");
    put("-.",   "N");
    put("---",  "O");
    put(".--.", "P");
    put("--.-", "Q");
    put(".-.",  "R");
    put("...",  "S");
    put("-",    "T");
    put("..-",  "U");
    put("...-", "V");
    put(".--",  "W");
    put("-..-", "X");
    put("-.--", "Y");
    put("--..", "Z");
  }};

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nCases = scan.nextInt();

    for(int i=0; i<nCases; i++) {
      System.out.printf("Case %d: ", i+1);
      String[] codes = scan.nextLine().split("\\s+");
      for(String code : codes) {
        System.out.print(MORSE_MAP.get(code));
      }
      System.out.println();
    }

    System.exit(0);
  }
}
