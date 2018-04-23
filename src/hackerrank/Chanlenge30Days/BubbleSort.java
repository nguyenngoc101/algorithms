package hackerrank.Chanlenge30Days;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrs = {2,3,4,5,1,2,3,4};
        sort(arrs);
        for(int i=0; i< arrs.length; i++){
            System.out.println(arrs[i]);
        }
    }

    public static void sort(int[] a){
        for(int i= 0; i< a.length; i++){
            for (int j= 0; j< a.length-1; j++){
                if(a[i] < a[j]){
                    int tem = a[i];
                    a[i] = a[j];
                    a[j] = tem;
                }
            }
        }
    }
}
