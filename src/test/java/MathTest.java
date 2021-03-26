import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MathTest {

    @DataProvider
    public Object[][] testEqualsSum() {
        return new Object[][]{
                {4, 2, 2},
                {0, -1, 1},
                {-1, 0, -1}
        };
    }
    @Test(dataProvider = "testEqualsSum")
    public void testSum(Object a, Object b, Object c){
        Assert.assertEquals(a, new MyMath().sumTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotSum() {
        return new Object[][]{
                {-1, "two"},
                {"0", -1},
                {null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotSum")
    public void testNotSum(Object b, Object c) {
        Assert.assertTrue(new MyMath().sumTest(b,c) instanceof Exception);
    }

    @DataProvider
    public Object[][] testEqualsSubtr() {
        return new Object[][]{
                {0, 2, 2},
                {-2, -1, 1},
                {1, 0, -1}
        };
    }
    @Test(dataProvider = "testEqualsSubtr")
    public void testSubtr(Object a, Object b, Object c){
        Assert.assertEquals(a, new MyMath().subtrTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotSubtr() {
        return new Object[][]{
                {-1, "one"},
                {"0", -1},
                {null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotSubtr")
    public void testNotSubtr(Object b, Object c) {
        Assert.assertTrue(new MyMath().subtrTest(b,c) instanceof Exception);
    }

    @DataProvider
    public Object[][] testEqualsMultipli() {
        return new Object[][]{
                {4, 2, 2},
                {-1, -1, 1},
                {0, 0, -1}
        };
    }
    @Test(dataProvider = "testEqualsMultipli")
    public void testMultipli(Object a, Object b, Object c){
        Assert.assertEquals(a, new MyMath().multipliTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotMultipli() {
        return new Object[][]{
                {-1, "one"},
                {"0", -1},
                {null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotMultipli")
    public void testNotMultipli(Object b, Object c) {
        Assert.assertTrue(new MyMath().multipliTest(b,c) instanceof Exception);
    }

    @DataProvider
    public Object[][] testEqualsDivis() {
        return new Object[][]{
                {2, 4, 2},
                {-1, -1, 1},
                {0, 0, -1}
        };
    }
    @Test(dataProvider = "testEqualsDivis")
    public void testDivis(Object a, Object b, Object c){
        Assert.assertEquals(a, new MyMath().divisTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotDivis() {
        return new Object[][]{
                {-1, "one"},
                {"0", -1},
                {null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotDivis")
    public void testNotDivis(Object b, Object c) {
        Assert.assertTrue(new MyMath().divisTest(b,c) instanceof Exception);
    }
}
