public class TTTBoard{

   private char[][] board;   // The tic-tac-toe board
   
   // Instantiate an empty board
   public TTTBoard(){
      board = new char[3][3];
      reset();
   }
   
   // Reset the board to empty
   public void reset(){
      for (int row = 0; row < 3; row++)
         for (int column = 0; column < 3; column++)
            board[row][column] = '-';
   }   
    
   // Return a string representation of the board
   public String toString(){
      String result = "\n";
      for (int row = 0; row < 3; row++){
         for (int column = 0; column < 3; column++)
            result += board[row][column] + " ";
         result += "\n";
      }
      return result;
   }
   
   // If the move is legal, make it and return true, else return false
   public boolean placeXorO(char s, int row, int column){
      if (board[row - 1][column - 1] == '-'){
         board[row - 1][column - 1] = s;
         return true;
      }else
         return false;
   }
         
   // Return true if the board is full else return false
   public boolean full(){
      for (int row = 0; row < 3; row++)
       for (int column = 0; column < 3; column++)
        if (board[row][column] == '-')
         return false;
      return true;
   }
   
   public char getWinner(){
     if ((board[0][0] == board[0][1]) && board[0][0] == (board[0][2])){
       return board[0][0];
     }else if (board[1][0]==board[1][1] && board[1][0]==board[1][2]){
       return board[1][0];
     }else if (board[2][0]==board[2][1] && board[2][0]==board[2][2]){
       return board[2][0];
     }else if (board[0][0]==board[1][0] && board[0][0]==board[2][0]){
       return board[0][0];
     }else if (board[0][1]==board[1][1] && board[0][1]==board[2][1]){
       return board[0][1];
     }else if (board[0][2]==board[1][2] && board[0][2]==board[2][2]){
       return board[0][2];
     }else if (board[0][0]==board[1][1] && board[0][0]==board[2][2]){
       return board[0][0];
     }else if (board[2][0]==board[1][1] && board[2][0]==board[0][2]){
       return board[2][0];
     }else{
       return '-';
     }
   }
   
   public int getRow(){
     int row;
     if (board[0][0]=='X' && board[0][1]=='X'){
            row = 1;
          }else if (board[1][0]=='X' && board[1][1]=='X'){
            row = 2;
          }else if (board[2][0]=='X' && board[2][1]=='X'){
            row = 3;
          }else if (board[0][2]=='X' && board[0][1]=='X'){
            row = 1;
          }else if (board[1][2]=='X' && board[1][1]=='X'){
            row = 2;
          }else if (board[2][2]=='X' && board[2][1]=='X'){
            row = 3;
          }else if (board[0][2]=='X' && board[0][0]=='X'){
            row = 1;
          }else if (board[1][2]=='X' && board[1][0]=='X'){
            row = 2;
          }else if (board[2][2]=='X' && board[2][0]=='X'){
            row = 3;
          }else if (board[0][0]=='X' && board[1][0]=='X'){
            row = 2;
          }else if (board[0][1]=='X' && board[1][1]=='X'){
            row = 2;
          }else if (board[0][2]=='X' && board[1][2]=='X'){
            row = 2;
          }else if (board[2][0]=='X' && board[1][0]=='X'){
            row = 0;
          }else if (board[2][1]=='X' && board[1][1]=='X'){
            row = 0;
          }else if (board[2][2]=='X' && board[1][2]=='X'){
            row = 0;
          }else if (board[0][0]=='X' && board[2][0]=='X'){
            row = 1;
          }else if (board[0][1]=='X' && board[2][1]=='X'){
            row = 1;
          }else if (board[0][2]=='X' && board[2][2]=='X'){
            row = 1;
          }else if (board[0][0]=='X' && board[2][2]=='X'){
            row = 1;
          }else if (board[0][2]=='X' && board[2][0]=='X'){
            row = 1;
          }else if (board[2][2]=='X' && board[1][1]=='X'){
            row = 0;
          }else if (board[0][0]=='X' && board[1][1]=='X'){
            row = 2;
          }else if (board[0][2]=='X' && board[1][1]=='X'){
            row = 2;
          }else if (board[2][0]=='X' && board[1][1]=='X'){
            row = 0;
          }else{
            row = (int) (Math.random()*3+1);
          }return row;
   }

   public int getColumn(){
     int column;
     if (board[0][0]=='X' && board[0][1]=='X'){
            column = 3;
          }else if (board[1][0]=='X' && board[1][1]=='X'){
            column = 3;
          }else if (board[2][0]=='X' && board[2][1]=='X'){
            column = 3;
          }else if (board[0][2]=='X' && board[0][1]=='X'){
            column = 1;
          }else if (board[1][2]=='X' && board[1][1]=='X'){
            column = 1;
          }else if (board[2][2]=='X' && board[2][1]=='X'){
            column = 1;
          }else if (board[0][2]=='X' && board[0][0]=='X'){
            column = 2;
          }else if (board[1][2]=='X' && board[1][0]=='X'){
            column = 2;
          }else if (board[2][2]=='X' && board[2][0]=='X'){
            column = 2;
          }else if (board[0][0]=='X' && board[1][0]=='X'){
            column = 0;
          }else if (board[0][1]=='X' && board[1][1]=='X'){
            column = 1;
          }else if (board[0][2]=='X' && board[1][2]=='X'){
            column = 2;
          }else if (board[2][0]=='X' && board[1][0]=='X'){
            column = 0;
          }else if (board[2][1]=='X' && board[1][1]=='X'){
            column = 1;
          }else if (board[2][2]=='X' && board[1][2]=='X'){
            column = 2;
          }else if (board[0][0]=='X' && board[2][0]=='X'){
            column = 0;
          }else if (board[0][1]=='X' && board[2][1]=='X'){
            column = 1;
          }else if (board[0][2]=='X' && board[2][2]=='X'){
            column = 2;
          }else if (board[0][0]=='X' && board[2][2]=='X'){
            column = 1;
          }else if (board[0][2]=='X' && board[2][0]=='X'){
            column = 1;
          }else if (board[2][2]=='X' && board[1][1]=='X'){
            column = 0;
          }else if (board[0][0]=='X' && board[1][1]=='X'){
            column = 2;
          }else if (board[0][2]=='X' && board[1][1]=='X'){
            column = 0;
          }else if (board[2][0]=='X' && board[1][1]=='X'){
            column = 2;
          }else {
            column = (int) (Math.random()*3+1);
          }return column;
   }
   
   
   
   

}
         
      
   
   
      
      