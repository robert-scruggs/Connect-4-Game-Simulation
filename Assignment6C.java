
import java.util.Arrays;
import java.util.Scanner;

public class Assignment6C {

    //methods
    public static void printArray(String[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isBoardFull(String[][] array){
        boolean wellIsIt = false;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == " "){
                    wellIsIt = false;
                }else{
                    wellIsIt = true;
                }
            }
        }
        return wellIsIt;
    }

    public static void addDisc(String[][] array, int column, char player){

    }

    public static boolean winVertical(String[][] array, char player){
        boolean player1Won = false;
        boolean player2Won = false;
        if (array[3][0].equals(array[2][0]) && array[3][0].equals(array[1][0]) && array[3][0].equals(array[0][0])){
            if ("X".equals(String.valueOf(player))){
                player1Won = true;
            }else if("O".equals(String.valueOf(player))){
                player2Won = true;
            }
        }
        if (array[3][1].equals(array[2][1]) && array[3][1].equals(array[1][1]) && array[3][1].equals(array[0][1])){
            if ("X".equals(String.valueOf(player))){
                player1Won = true;
            }else if("O".equals(String.valueOf(player))){
                player2Won = true;
            }
        }
        if (array[3][2].equals(array[2][2]) && array[3][2].equals(array[1][2]) && array[3][2].equals(array[0][2])){
            if ("X".equals(String.valueOf(player))){
                player1Won = true;
            }else if("O".equals(String.valueOf(player))){
                player2Won = true;
            }
        }
        if (array[3][0].equals(array[2][2]) && array[3][2].equals(array[1][2]) && array[3][2].equals(array[0][2])){
            if ("X".equals(String.valueOf(player))){
                player1Won = true;
            }else if("O".equals(String.valueOf(player))){
                player2Won = true;
            }
        }
        if (player1Won == true){
            return player1Won;
        }else{
            return player2Won;
        }
    }
   /* public static boolean winHorizontal(String[][] array, char player){
        boolean didTheyWin = false;
        for (int i = 0; i < array.length; i++){
          for (int j = 0; j < array[i].length - 1; i++){
              String toBeChecked = array[i][j];
              if (array[i][j+1] != toBeChecked){
              }else{
                  System.out.println("You won!");
              }
          }
        }

        return didTheyWin;
    }*/






    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row0counter = 3;
        int row1counter = 3;
        int row2counter = 3;
        int row3counter = 3;
        char player1 = 'X';
        char player2 = 'O';
        boolean player1Won = false;
        boolean player2Won = false;
        int playerTurn = 0;
        String[][] gameBoard = {
                {" "," "," "," "},
                {" "," "," "," "},
                {" "," "," "," "},
                {" "," "," "," "}

        };

        while(player1Won == false || player2Won == false){
            if (playerTurn == 0){
                playerTurn = 1;
                System.out.print("Player 1, enter a column: ");
                int player1response = input.nextInt();
                if (player1response == 0){
                    gameBoard[row0counter][player1response] = String.valueOf(player1);
                    row0counter--;
                }else if(player1response == 1){
                    gameBoard[row1counter][player1response] = String.valueOf(player1);
                    row1counter--;
                }else if(player1response == 2){
                    gameBoard[row2counter][player1response] = String.valueOf(player1);
                    row2counter--;
                }else if(player1response == 3){
                    gameBoard[row3counter][player1response] = String.valueOf(player1);
                    row3counter--;
                }

            }else if (playerTurn == 1){
                playerTurn = 0;
                System.out.print("Player 2, enter a column: ");
                int player2response = input.nextInt();
                if (player2response == 0){
                    gameBoard[row0counter][player2response] = String.valueOf(player2);
                    row0counter--;
                }else if(player2response == 1){
                    gameBoard[row1counter][player2response] = String.valueOf(player2);
                    row1counter--;
                }else if(player2response == 2){
                    gameBoard[row2counter][player2response] = String.valueOf(player2);
                    row2counter--;
                }else if(player2response == 3){
                    gameBoard[row3counter][player2response] = String.valueOf(player2);
                    row3counter--;
                }
            }
            printArray(gameBoard);
            if (isBoardFull(gameBoard)){
                System.out.println("No one wins!");
            }
            winVertical(gameBoard,player1);
            winVertical(gameBoard,player2);
        }


    }
}
