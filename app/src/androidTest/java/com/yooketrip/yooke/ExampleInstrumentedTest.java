package com.yooketrip.yooke;
/**
 * Created by DingYuQing(Scott_Ding)&Android Studio on 11/27/2017.
 */
// Filename:Yooke_ExampleInstrumentedTest.java(Yooke\app\src\androidTest\java\com\yooketrip\yooke\ExampleInstrumentedTest.java)
//IDE Android Studio 2.3.3
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.yooketrip.yooke", appContext.getPackageName());
    }
}
