import java.util.*;

public class arraylist {
    //swapping the two values
    // public static void alsw(ArrayList<Integer>ak,int n1,int n2){
    //     int temp=ak.get(n1);
    //    ak.set(n1, ak.get(n2));
    //    ak.set(n2,temp);

    // }

    // // container with the water
    // public static int cw(ArrayList<Integer>heigth){
    //   // //brute force method
    //   // int max=0;
      
    //   // for(int i=0;i<heigth.size();i++){
    //   //   for(int j=i+1;j<heigth.size();j++){
    //   //     int heigt=Math.min(heigth.get(i),heigth.get(j) );
    //   //     int width=j-i;
    //   //     int current =heigt*width;
    //   //     max=Math.max(max, current);
    //   //   }
        
    //   // }
    //   // System.out.println(max);
    //   // return max;

    //   //optimized solution
    //   int max=0;
    //   int lp=0;
    //   int rp=heigth.size()-1;
    //   while(lp<rp){
    //     int h=Math.min(heigth.get(lp),heigth.get(rp));
    //     int width=rp-lp;
    //     int current=h*width;
    //     max=Math.max(max, current);
    //     if(heigth.get(lp)<heigth.get(rp)){
    //       lp++;
    //     }else
    //     {
    //       rp--;
    //     }
    //   }
    //   return max;

    // }

    // // pair sum 
    // public static boolean pairsum(ArrayList<Integer>arr,int target){
    //   //optimized solution
    //   int lp=0;
    //   int rp=arr.size()-1;
    //   while(lp<rp){
    //     if(arr.get(lp)+arr.get(rp)==target){
    //       return true;
    //     }
    //     else if(arr.get(lp)+arr.get(rp)<target){
    //        lp++;
    //     }else{
    //       rp--;
    //     }
        
    //   }
    //   return false;
    // }

    // //pair sum and rotate
    // public static boolean pairsum(ArrayList<Integer>arr,int target){
    //   int bp=0;
    //   int n=arr.size();

    //   //calculating our breaking point 
    //   for(int i=0;i<n;i++){
    //     if(arr.get(i)>arr.get(i+1)){
    //       bp=i;
    //       break;
    //     }
    //   }
    //   int lp=bp+1;
    //   int rp=bp;
    //   while(lp!=rp){
    //     if(arr.get(lp)+arr.get(rp)==target){
    //       return true;
    //     }
    //     else if(arr.get(lp)+arr.get(rp)<target){
    //       lp=(lp++)%n;
    //     }
    //     else{
    //       rp=(n+rp-1)%n;
    //     }
    //   }

    //      return false;
    // }

    //[ractice question]
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // syntax
       // ArrayList<ArrayList<Integer>>ak=new ArrayList<>();
        // ArrayList<Integer>list1=new ArrayList<>();
        // ArrayList<Integer>list2=new ArrayList<>();
        // ArrayList<Integer>list3=new ArrayList<>();
        // ak.add(1);
        // ak.add(56);
        // ak.add(45);
        // ak.add(3);
        // ak.add(7);
        //operations

    //     //1.add
    //     ak.add("akram");
    //     ak.add("me");
    //     ak.add("mental");
    //     ak.add("kirak");
    //     ak.add("johan");
    //     ak.add("sulthan");
    //     System.out.println(ak);

    //     // //2.get operation
    //     System.out.println(ak.get(4));
    //     System.out.println(ak.get(2));

    //     // //3.remove operation
    //     ak.remove(1);
    //     ak.remove(3);
    //     System.out.println(ak);

    //     //4.set operation
    //     ak.set(1, "moahmmed");
    //     System.out.println(ak);

    //     //5.contains opeartion
    //    System.out.println( ak.contains("john"));
    //    System.out.println(ak.contains("mental"));

    //    //6.add extra elemrnts
    //    ak.add(2,"cena");
    //    System.out.println(ak);
   
    //size of al is size()

    //reverse of al operaton
   
    
    // for(int i=ak.size()-1;i>=0;i--){
    //    System.out.print(ak.get(i) +" "); 
    // }
    // System.out.println();
    // System.out.println(ak);

    // //finding maximum vqalue
    // int max=Integer.MIN_VALUE;
    // for(int i=0;i<ak.size();i++){
    //     max=Math.max(max, ak.get(i));
    // }
    // System.out.println(max);
    

    // //swapping the values
    //   alsw(ak, 0, 4);
    //  System.out.println(ak);

    //printing the vlaues of 3d arraylist

    // list1.add(1);list1.add(2);
    // ak.add(list1);
    // list2.add(3);
    // list2.add(4);
    // ak.add(list2);
    // list3.add(5);
    // list3.add(6);
    // ak.add(list3);

    //   for(int i=0;i<ak.size();i++){
    //     ArrayList <Integer>currentList=ak.get(i);
    //       for(int j=0;j<currentList.size();j++){
    //         System.out.print(currentList.get(j)+" ");
    //       }
    //       System.out.println();
    //   }
    //   System.out.println(ak);

    // //printing the table values
    // for(int i=1;i<=5;i++){
    //     list1.add(i*1);
    //     list2.add(i*2);
    //     list3.add(i*3);
    // }
    // ak.add(list1);
    // ak.add(list2);  ak.add(list3);
    // System.out.println(ak);
    // list2.remove(3);
    // list1.remove(2);
    // list3.remove(4);
    //   for(int i=0;i<ak.size();i++){
    //     ArrayList <Integer>currentList=ak.get(i);
    //       for(int j=0;j<currentList.size();j++){
    //         System.out.print(currentList.get(j)+" ");
    //       }
    //       System.out.println();
    //   }
    //   System.out.println(ak);

    //rainwater
    ArrayList<Integer>height=new ArrayList<>();
    height.add(11);
    height.add(15);
    height.add(6);
    height.add(8);
    height.add(90);
    height.add(10);
    height.add(8);
    height.add(3);
    height.add(7);

    //System.out.println(cw(height));
    //System.out.println(pairsum(height, 16));

    //practice questions 
       int a=3;
       int b=5;
       int count=0;
       int x=0;
       while(b>0){
        if((b&1)!=0){
            count++;

        }
       
    }
    System.out.println(count);
        // while(x<a){
            
        // }
       
    }
}
