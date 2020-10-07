package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	// created the board of given size
	public static void createBoard() {
		char[] board = new char[10];
		for (int position = 1; position < 10; position++) {
			board[position] = ' ';
		}
	}

	public static int getInput() {
		Scanner input = new Scanner(System.in);
		char givenInput = input.next().charAt(0);
		if (givenInput == 'X' || givenInput == 'x') {
			return 1;
		} else if (givenInput == 'O' || givenInput == 'o') {
			return 2;
		}
		return 3;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game Program");
		createBoard();
		getInput();
	}
}