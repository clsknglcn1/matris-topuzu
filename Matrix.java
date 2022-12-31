import java.util.Arrays;
public class Matrix {
    public static void main(String[] args) {
        int [][]matris ={{4,6,8},{5,7,9}};
        int matrsSatir= matris.length;
        int matrsStun= matris[0].length;
        int[][] transpoze = new int[matrsStun][matrsSatir];
        for (int i=0; i<transpoze.length;i++){
            for (int j =0; j<transpoze[0].length;j++){
                transpoze[i][j]=matris[j][i];
            }
        }
        for (int [] a :transpoze){
            for (int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
