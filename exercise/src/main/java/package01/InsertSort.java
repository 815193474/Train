package package01;

/**
 * @Author wolf  VX:a815193474
 * @Data 2019-12-16 16:39
 */
public class InsertSort {
    public static void main(String[] args){
        int[] array={7,3,19,40,4,7,1};
            insertSort(array);
    }
    public static int Cmp(int a,int b){
        if(a>b){
            return 1;
        }else if(a<b) {
            return -1;
        }
        else {
            return 0;
        }
    }
    public static void insertSort(int[] a){
        if (a!=null){
            for (int i=1;i<a.length;i++){
                int temp=a[i];
               int j=i;
               if (Cmp(a[j-1],temp)==1){
                   while(j>=1&&Cmp(a[j-1],temp)==1){
                       a[j]=a[j-1];//比较大小，交换位置
                       j--;
                   }
               }
              a[j]=temp;//保证每次数组中temp原有值不变
                for (int k=0;k<a.length;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }

        }
    }
}
