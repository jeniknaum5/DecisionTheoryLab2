import java.util.ArrayList;
import java.util.Collections;

public class WorstFitAlgorithm {
    ArrayList<Integer> InputData = new ArrayList<>();
    int NumbOfContainer = 1;
    int NumbOfCompare = 0;

    public WorstFitAlgorithm(int[][] InputData) {
        for (int j=0; j<3; j++){
            if(j==2)
                NumbOfContainer++;
            for (int i = 0; i < 20; i++){
                this.InputData.add(InputData[j][i]);
            }
            System.out.println("\nРяд № " + (j+1));
            Algorithm();
        }
    }

    public void Algorithm() {
        ArrayList<Integer> Containers = new ArrayList<>();
        Containers.add(0);

        for (int i = 0; i < InputData.size() - 1; i++) {
            if (Containers.get(Containers.size() - 1) + InputData.get(i) <= 100)
                Containers.set(Containers.size() - 1, Containers.get(Containers.size() - 1) + InputData.get(i));
            else{
                NumbOfCompare+=Containers.size()-1;
                if(Collections.min(Containers)+InputData.get(i)<= 100){
                    for(int j = 0; j <Containers.size()-1;j++){
                        if(Containers.get(j)==Collections.min(Containers)){
                            Containers.set(j, Containers.get(j)+ InputData.get(i));
                            break;
                        }
                    }
                }else{
                    NumbOfContainer++;
                    Containers.add(InputData.get(i));
                }

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
        NumbOfContainer++;
        Algorithm();
    }
}
