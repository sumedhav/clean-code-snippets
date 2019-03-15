package Code_Snippet_3;

import java.util.Arrays;
import java.util.List;

public class CodeSnippetThree {

  public static void main(String[] args) {
    CodeSnippetThree codeSnippetThree = new CodeSnippetThree();
    int i = codeSnippetThree.fooBar(1, 2);
    String formattedItemNames = codeSnippetThree.getFormattedItemNames(Arrays.asList("Milk", "Butter", "Bread"));
    System.out.println(formattedItemNames);
  }

  /**
   * This method returns the a's share in percentage
   */
  public int fooBar(int a, int b) {
    return a*100/(a+b) ;
  }

  private String getFormattedItemNames(List<String> itemNames) {
    String output_result = "";

    for (String item_name : itemNames) {
      output_result = output_result + "Item name: " + item_name + "\n";
    }

    return output_result;
  }

}
