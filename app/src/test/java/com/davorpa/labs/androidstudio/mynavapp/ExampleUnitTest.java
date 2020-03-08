package com.davorpa.labs.androidstudio.mynavapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.inOrder;
import static org.powermock.api.mockito.PowerMockito.*;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 * @see <a href="https://github.com/robolectric/robolectric/wiki/Using-PowerMock">Testing with Robolectric+PowerMock</a>
 * @see <a href="https://github.com/powermock/powermock/wiki/Mockito">Testing with PowerMock+Mockito</a>
 */
@RunWith(PowerMockRunner.class)
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*" })
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}
