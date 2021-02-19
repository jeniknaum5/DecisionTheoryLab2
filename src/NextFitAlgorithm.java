import java.util.ArrayList;

public class NextFitAlgorithm {

    ArrayList<Integer> InputData = new ArrayList<>();
    int NumbOfContainer = 1;
    int Counter = 0;
    int NumbOfCompare = 0;

    public NextFitAlgorithm(int[][] InputData) {
        for (int j=0; j<3; j++){
            for (int i = 0; i < 20; i++){
                this.InputData.add(InputData[j][i]);
            }
            System.out.println("\nРяд № " + (j+1));
            Algorithm();
        }
    }

    public void Algorithm() {
        Counter = InputData.get(0);
        for (int i = 1; i < InputData.size(); i++) {
            NumbOfCompare++;
            if (Counter + InputData.get(i) <= 100) {
                Counter += InputData.get(i);
            } else {
                NumbOfContainer++;
                Counter = InputData.get(i);
            }
        }
        printResult();
        NumbOfContainer=1;
        NumbOfCompare=0;
        InputData.clear();
    }
    public void printResult(){
        System.out.println("Кол-во сравнений: "+ NumbOfCompare+
                "\nКол-во контейнеров: "+ NumbOfContainer);
    }

    public void allNumbers(int[][] InputData){
        for (int j=0; j <3; j++){
            for (int i=0; i<20; i++){
                this.InputData.add(InputData[j][i]);
            }
        }
        System.out.println("\nВсе числа");
        Algorithm();
    }
}
