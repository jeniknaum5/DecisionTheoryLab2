import java.util.ArrayList;
import java.util.Collections;

public class WorstFitAlgorithm {
    ArrayList<Integer> InputData = new ArrayList<>();
    int NumbOfContainer = 1;
    int NumbOfCompare = 0;

    public WorstFitAlgorithm(int[][] InputData) {
        for (int i = 0; i < 20; i++)
            this.InputData.add(InputData[0][i]);
    }

    public void printInputData() {
        for (Integer integer : InputData)
            System.out.print(integer + " ");
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
            System.out.println("|||WFA|||");
        System.out.println("Кол-во сравнений: " + NumbOfCompare);
        System.out.println("Кол-во контейнеров: " + NumbOfContainer);
    }
}
