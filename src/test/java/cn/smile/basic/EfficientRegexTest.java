package cn.smile.basic;

import org.junit.Test;

import java.util.regex.Pattern;

public class EfficientRegexTest {

    /**
     * 贪婪模式
     * */
    @Test
    public void regexGreedyTest(){
        String text = "abbc";
        String pattern = "^ab{1,3}bc$";
        boolean isMatch = Pattern.matches(pattern, text);
        System.out.println(isMatch);
    }

    /**
     * 懒惰模式
     * */
    @Test
    public void regexReluctantTest(){
        String text = "abbc";
        String pattern = "^ab{1,3}?bc$";
        boolean isMatch = Pattern.matches(pattern, text);
        System.out.println(isMatch);
    }

    /**
     * 独占模式
     * */
    @Test
    public void regexPossessiveTest(){
        String text = "abbc";
        String pattern = "^ab{1,3}+bc$";
        boolean isMatch = Pattern.matches(pattern, text);
        System.out.println(isMatch);
    }
}
