public class arrayfindelement {
    public static void main(String args[])
    {
        int arr[]={4,5,3,56,69};
        int target=5;
        boolean b=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                b=true;
                System.out.println("array found at the location "+i);
            }
        }
        if(b==false)
        {
            System.out.println("not found ");
        }
    }
    
}
