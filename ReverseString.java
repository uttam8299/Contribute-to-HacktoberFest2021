import java.util.*;
import java.io.*;

public class ReverseString{
    public static void main(String args[]){
        String s = "MALAYALAM";
        for(int i = 0 ; i < s.length();i++){
            for(int j = s.length()-1;j>=0;j--){
                if(s[i] == s[j]){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}