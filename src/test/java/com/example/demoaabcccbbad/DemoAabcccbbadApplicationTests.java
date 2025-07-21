package com.example.demoaabcccbbad;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = DemoAabcccbbadApplication.class)
class DemoAabcccbbadApplicationTests {

    @Test
    void crush_NoChange() {
        assertEquals("abc", DemoUtil.delete("abc"));
    }

    @Test
    void crush_SingleRemoval() {
        assertEquals("", DemoUtil.delete("aaa"));
    }

    @Test
    void case_1() {
        assertEquals("d", DemoUtil.delete("aabcccbbad"));
    }

    @Test
    void case_2() {
        assertEquals("ac", DemoUtil.delete("aabbbac"));
    }

    @Test
    void replace_NoChange() {
        assertEquals("abc", DemoUtil.replace("abc"));
    }

    @Test
    void replace_SingleReplacement() {
        assertEquals("", DemoUtil.replace("aaa"));
    }

    @Test
    void replace_ExampleCase() {
        assertEquals("d", DemoUtil.replace("abcccbad"));
    }

    @Test
    void replace_ChainReplacement() {
        assertEquals("aa", DemoUtil.replace("bbba"));
    }

    @Test
    void replace_FourChars() {
        assertEquals("b", DemoUtil.replace("cccc"));
    }

    @Test
    void replace_BoundaryCase() {
        assertEquals("", DemoUtil.replace("aaaa"));
    }

}
