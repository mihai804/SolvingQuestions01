package main;

public class Main {
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.squareRoot(4);
        System.out.println(q1.squareRoot(3));

        Question2 q2 = new Question2();
        System.out.println(q2.isPrime(17));

        Question4 q4 = new Question4();
        System.out.println(q4.absoluteValue(-85));

        Question5 q5 = new Question5();
        System.out.println(q5.calculateTip(200));

        Question6 q6 = new Question6();
        System.out.println(q6.nametagText("Mihai"));

        Question7 q7 = new Question7();
        q7.printTemperature(35.061);

        Question8 q8 = new Question8();
        System.out.println(q8.monopolyRoll());

    }
}
