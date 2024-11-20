import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quiz quiz = setUpQuiz();
        quiz.printDescription();

        int rightAnswers = 0;

        for(Question question: quiz.getQuestions()){
            System.out.println(question.getText());
            question.moreCorrectAnswers();
            question.printOptions();

            String input = InputValidator.getStringInput(scanner,"Your answer: ");
            if(question.correctAnswer(input, question.getAnswers())){
                System.out.println("correct!");
                rightAnswers++;
            } else {
                System.out.println("incorrect...");
            }
            System.out.println("----------------------------------------------");
        }
        System.out.println("You had " + rightAnswers + " correct answers.");
    }

    public static Quiz setUpQuiz(){
        Answer answer1 = new Answer("Sahara Desert", true);
        Answer answer2 = new Answer("Gobi Desert", false);
        Answer answer3 = new Answer("Kalahari Desert", false);
        Answer answer4 = new Answer("Atacama Desert", false);

        Answer answer5 = new Answer("Nile", true);
        Answer answer6 = new Answer("Amazon", false);
        Answer answer7 = new Answer("Mississippi", false);
        Answer answer8 = new Answer("Yangtze", false);

        Answer answer9 = new Answer("Australia", true);
        Answer answer10 = new Answer("Africe", false);
        Answer answer11 = new Answer("South America", false);
        Answer answer12 = new Answer("Antarctica", true);

        Answer answer13 = new Answer("Niagara Falls", false);
        Answer answer14 = new Answer("Victoria Falls", false);
        Answer answer15 = new Answer("Iguazu Falls", false);
        Answer answer16 = new Answer("Angel Falls", true);

        Answer answer17 = new Answer("Germany", true);
        Answer answer18 = new Answer("Brazil", false);
        Answer answer19 = new Answer("France", true);
        Answer answer20 = new Answer("China", false);


        Question question1 = new Question("What is the name of the world’s largest hot desert, located in Africa?", List.of(answer1, answer2, answer3, answer4));
        Question question2 = new Question("What is the longest river in the world?", List.of(answer5, answer6, answer7, answer8));
        Question question3 = new Question("Which continents are entirely in the Southern Hemisphere?", List.of(answer9, answer10, answer11, answer12));
        Question question4 = new Question("What is the name of the highest uninterrupted waterfall in the world, located in Venezuela?", List.of(answer13, answer14, answer15, answer16));
        Question question5 = new Question("Which of the following are European countries?", List.of(answer17, answer18, answer19, answer20));

        Quiz quiz = new Quiz("Geography quiz", List.of(question1, question2, question3, question4, question5));
        return quiz;
    }
}


