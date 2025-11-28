import java.util.*;

public class tic {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j] = '-';

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int moves = 0;

        while(true){
            printBoard(board);
            System.out.println("Enter row and col (0-2): ");
            int r = sc.nextInt(), c = sc.nextInt();

            if(board[r][c] != '-') { System.out.println("Taken!"); continue; }
            board[r][c] = 'X';
            moves++;
            if(checkWinner(board,'X')) { printBoard(board); System.out.println("You win!"); break; }
            if(moves==9) { printBoard(board); System.out.println("Tie!"); break; }

            // Computer move
            int cr, cc;
            do{ cr=rand.nextInt(3); cc=rand.nextInt(3);} while(board[cr][cc]!='-');
            board[cr][cc]='O';
            moves++;
            if(checkWinner(board,'O')) { printBoard(board); System.out.println("Computer wins!"); break; }
            if(moves==9) { printBoard(board); System.out.println("Tie!"); break; }
        }
    }

    static void printBoard(char[][] b){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) System.out.print(b[i][j]+" ");
            System.out.println();
        }
    }

    static boolean checkWinner(char[][] b,char s){
        for(int i=0;i<3;i++){
            if(b[i][0]==s && b[i][1]==s && b[i][2]==s) return true;
            if(b[0][i]==s && b[1][i]==s && b[2][i]==s) return true;
        }
        if(b[0][0]==s && b[1][1]==s && b[2][2]==s) return true;
        if(b[0][2]==s && b[1][1]==s && b[2][0]==s) return true;
        return false;
    }
}
