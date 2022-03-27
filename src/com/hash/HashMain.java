package com.hash;

public class HashMain {

    public static void main(String[] args) {

        String str = "To be or not to be";

        HashTable hash = new HashTable(6);
        hash.countWords(str);

    }

}

