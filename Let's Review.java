public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<T;i++)
        {
            String s=sc.nextLine();
            for(int j=0;j<s.length();j+=2)
            System.out.print(s.charAt(j));
            System.out.print(" ");
            for(int j=1;j<s.length();j+=2)
            System.out.print(s.charAt(j));
            System.out.print("\n");
       }
    }
}

