import java.io.*;
import java.io.FileInputStream;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream=new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int max=0,i;
        while(inputStream.available()>0)
            if((i=inputStream.read())>max)
                max=i;
        inputStream.close();
        System.out.println(max);
    }
}
