public class ButterflyPattern {
    public static void main(String[] args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n*2;j++){
              if(j<=i || j>n*2-i){
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
        //bottom;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n*2;j++){
              if(j<=i || j>2*n-i){
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}
