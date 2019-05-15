import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        ex1(reader);
//        ex2(reader);
//        ex3();
//        ex4(reader);
//        ex5();
//        ex6(reader);
        ex7(reader);

    }

    private static void ex1(Scanner reader){
//        #### Exercise 1:
////        Ask the user to enter for names in an array. Print the array
        ArrayList<String> nameString = new ArrayList<String>();

        System.out.println("Enter a name");
        nameString.add(reader.next());

        for(int i = 0; i<4; i++)
        {
            if(i<3)
            {
                System.out.println("Enter another name");
                nameString.add(reader.next());
            }
            else{
                System.out.println("Enter one last name");
                nameString.add(reader.next());
            }
        }

        for(String eachName: nameString){
            System.out.println(eachName);
        }
    }

    private static void ex2(Scanner reader){
        //
//        #### Exercise 2:
//                Create the array [5,3,7, 4]. Pass the array to a new function to do the following:
//                1) Print the array.
//                1) Print the 3rd index of the numberList.
//                2) Delete the second index.
//                3) Print the 3rd index again.
        ArrayList<Integer> createdArray = new ArrayList<Integer>();
        Integer[] test = {5,3,7,4};
        createdArray.addAll(Arrays.asList(test));

        for(Integer eachNumber: createdArray)
            System.out.print(eachNumber + ", ");

        System.out.print("\n");
        System.out.println(createdArray.get(2));
        createdArray.remove(1);
        System.out.println(createdArray.get(2));
    }

    private static void ex3(){
//  #### Exercise 3:
//  Create the array ["Bob", "John", "Kenn", "Kevin"].
//     1) Remove “Kenn” from the array.
//     2) Print the array.
//     3) Print the size of the array.
//     4) Check to see if the array contains “Kevin”. If so, get the index of “Kevin” to print.
        ArrayList<String> nameArray = new ArrayList<String>();
        String[] test = {"Bob", "John", "Kenn", "Kevin"};
        nameArray.addAll(Arrays.asList(test));

        nameArray.remove("Kenn");
        for(String eachName: nameArray)
            System.out.print(eachName + ", ");

        System.out.print("\n");
        System.out.println("The size of the array is " + nameArray.size());

        if(nameArray.contains("Kevin")){
            System.out.println("Kevin is at index: " + nameArray.indexOf("Kevin")+".");
        }
        else
            System.out.println("Can't find a 'Kevin'");
    }

    private static void ex4(Scanner reader){
//        #### Exercise 4:
//        Ask the user to enter 5 numbers. Put them in an array and print the sum.
        ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();

        System.out.println("Enter a number");
        arrayOfNumbers.add(reader.nextInt());

        for(int i = 0; i<4; i++)
        {
            if(i<3)
            {
                System.out.println("Enter another number");
                arrayOfNumbers.add(reader.nextInt());
            }
            else{
                System.out.println("Enter one last number");
                arrayOfNumbers.add(reader.nextInt());
            }
        }

        int sum = 0;
        for(Integer eachNumber: arrayOfNumbers){
            sum += eachNumber;
        }
        System.out.println("The sum is: " + sum);
    }

    private static void ex5(){
//        #### Exercise 5:
//                Create an array in the main function. Create two functions, min and max, to find the minimum and maximum values. Do not use a min/max function.
        ArrayList<Integer> ex5Array = new ArrayList<Integer>();
        Integer[] tempArray = {5,3,7,4,7,3,5};
        ex5Array.addAll(Arrays.asList(tempArray));
        System.out.println("The max is " + max(ex5Array));
        System.out.println("The min is " + min(ex5Array));
    }

    private static int max(ArrayList<Integer> array){
        int maxNumber = array.get(0);
        for(Integer eachNumber: array){
            if(maxNumber < eachNumber)
                maxNumber = eachNumber;
        }
        return maxNumber;
    }

    private static int min(ArrayList<Integer> array){
        int minNumber = array.get(0);
        for(Integer eachNumber: array){
            if(minNumber > eachNumber)
                minNumber = eachNumber;
        }
        return minNumber;
    }

    private static void ex6(Scanner reader){
//        #### Exercise 6:
//                Create a program that will add all numbers given to a program until the number 0 is pressed. Then return the total of all numbers.
        int sum = 0;
        int userInput = 0;
        System.out.println("Enter a number. Enter 0 to quit");
        userInput = reader.nextInt();
        while(userInput!= 0){
            sum+=userInput;
            System.out.println("Enter another number. You can still enter 0 to quit");
            userInput = reader.nextInt();
        }
        System.out.println("The total of all numbers is " + sum);
    }

    private static void ex7(Scanner reader){
//        #### Exercise 7:
//                Allow a user enter as many strings as they want to until they enter the character 'q'. Check to see if the strings are similar to a palindrome.
        ArrayList<String> ex7ArrayList = new ArrayList<String>();
        String userInput = "q";
        System.out.println("Enter a string that will be part of the palindrome stings. Enter 'q' to quit");
        userInput = reader.next();
        while(!userInput.equals("q")){
            ex7ArrayList.add(userInput);
            System.out.println("Enter another possible pallinString. You can still enter 'q' to quit");
            userInput = reader.next();
        }

        ArrayList<String> reverseString = new ArrayList<String>();
        for(int i = ex7ArrayList.size()-1;i>=0; i--){
            reverseString.add(ex7ArrayList.get(i));
        }

//        for(String eachName:reverseString)
//            System.out.println(eachName);
        if(reverseString.equals(ex7ArrayList))
            System.out.println("It's a palindrome");
        else
            System.out.println("Noooope!!!!");
    }

}
