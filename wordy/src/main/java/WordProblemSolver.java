import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class WordProblemSolver {

    public int solve(String words){
        String[] splited = words.substring(0,words.length()-1).split(" ");

        Stack<Integer> integers = new Stack<>();
        Stack<String> operators = new Stack<>();

        int i = 0;
        while (i < splited.length){

            System.out.println(splited[i]);

            if (checkInteger(splited[i])) {
                integers.push(Integer.valueOf(splited[i]));
                if (i+1 < splited.length && (!checkPlusMinus(splited[i+1]) && !checkMultiDivide(splited[i+1]))) throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
            }

            if (checkPlusMinus(splited[i])) operators.push(splited[i]);

            if (checkMultiDivide(splited[i])) {
                if (integers.empty()) throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
                if (((i+2)<= splited.length-1) && splited[i+1].equals("by") && checkInteger(splited[i+2])) {
                    System.out.println(splited[i+2]);
                    System.out.println(integers.peek().intValue());
                    integers.push(operate(integers.pop(), splited[i], Integer.valueOf(splited[i+2])));
                    i = i + 3;
                    continue;
                }else{
                    throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
                }
            }
            if ((integers.size() - operators.size() < 0)||(integers.size() - operators.size() > 1)) throw new IllegalArgumentException("I'm sorry, I don't understand the question!");
            i = i + 1;
        }
        System.out.println(integers);

        if (integers.size() == 0 || integers.size() == operators.size()) throw new IllegalArgumentException("I'm sorry, I don't understand the question!");

        Stack<Integer> stack_int = reverse_int(integers);
        Stack<String> stack_str = reverse_str(operators);

        while(!stack_str.empty()){
            stack_int.push(operate(stack_int.pop(), stack_str.pop(), stack_int.pop()));
        }
        return stack_int.pop().intValue();



    }

    boolean checkInteger (String string){
        if (string.charAt(0) == '-') string = string.substring(1);
        for (char unit : string.toCharArray()){
            if (unit > '9' || unit < '0') return false;
        }
        return true;
    }

    boolean checkPlusMinus (String string){
        return (string.equals("plus") || string.equals("minus"))? true:false;
    }

    boolean checkMultiDivide (String string){
        return (string.equals("multiplied") || string.equals("divided"))? true:false;
    }

    int operate (Integer num_1 , String opr, Integer num_2){
        System.out.println(num_1.toString());
        System.out.println(opr);
        System.out.println(num_2.toString());

        switch (opr){
            case "plus": return num_1.intValue() + num_2.intValue();
            case "minus": return num_1.intValue() - num_2.intValue();
            case "multiplied": return num_1.intValue() * num_2.intValue();
            case "divided": return num_1.intValue() / num_2.intValue();
        }
        return 0;
    }

    Stack<Integer> reverse_int(Stack<Integer> input){
        Stack<Integer> result = new Stack<>();
        while (! input.empty()){
            result.push(input.pop());
        }
        return result;
    }

    Stack<String> reverse_str(Stack<String> input){
        Stack<String> result = new Stack<>();
        while (! input.empty()){
            result.push(input.pop());
        }
        return result;
    }

}