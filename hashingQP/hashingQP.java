import java.util.ArrayList;

public class hashingQP {
    public static class QuadraticProbing {
        String[] hashTable;
        int usedCellNumber;

        // constructor
        public QuadraticProbing(int size) {
            hashTable = new String[size];
            usedCellNumber = 0;

        }

        // HashFunction
        public int modASCII(String x, int M) {
            char[] ch;
            ch = x.toCharArray();
            int i, sum;
            for (i = 0, sum = 0; i < x.length(); i++) {
                sum += ch[i];
            }
            return sum % M;
        }

        // LoadFactor
        public double getLoadFactor() {
            double loadFactor = usedCellNumber * 1.0 / hashTable.length;
            return loadFactor;
        }

        // rehash funchtion
        public void rehashKeys(String newStringToBeInserted) {
            usedCellNumber = 0;
            ArrayList<String> data = new ArrayList<String>();
            for (String s : hashTable) {
                if (s != null)
                    data.add(s);
            }
            data.add(newStringToBeInserted);
            hashTable = new String[hashTable.length * 2];
            for (String s : data) {
                insertHashTable(s);
            }

        }

        // insert function
        public void insertHashTable(String word) {
            double loadFactor = getLoadFactor();
            if (loadFactor > 0.75) {
                rehashKeys(word);
            } else {
                int index = modASCII(word, hashTable.length);
                int counter = 0;
                for (int i = index; i < index + hashTable.length; i++) {
                    int newIndex = (index + (counter * counter)) % hashTable.length;
                    if (hashTable[newIndex] == null) {
                        hashTable[newIndex] = word;
                        System.out.println("The " + word + " successfully inserted at location: " + newIndex);
                        break;
                    } else {
                        System.out.println(newIndex + " is already occupied . Trying next empty cell");
                    }
                    counter++;
                }
            }
            usedCellNumber++;
        }

        public void displayHashTable() {
            if (hashTable == null) {
                System.out.println("\nHashTable does not exists");
                return;
            } else {
                System.out.println("----------HashTable----------");
                for (int i = 0; i < hashTable.length; i++) {
                    System.out.println("Index " + i + ", key:" + hashTable[i]);
                }
            }
        }
        //display
        public boolean searchHashTable(String word){
            int index = modASCII(word, hashTable.length);
            for (int i = index; i < index+hashTable.length; i++) {
                int newIndex = i % hashTable.length;
                if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                  System.out.println(word +" found at location: "+ newIndex);
                  return true;
                }
              }
              System.out.println(word +" not found in hasbTable");
              return false;
        }

        public void deleteKeyHashTable(String word) {
            int index = modASCII(word, hashTable.length);
            for (int i = index; i<index+hashTable.length; i++) {
              int newIndex = i % hashTable.length;
              if (hashTable[newIndex] != null && hashTable[newIndex].equals(word)) {
                hashTable[newIndex] = null;
                System.out.println(word +" has been deleted from HashTable");
                return;
              }
            }
            System.out.println(word +" not found in HashTable");
          }
    }
    public static void main(String[] args) {
        QuadraticProbing qp = new QuadraticProbing(13);
        qp.insertHashTable("Sidhartha");
        //  linearprobing.displayHashTable();
        qp.insertHashTable("the");
        qp.insertHashTable("Genius");
        qp.insertHashTable("man");
        qp.insertHashTable("paidi");
        qp.insertHashTable("Tea");
        qp.insertHashTable("code");
        qp.displayHashTable();
    }
}
