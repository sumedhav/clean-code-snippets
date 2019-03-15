package Code_Snippet_15;

import java.util.Arrays;
import java.util.List;

public class CodeSnippetFifteen {


  private static final String QUESTION_TRAILING_STRING = "?";
  private static final List<Character> ROMAN_NUMERALS_SET = Arrays.asList('I', 'V', 'X', 'L');

  public static void main(String[] args) {

    String[] wordList = new String[] {"glob", "is", "I"};
    int endIndex = 2;

    if(UtilityClass.isPresent(wordList[endIndex], QUESTION_TRAILING_STRING) == false
      && wordList[endIndex].length() == 1
      && UtilityClass.isPresent(wordList[endIndex].charAt(0), ROMAN_NUMERALS_SET) == true
    ) {
      System.out.println("I am inside if...do something");
    }
  }

}
