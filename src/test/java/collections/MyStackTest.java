package collections;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.MyStack;

public class MyStackTest {

    private MyStack<Integer> testingStack;

    @BeforeMethod
    public void initStack() {
        testingStack = new MyStack<>();
    }

    @Test(groups = "additionTests")
    public void testInitialSize() {
        Assert.assertEquals(testingStack.size(), 0);
    }

    @Test(groups = "additionTests")
    public void testPush() {
        testingStack.push(6);
        Assert.assertEquals(testingStack.size(), 1);
    }
}
