public class sort01{
    public static void main(String[] args){
        int s1[] = new int[]{0,1,0,1,0,1,0,0,1,0,0,1,1,0,0,0,1,1,1,1};
        int count = 0;
        for(int i=0;i<s1.length;i++){
            if(s1[i]==0){
                count+=1;
            }
        } 
        int arr[] = new int[s1.length];
        for(int i=0;i<s1.length;i++){
            if(count>0){
                arr[i]=0;
                count-=1;
            }
            else{
                arr[i]=1;
            }
    }
    for(int i=0;i<s1.length;i++){
        System.out.print(arr[i]);
    }
    }
}