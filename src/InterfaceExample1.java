public class InterfaceExample1 {
    public static void main(String[] args) {
        int[] elements={5,7,2,11,1};
        sort(elements,new SortAscending());
        for (int i:elements){
            System.out.println(i);
        }
        System.out.println("\n");
        sort(elements,new SortDescending());
        for (int i:elements){
            System.out.println(i);
        }
    }
    public static void sort(int[] elements,SortCondition condition){
        for(int i=0;i< elements.length;i++){
            for(int j=i+1;j<elements.length;j++){
                if(condition.process(elements[i],elements[j])){
                    int temp=elements[i];
                    elements[i]=elements[j];
                    elements[j]=temp;
                }
            }
        }
    }
}
interface SortCondition {
    boolean process(int ele1,int ele2);
}
class SortAscending implements SortCondition{
    @Override
    public boolean process(int ele1, int ele2) {
        return ele1>ele2;
    }
}
class SortDescending implements SortCondition{
    public boolean process(int ele1, int ele2) {
        return ele1<ele2;
    }
}
