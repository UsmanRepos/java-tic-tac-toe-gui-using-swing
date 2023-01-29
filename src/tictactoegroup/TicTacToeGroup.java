
package tictactoegroup;

/**
 *
 * @author Usman_Aslam
 */
public class TicTacToeGroup {

    final int SIZE = 9;
    String[] board = new String[SIZE];
    static int count = 0;
    char player = '1';
    
    int checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;
	    switch (a) 
            {
                case 0:
		    line = board[0] + board[1] + board[2];
		    break;
		case 1:
		    line = board[3] + board[4] + board[5];
		    break;
		case 2:
		    line = board[6] + board[7] + board[8];
		    break;
		case 3:
		    line = board[0] + board[3] + board[6];
		    break;
		case 4:
		    line = board[1] + board[4] + board[7];
		    break;
		case 5:
		    line = board[2] + board[5] + board[8];
		    break;
		case 6:
		    line = board[0] + board[4] + board[8];
		    break;
		case 7:
		    line = board[2] + board[4] + board[6];
		    break;
	    }
	    if (line.equals("XXX") || line.equals("OOO")) 
		return 1; 
        }
        count++;
        if(count >= 9)
            return 0;
        return -1;		
    }
  
}
