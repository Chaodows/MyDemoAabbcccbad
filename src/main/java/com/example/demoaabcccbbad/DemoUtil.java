package com.example.demoaabcccbbad;

/**
 * <p>
 * <br>==========================
 * <br> 公司：
 * <br> 开发：zhichao
 * <br> 版本：1.0
 * <br> 创建时间: 2025/7/22: 1:11
 * <br>==========================
 */
public class DemoUtil {
    public static String delete(String input) {
        return new RemoveDemo().process(input);
    }

    public static String replace(String input) {
        return new ReplaceDemo().process(input);
    }
}
