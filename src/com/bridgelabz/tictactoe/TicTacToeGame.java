package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	// created the board of given size
	public static char[] createBoard() {
		char[] board = new char[10];
		for (int position = 1; position < 10; position++) {
			board[position] = ' ';
		}
		return board;
	}

	// get input from the user
	public static char getInput(Scanner input) {
		
		char givenInput = input.next().charAt(0);
		if (givenInput == 'X' || givenInput == 'x')
			return givenInput;
		else if (givenInput == 'O' || givenInput == 'o')
			return givenInput;
		return givenInput;
	}

	// display the board
	public static void displayBoard(char[] board) {
		for (int position = 0; position < board.length; position++) {
			System.out.print(board[position] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Tic Tac Toe Game Program");
		Scanner input = new Scanner(System.in);
		char[] board = createBoard();
		char chosenValue = getInput(input);
		displayBoard(board);
	}
}