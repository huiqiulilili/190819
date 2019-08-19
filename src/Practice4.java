import java.util.*;
public class Practice4 {

    public List<List<Integer>> generate(int numRow){

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numRow;i ++){
            list.add(new ArrayList<>());
        }

        list.get(0).add(1);
        list.get(1).add(1);
        list.get(1).add(1);

        for(int i = 2;i < numRow;i ++){
            list.get(i).add(1);

            for(int j = 0;j <= i - 2 ;j ++){
                int num = list.get(i - 1).get(j) + list.get(i - 1).get(j +1);
                list.get(i).add(num);
            }
            list.get(i).add(1);
        }
        return list;
    }

    public List<List<Integer>> generate0(int numRow){
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0;i < numRow;i ++){
            List<Integer> num = new ArrayList<>();
            num.add(1);

            for(int j = 0;j <= i - 2;j ++){
                List<Integer> prev = list.get(i - 1);
                int p = prev.get(j);
                int q = prev.get(j + 1);
                num.add(p + q);
            }
            if(i != 0){
                num.add(1);
            }
            list.add(num);
        }
        return list;
    }

    public static void print(Practice4 p,int n){
        System.out.println(p.generate0(n));
    }

    public static void main(String[] args) {
        Practice4 p = new Practice4();
        print(p,3);
    }
}
