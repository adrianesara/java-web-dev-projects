public class MultiChoice extends Questions {
    private String optionA;
    private String optionB;
    private String optionC;

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public MultiChoice (String inquiry, String correctAnswers, String optionA,
                        String optionB, String optionC){
        super(inquiry,correctAnswers);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;


    }

}
