import java.util.*;
public class Practice3 {

    public List<List<Integer>> generate0(int numRow){
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0 ;i < numRow; i ++){
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            for(int j = 0;j <= i - 2;j ++){
                List<Integer> preNum = list.get(i - 1);

                int n = preNum.get(j);
                int m = preNum.get(j + 1);
                int p = n + m ;
                nums.add(p);
            }
            if(i != 0){
                nums.add(1);
            }
            list.add(nums);
        }
        return list;
    }


//    public List<List<Integer>> generate(int numRow){
//        List<List<Integer>> list = new ArrayList<>() ;
//
//        for(int i = 0;i < numRow;i ++){
//            list.add(new ArrayList<>());
//        }
//
//        list.get(0).add(1);
//        list.get(1).add(1);
//        list.get(1).add(1);
//
//        for(int i = 2;i < numRow;i ++){
//            list.get(i).add(1);
//            for(int j = 1;j < i;j ++){
//                int nums = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
//                list.get(i).add(nums);
//            }
//            list.get(i).add(1);
//        }
//        return list;
//    }

    private static void print(Practice3 p, int n)
    {

        System.out.println(p.generate0(n));
    }

    public static void main(String[] args) {

        Practice3 p = new Practice3();

        print(p,3);

    }

}
