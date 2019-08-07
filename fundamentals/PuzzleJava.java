import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class PuzzleJava{
    public void createArray(int[] arr){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i ++){
            sum += arr[i];
            if (arr[i] > 10){
                newArray.add(arr[i]);
            }
            System.out.println(sum);
            System.out.println("[" + newArray + "]");
        }
    }

    public void shuffleStrings(String[] arr){
        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> newList2 = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() > 5){
                newList2.add(arr[i]);
            }
            newList.add(arr[i]);
        }
        Collections.shuffle(newList);
        System.out.println(newList);
        System.out.println(newList2);
        }

    public void createAlphabet(){
        ArrayList<String> alphaArr = new ArrayList<String>();
        for(char alpha = 'A'; alpha <= 'Z'; alpha++){
            alphaArr.add(Character.toString(alpha));
        }
        System.out.println(alphaArr);
        Collections.shuffle(alphaArr);
        System.out.println(alphaArr);

        System.out.println("First letter in array: " + alphaArr.get(0));
        System.out.println("Last letter in array: " + alphaArr.get(25));
        String sample = alphaArr.get(0);

        if("AEIOU".indexOf(sample) > 0){
            System.out.println("First letter is a vowel");
        }
    
    }

    public void TenRandomNumbers(){
        ArrayList<Integer> randomNumber = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++){
            int number = ThreadLocalRandom.current().nextInt(55,101);
            randomNumber.add(number);
        }
        System.out.println(randomNumber);
    }

    public void TenRandomSort(){
        ArrayList<Integer> randomAndSort = new ArrayList<Integer>();
        int min = 55;
        int max = 101;
        for (int i = 0; i < 10; i++){
            int number2 = ThreadLocalRandom.current().nextInt(55,101);
            randomAndSort.add(number2);
            if(number2 < min){
                min = number2;
            }
            if(number2 > max){
                max= number2;
            }
        }
        Collections.sort(randomAndSort);
        System.out.println(randomAndSort);
        System.out.println("Smallest is: " + min);
        System.out.println("Largest is: " + max);
    }
    public void randomString(){
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();
        String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            randomString.append(alphaNumeric.charAt(random.nextInt(alphaNumeric.length())));
        }
        String newString = randomString.toString();
        System.out.println(newString);
    }

    public void stringOfStrings(){
    Random random = new Random();
    StringBuilder randomString = new StringBuilder();
    ArrayList<String> randomList = new ArrayList<String>();
    String alphaNumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    for(int i = 0; i <10; i++){
        for(int j = 0; j < 5; j++){
            randomString.append(alphaNumeric.charAt(random.nextInt(alphaNumeric.length())));
        }
        String newString = randomString.toString();
        randomList.add(newString);
        randomString.setLength(0);
    }
    System.out.println(randomList);
    }
}