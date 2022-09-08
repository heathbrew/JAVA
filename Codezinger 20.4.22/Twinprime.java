import java.util.*; 
class AllPrime{
    static void prime(){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=2; i<100;i++){
            int a=0;
            for(int j=2; j<=i/2;j++){
                if (i%j==0){
                    a=1;
                    break;
                }}
                if (a==0){
                    list.add(i);
                }
            
        }
        for(int i=0; i<list.size()-1; i++){
            if ((list.get(i+1)-(list.get(i))==2)){
                System.out.printf("(%d, %d)%n",list.get(i),list.get(i+1));
            }
        }
    } 
}
class Prime extends AllPrime{}
public class Twinprime {
    public static void main(String[] args){
        Prime p =new Prime();
        p.prime();
    }
}
