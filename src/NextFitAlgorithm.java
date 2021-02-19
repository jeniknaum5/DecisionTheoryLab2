import java.util.ArrayList;

public class NextFitAlgorithm {

    ArrayList<Integer> InputData = new ArrayList<>();
    int NumbOfContainer = 1;
    int Counter = 0;
    int NumbOfCompare = 0;

    public NextFitAlgorithm(int[][] InputData) {
        for (int i = 0; i < 20; i++)
            this.InputData.add(InputData[0][i]);
    }

    public void printInputData() {
        for (Integer integer : InputData)
            System.out.print(integer + " ");
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
        System.out.println("|||NFA|||");
        System.out.println("Кол-во сравнений: " + NumbOfCompare);
        System.out.println("Кол-во контейнеров: "+NumbOfContainer);

    }
}
