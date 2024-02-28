import java.util.Scanner;

public class Matrix 
{

    private int rows;
    private int columns;
    private double[ ][ ] data;
    private String name;


    public void setRows(int rows) 
    {
        this.rows = rows ;
    }

    public void setColumns(int columns) 
    {
        this.columns = columns ;
    }

    public void setData(double[ ][ ] data) 
    {
        this.data = data ;
    }

    public void setName(String name) 
    {
        this.name = name ;
    }

    public int getColumns( ) 
    {
        return columns ;
    } 

    public double[ ][ ] getData( ) 
    {
        return data ;
    }

    public int getRows( ) 
    {
        return rows ;
    }
    public String getName( ) 
    {
        return name ;
    }



    Matrix ( )
    {
        Scanner scanner = new Scanner( System.in ) ;

        System.out.print("Enter no of rows for the matrix:") ;
        rows = scanner.nextInt( ) ;

        System.out.print("Enter no of Coulumns for the matrix:") ;
        columns = scanner.nextInt( ) ;


        data = new double[ rows ][ columns ] ;


        for ( int i = 0 ; i < rows ; i++ ) 
	{
            for ( int j = 0 ; j < columns ; j++ )
	    {
                data[ i ][ j ] = 0 ;
            }
        }
    }



    Matrix( int rows ,int columns )
    {
        this.rows = rows ;
        this.columns = columns ;
        data = new double[ rows ][ columns ] ;
        for ( int i = 0 ; i < rows ; i++ )
 	{
            for ( int j = 0 ; j < columns ; j++ )
	    {
                data[ i ][ j ] = 0 ;
            }
        }
    }

    public void setElements( ) 
    { 
	int a = 1 ;

        Scanner scans = new Scanner( System.in ) ;

        for ( int i = 0 ; i < rows ; i++ )
 	{
            for  ( int j = 0 ; j < columns ; j++ )
	    {
                System.out.println( "Enter " + a++ + "th element:" ) ;
                double temp = scans.nextDouble( ) ;
                data[ i ][ j ] = temp ;
            }
        }
    }


    public void getElements( )
    {
        for( int i = 0 ; i < rows ; i++ )
	{
            for ( int j = 0 ; j < columns ; j++ )
	    {
                System.out.print( data[ i ][ j ]+ " \t " ) ;
            }
            System.out.println( );
        }
    }

    public Matrix addMatrix ( Matrix M1 , Matrix M2 )
    {
        Matrix result = new Matrix(M1.rows , M1.columns ) ;


        if ( M1.rows != M2.rows || M1.columns != M2.columns )
	{
            System.out.println( "Not possible to add unlike matrices. " ) ;

        }
	else
	{
            for ( int i = 0 ; i < rows ; i++ )
	    {
                for ( int j = 0 ; j < columns ; j++ )
		{
                    result.data[ i ][ j ] = M1.data[i][j] + M2.data[ i ][ j ] ;
                }
            }
        }
        return result;
    }


    public Matrix diffMatrix ( Matrix M1, Matrix M2) 
     {
        Matrix result = new Matrix( M1.rows , M1.columns ) ;
        if ( M1.rows != M2.rows || M1.columns != M2.columns )
	{
            System.out.println("Not possible to subtract unlike matrix. ") ;

        }
	else
	{
            for ( int i = 0 ; i < rows ; i++ )
	    {
                for ( int j = 0 ; j < columns ; j++ )
		{
                    result.data[ i ][ j ] = M1.data[ i ][ j ] - M2.data[ i ][ j ] ;
                }
            }
        }
        return result;
    }


    public Matrix productMatrix ( Matrix M1,Matrix M2) 
	{

        Matrix result = new Matrix( M1.rows , M2.columns ) ;

        if ( M1.columns != M2.rows ) 
	{
            System.out.println( " Not possible to multiply unagreeing matrices. ") ;

        } 
	else 
	{
            for ( int i = 0 ; i < M1.rows ; i++ ) 
		{
                  for ( int j = 0 ; j < columns ; j++ ) 
		  {
                    for ( int k = 0 ; k < M1.columns ; k++ ) 
			{
                           result.data[ i ][ j ] += M1.data[ i ][ k ] * M2.data[ k ][ j ] ;
                    }
                }
            }
        }
        return result;
    }


    public Matrix transpose ( Matrix M1 )
    {
        Matrix result = new Matrix( M1.columns , M1.rows ) ;

        for( int i = 0 ; i < result.rows ; i++ )
	 {
            for ( int j = 0 ; j < result.columns ; j++ ) 
	   {
                result.data[ i ][ j ] = M1.data[ j ][ i ] ;
            }
        }
        return result ;
    }


    public String elementString( Matrix M1 )
	{
          name = " ";
        for ( int i = 0 ; i < M1.rows ; i++ )
	{
            for ( int j = 0 ; j < M1.columns ; j++ )
	    {
                String temp = String.valueOf( M1.data[ i ][ j ] ) ;
                name = name.concat( temp.concat(" ") ) ;
            }
        }
        return name;
    }
}

