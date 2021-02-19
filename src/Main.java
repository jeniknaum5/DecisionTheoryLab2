import java.util.ArrayList;
//{{67,12,92,29,2,68,31,2,74,7,18,16,83,77,87,72,73,57,62,25},
//{{54,73,15,6,51,64,90,63,91,72,37,37,59,28,71,80,87,56,90,41},
public class Main {

    public static int[][] InputData = {{54,73,15,6,51,64,90,63,91,72,37,37,59,28,71,80,87,56,90,41},
            {33,97,96,18,41,53,26,74,80,93,85,48,5,30,29,59,98,60,62,24},
            {19,80,41,2,10,80,26,83,89,40,8,23,38,57,93,31,10,20,5,90}};

    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            for (int j=0;j<20;j++){
                System.out.print(InputData[i][j]+ " ");
            }
            System.out.println();
        }

        BestFitAlgorithm first = new BestFitAlgorithm(InputData);
        first.printInputData();
        System.out.println();
        first.Algorithm();

    }


}
