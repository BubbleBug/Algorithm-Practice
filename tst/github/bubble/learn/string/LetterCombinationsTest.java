package github.bubble.learn.string;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LetterCombinationsTest {
    LetterCombinations letterCombinations;
    @Before
    public void setUp() throws Exception {
        letterCombinations=new LetterCombinations();
    }

    @Test
    public void testLetterCombinationsOfOneChar0() throws Exception {
        List<String> testList=new ArrayList<String>();
        testList.add("0");
        assertEquals(testList,letterCombinations.letterCombinations("0"));
    }
    @Test
    public void testLetterCombinationsOfOneChar1() throws Exception {
        List<String> testList=new ArrayList<String>();
        testList.add("1");
        assertEquals(testList, letterCombinations.letterCombinations("1"));
    }
    @Test
    public void testLetterCombinationsOfOneChar2() throws Exception {
        List<String> testList=new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        assertEquals(testList, letterCombinations.letterCombinations("2"));
    }
    @Test
    public void testLetterCombinationsOfOneChar7() throws Exception {
        List<String> testList=new ArrayList<String>();
        testList.add("p");
        testList.add("q");
        testList.add("r");
        testList.add("s");
        assertEquals(testList, letterCombinations.letterCombinations("7"));
    }

    @Test
    public void testLetterCombinationsOfTwoChars1() throws Exception {
        List<String> testList=new ArrayList<String>();
        testList.add("01");
        assertEquals(testList, letterCombinations.letterCombinations("01"));
    }

    @Test
    public void testLetterCombinationsOfTwoChars2() throws Exception {
        List<String> testList=new ArrayList<String>();
        testList.add("0a");
        testList.add("0b");
        testList.add("0c");
        assertEquals(testList, letterCombinations.letterCombinations("02"));
    }
    @Test
    public void testLetterCombinationsOfTwoChars3() throws Exception {
        List<String> testList=new ArrayList<String>();
        testList.add("ad");
        testList.add("ae");
        testList.add("af");
        testList.add("bd");
        testList.add("be");
        testList.add("bf");
        testList.add("cd");
        testList.add("ce");
        testList.add("cf");
        assertEquals(testList, letterCombinations.letterCombinations("23"));
    }
}