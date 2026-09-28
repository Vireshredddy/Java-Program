public class StringRotation {
    public static boolean isRotation(String a,String b){return a!=null&&b!=null&&a.length()==b.length()&&(a+a).contains(b);}
    public static void main(String[] args){System.out.println(isRotation("waterbottle","erbottlewat"));}
}