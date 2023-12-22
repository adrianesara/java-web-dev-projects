public class Questions {
    private String inquiry;
    private String correctAnswers;
    private String userInput;

    public Questions (String inquiry, String correctAnswers){
        this.inquiry = inquiry;
        this.correctAnswers = correctAnswers;

    }

    public String getInquiry() {
        return inquiry;
    }

    public void setInquiry(String inquiry) {
        this.inquiry = inquiry;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public String getUserInput(){
        return userInput;
    }
    public void setUserInput(String userInput){
        this.userInput = userInput;
    }
}
