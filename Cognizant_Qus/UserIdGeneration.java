package Cognizant_Qus;

import java.util.*;

public class UserIdGeneration {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String fristName = sc.next();
    String lastName = sc.next();
    String PIN = sc.next();
    int N = sc.nextInt();
    String smaller, longer;
    if (fristName.length() < lastName.length()) {
      smaller = fristName;
      longer = lastName;
    } else if (fristName.length() > lastName.length()) {
      smaller = lastName;
      longer = fristName;
    } else if (fristName.charAt(0) < lastName.charAt(0)) {
      smaller = fristName;
      longer = lastName;
    } else {
      smaller = lastName;
      longer = fristName;
    }
    String userId = longer.charAt(longer.length() - 1) + smaller + PIN.charAt(N - 1) + PIN.charAt(PIN.length() - N);

    StringBuilder toggleId = new StringBuilder();
    for (char ch : userId.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        toggleId.append(Character.toLowerCase(ch));
      } else if (Character.isLowerCase(ch)) {
        toggleId.append(Character.toUpperCase(ch));
      } else {
        toggleId.append(ch);
      }
    }
    System.out.print(toggleId);
  }
}
