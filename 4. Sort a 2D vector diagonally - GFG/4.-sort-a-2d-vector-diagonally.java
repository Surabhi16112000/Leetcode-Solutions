// { Driver Code Starts
//Initial Template for Java

import java.util.*; 
import java.io.*;
import java.lang.*;

class GFG
{
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
            
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    matrix[i][j] = sc.nextInt();
            
            Solution ob = new Solution();
            ob.diagonalSort(matrix,n,m);
            printMatrix (matrix);
        }
	} 
	
	static void printMatrix(int arr[][]) 
	{ 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = 0; j < arr[0].length; j++) 
				System.out.print(arr[i][j] + " "); 
			System.out.println(""); 
		} 
	} 
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    void diagonalSort(int mat[][], int m, int n)
    {
        for(int i=1;i<m;i++)
        {
            countSortasc(mat,i,0,m,n);
        }
        for(int j=1;j<n;j++)
        {
            countSortdes(mat,0,j,m,n);
        }
        return;
    }
    void countSortdes(int mat[][], int r, int c, int m, int n)
    {
        int[] map=new int[100001];
        int i=r, j=c;
        while(i<m && j<n)
        {
            map[mat[i][j]]++;
            i++; j++;
        }
        i=r; j=c;
        int k=100000;
        while(i<m && j<n)
        {
            while(map[k]>0)
            {
                mat[i++][j++]=k;
                map[k]--;
                
            }
            k--;
        }
    }
    void countSortasc(int mat[][], int r, int c, int m, int n)
    {
        int[] map=new int[100001];
        int i=r, j=c;
        while(i<m && j<n)
        {
            map[mat[i][j]]++;
            i++; j++;
        }
        i=r; j=c;
        int k=1;
        while(i<m && j<n)
        {
            while(map[k]>0)
            {
                mat[i++][j++]=k;
                map[k]--;
                
            }
            k++;
        }
    }
}