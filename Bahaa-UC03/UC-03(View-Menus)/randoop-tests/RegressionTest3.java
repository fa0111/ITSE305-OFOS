import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        data.Menu menu16 = menuResult1.getMenu();
        java.lang.String str17 = menuResult1.getErrorMessage();
        java.lang.String str18 = menuResult1.getErrorMessage();
        data.Menu menu19 = menuResult1.getMenu();
        boolean boolean20 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(menu19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        data.Menu menu10 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
        boolean boolean16 = menuResult1.isSuccess();
        boolean boolean17 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        boolean boolean14 = menuResult1.isSuccess();
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        data.Menu menu16 = menuResult1.getMenu();
        boolean boolean17 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = menu9.getClass();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        data.Menu menu19 = menuResult1.getMenu();
        java.lang.String str20 = menuResult1.getErrorMessage();
        data.Menu menu21 = menuResult1.getMenu();
        data.Menu menu22 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(menu21);
        org.junit.Assert.assertNull(menu22);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
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
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str17 = menuResult1.getErrorMessage();
        java.lang.String str18 = menuResult1.getErrorMessage();
        java.lang.String str19 = menuResult1.getErrorMessage();
        data.Menu menu20 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(menu20);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = menu11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        data.Menu menu17 = menuResult1.getMenu();
        data.Menu menu18 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = menu18.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(menu18);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        data.Menu menu17 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = menu17.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
        data.Menu menu17 = menuResult1.getMenu();
        java.lang.String str18 = menuResult1.getErrorMessage();
        java.lang.String str19 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
        boolean boolean16 = menuResult1.isSuccess();
        boolean boolean17 = menuResult1.isSuccess();
        data.Menu menu18 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass19 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        data.Menu menu16 = menuResult1.getMenu();
        data.Menu menu17 = menuResult1.getMenu();
        data.Menu menu18 = menuResult1.getMenu();
        java.lang.String str19 = menuResult1.getErrorMessage();
        data.Menu menu20 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(menu20);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.String str16 = menuResult1.getErrorMessage();
        data.Menu menu17 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        data.Menu menu15 = menuResult1.getMenu();
        boolean boolean16 = menuResult1.isSuccess();
        data.Menu menu17 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = menu5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        data.Menu menu10 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        java.lang.String str18 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        data.Menu menu16 = menuResult1.getMenu();
        data.Menu menu17 = menuResult1.getMenu();
        data.Menu menu18 = menuResult1.getMenu();
        boolean boolean19 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        data.Menu menu16 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        data.Menu menu18 = menuResult1.getMenu();
        boolean boolean19 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        data.Menu menu16 = menuResult1.getMenu();
        data.Menu menu17 = menuResult1.getMenu();
        data.Menu menu18 = menuResult1.getMenu();
        data.Menu menu19 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertNull(menu19);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        data.Menu menu16 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        data.Menu menu18 = menuResult1.getMenu();
        data.Menu menu19 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertNull(menu19);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        boolean boolean17 = menuResult1.isSuccess();
        java.lang.String str18 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        data.Menu menu17 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        data.Menu menu14 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = menu14.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        boolean boolean10 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        data.Menu menu19 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = menu19.getClass();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(menu19);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
        data.Menu menu17 = menuResult1.getMenu();
        boolean boolean18 = menuResult1.isSuccess();
        boolean boolean19 = menuResult1.isSuccess();
        data.Menu menu20 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(menu20);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
        data.Menu menu17 = menuResult1.getMenu();
        boolean boolean18 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass19 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        boolean boolean18 = menuResult1.isSuccess();
        data.Menu menu19 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass20 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(menu19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
        data.Menu menu16 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        data.Menu menu19 = menuResult1.getMenu();
        java.lang.String str20 = menuResult1.getErrorMessage();
        data.Menu menu21 = menuResult1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = menu21.getClass();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(menu19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(menu21);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
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
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }
}

