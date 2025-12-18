public class MessageBuilder {
    // STATIC VARIABLES ADDED TO ENABLE TESTING:
    private static String[] tests = {"book", "on", "the", "table", null, "morning", "sunshine", null, "b", "c", "d", "e", "f", "g", "h", null, "job", null, null, "soon", "as", "possible", null};
    public static int testIdx = 0;

    private String message;  // To be initialized in part (a)
    private int numWords;    // To be initialized in part (a)
    /**
     * Builds a message starting with the word specified by the
     * parameter and counts the number of words in the message,
     * as described in part (a)
     * Precondition: startingWord is a single word with no spaces.
     */
    public MessageBuilder(String startingWord) {
        message = startingWord;
        numWords = 1;
        String word = getNextWord(startingWord);
        while (word != null) {
            message += " " + word;
            word = getNextWord(word);
            numWords++;
        }
    }

    // GETTER METHODS ADDED TO ENABLE TESTING:
    public String getMessage() {
        return message;
    }

    public int getNumWords() {
        return numWords;
    }

    /**
     * Returns a word to follow the word specified by the
     * parameter or null if there are no remaining words.
     * Precondition: s is a single word with no spaces.
     * Postcondition: Returns an individual word with no spaces.
     */
    public String getNextWord(String s) {
        // CODE FOR THIS METHOD WAS NOT SHOWN IN FRQ, BUT IT WAS ADDED HERE TO ENABLE TESTING
        String nextWord = tests[testIdx];
        testIdx++;
        return nextWord;
    }
    /**
     * Returns an abbreviation for the instance variable message,
     * as described in part (b)
     * Preconditions: Each word in message is separated by a
     * Postcondition: message is unchanged.
     */
    public String getAbbreviation() {
        String temp = message;
        String ans = temp.substring(0,1);
        int idx = temp.indexOf(" ");
        while (idx != -1) {
            temp = temp.substring(idx + 1);
            ans += temp.substring(0,1);
            idx = temp.indexOf(" ");
        }
        return ans;
    }

   /* There may be instance variables, constructors,
   and methods that are not shown. */
}