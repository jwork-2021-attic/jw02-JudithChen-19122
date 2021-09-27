package s191220013.task3;

public class QuickSorter implements Sorter{
    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + i + "<->" + j + "\n";
    }

    private String plan = "";
    
    private void quick_sort(int begin, int end){
        if(begin > end)
            return;
        int tmp = a[begin];
        int i = begin;
        int j = end;
        while(i != j){
            while(a[j] >= tmp && j > i)
                j--;
            while( a[i] <= tmp && j > i)
                i++;
            if(j > i){
                swap(i,j);
            }
        }
        if(begin!=i)
            swap(begin,i);
        quick_sort(begin, i-1);
        quick_sort(i+1, end);
    }

    @Override
    public void sort() {
        quick_sort(0,a.length-1);
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}
