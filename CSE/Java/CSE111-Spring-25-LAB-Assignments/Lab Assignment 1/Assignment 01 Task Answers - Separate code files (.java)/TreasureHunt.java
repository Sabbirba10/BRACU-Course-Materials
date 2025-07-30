//
//
//
//
//
//--TASK--10-------------------------------------------
import java.util.Scanner;
public class TreasureHunt{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}
    };
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    
    //To-do: find out the position of the player
    for (int i = 0; i<arr2D.length; i++) {
      for (int j = 0; j<arr2D[0].length; j++) {
        if (arr2D[i][j]==7) {
          row_pos = i;
          col_pos = j;}}}
    
    int turns = 5;
    while (turns > 0) {
      int new_row = row_pos, new_col = col_pos;
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      
      /*To-do: Based on the input update the player position and check if
       * 1. the player fell out of the grid
       * 2. player stepped on mine
       * 3. player found the treasure
       * otheriwse, update the player position */
      if (inp.equals("UP")) {
        new_row = new_row-1;
        new_col = new_col;}
      if (inp.equals("DOWN")) {
        new_row = new_row+1;
        new_col = new_col;}
      if (inp.equals("LEFT")) {
        new_row = new_row;
        new_col = new_col-1;}
      if (inp.equals("RIGHT")) {
        new_row = new_row;
        new_col = new_col+1;}
      if (new_row<0||new_col<0) {
        System.out.println("Player fell outside the playing area. Game over!");
        arr2D[row_pos][col_pos] = 0;
        arr2D[new_row][new_col] = 7;
        System.out.println("Final state:");
        printMap(arr2D);
        break;}
      if (new_row>=arr2D.length||new_col>=arr2D[0].length) {
        System.out.println("Player fell outside the playing area. Game over!");
        break;}
      if (arr2D[new_row][new_col]==10) {
        System.out.println("Treasure found. You win!");
        arr2D[row_pos][col_pos] = 0;
        arr2D[new_row][new_col] = 7;
        System.out.println("Final state:");
        printMap(arr2D);
        break;}
      if (arr2D[new_row][new_col]==-1) {
        System.out.println("Player stepped on mine. Game Over!");
        arr2D[row_pos][col_pos] = 0;
        arr2D[new_row][new_col] = 7;
        System.out.println("Final state:");
        printMap(arr2D);
        break;}
      arr2D[row_pos][col_pos] = 0;
      arr2D[new_row][new_col] = 7;
      row_pos = new_row;
      col_pos = new_col;
      
      
      
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");
    }
  }
  
  public static void printMap(int[][] arr) { 
    // To-do: print the 2D grid
    for (int i = 0; i<arr.length; i++) {
      for (int j = 0; j<arr[0].length; j++) {
        System.out.print(arr[i][j]+" ");}
      System.out.println();}
  }
}