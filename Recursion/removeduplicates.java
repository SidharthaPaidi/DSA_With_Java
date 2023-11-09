public class removeduplicates {
    public static void remdup(String str,StringBuilder sb,boolean map[],int idx ){
      if(idx == str.length()){
        System.out.println(sb);
        return;
      }  
      char currchar = str.charAt(idx);
      if(map[currchar-'a']==true){
        remdup(str, sb, map, idx+1);
      }else{
        map[currchar-'a'] = true;
        remdup(str, sb.append(currchar), map, idx);
      }

    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        remdup(str, new StringBuilder(""),new boolean[26] , 0);
    }
}
