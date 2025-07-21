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
public class RemoveDemo extends AbstractProcessClass{
    @Override
    protected String handleRepeated(String s, int start, int end, int len) {
        return "";
    }

    @Override
    protected void afterProcess(String current, String oldSegment, String replacement) {
        System.out.println("-> " + current);
    }
}
