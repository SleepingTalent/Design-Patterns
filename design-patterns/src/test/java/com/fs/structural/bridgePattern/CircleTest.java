package com.fs.structural.bridgePattern;

import com.fs.common.BaseUnitTest;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CircleTest extends BaseUnitTest {

    Circle circle;

    @Mock
    DrawAPI drawAPI;

    @Test
    public void circle_callsExpectedMethod() {
        Shape redCircle = new Circle(100,100,10,drawAPI);
        redCircle.draw();

        verify(drawAPI, times(1)).drawCircle(eq(10),eq(100),eq(100));
    }
}
