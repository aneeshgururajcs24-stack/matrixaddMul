import java.util.*;
public class matrixaddmul {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();
        int m=in.nextInt();
        int p = in.nextInt();
        int arr[][]=new int[n][m];
        int arr1[][]=new int[m][p];
        int result[][]=new int[n][p];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                for(int k=0;k<m;k++){
                    result[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
    }
}
