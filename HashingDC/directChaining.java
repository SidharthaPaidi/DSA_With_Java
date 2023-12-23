import java.util.ArrayList;
import java.util.LinkedList;

/**
 * directChaning
 */
public class directChaining {
    /**
     * DirectChaning
     */ 
    public static class DirectChaning {
        LinkedList<String>[] hashTable;
        int maxChainSize = 5;

        public DirectChaning(int size){
            hashTable = new LinkedList[size];
        }

        public int modASCIIHashFunction(String word , int M){
            char[] ch;
            ch = word.toCharArray();
            int i , sum;
            for(sum=0,i = 0;i<word.length();i++){
                sum += ch[i];

            }
            return sum % M;
        }
        public void insertHashTable(String word){
            int newIndex = modASCIIHashFunction(word, hashTable.length);
            if(hashTable[newIndex] == null){
                hashTable[newIndex] = new LinkedList<String>();
                hashTable[newIndex].add(word);
            }else {
                 hashTable[newIndex].add(word);
            }
        }

        public void displayHashTable(){
            if(hashTable == null){
                System.out.println("HashTable does not Exist");
                return;
            }else{
                System.out.println("--------------HashTable---------------");
                for(int i  = 0;i<hashTable.length;i++){
                    System.out.println("Index : "+ i + ", key : "+ hashTable[i]);
                }
            }
        }

        public boolean searchHashTable(String word){
            int newIndex = modASCIIHashFunction(word, hashTable.length);
            if(hashTable[newIndex]!=null && hashTable[newIndex].contains(word)){
                System.out.println("\n" + "\""+word + "\""+" found in hash Table at location: "+ newIndex);
                return true;
            }else{
                System.out.println("\n" + "\""+word + "\""+" is not found in hashTable");
                return false;
            }
        }

        public boolean deleteKeyHashTable(String word){
            int newIndex = modASCIIHashFunction(word, hashTable.length);
            boolean result = searchHashTable(word);
            if (result) {
                hashTable[newIndex].remove(word);
                System.out.println("\n" + "\""+word + "\""+" deleted from hash Table which was at location: "+ newIndex);
                return true;
            }else{
                System.out.println("\n" + "\""+word + "\""+" is not found in hashTable");
                return false;
            }
        }
        
    }
    public static void main(String[] args) {
        DirectChaning directChaning = new DirectChaning(15);
        directChaning.insertHashTable("Sidhartha");
        directChaning.insertHashTable("the");
        directChaning.insertHashTable("Genius");
        directChaning.insertHashTable("man");
        directChaning.insertHashTable("paidi");
        directChaning.insertHashTable("Tea");
        directChaning.insertHashTable("code");
        directChaning.displayHashTable();
        
        directChaning.deleteKeyHashTable("code");
        directChaning.searchHashTable("code");
    }
}