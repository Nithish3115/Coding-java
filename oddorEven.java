import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int b[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<b.length;i++){
            if(b[i]%2==0){
                 System.out.println("even " + b[i]);
            }
            else{
                System.out.println("odd " + b[i]);
            }
        }
       
     }
}