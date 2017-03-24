***package com.example.lottery;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author KAPLAN 
 */

public class LotteryArrays {
 private static final int SIZE = 6;
 private static final int MIN_VALUE = 1;
 private static final int MAX_VALUE = 49;
 
private static Random random= new Random();

 public static void main(String[] args) {
  int[] numbers = new int[SIZE];
  Arrays.fill(numbers, MIN_VALUE + MAX_VALUE);
  for (int i = 0; i < SIZE; ++i) {
   int applicant = 0;
   do {
    applicant = random.nextInt(MAX_VALUE) + 1;
   } while (Arrays.binarySearch(numbers, applicant) > 0);
   numbers[i] = applicant;
   Arrays.parallelSort(numbers);
  }
  System.out.println(Arrays.toString(numbers));
 }
}