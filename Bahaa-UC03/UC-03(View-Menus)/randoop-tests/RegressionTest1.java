import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = menu8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = menu6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = menu5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = menu6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = menu9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = menu9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
        java.lang.String str16 = menuResult1.getErrorMessage();
        boolean boolean17 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = menu12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = menu6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
        data.Menu menu16 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = menu11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
        java.lang.String str17 = menuResult1.getErrorMessage();
        boolean boolean18 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass19 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = menu6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = menu5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
        data.Menu menu16 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = menu8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = menu13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
        boolean boolean17 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass18 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = menu5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        data.Menu menu16 = menuResult1.getMenu();
        java.lang.String str17 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass18 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = menu4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = menu12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = menu14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        data.Menu menu16 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = menu12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = menu5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = menu6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = menu8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = menu13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = menu11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
        boolean boolean17 = menuResult1.isSuccess();
        java.lang.String str18 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        data.Menu menu15 = menuResult1.getMenu();
        boolean boolean16 = menuResult1.isSuccess();
        boolean boolean17 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass18 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        boolean boolean16 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = menu14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = menu12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = menu11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = menu9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        data.Menu menu15 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
        data.Menu menu16 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = menu16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = menu8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        boolean boolean14 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = menu9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = menu6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = menu15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = menu15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.String str17 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass18 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = menu14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        data.Menu menu16 = menuResult1.getMenu();
        data.Menu menu17 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = menu8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        data.Menu menu16 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        boolean boolean16 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass4 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = menu4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = menu7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

