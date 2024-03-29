//Challenge

/*
Replace Rows & Columns with Zero
The program must accept an integer matrix of size RxC as the input. If any cell is 0 in the matrix, the
program must replace the entire row and column of the cell with zero. Finally, the program must print
the modified matrix as the output.
Boundary Conditon(s):
2 <= R, C <= 50
0 <= Each integer value <= 1000
Input Format:
The first line contains R and C separated by a space.
The next R lines, each containing C integers separated by a space.
Output Format:
The first R lines, each containing C integers separated by a space.
Example Input/Output 1:
Input:
2 3
1 0 1
1 1 1
Output:
0 0 0
1 0 1
Explanation:
In the given 2x3 matrix, the 0 is present in the first row and second column.
So the entire first row and the entire second column are replaced with zero. Now, the matrix becomes
0 0 0
1 0 1
Example Input/Output 2:
Input:
3 4
3 8 3 8
0 5 7 8
6 0 4 8
Output:
0 0 3 8
0 0 0 0
0 0 0 0
*/

//Solution
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int r= sc.nextInt();
		int c= sc.nextInt();
		int a[][]= new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j]= sc.nextInt();
            }
        }
        boolean row[]=new boolean[r];
        boolean col[]=new boolean[c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(a[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(row[i]||col[j])
                    a[i][j]=0;
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
