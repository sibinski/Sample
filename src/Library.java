public static void main() {
    String bookTitle = "The Adventures of Captain Fantastic and the Magical Unicorn";
    int titleLength = bookTitle.length();
    System.out.println("Length of the book title: " + titleLength);

    //Declare and initialise the length of shortened book title
    int maxLength = 20;


    // Shortened the book title
    String shortBookTitle = bookTitle.substring(0, maxLength);
    System.out.println("Original title: " + bookTitle);
    System.out.println("Shortened title: " + shortBookTitle);

    // Declare and initialize the searchWord
    String searchWord = "Captain";

    // Check if the searchWord is present in book title
    boolean containsWord = bookTitle.contains(searchWord);
    System.out.println("Does the title contain the word \"" + searchWord + "\"? " + containsWord);
    String sentence = training();
    System.out.println(sentence);
    boolean contains = sentence.contains("fun");
    System.out.println(contains);
    String newString = sentence.replace("educational", "awesome");
    System.out.println(newString);
    int length = sentence.length();
    System.out.println(length);
    String shortenedSentence = newString.substring(0, 17);
    System.out.println(shortenedSentence);
}

public static String training() {
    return "Java programming is fun and educational";
}
