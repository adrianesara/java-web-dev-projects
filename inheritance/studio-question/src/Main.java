import java.util.Scanner;
public class Main {
    public static void main(String[] args){

     Questions testQuestion = new Questions("Is this working?", "Yes");
        System.out.println(testQuestion.getInquiry());
        testQuestion.setInquiry("Yeah it's working, right?");
        System.out.println(testQuestion.getInquiry());

        TrueFalse testTrue = new TrueFalse("Today is Thursday", "True");
        System.out.println(testTrue.getInquiry());

        MultiChoice testOptions = new MultiChoice("What color shirt am I wearing?", "Green", "Blue", "Green", "" +
                "Black");
        System.out.println(testOptions.getInquiry());
        System.out.println(testOptions.getOptionA());
        System.out.println(testOptions.getOptionB());
        System.out.println(testOptions.getOptionC());
        Scanner input = new Scanner (System.in);
        String shirtAnswer = input.nextLine();
        testOptions.setUserInput(shirtAnswer);

        System.out.println(testOptions.getUserInput());


    }
}
