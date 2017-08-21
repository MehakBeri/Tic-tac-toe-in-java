import java.util.Scanner;
public class tictactoe{
	static Scanner k= new Scanner(System.in);
	static String[][] grid= new String[3][3];
	static int row;
	static int col;
	static int player;
	public static void main(String[] args)
	{	
		System.out.println("Welcome to tictactoe. It is a two player game. the first player is an 'O' and second player an 'X'. Choose the position on the grid by specifying the row number followed by the column number. separate them with a space.");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				grid[i][j]=" . ";
			}
		}
		while(!gameOver())
		{
			player1();
			gameBoard();
			if(!gameOver()){
			player2();
			gameBoard();}

		}
	
	}
	public static boolean gameOver(){
		if (wins() || tie()) {
		if (wins()){System.out.println("Player "+Integer.toString(player)+" wins!"); System.exit(0);}
		if (tie()){System.out.println("Game is a tie!!"); System.exit(0);}
		return true;}
		else {return false;}
	
	}
	public static void player1(){
		System.out.println("'O', choose your location: ");
		row= k.nextInt();
		col=k.nextInt();
		grid[row][col]=" O ";
		player=1;
		
	}
	public static void player2(){
		System.out.println("'X', choose your location: ");
		row= k.nextInt();
		col=k.nextInt();
		grid[row][col]=" X ";
		player=2;
	}
 	public static boolean wins(){
		if(grid[0][0].equals(grid[0][1]) && grid[0][1].equals(grid[0][2]) && !grid[0][0].equals(" . ")) {return true;}
		if(grid[1][0].equals(grid[1][1]) && grid[1][1].equals(grid[1][2]) && !grid[1][0].equals(" . ")) {return true;}
		if(grid[2][0].equals(grid[2][1]) && grid[2][1].equals(grid[2][2]) && !grid[2][0].equals(" . ")) {return true;}
		if(grid[0][0].equals(grid[1][0]) && grid[1][0].equals(grid[2][0]) && !grid[0][0].equals(" . ")) {return true;}
		if(grid[0][1].equals(grid[1][1]) && grid[1][1].equals(grid[2][1]) && !grid[0][1].equals(" . ")) {return true;}
		if(grid[0][2].equals(grid[1][2]) && grid[1][2].equals(grid[2][2]) && !grid[0][2].equals(" . ")) {return true;}
		if(grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2]) && !grid[0][0].equals(" . ")) {return true;}
		if(grid[0][2].equals(grid[1][1]) && grid[1][1].equals(grid[2][0]) && !grid[0][2].equals(" . ")) {return true;}
		else{return false;}
	}
	public static boolean tie(){
		for(int i=0; i<3; i++){	
		for(int j=0; j<3; j++){
		if(wins() || grid[i][j].equals(" . ")){return false;}}}
		return true;
	}
	public static void gameBoard(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.print("     "+grid[i][j]);
			}
			System.out.println();
			System.out.println();
		}
	}
}