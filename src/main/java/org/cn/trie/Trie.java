package org.cn.trie;

public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
        System.out.println("Trie Node Created");
    }

    public void insert(String word) {
        TrieNode node = root;           //Assigning root to a temp node
        for (int i = 0; i < word.length(); i++) {    //Traversing over word
            TrieNode curr = node.children.get(word.charAt(i));   //Checking if that Character already exist in Trie
            if (curr == null) {   //if doesnt exist
                curr = new TrieNode();     //create an empty node
                node.children.put(word.charAt(i), curr);   //insert Character to the children and link to empty next node
            }
            node = curr;  //if character already exist in trie move to next word
        }
        node.endOfString = true;  //seting endOfString true for last word
        System.out.println(word + " - Inserted SuccessFully");
    }

    /**
     * search
     * 1. string doesn't exist in trie (Compare root)
     * 2. string exists in trie (compare each till eos)
     * 3. string is just a prefix and doesn't exist in trie(compare till end of word and check if next node is eos true or not)
     */

    public boolean search(String word) {
        TrieNode currNode = root;
        for (int i = 0; i < word.length(); i++) {
            Character ch = word.charAt(i);
            TrieNode node = currNode.children.get(ch);
            if (node == null) {    //1st case
                System.out.println(word + " doesnt exist in Trie");
                return false;
            }
            currNode = node;
        }
        if (currNode.endOfString) { //2nd case
            System.out.println(word + " exists in Trie");
            return true;
        } else {
            System.out.println(word + " is a prefix");
            return false;   //only prefix
        }
    }

    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        if (currNode.children.size() > 1) { //1st case prefix
            delete(currNode, word, index + 1);
            return false;
        }
        if (index == word.length() - 1) {  //last character 2nd case
            if (currNode.children.size() > 1) {
                currNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (currNode.endOfString) {  //3rd case
            delete(currNode, word, index + 1);
            return false;
        }
        canThisNodeBeDeleted = delete(currNode, word, index + 1);   //4th case -- no niode depends on this
        if (canThisNodeBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        } else {
            System.out.println(word + " doesn't exist so cant be deleted");
        }
    }
}
