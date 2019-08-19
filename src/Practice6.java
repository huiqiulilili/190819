public class Practice6 {
    public static void main(String[] args) {
        //装箱
        Integer it = new Integer(1);
        System.out.println(it);

        Integer it2 = new Integer("123");
        System.out.println(it2);

        //静态方法  装箱
        Integer i1 = Integer.valueOf(1);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("123");
        System.out.println(i2);

        System.out.println("--------------------");
        //拆箱
        int it1 = it.intValue();
        System.out.println(it1);
    }
}
