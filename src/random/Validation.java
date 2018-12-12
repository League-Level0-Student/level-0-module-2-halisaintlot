//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(10);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==0) {
	JOptionPane.showMessageDialog(null, "You have nice eyes.");
}
		// 2. Repeat all the code above 10 times
if (randomNumber==1) {
	JOptionPane.showMessageDialog(null, "You are a nice person.");
}
if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "You have good style.");
}
if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "You have nice hair.");
}
if (randomNumber==4) {
	JOptionPane.showMessageDialog(null, "You are kind.");
}
if (randomNumber==5) {
	JOptionPane.showMessageDialog(null, "You sing well.");
}
if (randomNumber==6) {
	JOptionPane.showMessageDialog(null, "You have a nice smile.");
}
if (randomNumber==7) {
	JOptionPane.showMessageDialog(null, "You look good today.");
}
if (randomNumber==8) {
	JOptionPane.showMessageDialog(null, "Nice shoes.");
}
if (randomNumber==9) {
	JOptionPane.showMessageDialog(null, "Nice shirt.");
}
if (randomNumber==10) {
	JOptionPane.showMessageDialog(null, "You have nice style.");
}
		// 3. Find someone to test out your program. They will like it :)
	}
}
