package edu.wctc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    static void askQuestions() {
        List<String> questions = new ArrayList<>();
        questions.add("Mild or spicy?");
        questions.add("Tea or coffee?");
        questions.add("Breakfast or brunch?");
        questions.add("Puppies or possums?");
        questions.add("Maliwan or Torgue?");  //Got hooked on Borderlands 2 again...
        List<Integer> answers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0; //must be within while loop to reset each time

        for (int i=0; i<5; i++) {
            System.out.println(questions.get(i));
            int userAnswer = Integer.parseInt(scanner.nextLine());
            answers.add(userAnswer);
        }
        //Add up results
        for(int answer : answers){
            count = count + answer;
        }

        //Show answers
        if (count < 3){
            System.out.println("You prefer life to be calm and organized.");
        }
        else if (count == 3) {
            System.out.println("You prefer a good balance in life.");
        }
        else {
            System.out.println("You prefer to be spontaneous and active.");
        }

        //clear out answer array for the next run
        answers.clear();
    }

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        //Runs while loop = true
        while (loop) {
            System.out.println("Quiz time! Enter 0 for the left choice and 1 for the choice on the right.");

            askQuestions();

            System.out.println("Take the quiz again? y/n");
            String againAnswer = scanner.nextLine();
            if (againAnswer.equals("n")){
                loop = false;
            }
        } //end of while loop
}}
