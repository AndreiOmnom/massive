 package com.company.Arrayservice;

 public class ArrayService {
     //         public static void Sortirovka(String[]args) {
//             int[] array = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив
//
//             System.out.println(Arrays.toString(array));//печатаем массив "правильно"
//             Arrays.sort(array, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
//             System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
//         }
//          public static void findShortestLongest(int[] nums, int len) {
//              int shortestLen = nums[0].length();
//              int longestLen = nums[0].length();
//              String shortest = nums[0];
//              String longest = nums[0];
//              for (int i = 1; i < len; i++) {
//                  if (nums[i].length() < shortestLen) {
//                      shortestLen = nums[i].length();
//                      shortest = nums[i];
//
//                  }
//                  if (nums[i].length() > longestLen) {
//                      longestLen = nums[i].length();
//                      longest = nums[i];
//
//                  }
//              }
//              System.out.println(longest);
//              System.out.println(shortest);
//          }
     public static  void sortByHighest(int[] nums, int len) {



         for (int i = 0; i < len ; i++) {
             for (int j = 0; j < len ; j++) {
                 if (nums[i] < nums[j]) {
                       int c =  nums[i];
                     nums[i] = nums[j];
                     nums[j] = c;

                 }

                 }
             }
         for (int i = 0; i < len ; i++){
             System.out.print(nums[i]+ " ");

         }




           }
         }





     







