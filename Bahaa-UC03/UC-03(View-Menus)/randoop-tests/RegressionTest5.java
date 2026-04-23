import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        data.Menu menu18 = menuResult1.getMenu();
        boolean boolean19 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        boolean boolean17 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass18 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.lang.Class<?> wildcardClass20 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        data.Menu menu16 = menuResult1.getMenu();
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass15 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        boolean boolean14 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        boolean boolean18 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        boolean boolean18 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        java.lang.String str18 = menuResult1.getErrorMessage();
        data.Menu menu19 = menuResult1.getMenu();
        boolean boolean20 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(menu19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        data.Menu menu15 = menuResult1.getMenu();
        java.lang.String str16 = menuResult1.getErrorMessage();
        data.Menu menu17 = menuResult1.getMenu();
        boolean boolean18 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        data.Menu menu13 = menuResult1.getMenu();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        data.Menu menu13 = menuResult1.getMenu();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        data.Menu menu16 = menuResult1.getMenu();
        data.Menu menu17 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass18 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        data.Menu menu15 = menuResult1.getMenu();
        data.Menu menu16 = menuResult1.getMenu();
        data.Menu menu17 = menuResult1.getMenu();
        data.Menu menu18 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(menu18);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
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
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }
}

