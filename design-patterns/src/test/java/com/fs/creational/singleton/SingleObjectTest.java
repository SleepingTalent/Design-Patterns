package com.fs.creational.singleton;

import com.fs.common.BaseUnitTest;
import org.junit.Assert;
import org.junit.Test;

public class SingleObjectTest extends BaseUnitTest {

    @Test
    public void message_returnedAsExpected() {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        Assert.assertEquals("Hello World!",object.getMessage());
    }
}
