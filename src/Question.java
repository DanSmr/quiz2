import java.util.List;

public class Question {
    private String text;
    private List<Answer> answers;

    public Question(String text, List<Answer> answers) {
        super();
        this.text = text;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void printOptions(){
        char label = 'A';

        for(Answer option : answers){
            System.out.println(label + " : " +option.toString());
            label++;
        }
    }

    public void moreCorrectAnswers(){
        int counter = 0;
        for(Answer answer: answers){
            if(answer.isCorrect()){
                counter++;
            }
        }
        if(counter>1){
            System.out.println("There are more correct answers.");
        } else {
            System.out.println("There is only one correct answer.");
        }
    }

    public boolean correctAnswer(String userAnswer, List<Answer> answers){
        StringBuilder correctAnswer = new StringBuilder();
        char label = 'A';
        for(Answer answer: answers){
            if(answer.isCorrect()){
                correctAnswer.append(label);
            }
            label++;
        }
        //System.out.println(correctAnswer);
        return correctAnswer.toString().equals(userAnswer);
    }
}
