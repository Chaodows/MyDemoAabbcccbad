package com.example.demoaabcccbbad;

/**
 * <p>
 * <br>==========================
 * <br> 公司：
 * <br> 开发：zhichao
 * <br> 版本：1.0
 * <br> 创建时间: 2025/7/22: 1:04
 * <br>==========================
 */
public abstract class AbstractProcessClass {

    public String process(String input) {
        String s = input;
        System.out.println("Input: " + s);
        while (true) {
            boolean found = false;
            int i = 0;
            while (i < s.length()) {
                int j = i;
                while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                    j++;
                }
                int len = j - i;
                if (len >= 3) {
                    String oldSegment = s.substring(i, j);
                    String replacement = handleRepeated(s, i, j, len);
                    s = s.substring(0, i) + replacement + s.substring(j);
                    found = true;
                    afterProcess(s, oldSegment, replacement);
                    break;
                }
                i = j;
            }
            if (!found) break;
        }
        return s;
    }

    protected abstract String handleRepeated(String s, int start, int end, int len);

    protected abstract void afterProcess(String current, String oldSegment, String replacement);

}
