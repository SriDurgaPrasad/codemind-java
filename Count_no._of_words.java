import java.util.Scanner;
public class Sample
{
    public static int FindCount(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
            count++;
        }
        return count+1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str;
        str=s.nextLine();
        System.out.println(FindCount(str));
    }
}