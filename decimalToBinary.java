public class decimalToBinary {
    public static void main(String[] args)
    {
        int deci=24;//bin=1100
        double bin=0;
       int i=0;
        while(deci!=0)
        {
           int rem=deci%2;
            int c=(int)Math.pow(10,i);
            bin = bin + rem * c;
            deci=deci/2;
            i++;
        }
        System.out.println((int)bin);   
    }
    
}
