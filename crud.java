import java.util.*;
public class crud {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
    ArrayList<Integer> arr=new ArrayList<Integer>();
    System.out.println("how many entries you want to make : ");
    int count=sc.nextInt();
    System.out.println("enter the entries : ");
for(int i=1;i<=count;i++){
    
    int no=sc.nextInt();
    arr.add(no);
}
    System.out.println(arr);
    show hi=new show();
    hi.showing(arr);
    }
  
    

}
class show{
    void showing(ArrayList<Integer> array){
        System.out.println("the array from show class is "+array);
    }
}


