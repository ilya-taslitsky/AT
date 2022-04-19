import java.util.HashMap;

public class lab2
{
    public static double add(double digit1, double digit2)
    {
        return digit1+digit2;
    }
    public static double sub(double digit1, double digit2)
    {
        return digit1-digit2;
    }
    public static double mulp(double digit1, double digit2)
    {
        return digit1*digit2;
    }
    public static double divide(double digit1, double digit2)
    {
        return digit1/digit2;
    }

    public static int findNumberOfWords(String s)
    {
        int count =0;
        char space = ' ';
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == space)
                count++;
        }
        return count++;
    }

    public static void showCountOfCharInEachWord(String s)
    {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++)
        {
            String str = "";

            while (i < ch.length && ch[i] != ' ')
            {

                str = str + ch[i];
                i++;
            }
            if (str.length() > 0)
                System.out.println(str + "->" + str.length());
        }
    }

    public static HashMap<Character, Integer> task4(String s)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int count = 0;
        char space = ' ';
        if(s.isEmpty())
            return hashMap;

        char currentChar = s.charAt(0);
        hashMap.put(currentChar, 1);


        for(int i = 1; i < s.length()-1; i++)
        {

            System.out.println("CurChar: " + s.charAt(i));
            if(s.charAt(i) == space)
            {
                currentChar = s.charAt(i+1);
                if(hashMap.containsKey(currentChar)) {
                    System.out.println("Yes");
                    hashMap.replace(currentChar, hashMap.get(currentChar) + 1);
                }
                else {
                    System.out.println("No");
                    hashMap.put(currentChar, 1);
                }
                System.out.println("\n");


            }
        }
        return hashMap;
    }

    public static void main(String[] args) {
        String s = "fewer few qr32t j6utkj lmlp 134 wq y54d fas gm";
        System.out.println(task4(s));
    }


}