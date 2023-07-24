class Solution 
{ 
    String removeComments(String code) 
    { 
        // code here
        int comment1=code.indexOf("//");
        int comment2=code.indexOf("\\n");
        if(comment1!=-1 && comment2!=-1){
            code=code.substring(0,comment1)+code.substring(comment2+2);
        }
        comment1=code.indexOf("/*");
        comment2=code.indexOf("*/");
        if(comment1!=-1 && comment2!=-1){
            code=code.substring(0,comment1)+code.substring(comment2+2);
        }
        return code;
    }
}
