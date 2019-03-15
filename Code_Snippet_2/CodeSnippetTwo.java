package Code_Snippet_2;

public class CodeSnippetTwo {
  private static String patternAssigned = "some regex 1";
  private static String patternCredits = "some regex 2";
  private static String patternHowMuch = "some regex 3";
  private static String patternHowMany = "some rege 4";

  public static void main(String[] args) {

    new CodeSnippetTwo().processMessage("Hello World!");
  }

  public String messageType(String message) {
    String messageType = "";
    if (message.matches(patternAssigned))
      messageType = "assigned";
    else if (message.matches(patternCredits))
      messageType = "credits";
    else if (message.matches(patternHowMuch))
      messageType = "questionHowMuch";
    else if (message.matches(patternHowMany))
      messageType = "questionHowMany";
    return messageType;
  }

  public void processMessage(String message) {
    String messageType = messageType(message);
    if(messageType.equalsIgnoreCase("assigned"))
      assignmentMessage(message);
    else if (messageType.equalsIgnoreCase("credits"))
      creditMessage(message);
    else if(messageType.equalsIgnoreCase("questionHowMuch"))
      howMuchMessage(message);
    else if(messageType.equalsIgnoreCase("questionHowMany"))
      howManyMessage(message);
    else if (messageType.equalsIgnoreCase(""))
      System.out.printf("Error");
  }

  private void howManyMessage(String message) {
    //does something
  }

  private void howMuchMessage(String message) {
    //does something
  }

  private void creditMessage(String message) {
    //does something
  }

  private void assignmentMessage(String message) {
    //does something
  }

}