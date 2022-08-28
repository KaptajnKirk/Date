package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    Scanner sc = new Scanner(System.in);
    int dateAge;
    int userAge;
    int dateValue;

    //Introduce the program
    System.out.println("\n\n");
    System.out.println("Velkommen til 'Test din date' programmet!");
    Thread.sleep(1500);
    System.out.println("\n\n\n\n\n\n\n");
    //User types in age of user and users date

    System.out.println("Indtast venligst din alder:");
    userAge = sc.nextInt();
    do {
      System.out.println("Indtast venligst alderen på din date:");
      dateAge = sc.nextInt();

      dateValue = userAge / 2 + 7;


      //check if dateAge is younger than userAge

      if (userAge < dateAge) {
        System.out.println("Din date er ikke yngre end dig selv. Have fun");
      }
      if (dateValue > dateAge) {
        System.out.println("Din date er for ung. Indtast venligst alderen på en ny date");
      }
      if (dateValue == dateAge || dateValue < dateAge) {
        System.out.println("Din date er inde for det acceptable aldersspektrum. Have fun");
      }
    } while (dateValue > dateAge);
  }
}
