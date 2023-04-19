package org.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {

    @Test
    void longestPalindrome() {


        String t1 = Palindromes.longestPalindrome("babad");

        String t2 = Palindromes.longestPalindrome("cbbd");


        assertEquals("aba", t1);

        assertEquals("bb", t2);

    }
}
