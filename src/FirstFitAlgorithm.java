import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class FirstFitAlgorithm {

    ArrayList<Integer> InputData = new ArrayList<>();
    int NumbOfContainer = 0;
    int NumbOfCompare = 0;

    public FirstFitAlgorithm(int[][] InputData) {
        for (int i = 0; i < 20; i++)
            this.InputData.add(InputData[0][i]);
    }

    public void printInputData() {
        for (Integer integer : InputData)
            System.out.print(integer + " ");
    }

    public void Algorithm() {
        ArrayList<Integer> Containers = new ArrayList<>();
        for (int i = 0; i < InputData.size(); i++) {
            if (Containers.isEmpty()) {
                Containers.add(0);
                NumbOfContainer++;
            }
            NumbOfCompare++;
            if(Containers.get(Containers.size()-1)+InputData.get(i)<=100){
                Containers.set(Containers.size()-1, Containers.get(Containers.size()-1)+InputData.get(i));
            }else{
                for(int j=0;j<Containers.size();j++){
                    NumbOfCompare++;
                    if(Containers.get(j)+InputData.get(i)<=100){
                        Containers.set(j, Containers.get(j)+InputData.get(i));
                        break;
                    }else if(j==Containers.size()-1){
                        NumbOfContainer++;
                        Containers.add(InputData.get(i));
                        break;
                    }
                }
            }
        }

        System.out.println("|||FFA|||");
        System.out.println("Кол-во сравнений: " + NumbOfCompare);
        System.out.println("Кол-во контейнеров: " + NumbOfContainer);

    }

}
