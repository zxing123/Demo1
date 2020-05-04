import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        String str1="1231";
        StringBuilder str2=new StringBuilder(str1);
        str2.reverse();
        boolean flag=false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                flag=true;
            }

        }
        if(flag){
            System.out.println("不是回文数");
        }else{
            System.out.println("是回文数");
        }
    }


}
