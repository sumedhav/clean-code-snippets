package Code_Snippet_18;

public class CodeSnippetEighteen {

  public static void main(String[] args) {
    CodeSnippetEighteen codeSnippetEighteen = new CodeSnippetEighteen();
    codeSnippetEighteen.getTargetStatus("something");
    codeSnippetEighteen.getTargetStatusTwo("some other thing");
  }

  public String getTargetStatus(String target) {
    if(target == null) {
      return "No target found";
    }
    target.trim();
    return "Target found";
  }

  public String getTargetStatusTwo(String target) {
    if(target == null) {
      return "No target found";
    }
    return "Target found";
    System.out.println("Attacking target" + target);
  }


}
