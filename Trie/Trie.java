import java.util.*;

public class Trie {
    public static class TrieNode {
        Map<Character, TrieNode> children;
        boolean endOfString;

        public TrieNode() {
            children = new HashMap<>();
            endOfString = false;
        }
    }

    public static class trie {
        private TrieNode root;

        public trie() {
            root = new TrieNode();
            System.out.println("Trie has been successfully created");
        }

        // Insert a node
        public void insert(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                TrieNode node = current.children.get(ch);
                if (node == null) {
                    node = new TrieNode();
                    current.children.put(ch, node);
                }
                current = node;
            }
            current.endOfString = true;
            System.out.println("Successfully inserted " + word + " in Trie");

        }

        // Search for a node
        public boolean search(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                TrieNode node = current.children.get(ch);
                if (node == null) {
                    System.out.println("Word : " + word + " is not present in the Trie");
                    return false;
                }
                current = node;
            }
            if (current.endOfString == true) {
                System.out.println("Word : " + word + " is present in the Trie");
                return true;
            } else {
                System.out.println(word + " is present as prefix in the Trie");

            }
            return current.endOfString;
        }

        // delete node helper method
        public boolean delete(TrieNode parentNode, String word, int index) {
            char ch = word.charAt(index);
            TrieNode currentNode = parentNode.children.get(ch);
            boolean canThisNodeBeDeleted;

            if (currentNode.children.size() > 1) {
                delete(currentNode, word, index + 1);
                return false;
            }
            if (index == word.length() - 1) {
                if (currentNode.children.size() >= 1) {
                    currentNode.endOfString = false;
                    return false;
                } else {
                    parentNode.children.remove(ch);
                    return true;
                }
            }
            if (currentNode.endOfString == true) {
                delete(currentNode, word, index + 1);
                return false;
            }
            canThisNodeBeDeleted = delete(currentNode, word, index + 1);
            if (canThisNodeBeDeleted) {
                parentNode.children.remove(ch);
                return true;
            } else {
                return false;
            }

        }

        public void delete(String word) {
            if (search(word) == true) {
                delete(root, word, 0);
            }
        }
    }

    public static void main(String[] args) {
        trie newTrie = new trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.search("APIS");
        newTrie.delete("APIS");
        newTrie.search("APIS");
        newTrie.search("API");
        
    }

}