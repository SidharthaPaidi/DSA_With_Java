public class uppercaseconv {
    public static void UpppercaseConv(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            sb = sb.append(ch);
        }
        System.out.println(sb);

    }

    public static String compress(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();

            }
        }
        return newstr;

    }

    public static void main(String[] args) {
        String str = "sidhu";
         String as ="aaaggmmn";
        UpppercaseConv(str);
       
        System.out.println(compress(as));
    }
}
