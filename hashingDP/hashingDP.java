import java.util.ArrayList;

public class hashingDP {
    public static class DoubleHashing {
        String[] hashTable;
        int noOfCellsUsedInHashTable;

        public DoubleHashing(int size) {
            hashTable = new String[size];
            noOfCellsUsedInHashTable = 0;
        }

        // HashFunction
        public int modASCII(String word, int M) {
            char[] ch;
            ch = word.toCharArray();
            int i, sum;
            for (i = 0, sum = 0; i < word.length(); i++) {
                sum += ch[i];
            }
            return sum % M;
        }

        // Rehash
        public void rehashKeys(String newStringToBeInserted) {
            noOfCellsUsedInHashTable = 0;
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

        // Display the hash table
        public void displayHashTable() {
            if (hashTable == null) {
                System.out.println("\nHashTable does not exits !");
                return;
            } else {
                System.out.println("\n---------- HashTable ---------");
                for (int i = 0; i < hashTable.length; i++) {
                    System.out.println("Index:" + i + ".   Key:" + hashTable[i]);
                }
            }
            System.out.println("\n");
        }
        // -------------------------------------------------------------------------

        private int addAllDigitsTogether(int sum) {
            int value = 0;
            while (sum > 0) {
                value = sum % 10;
                sum = sum / 10;
            }
            return value;
        }

        public int secondHashFunction(String x, int M) {
            char ch[];
            ch = x.toCharArray();
            int i, sum;
            for (sum = 0, i = 0; i < x.length(); i++) {
                sum += ch[i];
            }
            while (sum > hashTable.length) {
                sum = addAllDigitsTogether(sum);
            }

            return sum % M;

        }

        public double getLoadFactor() {
            return noOfCellsUsedInHashTable * 1.0 / hashTable.length;
        }

        public void insertHashTable(String value) {
            double loadFactor = getLoadFactor();
            if (loadFactor >= 0.75) {
                rehashKeys(value);
            } else {
                int x = modASCII(value, hashTable.length);
                int y = secondHashFunction(value, hashTable.length);
                for (int i = 0; i < hashTable.length; i++) {
                    int newIndex = (x + i * y) % hashTable.length;
                    if (hashTable[newIndex] == null) {
                        hashTable[newIndex] = value;
                        System.out.println(value + " inserted at location:" + newIndex);
                        break;
                    } else {
                        System.out.println(newIndex + " is occupied. Tryin next empty index..");
                    }

                }
            }
            noOfCellsUsedInHashTable++;

        }

    }
    public static void main(String[] args) {
        DoubleHashing dh = new DoubleHashing(15);
        dh.insertHashTable("Sidhartha");
        //  linearprobing.displayHashTable();
        dh.insertHashTable("the");
        dh.insertHashTable("Genius");
        dh.insertHashTable("man");
        dh.insertHashTable("paidi");
        dh.insertHashTable("Tea");
        dh.insertHashTable("code");
        dh.displayHashTable();
    }
}
