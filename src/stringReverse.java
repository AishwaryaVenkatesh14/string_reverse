import java.util.Scanner;
public class stringReverse {
     public static void ReverseString(char[] s) {
            int size=s.length;
            int i=0;int z=size-1;
            while(i<z){
                char temp=s[i];
                s[i]=s[z];
                s[z] = temp;
                i++;
                z--;
            }
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String ip=sc.nextLine();
            char []s=ip.toCharArray();
            ReverseString(s);
            System.out.println(new String(s));
            sc.close();
        }
    }
