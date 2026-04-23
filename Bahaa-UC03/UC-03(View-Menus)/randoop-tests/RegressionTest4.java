import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        boolean boolean18 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        boolean boolean15 = menuResult1.isSuccess();
        boolean boolean16 = menuResult1.isSuccess();
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass16 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(menu18);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        boolean boolean15 = menuResult1.isSuccess();
        data.Menu menu16 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.lang.Class<?> wildcardClass14 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        boolean boolean15 = menuResult1.isSuccess();
        boolean boolean16 = menuResult1.isSuccess();
        boolean boolean17 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        boolean boolean19 = menuResult1.isSuccess();
        boolean boolean20 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
        data.Menu menu16 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass17 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.String str17 = menuResult1.getErrorMessage();
        boolean boolean18 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        data.Menu menu14 = menuResult1.getMenu();
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        data.Menu menu20 = menuResult1.getMenu();
        data.Menu menu21 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu20);
        org.junit.Assert.assertNull(menu21);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = menu10.getClass();
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
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        boolean boolean13 = menuResult1.isSuccess();
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass7 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
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
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
        boolean boolean17 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass5 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        boolean boolean12 = menuResult1.isSuccess();
        data.Menu menu13 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
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
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
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
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(menu16);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        boolean boolean18 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(menu19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
        boolean boolean11 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        boolean boolean17 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(menu18);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        java.lang.String str13 = menuResult1.getErrorMessage();
        boolean boolean14 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
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
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.String str13 = menuResult1.getErrorMessage();
        java.lang.String str14 = menuResult1.getErrorMessage();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        data.Menu menu11 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass9 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        data.Menu menu13 = menuResult1.getMenu();
        data.Menu menu14 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass8 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        data.Menu menu13 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        java.lang.String str10 = menuResult1.getErrorMessage();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass6 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
        java.lang.String str16 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(menu17);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        data.Menu menu11 = menuResult1.getMenu();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        java.lang.String str10 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
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
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        boolean boolean10 = menuResult1.isSuccess();
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
        java.lang.Class<?> wildcardClass13 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        data.Menu menu11 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        java.lang.String str22 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass23 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        data.Menu menu2 = menuResult1.getMenu();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
        java.lang.String str17 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        data.Menu menu16 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        boolean boolean11 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        java.lang.Class<?> wildcardClass12 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        java.lang.String str17 = menuResult1.getErrorMessage();
        data.Menu menu18 = menuResult1.getMenu();
        boolean boolean19 = menuResult1.isSuccess();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        data.Menu menu11 = menuResult1.getMenu();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
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
        boolean boolean13 = menuResult1.isSuccess();
        data.Menu menu14 = menuResult1.getMenu();
        data.Menu menu15 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(menu12);
        org.junit.Assert.assertNull(menu13);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        boolean boolean11 = menuResult1.isSuccess();
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        data.Menu menu10 = menuResult1.getMenu();
        boolean boolean11 = menuResult1.isSuccess();
        boolean boolean12 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        java.lang.String str13 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        data.Menu menu18 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        java.lang.String str14 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        java.lang.String str16 = menuResult1.getErrorMessage();
        boolean boolean17 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        boolean boolean11 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        boolean boolean14 = menuResult1.isSuccess();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        data.Menu menu3 = menuResult1.getMenu();
        boolean boolean4 = menuResult1.isSuccess();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        data.Menu menu14 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu14);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(menu8);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        data.Menu menu9 = menuResult1.getMenu();
        boolean boolean10 = menuResult1.isSuccess();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertNull(menu9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        data.Menu menu2 = menuResult1.getMenu();
        java.lang.String str3 = menuResult1.getErrorMessage();
        boolean boolean4 = menuResult1.isSuccess();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        data.Menu menu0 = null;
        business.MenuResult menuResult1 = business.MenuResult.success(menu0);
        boolean boolean2 = menuResult1.isSuccess();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        boolean boolean5 = menuResult1.isSuccess();
        java.lang.String str6 = menuResult1.getErrorMessage();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        boolean boolean6 = menuResult1.isSuccess();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        org.junit.Assert.assertNull(menu13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        data.Menu menu12 = menuResult1.getMenu();
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
        org.junit.Assert.assertNull(menu12);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        boolean boolean8 = menuResult1.isSuccess();
        java.lang.String str9 = menuResult1.getErrorMessage();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        java.lang.String str11 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        data.Menu menu10 = menuResult1.getMenu();
        java.lang.String str11 = menuResult1.getErrorMessage();
        java.lang.String str12 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertNull(menu2);
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(menu10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
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
        java.lang.String str12 = menuResult1.getErrorMessage();
        java.lang.String str13 = menuResult1.getErrorMessage();
        data.Menu menu14 = menuResult1.getMenu();
        boolean boolean15 = menuResult1.isSuccess();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        java.lang.String str6 = menuResult1.getErrorMessage();
        data.Menu menu7 = menuResult1.getMenu();
        boolean boolean8 = menuResult1.isSuccess();
        boolean boolean9 = menuResult1.isSuccess();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        boolean boolean13 = menuResult1.isSuccess();
        boolean boolean14 = menuResult1.isSuccess();
        java.lang.String str15 = menuResult1.getErrorMessage();
        boolean boolean16 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        java.lang.Class<?> wildcardClass11 = menuResult1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        java.lang.String str3 = menuResult1.getErrorMessage();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
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
        org.junit.Assert.assertNull(menu17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(menu19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        boolean boolean4 = menuResult1.isSuccess();
        boolean boolean5 = menuResult1.isSuccess();
        boolean boolean6 = menuResult1.isSuccess();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        boolean boolean2 = menuResult1.isSuccess();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        data.Menu menu7 = menuResult1.getMenu();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertNull(menu7);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(menu11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        boolean boolean12 = menuResult1.isSuccess();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        data.Menu menu4 = menuResult1.getMenu();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        data.Menu menu8 = menuResult1.getMenu();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.String str10 = menuResult1.getErrorMessage();
        java.lang.String str11 = menuResult1.getErrorMessage();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertNull(menu4);
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(menu8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        java.lang.String str15 = menuResult1.getErrorMessage();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        business.MenuResult menuResult1 = business.MenuResult.failure("");
        java.lang.String str2 = menuResult1.getErrorMessage();
        boolean boolean3 = menuResult1.isSuccess();
        java.lang.String str4 = menuResult1.getErrorMessage();
        java.lang.String str5 = menuResult1.getErrorMessage();
        data.Menu menu6 = menuResult1.getMenu();
        boolean boolean7 = menuResult1.isSuccess();
        java.lang.String str8 = menuResult1.getErrorMessage();
        java.lang.String str9 = menuResult1.getErrorMessage();
        java.lang.Class<?> wildcardClass10 = menuResult1.getClass();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(menu14);
        org.junit.Assert.assertNull(menu15);
        org.junit.Assert.assertNull(menu16);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        business.MenuResult menuResult1 = business.MenuResult.failure("hi!");
        java.lang.String str2 = menuResult1.getErrorMessage();
        data.Menu menu3 = menuResult1.getMenu();
        java.lang.String str4 = menuResult1.getErrorMessage();
        data.Menu menu5 = menuResult1.getMenu();
        data.Menu menu6 = menuResult1.getMenu();
        java.lang.String str7 = menuResult1.getErrorMessage();
        java.lang.String str8 = menuResult1.getErrorMessage();
        boolean boolean9 = menuResult1.isSuccess();
        data.Menu menu10 = menuResult1.getMenu();
        org.junit.Assert.assertNotNull(menuResult1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNull(menu3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(menu5);
        org.junit.Assert.assertNull(menu6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(menu10);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

