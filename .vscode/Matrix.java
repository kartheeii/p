import java.util.Scanner;
public class Matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows @ and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int arr1[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
      System.out.println("Enter Second array");
          for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }}
        int k[][]=new int[m][n];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int g=0;g<m;g++){
                k[i][j]=k[i][j]+(arr[i][g]*arr1[g][i]);            }}}
      for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+k[i][j]);
            }
        }
        
    }
    
}
