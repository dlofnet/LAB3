import javax.swing.JOptionPane;

public class Activity1 {
    public static void main(String[] args) throws Exception {
        String str1 = "God is real";
        String str2 = "UNLESs";

        //Display or Show the following in your program:
        //1. Determine the 8th character of str1
        JOptionPane.showMessageDialog(null, str1.charAt(8));

        //2. Determine the index of ‘s’ in str2
        JOptionPane.showMessageDialog(null, str2.indexOf("s"));

        //3. Convert str1 to uppercase
        JOptionPane.showMessageDialog(null, str1.toUpperCase());

        //4. Convert str2 to lowercase
        JOptionPane.showMessageDialog(null, str2.toLowerCase());

        //5. Replace all vowels with ‘x’ in str1. Store it to replace the variable.
        JOptionPane.showMessageDialog(null, str1 = str1.replaceAll("[aeiouAEIOU]", "x"));

        //6. Display the length of the String in str1 and str2
        JOptionPane.showMessageDialog(null, str1.length());
        JOptionPane.showMessageDialog(null, str2.length());

        //In your program, using Scanner/JOP (to process an input), declare a 
        //‘String statement’ which stores an input string value (example: “declared as an integer.")
        
        //1. Put all the quotes from str1, str2, and the statement into a String sentence. Then, display it on your screen. 
        String sentence = str1 + " " + str2 + " " + JOptionPane.showInputDialog(null, "Enter a message: ");
        JOptionPane.showMessageDialog(null, sentence);

        //2. Display the length of the sentence in your program.
        JOptionPane.showMessageDialog(null, "Length of sentence is " + sentence.length());

        //3. Display the word “an integer” in your program from the sentence;
        JOptionPane.showMessageDialog(null, sentence.substring(31, 41));

        //4. Compare the word “as” from the sentence to “is” from str1.
        JOptionPane.showMessageDialog(null, sentence.substring(27, 29).equals(str1.substring(4, 5)));
    
        //5. Reverse the String in str2.
        String str2_r = "";

        for (int i = 0; i < str2.length(); i++) {
            str2_r = str2.charAt(i) + str2_r;
          }
        JOptionPane.showMessageDialog(null, str2_r);
    }
}
