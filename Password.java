import java.util.*;
public class Password {
    public static void main(String[]args){
        int length=10;
        System.out.println(Apassword(length));
}
static char[]Apassword(int len){
    System.out.println("generating password using rsndom():");
    System.out.println("your new password is:");
    String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String small_chars="abcdefghijklmnopqrstuvwxyz";
    String numbers="2005";
    String Symbols="0123456789";
    String values=capital_chars+small_chars+numbers+Symbols;
    Random  rndm_method=new Random();
    char[]password= new char[len];
    for(int i=0;i<len;i++){
    password[i]=
    values.charAt(rndm_method.nextInt(values.length()));
}
return password;

}
}
