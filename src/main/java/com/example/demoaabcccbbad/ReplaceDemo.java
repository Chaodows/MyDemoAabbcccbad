package com.example.demoaabcccbbad;

/**
 * <p>
 * <br>==========================
 * <br> 公司：
 * <br> 开发：zhichao
 * <br> 版本：1.0
 * <br> 创建时间: 2025/7/22: 1:07
 * <br>==========================
 */
public class ReplaceDemo extends AbstractProcessClass{
    @Override
    protected String handleRepeated(String s, int start, int end, int len) {
        char c = s.charAt(start);
        return (c == 'a') ? "" : String.valueOf((char)(c - 1));
    }

    @Override
    protected void afterProcess(String current, String oldSegment, String replacement) {
        System.out.print("-> " + current);
        if (!replacement.isEmpty()) {
            System.out.println(", " + oldSegment + " is replaced by " + replacement);
        } else {
            System.out.println();
        }
    }
}
