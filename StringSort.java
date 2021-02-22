package arrayproblems;

import java.util.Scanner;

public class StringSort 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        
        int n=scanner.nextInt();
        String[] str = new String[n];
        
        for(int i = 0; i < n; i++)
            str[i] = scanner.next();
        
        sort(str);
        
        arrange(str);
        
        for(int k = 0; k < n; k++)
        {
            System.out.print(str[k]+" ");
        }
    }
    
    public static void sort(String[] str)
    {
        int start = 0;
        
        while(start < str.length-1)
        {
            for(int j = start+1 ; j<str.length; j++)
            {
                if(str[start].length() > str[j].length())
                {
                    String temp = str[start];
                    str[start] = str[j];
                    str[j] = temp;
                }
            }
            start++;
        }
    }
    
    public static void arrange(String[] str)
    {
        int start = 0;
        while(start < str.length-1)
        {
            int k = start + 1;
            
            while(k < str.length && str[start].length() == str[k].length())
            {
                if(str[start].compareTo(str[k]) > 0){
                    String temp = str[start];
                    str[start] = str[k];
                    str[k] = temp;
                }
                k++;
            }
            start++;
        }
    }
}
