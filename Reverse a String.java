class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
         StringBuilder str1  = new StringBuilder();
         str1.append(str);

        return str1.reverse().toString();
    }
}
