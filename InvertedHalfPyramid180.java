public class InvertedHalfPyramid180 {
    public static void main(String[] args){
        int m=5;
        int n=5;
        for(int i=1;i<=n;i++){
           for(int j=m;j>=1;j--){
             if(j>i){
                System.out.print(" ");
             }
             else{
                System.out.print("*");
             }
           }
           System.out.println();
        }
    }
}
