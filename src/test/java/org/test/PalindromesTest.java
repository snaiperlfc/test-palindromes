package org.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromesTest {

    @Test
    void testExample1() {
        String s = "babad";
        String expected = "aba";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testExample2() {
        String s = "cbbd";
        String expected = "bb";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSingleCharacter() {
        String s = "a";
        String expected = "a";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAllSameCharacters() {
        String s = "bbbbbbbbbb";
        String expected = "bbbbbbbbbb";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testNoPalindromicSubstring() {
        String s = "abcdefg";
        String expected = "g";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testEmptyString() {
        String s = "";
        String expected = "";
        String actual = new LongestPalindromicSubstring().longestPalindrome(s);
        Assertions.assertEquals(expected, actual);
    }
}
