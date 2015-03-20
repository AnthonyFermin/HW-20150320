package nyc.c4q.AnthonyFermin;

/* Anthony Fermin
 * program capitalized a string and underlines title with a line of characters
 */


public class PrettyTitle {

    //returns true if the next word after int currentIndex should be capitalized
    public static boolean shouldCapitalize(String textToCheck, int currentIndex){

        //String array that contains list of words that should not be capitalized in a title
        String[] wordsToCompare = {"a ", "an ", "the ", "at ", "by ", "for ", "in ", "of ", "on ", "to ", "up ", "and ", "as ", "but ", "it ", "or ", "nor "};
        textToCheck = textToCheck.substring(currentIndex, currentIndex + 4); // sets textToCheck as the substring that has to be checked for a word

        //iterates through list of wordsToCompare and returns false if textToCheck contains word
        for(int i = 0; i < wordsToCompare.length; i++){
            if(textToCheck.contains(wordsToCompare[i])){
                return false;
            }
        }

        return true; //only happens if textToCheck does not contain a word from wordsToCompare array
    }

    //capitalizes a string to proper title format
    public static String makeTitleCaps(String toTitle){

        String isTitle = ""; //separate empty string for final result

        toTitle = toTitle.trim().toLowerCase(); //sets all string to lowercase to start and trims extra spaces from start/end
        int lastSpaceIndex = toTitle.lastIndexOf(' '); //assigns lastSpaceIndex the index position of last space position

        isTitle += Character.toUpperCase(toTitle.charAt(0)); //capitalizes first character of title
        int currentIndex = 1; //sets currentIndex to second character in string

        //loops through string until currentIndex reaches lastSpaceIndex
        while(currentIndex < lastSpaceIndex) {
            int nextSpace = toTitle.indexOf(' ', currentIndex); //finds position of the next space after the currentIndex
            isTitle += toTitle.substring(currentIndex, nextSpace) + " "; //concatenates substring (which are all lowercase) between currentIndex and nextSpace to the isTitle String. Also adds a space
            currentIndex = nextSpace + 1; //sets currentIndex to the index after nextSpace

            //capitalizes first letter of the next word if the word is not supposed to be capitalized in a title (propositions, articles or coordinating conjunctions under 4 letters long)
            if (shouldCapitalize(toTitle, currentIndex)) {
                isTitle += Character.toUpperCase(toTitle.charAt(currentIndex));
                currentIndex++;
            }
        }

        isTitle += toTitle.substring(currentIndex); //concatenates the rest of the characters after the lastSpace found in the string

        return isTitle; //returns complete string with proper title capitalization

    }

    //prints a string of a specified character that aligns with another string excluding the spaces.
    public static void printUnderline(String toUnderline, char underlineWith){

        //loops through each character in the string to be underlined
        for(int i = 0; i < toUnderline.length(); i++){

            //prints specified character if there is no space at the current index
            if(toUnderline.charAt(i) == ' '){
                System.out.print(" ");
            } else {
                System.out.print(underlineWith);
            }
        }

    }

    //method that calls on other methods to capitalize a string and print an underline with a specified character
    public static void printTitle(String makePretty, char lineSymbol) {

        makePretty = makeTitleCaps(makePretty);
        System.out.println(makePretty);
        printUnderline(makePretty, lineSymbol);

    }

    public static void main(String[] args){

        printTitle("    a tale OF tWo cITIes  ", '*');

    }


}
