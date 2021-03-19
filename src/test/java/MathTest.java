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
    public void testSum(int a, int b, int c){
        Assert.assertEquals(a, new MyMath().sumTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotSum() {
        return new Object[][]{
                {5, 2, 2},
                {1, -1, 1},
                {0, 0, -1}
        };
    }
    @Test(dataProvider = "testEqualsNotSum")
    public void testNotSum(int a, int b, int c) {
        Assert.assertNotEquals(a, new MyMath().sumTest(b, c), "Значения равны!");
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
    public void testSubtr(int a, int b, int c){
        Assert.assertEquals(a, new MyMath().subtrTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotSubtr() {
        return new Object[][]{
                {5, 2, 2},
                {1, -1, 1},
                {0, 0, -1}
        };
    }
    @Test(dataProvider = "testEqualsNotSubtr")
    public void testNotSubtr(int a, int b, int c) {
        Assert.assertNotEquals(a, new MyMath().subtrTest(b, c), "Значения равны!");
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
    public void testMultipli(int a, int b, int c){
        Assert.assertEquals(a, new MyMath().multipliTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotMultipli() {
        return new Object[][]{
                {5, 2, 2},
                {1, -1, 1},
                {-1, 0, -1}
        };
    }
    @Test(dataProvider = "testEqualsNotMultipli")
    public void testNotMultipli(int a, int b, int c) {
        Assert.assertNotEquals(a, new MyMath().multipliTest(b, c), "Значения равны!");
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
    public void testDivis(int a, int b, int c){
        Assert.assertEquals(a, new MyMath().divisTest(b, c), "Значения не равны!");
    }

    @DataProvider
    public Object[][] testEqualsNotDivis() {
        return new Object[][]{
                {5, 2, 2},
                {1, -1, 1},
                {1, 0, 1}
        };
    }
    @Test(dataProvider = "testEqualsNotDivis")
    public void testNotDivis(int a, int b, int c) {
        Assert.assertNotEquals(a, new MyMath().divisTest(b, c), "Значения равны!");
    }
}
