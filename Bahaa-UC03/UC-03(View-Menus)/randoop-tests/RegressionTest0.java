import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        java.lang.Class<?> wildcardClass2 = menuService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass4 = menuResult3.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass4 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass8 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass6 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass6 = menuResult5.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass10 = menuResult9.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass8 = menuResult7.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass12 = menuResult11.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass12 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass14 = menuResult13.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass14 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass16 = menuResult15.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass10 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass18 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass18 = menuResult17.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass16 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass22 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass20 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass20 = menuResult19.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass22 = menuResult21.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass24 = menuResult23.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass24 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass26 = menuResult25.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass26 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass28 = menuResult27.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass28 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass30 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass30 = menuResult29.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass32 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass34 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass34 = menuResult33.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass36 = menuResult35.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass40 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass32 = menuResult31.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass40 = menuResult39.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass42 = menuResult41.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass38 = menuResult37.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass44 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass38 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass44 = menuResult43.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass42 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass36 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass46 = menuResult45.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass48 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass46 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass48 = menuResult47.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass50 = menuResult49.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass56 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass56 = menuResult55.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass52 = menuResult51.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass58 = menuResult57.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass50 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass60 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass58 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass54 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass62 = menuResult61.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass64 = menuResult63.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass62 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass52 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass60 = menuResult59.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass64 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass54 = menuResult53.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass66 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass68 = menuResult67.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass68 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass66 = menuResult65.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass70 = menuResult69.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass70 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass72 = menuResult71.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass72 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass74 = menuResult73.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass74 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass76 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass76 = menuResult75.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass78 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass80 = menuResult79.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass80 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass78 = menuResult77.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass82 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass82 = menuResult81.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass84 = menuResult83.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass84 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass86 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass86 = menuResult85.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass88 = menuResult87.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass90 = menuResult89.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass88 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass90 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass92 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult97 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass98 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(menuResult95);
        org.junit.Assert.assertNotNull(menuResult97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult97 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(menuResult95);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult97 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult99 = menuService1.getMenuForRestaurant("");
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(menuResult95);
        org.junit.Assert.assertNotNull(menuResult97);
        org.junit.Assert.assertNotNull(menuResult99);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass94 = menuResult93.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass94 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass96 = menuResult95.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(menuResult95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult97 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass98 = menuResult97.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(menuResult95);
        org.junit.Assert.assertNotNull(menuResult97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass92 = menuResult91.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("");
        java.lang.Class<?> wildcardClass96 = menuService1.getClass();
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(menuResult95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        data.MenuRepository menuRepository0 = null;
        business.MenuService menuService1 = new business.MenuService(menuRepository0);
        business.MenuResult menuResult3 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult5 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult7 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult9 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult11 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult13 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult15 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult17 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult19 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult21 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult23 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult25 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult27 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult29 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult31 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult33 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult35 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult37 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult39 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult41 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult43 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult45 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult47 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult49 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult51 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult53 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult55 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult57 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult59 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult61 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult63 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult65 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult67 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult69 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult71 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult73 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult75 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult77 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult79 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult81 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult83 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult85 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult87 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult89 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult91 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult93 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult95 = menuService1.getMenuForRestaurant("");
        business.MenuResult menuResult97 = menuService1.getMenuForRestaurant("");
        // The following exception was thrown during execution in test generation
        try {
            business.MenuResult menuResult99 = menuService1.getMenuForRestaurant("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"data.MenuRepository.menuExistsForRestaurant(String)\" because \"this.menuRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult3);
        org.junit.Assert.assertNotNull(menuResult5);
        org.junit.Assert.assertNotNull(menuResult7);
        org.junit.Assert.assertNotNull(menuResult9);
        org.junit.Assert.assertNotNull(menuResult11);
        org.junit.Assert.assertNotNull(menuResult13);
        org.junit.Assert.assertNotNull(menuResult15);
        org.junit.Assert.assertNotNull(menuResult17);
        org.junit.Assert.assertNotNull(menuResult19);
        org.junit.Assert.assertNotNull(menuResult21);
        org.junit.Assert.assertNotNull(menuResult23);
        org.junit.Assert.assertNotNull(menuResult25);
        org.junit.Assert.assertNotNull(menuResult27);
        org.junit.Assert.assertNotNull(menuResult29);
        org.junit.Assert.assertNotNull(menuResult31);
        org.junit.Assert.assertNotNull(menuResult33);
        org.junit.Assert.assertNotNull(menuResult35);
        org.junit.Assert.assertNotNull(menuResult37);
        org.junit.Assert.assertNotNull(menuResult39);
        org.junit.Assert.assertNotNull(menuResult41);
        org.junit.Assert.assertNotNull(menuResult43);
        org.junit.Assert.assertNotNull(menuResult45);
        org.junit.Assert.assertNotNull(menuResult47);
        org.junit.Assert.assertNotNull(menuResult49);
        org.junit.Assert.assertNotNull(menuResult51);
        org.junit.Assert.assertNotNull(menuResult53);
        org.junit.Assert.assertNotNull(menuResult55);
        org.junit.Assert.assertNotNull(menuResult57);
        org.junit.Assert.assertNotNull(menuResult59);
        org.junit.Assert.assertNotNull(menuResult61);
        org.junit.Assert.assertNotNull(menuResult63);
        org.junit.Assert.assertNotNull(menuResult65);
        org.junit.Assert.assertNotNull(menuResult67);
        org.junit.Assert.assertNotNull(menuResult69);
        org.junit.Assert.assertNotNull(menuResult71);
        org.junit.Assert.assertNotNull(menuResult73);
        org.junit.Assert.assertNotNull(menuResult75);
        org.junit.Assert.assertNotNull(menuResult77);
        org.junit.Assert.assertNotNull(menuResult79);
        org.junit.Assert.assertNotNull(menuResult81);
        org.junit.Assert.assertNotNull(menuResult83);
        org.junit.Assert.assertNotNull(menuResult85);
        org.junit.Assert.assertNotNull(menuResult87);
        org.junit.Assert.assertNotNull(menuResult89);
        org.junit.Assert.assertNotNull(menuResult91);
        org.junit.Assert.assertNotNull(menuResult93);
        org.junit.Assert.assertNotNull(menuResult95);
        org.junit.Assert.assertNotNull(menuResult97);
    }
}

