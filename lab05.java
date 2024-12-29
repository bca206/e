public class lab05 {
    public static void main(String[] args) {
        String s1=new String("anjuman bca college");
        String s2="ANJUMAN BCA COLLEGE";
        System.out.println("The string s1 is="+s1);
        System.out.println("The string s2 is="+s2);
        System.out.println("The length of the string s1="+s1.length());
        System.out.println("The First occurence of c in string s1="+s1.indexOf('c'));
        System.out.println("The lower case of s2="+s2.toLowerCase());
        System.out.println("the upper case of s1="+s1.toUpperCase());
        System.out.println("S1 is equal to s2="+s1.equals(s2));
        System.out.println("S1 is equal to s2 ingore case="+s1.equalsIgnoreCase(s2));
        int result=s1.compareTo(s2);
        System.out.println("After compareto()");
        if(result==0)
            System.out.println(s1+" is equal to "+s2);
        else if(result > 0)
            System.out.println(s1+" is greater than to "+s2);
        else
            System.out.println(s1+" is smaller than to "+s2);
        System.out.println("Character at index 9 is="+s1.charAt(9));
        String s3=s1.substring(4,12);
        System.out.println("Extracted substring is: "+s3);
        System.out.println("After Replacing b with m in s1: "+s1.replace('b','m'));
        String s4="  This is a book  ";
        System.out.println(" The string s4 is : "+s4);
        System.out.println(" After trim():"+s4.trim());
        String s5="Mudasir";
        String s6="Syed";
        String s7=s6.concat(s5);
        System.out.println("Concatenating "+s6+" and "+s5+" : "+s7);
    }
}
