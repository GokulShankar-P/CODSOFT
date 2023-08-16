import java.util.Scanner;

public class WordCounter 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text to count the words: ");
        String text = in.nextLine();
        String[] words = text.split("\\s+");
        int wordCount = 0;
        for (String word : words) 
        {
            wordCount++;
        }
        System.out.println("The number of words in the text is: " + wordCount);
    }
}

/*
OUTPUT : 
	Enter a text or provide a file to count the words: 
		Hi I am GokulShankar P from final year CSE department
		The number of words in the text is: 10
*/
	