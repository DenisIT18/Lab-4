/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mystack;

/**
 *
 * @author Денис
 */
import java.util.ArrayList;

class MyStack extends ArrayList<String> {
    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public String peek() {
        return super.get(getSize() - 1);
    }

    public String pop() {
        String o = super.get(getSize() - 1);
        super.remove(getSize() - 1);
        return o;
    }

    public void push(String o) {
        super.add(o);
    }
}


public class AvgSum {
    static class Result {
        double average;
        int sum;

        Result(double average, int sum) {
            this.average = average;
            this.sum = sum;
        }
    }

    static Result avgsum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;

        return new Result(average, sum);
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        Result result = avgsum(numbers);

        System.out.println("Average: " + result.average);
        System.out.println("Sum: " + result.sum);
    }
}
