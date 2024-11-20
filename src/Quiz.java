import java.util.List;

public class Quiz {
    private String description;
    private List<Question> questions;

    public Quiz(String description, List<Question> questions) {

        this.description = description;
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void printDescription(){

        System.out.println("Welcome to the " + this.description);
    }


}
