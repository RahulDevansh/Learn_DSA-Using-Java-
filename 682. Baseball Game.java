//https://leetcode.com/problems/baseball-game/description/
// class Solution {
//     public int calPoints(String[] operations) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0;i<operations.length;i++) {
//             if(operations[i] !="C" || operations[i]!="D" || operations[i] !="+"){
//                 //int  num =Integer.parse(operations[i]);
//                 list.add(Integer.valueOf(operations[i]));
//             }
//             if(operations[i] =="C") {
//                 list.remove(list.size()-1);
//             }
//             if(operations[i] =="D") {
//                 list.add(list.get(list.size()-1)*2);
//             }
//             if(operations[i] =="+")  {
//                 list.add(list.get(list.size()-1)+list.get(list.size()-2));
//             }         
            
//         }
//         int sum=0;
//         for(int i=0;i<list.size()-1;i++) {
//             sum +=list.get(i);
//         }
//         return sum;
//     }
// }
class Solution {
    public int calPoints(String[] ops) {
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<ops.length;i++){
            if(ops[i].equals("+")){
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
            } else if(ops[i].equals("D")){
                list.add(list.get(list.size()-1)*2);
            } else if(ops[i].equals("C")){
                list.remove(list.size()-1);
            } else {
                list.add(Integer.valueOf(ops[i]));
            }
        }
        for(int i=0;i<list.size();i++){
            res +=list.get(i);
        }
        return res;
    }
}
