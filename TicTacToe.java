import java.util.Scanner ;

public class TicTacToe
{
	int s , board[s][s] ;

	TicTacToe ( int side )
	{
		System.out.println( " New Game created! " ) ;
		s = side ;
	}

	public static void initializeBoard ( )
	{
		System.out.println( "Board : " ) ;

		for ( int i = 0 ; i < side ; i++ )
		{
			for ( int j = 0 ; j < side ; j++ )
			{
				board[i][j] = 0 ;
			}
		}
	}

 	public static void displayBoard ( int r , int c , int value )
	{
		board[r][c] == value ;
		for ( int i = 0 ; i < side ; i++ )
		{
			for ( int j = 0 ; j < side ; j++ )
			{
				if ( board[i][j] != 0 )
				{
					System.out.print( board[i][j] + " "  ) ;
				}
				else 
				{
					System.out.print( "_ " ) ;
				}
			}
			
			System.out.println("") ;
		}
	}

	public static boolean makeMove ( int row , int coulumn , int player )
	{
		if ( board[row][coulumn] == 0 )
		{
			displayboard( row , coulumn , player ) ;
			return true ;
		}
		else
		{
			System.out.print("invalid move." ) 
			return false ;
		}
	}

	public boolean checkWin ( int r , int c )
	{
		int sum1 = 0, sum2 = 0, sum3 = 0 ;

		for ( int i = 0 ; i < r ; i++ )
		{
			sum1 = sum1 + board[i][c] ;
		}


		for ( int j = 0 ; j < c ; j ++ )
		{
			sum2 = sum2 + board[r][j]  ;
		}

		for ( int k = 0 ; k < c ; k++ )
		{
			sum3 = sum3 + board[k][k] ;
		}

		if ( sum1 == ( 3 || -3) || sum2 == ( 3 || -3 ) || sum3 == ( 3 || -3) )
		{
			System.out.println("Win!");
			return true ;
		}
		return false ;
	}

