import java.util.*;

public class GradeQuiz
{
  private int[] key;
  private int[] studentAnswers;
  private int arraySize;

  public GradeQuiz()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How many questions are in the quiz?");
    arraySize = input.nextInt();
    key = new int[arraySize];
    studentAnswers = new int[arraySize];
  }

  public void enterKey()
  {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Please enter the correct answers for the quiz, separated by spaces.");
    String correctKey[] = input1.nextLine().split(" ");
    for (int i = 0; i < correctKey.length; i++)
    {
      key[i] = Integer.parseInt(correctKey[i]);
    }
  }

  public void enterStudentAnswers()
  {
    Scanner input2 = new Scanner(System.in);
    System.out.println("Please enter the answers from your student.");
    String inputAnswers[] = input2.nextLine().split(" ");
    for (int i = 0; i < inputAnswers.length; i++)
    {
      studentAnswers[i] = Integer.parseInt(inputAnswers[i]);
    }
  }

  public void checkAnswers()
  {
    int numCorrect = 0;
    for (int i = 0; i < arraySize; i++)
    {
      if (key[i] == studentAnswers[i])
      {
        numCorrect++;
      }
    }
    System.out.println("The number of correct student answers was " + numCorrect);
    System.out.println("The percentage of correct questions was " + ((double)numCorrect / (double)arraySize) * 100 + "%.");
  }

  public void loopMethod()
  {
    Scanner input3 = new Scanner(System.in);
    System.out.println("Would you like to check another student's answers? (Y/N)");
    if (input3.nextLine().equals("Y"))
    {
      enterStudentAnswers();
      checkAnswers();
      loopMethod();
    }
    else
    {
      System.out.println("Goodbye.");
    }
  }
}