package com.example.tianfei.myjni_2;

import com.example.tianfei.myjni_2.strategy.ConnctManager;

import org.junit.Test;

import static org.junit.Assert.*;

import static com.example.tianfei.myjni_2.strategy.ConnctManager.getInstance;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test01() {
       getInstance().connect();
    }
}