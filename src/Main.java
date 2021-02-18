import java.util.ArrayList;

public class Main {

    public static int[][] InputData = {{67,12,92,29,2,68,31,2,74,7,18,16,83,77,87,72,73,57,62,25},
            {33,97,96,18,41,53,26,74,80,93,85,48,5,30,29,59,98,60,62,24},
            {19,80,41,2,10,80,26,83,89,40,8,23,38,57,93,31,10,20,5,90}};

    public static void main(String[] args) {
        for (int i=0; i<3; i++){
            for (int j=0;j<20;j++){
                System.out.print(InputData[i][j]+ " ");
            }
            System.out.println();
        }

        NextFitAlgorithm first = new NextFitAlgorithm(InputData);
        first.printInputData();
        System.out.println();
        first.Algorithm();
    }


}
