public class FindLongestWordEx{
    public static  void main (String [] ards){
        String s= "I like Mastercard Technologies";
        FindLongestWordEx ex= new FindLongestWordEx();
        String[] str= ex.findLongestWordAndLength(s);
        System.out.println("longest Word:"+str[1]);
        System.out.println("longest Word length:"+str[0]);
    }

    public String[] findLongestWordAndLength(String line){

        int l=0;
        String longWord="";
        for(String str:line.split(" ")){
            if(l==0) {
                l = str.length();
                longWord=str;
            }else{
                if(l < str.length()){
                    l = str.length();
                    longWord=str;
                }
            }
        }
        String[] ret = new String[2];
        ret[0] = String.valueOf(l);
        ret[1] = String.valueOf(longWord);
        return ret;
    }
}
