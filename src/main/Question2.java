package main;

public class Question2 {
    public boolean isPrime (int number) {
        boolean prime = true;
        for(int i = 2; i <=number/2; i++ ){
            if(number%i == 0)
                prime = false;
        }
        return prime;
    }
}
