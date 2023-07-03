package com.mehrdad.falahati.algorithms.trie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie {
    public static class Node {
        private final char value;
        private final Map<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value ;
        }

        public boolean isEndOfWord() {
            return isEndOfWord;
        }

        public void setEndOfWord(boolean endOfWord) {
            isEndOfWord = endOfWord;
        }

        public boolean hasChild(char ch) {
            return children.containsKey(ch);
        }

        public void addChild(char ch) {
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch) {
            return children.get(ch);
        }

        public List<Node> getChildren() {
            return children.values().stream().toList();
        }

        public boolean hasChildren() {
            return !children.isEmpty();
        }

        public void removeChild(char ch) {
            children.remove(ch);
        }

        public char getValue() {
            return value;
        }
    }

    final Node root = new Node('$');

    public void insert(String word) {
        var current = root;
        for (char ch : word.toCharArray()) {
            if (!current.hasChild(ch)) {
                current.addChild(ch);
            }
            current = current.getChild(ch);
        }
        current.setEndOfWord(true);
    }

    public boolean contains(String word) {
        if (word == null)
            return false;
        var current = root;
        for (char ch: word.toCharArray()) {
            if (!current.hasChild(ch))
                return false;
            current = current.getChild(ch);
        }
        return current.isEndOfWord;
    }

    public void remove(String word) {
        if (word == null)
            return;
        remove(root, word, 0);
    }

    public void remove(Node root, String word, int index) {
        if (index == word.length()) {
            root.isEndOfWord = false;
            return;
        }

        char ch = word.charAt(index);
        var child = root.getChild(ch);
        if (child == null)
            return;

        remove(child, word, index + 1);

        if (!child.hasChildren() && !child.isEndOfWord)
            child.removeChild(ch);
    }
}
