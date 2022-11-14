package Question4;

public class CombineWords {


    // main method
    public static void main(String[] args) {

        String sentence_one, sentence_two;

        // calling a static method
        sentence_one = "I enjoy";
        sentence_two = getSecondSentence();

        // using non-static method
        CombineWords objOfThisClass = new CombineWords();
        objOfThisClass.addSentences(sentence_one, sentence_two);
    }

    // non static method
    void addSentences(String sentence_one, String sentence_two) {
        // returns void
        System.out.println(sentence_one + sentence_two);
    }


    // This is a static method
    static String getSecondSentence() {
        return " eating apples.";
    }
}