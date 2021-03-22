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
                {1, -1, "two"},
                {-1, "0", -1},
                {3, null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotSum", expectedExceptions = {ClassCastException.class, NullPointerException.class})
    public void testNotSum(Object a, Object b, Object c) {
        Assert.assertEquals(a, new MyMath().sumTest(b, c), "Значения не равны!");
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
                {-2, -1, "one"},
                {1, "0", -1},
                {3, null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotSubtr", expectedExceptions = {ClassCastException.class, NullPointerException.class})
    public void testNotSubtr(Object a, Object b, Object c) {
        Assert.assertEquals(a, new MyMath().subtrTest(b, c), "Значения не равны!");
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
                {-1, -1, "one"},
                {0, "0", -1},
                {3, null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotMultipli", expectedExceptions = {ClassCastException.class, NullPointerException.class})
    public void testNotMultipli(Object a, Object b, Object c) {
        Assert.assertEquals(a, new MyMath().multipliTest(b, c), "Значения не равны!");
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
                {-1, -1, "one"},
                {0, "0", -1},
                {3, null, 3}
        };
    }
    @Test(dataProvider = "testEqualsNotDivis", expectedExceptions = {ClassCastException.class, NullPointerException.class})
    public void testNotDivis(Object a, Object b, Object c) {
        Assert.assertEquals(a, new MyMath().divisTest(b, c), "Значения не равны!");
    }
}
