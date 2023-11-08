public class CapatalizeTheFirstAndLastCharInString {
    public static void main(String[] args)
    {
        String str="venkatesh is a good boy and also a bad boy";
        String str1[]=str.split("\\s");
        String temp="";
        for(String i:str1)
        {
           int length=i.length();
           String firstchar=i.substring(0,1);
           String restchar=i.substring(1,length);
           String lastchar=Character.toString(i.charAt(length-1));
           temp=temp+firstchar.toUpperCase()+restchar+lastchar.toUpperCase()+" ";
        }
        System.out.println(temp);  
    }
}
/*int length=i.length();
            String firstchar=i.substring(0,1);
            String restchar=i.substring(1,length-1);
            String lastchar=Character.toString(i.charAt(length-1));
            temp=temp+firstchar.toUpperCase()+restchar+" ";*/