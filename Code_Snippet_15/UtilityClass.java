package Code_Snippet_15;

import java.util.List;

public class UtilityClass {

  public static boolean isPresent(char c, List<Character> characterList){
    return characterList.contains(c);
  }

  public static boolean isPresent(String str, String matchText){
    return matchText.equals(str);
  }
}
