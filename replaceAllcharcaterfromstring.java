public class replaceAllcharcaterfromstring {
    public static void main(String[] args)
    { 
        String str="ve#$@%@%#nkate^7727sh!!  ";
        str=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str);
    }
}
