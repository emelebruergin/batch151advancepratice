package cozulensorular;

import java.util.Scanner;

public class CardNumaraIsimYildizli {
    public static void main(String[] args) {
        /* Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN  : **** **** **** 1478
  */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = input.nextLine().toLowerCase();
        System.out.println("Please enter your card number");
        String card = input.next();


    int boslkIndx = name.trim().lastIndexOf(" ");
    String d = "";
    for (int i = 0; i < name.length(); i++) {
        String c = name.substring(i, i + 1);
        if (i == 0 || i == boslkIndx + 1) {
            d = d + c.toUpperCase();
        } else if (c.equals(" ")) {
            d += " ";
        } else {
            d = d + "*";
        }
    }
    System.out.println("Name : " + "\n" + d);
    int count = 0;
    String card1 = "";
    for (int k = 0; k < card.length(); k++) {
        String c = card.substring(k, k + 1);
        if (k > card.length() - 5) {
            card1 += c;
            count++;
        } else {
            card1 += "*";
              count++;
          }
          if (count == 4) {
              card1 += " ";
              count = 0;
          }
      }
      System.out.println("CCN : " + card1);


    }
}
