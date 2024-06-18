package Inhertance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Use_of_stream {
    public static void main(String[] args) {

        //Filter the numbers from the array list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0) .collect(Collectors.toList());
        System.out.println(evenNumbers);

        //Sorting names by alphabets
        List<String> names = Arrays.asList("John", "Doe", "Alice", "Bob");
        List<String> sortedNames = names.stream() .sorted().collect(Collectors.toList());
        System.out.println(sortedNames);


        //Make  all the names in uppercase
        List<String> Names = Arrays.asList("John", "Doe", "Alice", "Bob");
        List<String> upperCaseNames = Names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseNames);


        //Iska nhi pata
        List<Integer> Numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = Numbers.stream().reduce(2, Integer::sum);
        System.out.println(sum);


        //Perform the Sum of all digits
        List<Integer> Digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum1 = Digits.parallelStream().reduce(0, Integer::sum);
        System.out.println(sum1);


    }
}
