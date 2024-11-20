import java.util.List;
import java.util.Objects;

public class Answer {

    private String option;
    private boolean isCorrect;

    public Answer(String option, boolean isCorrect) {
        this.option = option;
        this.isCorrect = isCorrect;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    @Override
    public String toString() {
        return option;
    }
}
