import java.util.ArrayList;

public class Practice01Dec25 {
    public static void main(String[] args){
        int a=5;
        Integer b =10;
        System.out.println(a+b);
        String test = "testing";
        int c =a+b;
        int[] ar={1,2};
        int[][] ar2 = new int[2][2];
        ar2[1][1]=0;
        System.out.println(ar2+" "+ar2[1][1]);

//        Array List
        ArrayList<Integer> arl1 = new ArrayList<Integer>();
        System.out.println(arl1);
        arl1.add(2);
        arl1.add(2);
        arl1.add(2,25);
        System.out.println(arl1);
        System.out.println(arl1.get(2));
    }
}
