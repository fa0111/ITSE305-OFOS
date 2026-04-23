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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("", (int) (short) 10);
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 x  added to cart." + "'", str8, "10 x  added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("hi!", (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x hi! added to cart." + "'", str10, "0 x hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("hi!", 0);
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x hi! added to cart." + "'", str12, "0 x hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x Cart cleared. added to cart." + "'", str9, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass2 = strMap1.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        business.CartService cartService0 = new business.CartService();
        java.lang.Class<?> wildcardClass1 = cartService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("1 x 0 x 0 x  added to cart. added to cart. added to cart.", 1);
        java.lang.Class<?> wildcardClass18 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str17, "1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass4 = strMap3.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("10 x  added to cart.", (-1));
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str12, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 0);
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str12 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str4 = cartService0.clearCart();
        java.lang.String str7 = cartService0.addToCart("1 x 1 x -1 x  added to cart. added to cart. added to cart.", (int) '#');
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cart cleared." + "'", str4, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35 x 1 x 1 x -1 x  added to cart. added to cart. added to cart. added to cart." + "'", str7, "35 x 1 x 1 x -1 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str12, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str4 = cartService0.addToCart("0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str4, "97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str2 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass3 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cart cleared." + "'", str2, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str14 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str15 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str14, "1 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str14 = cartService0.addToCart("-1 x  added to cart.", (int) (short) 1);
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x -1 x  added to cart. added to cart." + "'", str14, "1 x -1 x  added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x  added to cart.", (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str8, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass18 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x Cart cleared. added to cart." + "'", str9, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        java.lang.String str16 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str7 = cartService0.addToCart("1 x hi! added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 x 1 x hi! added to cart. added to cart." + "'", str7, "1 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str7 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "97 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32 x 1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "32 x 1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        boolean boolean14 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x Cart cleared. added to cart.", (int) (short) -1);
        java.lang.String str13 = cartService0.addToCart("1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 10);
        boolean boolean18 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x Cart cleared. added to cart. added to cart." + "'", str10, "-1 x 100 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 x 0 x hi! added to cart. added to cart." + "'", str17, "10 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass6 = strMap5.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x  added to cart.", (int) (byte) 100);
        boolean boolean9 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str8, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str14, "100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 0);
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("hi!", (int) (byte) 0);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x hi! added to cart." + "'", str10, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.addToCart("10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str15 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str12, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str15, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str7 = cartService0.addToCart("1 x hi! added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 x 1 x hi! added to cart. added to cart." + "'", str7, "1 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str15 = cartService0.addToCart("32 x 1 x  added to cart. added to cart.", (int) (short) 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 32 x 1 x  added to cart. added to cart. added to cart." + "'", str15, "0 x 32 x 1 x  added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("100 x 0 x 0 x  added to cart. added to cart. added to cart.", (-1));
        java.lang.String str11 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str10, "-1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass2 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass4 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.lang.String str4 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cart cleared." + "'", str4, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str19 = cartService0.addToCart("100 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) '4');
        java.lang.String str20 = cartService0.clearCart();
        java.lang.String str23 = cartService0.addToCart("0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass24 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str19, "52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cart cleared." + "'", str20, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "97 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "97 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", 1);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str9 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str14 = cartService0.clearCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str16 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str19 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("100 x 0 x 0 x  added to cart. added to cart. added to cart.", (-1));
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str10, "-1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.String str19 = cartService0.addToCart("10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.String str18 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", 0);
        java.lang.String str21 = cartService0.addToCart("1 x  added to cart.", (int) ' ');
        java.lang.Class<?> wildcardClass22 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str18, "0 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "32 x 1 x  added to cart. added to cart." + "'", str21, "32 x 1 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 100);
        java.lang.String str12 = cartService0.addToCart("-1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x  added to cart.", (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str8, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("1 x hi! added to cart.", (int) ' ');
        java.lang.String str6 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x hi! added to cart. added to cart." + "'", str5, "32 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("100 x  added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 100 x  added to cart. added to cart." + "'", str12, "-1 x 100 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 100);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("", (-1));
        java.lang.String str17 = cartService0.addToCart("100 x 100 x 97 x  added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.String str18 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass20 = strMap19.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x  added to cart." + "'", str14, "-1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str17, "10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("Cart cleared.", (int) (byte) -1);
        java.lang.String str14 = cartService0.addToCart("0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x Cart cleared. added to cart." + "'", str11, "-1 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.addToCart("1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass4 = strMap3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.String str18 = cartService0.addToCart("100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str18, "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("", (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 x  added to cart." + "'", str14, "100 x  added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str12 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str14 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str15 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str14, "1 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.String str18 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", 0);
        boolean boolean19 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass21 = strMap20.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str18, "0 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("100 x  added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 100 x  added to cart. added to cart." + "'", str12, "-1 x 100 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("97 x 100 x 97 x  added to cart. added to cart. added to cart.", 0);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "0 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 x 100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "10 x 100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x Cart cleared. added to cart.", (int) (short) -1);
        java.lang.String str13 = cartService0.addToCart("1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 10);
        java.lang.String str20 = cartService0.addToCart("-1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        boolean boolean21 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass22 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x Cart cleared. added to cart. added to cart." + "'", str10, "-1 x 100 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 x 0 x hi! added to cart. added to cart." + "'", str17, "10 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("0 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.String str18 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str4 = cartService0.addToCart("0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "-1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("100 x  added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str16 = cartService0.addToCart("10 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 100 x  added to cart. added to cart." + "'", str12, "-1 x 100 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str16, "100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        boolean boolean3 = cartService0.isCartEmpty();
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "97 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("1 x hi! added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 x 1 x hi! added to cart. added to cart." + "'", str3, "32 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str16 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass2 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.String str16 = cartService0.clearCart();
        boolean boolean17 = cartService0.isCartEmpty();
        java.lang.String str20 = cartService0.addToCart("100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass21 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 x 100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "10 x 100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x  added to cart." + "'", str10, "100 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        boolean boolean14 = cartService0.isCartEmpty();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("1 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "-1 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x  added to cart.", (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str8, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        java.lang.String str18 = cartService0.addToCart("100 x  added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 x 100 x  added to cart. added to cart." + "'", str18, "10 x 100 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x  added to cart." + "'", str10, "100 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("hi!", 0);
        java.lang.String str15 = cartService0.addToCart("100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", 0);
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str19 = cartService0.addToCart("100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x hi! added to cart." + "'", str12, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "-1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str15 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 1);
        boolean boolean14 = cartService0.isCartEmpty();
        boolean boolean15 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        boolean boolean14 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "-1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("0 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 0);
        boolean boolean13 = cartService0.isCartEmpty();
        boolean boolean14 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) (short) 100);
        java.lang.String str15 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str12, "100 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str15, "10 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x Cart cleared. added to cart.", (int) (short) -1);
        java.lang.String str13 = cartService0.addToCart("1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x Cart cleared. added to cart. added to cart." + "'", str10, "-1 x 100 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.String str18 = cartService0.addToCart("1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "100 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str18 = cartService0.addToCart("1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "-1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str7 = cartService0.addToCart("1 x hi! added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 x 1 x hi! added to cart. added to cart." + "'", str7, "1 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("hi!", (int) (byte) 0);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("100 x -1 x Cart cleared. added to cart. added to cart.", (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x hi! added to cart." + "'", str10, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart." + "'", str14, "1 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.addToCart("-1 x 0 x  added to cart. added to cart.", (int) (short) 1);
        java.lang.String str18 = cartService0.addToCart("0 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x -1 x 0 x  added to cart. added to cart. added to cart." + "'", str15, "1 x -1 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str18, "10 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("1 x  added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x  added to cart. added to cart." + "'", str12, "1 x 1 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x  added to cart." + "'", str10, "100 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.lang.String str4 = cartService0.clearCart();
        java.lang.String str7 = cartService0.addToCart("-1 x 0 x Cart cleared. added to cart. added to cart.", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cart cleared." + "'", str4, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart." + "'", str7, "10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.lang.String str13 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("97 x 100 x 97 x  added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str11, "10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("1 x 0 x 0 x  added to cart. added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str17, "1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str18 = cartService0.addToCart("35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass20 = strMap19.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "1 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str16 = cartService0.addToCart("52 x 0 x Cart cleared. added to cart. added to cart.", 1);
        java.lang.String str19 = cartService0.addToCart("1 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart." + "'", str16, "1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str19, "10 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str19 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.String str22 = cartService0.addToCart("1 x 1 x  added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass23 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97 x 1 x 1 x  added to cart. added to cart. added to cart." + "'", str22, "97 x 1 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x Cart cleared. added to cart.", (int) (short) -1);
        java.lang.String str13 = cartService0.addToCart("1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x Cart cleared. added to cart. added to cart." + "'", str10, "-1 x 100 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 x 0 x hi! added to cart. added to cart." + "'", str17, "10 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.Class<?> wildcardClass4 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        boolean boolean5 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str12 = cartService0.addToCart("0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        java.lang.String str16 = cartService0.clearCart();
        boolean boolean17 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("-1 x 0 x  added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x -1 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "100 x -1 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        boolean boolean14 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str17 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass18 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.lang.String str14 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52 x 52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "52 x 52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("Cart cleared.", (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x Cart cleared. added to cart." + "'", str11, "-1 x Cart cleared. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("0 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str16 = cartService0.addToCart("", 1);
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 x  added to cart." + "'", str16, "1 x  added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str12 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.String str15 = cartService0.addToCart("1 x  added to cart.", 100);
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x 1 x  added to cart. added to cart." + "'", str15, "100 x 1 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean18 = cartService0.isCartEmpty();
        boolean boolean19 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.addToCart("10 x 10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str11 = cartService0.addToCart("100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 x 10 x 10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "0 x 10 x 10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str11, "10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("hi!", (int) (byte) 0);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str18 = cartService0.addToCart("1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x hi! added to cart." + "'", str10, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "0 x 1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str11 = cartService0.addToCart("1 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) 'a');
        boolean boolean12 = cartService0.isCartEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "97 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str14 = cartService0.clearCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str16 = cartService0.clearCart();
        boolean boolean17 = cartService0.isCartEmpty();
        java.lang.String str18 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("0 x 0 x 0 x  added to cart. added to cart. added to cart.", 100);
        java.lang.String str20 = cartService0.addToCart("1 x  added to cart.", (int) (short) 10);
        java.lang.String str23 = cartService0.addToCart("100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str17, "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 x 1 x  added to cart. added to cart." + "'", str20, "10 x 1 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1 x 100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "-1 x 100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean16 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.String str20 = cartService0.addToCart("10 x  added to cart.", (int) (short) 1);
        java.lang.String str23 = cartService0.addToCart("-1 x 52 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.lang.Class<?> wildcardClass24 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 x 10 x  added to cart. added to cart." + "'", str20, "1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "52 x -1 x 52 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "52 x -1 x 52 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 x 100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "10 x 100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("97 x 100 x 97 x  added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str11, "10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.addToCart("1 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str8, "32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str12, "10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str16 = cartService0.addToCart("-1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("Cart cleared.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x Cart cleared. added to cart." + "'", str11, "-1 x Cart cleared. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.String str15 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str18 = cartService0.addToCart("10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        boolean boolean19 = cartService0.isCartEmpty();
        boolean boolean20 = cartService0.isCartEmpty();
        java.lang.String str23 = cartService0.addToCart("100 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        java.lang.Class<?> wildcardClass24 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str15, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 x 100 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "1 x 100 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        java.lang.String str18 = cartService0.addToCart("100 x  added to cart.", (int) (short) 10);
        java.lang.String str19 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 x 100 x  added to cart. added to cart." + "'", str18, "10 x 100 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cart cleared." + "'", str19, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 1);
        java.lang.String str14 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str18 = cartService0.addToCart("100 x 10 x  added to cart. added to cart.", 1);
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 x 100 x 10 x  added to cart. added to cart. added to cart." + "'", str18, "1 x 100 x 10 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str4 = cartService0.addToCart("0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str4, "97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "97 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.addToCart("0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str15 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("0 x 0 x 0 x  added to cart. added to cart. added to cart.", 100);
        java.lang.String str20 = cartService0.addToCart("10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str17, "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "1 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.addToCart("100 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = strMap14.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str16 = cartService0.addToCart("0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", (int) (byte) 10);
        boolean boolean17 = cartService0.isCartEmpty();
        java.lang.String str20 = cartService0.addToCart("Cart cleared.", 10);
        boolean boolean21 = cartService0.isCartEmpty();
        boolean boolean22 = cartService0.isCartEmpty();
        boolean boolean23 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str16, "10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 x Cart cleared. added to cart." + "'", str20, "10 x Cart cleared. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("0 x 0 x 0 x  added to cart. added to cart. added to cart.", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass19 = strMap18.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str17, "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("10 x 97 x  added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97 x 10 x 97 x  added to cart. added to cart. added to cart." + "'", str11, "97 x 10 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x Cart cleared. added to cart.", (int) (short) -1);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x Cart cleared. added to cart. added to cart." + "'", str10, "-1 x 100 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str4 = cartService0.addToCart("0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str4, "97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x Cart cleared. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x Cart cleared. added to cart. added to cart." + "'", str10, "0 x 0 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("1 x hi! added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        boolean boolean5 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 x 1 x hi! added to cart. added to cart." + "'", str3, "32 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.addToCart("", (-1));
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1 x  added to cart." + "'", str15, "-1 x  added to cart.");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.String str18 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", 0);
        boolean boolean19 = cartService0.isCartEmpty();
        java.lang.String str22 = cartService0.addToCart("-1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.Class<?> wildcardClass23 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str18, "0 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "35 x -1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "35 x -1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str9 = cartService0.addToCart("-1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "-1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("", (int) (byte) 1);
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 x  added to cart." + "'", str10, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = strMap8.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str14 = cartService0.addToCart("-1 x  added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x -1 x  added to cart. added to cart." + "'", str14, "1 x -1 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x Cart cleared. added to cart.", (int) (short) -1);
        java.lang.String str13 = cartService0.addToCart("1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str14 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 100 x Cart cleared. added to cart. added to cart." + "'", str10, "-1 x 100 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("0 x hi! added to cart.", (-1));
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x 0 x hi! added to cart. added to cart." + "'", str11, "-1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("-1 x 97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x -1 x 97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x -1 x 97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.lang.String str11 = cartService0.addToCart("10 x 97 x  added to cart. added to cart.", (-1));
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("1 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        boolean boolean16 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "52 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x 10 x 97 x  added to cart. added to cart. added to cart." + "'", str11, "-1 x 10 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x 1 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "100 x 1 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("hi!", 0);
        boolean boolean13 = cartService0.isCartEmpty();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x hi! added to cart." + "'", str12, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str2 = cartService0.clearCart();
        java.lang.String str5 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cart cleared." + "'", str2, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("0 x hi! added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x 0 x hi! added to cart. added to cart." + "'", str11, "-1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass4 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("", (-1));
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x  added to cart." + "'", str14, "-1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str8 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str8, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "-1 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "97 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.String str15 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str18 = cartService0.addToCart("10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        boolean boolean19 = cartService0.isCartEmpty();
        boolean boolean20 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass21 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str15, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.Class<?> wildcardClass18 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "-1 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 100);
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str16 = cartService0.addToCart("100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str16, "97 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x Cart cleared. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x Cart cleared. added to cart. added to cart." + "'", str10, "0 x 0 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "97 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean18 = cartService0.isCartEmpty();
        java.lang.String str21 = cartService0.addToCart("10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass23 = strMap22.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "32 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "32 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("-1 x 0 x  added to cart. added to cart.", (-1));
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x  added to cart." + "'", str10, "100 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x -1 x 0 x  added to cart. added to cart. added to cart." + "'", str14, "-1 x -1 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.addToCart("0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("10 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "0 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x  added to cart.", (int) (byte) 100);
        java.lang.String str11 = cartService0.addToCart("-1 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str8, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x -1 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x -1 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean16 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        boolean boolean18 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str7 = cartService0.addToCart("1 x hi! added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 x 1 x hi! added to cart. added to cart." + "'", str7, "1 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.addToCart("100 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) (short) 100);
        java.lang.String str15 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (short) 10);
        java.lang.String str16 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str12, "100 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str15, "10 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("", (int) (short) 10);
        java.lang.String str11 = cartService0.addToCart("10 x 1 x  added to cart. added to cart.", (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 x  added to cart." + "'", str8, "10 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x 10 x 1 x  added to cart. added to cart. added to cart." + "'", str11, "-1 x 10 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("52 x 10 x 1 x  added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100 x 52 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart." + "'", str6, "100 x 52 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str17 = cartService0.addToCart("32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "100 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) (short) 100);
        java.lang.String str15 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        boolean boolean17 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str12, "100 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str15, "10 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "-1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "10 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.addToCart("10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str18 = cartService0.addToCart("1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "10 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        boolean boolean14 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str16 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str19 = cartService0.addToCart("10 x 1 x  added to cart. added to cart.", (int) '4');
        java.lang.String str20 = cartService0.clearCart();
        java.lang.String str23 = cartService0.addToCart("0 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.String str24 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "52 x 10 x 1 x  added to cart. added to cart. added to cart." + "'", str19, "52 x 10 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cart cleared." + "'", str20, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1 x 0 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "-1 x 0 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cart cleared." + "'", str24, "Cart cleared.");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "0 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "0 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("97 x 100 x 97 x  added to cart. added to cart. added to cart.", (-1));
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str8, "-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x  added to cart." + "'", str9, "-1 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str17 = cartService0.addToCart("0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 100);
        java.lang.String str12 = cartService0.addToCart("-1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("", (int) (byte) 100);
        boolean boolean15 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass17 = strMap16.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 x  added to cart." + "'", str14, "100 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str3 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cart cleared." + "'", str3, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("1 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.String str8 = cartService0.addToCart("0 x  added to cart.", (int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "-1 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x  added to cart. added to cart." + "'", str8, "1 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass7 = strMap6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str19 = cartService0.addToCart("0 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass21 = strMap20.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str19, "-1 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass3 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str19 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.String str22 = cartService0.addToCart("1 x 1 x  added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass24 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97 x 1 x 1 x  added to cart. added to cart. added to cart." + "'", str22, "97 x 1 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str19 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.String str22 = cartService0.addToCart("1 x 1 x  added to cart. added to cart.", (int) 'a');
        java.lang.String str25 = cartService0.addToCart("52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.String str28 = cartService0.addToCart("-1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97 x 1 x 1 x  added to cart. added to cart. added to cart." + "'", str22, "97 x 1 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "-1 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 x -1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str28, "1 x -1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x  added to cart." + "'", str9, "-1 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) (short) 100);
        java.lang.String str15 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str12, "100 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str15, "10 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("-1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x -1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x -1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("0 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str7, "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = strMap7.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("0 x 1 x 1 x hi! added to cart. added to cart. added to cart.", 10);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str15, "10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("0 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str7, "100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str14 = cartService0.addToCart("-1 x  added to cart.", (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x -1 x  added to cart. added to cart." + "'", str14, "1 x -1 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("-1 x 0 x Cart cleared. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str12 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart." + "'", str11, "100 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("100 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 100 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 100 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str7 = cartService0.addToCart("1 x hi! added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 x 1 x hi! added to cart. added to cart." + "'", str7, "1 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 x 10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "10 x 10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("32 x 1 x hi! added to cart. added to cart.", (int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 x 32 x 1 x hi! added to cart. added to cart. added to cart." + "'", str10, "1 x 32 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean16 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.String str20 = cartService0.addToCart("10 x  added to cart.", (int) (short) 1);
        java.lang.String str21 = cartService0.clearCart();
        java.lang.String str22 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 x 10 x  added to cart. added to cart." + "'", str20, "1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cart cleared." + "'", str21, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cart cleared." + "'", str22, "Cart cleared.");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str9 = cartService0.addToCart("0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str12 = cartService0.addToCart("100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str15 = cartService0.addToCart("-1 x 10 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x -1 x 10 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x -1 x 10 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x  added to cart." + "'", str10, "100 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("10 x  added to cart.", (int) (short) 100);
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str11, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("0 x Cart cleared. added to cart.", (int) (byte) -1);
        boolean boolean10 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x 0 x Cart cleared. added to cart. added to cart." + "'", str9, "-1 x 0 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str17 = cartService0.addToCart("0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str18 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass19 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.addToCart("1 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str8, "32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("hi!", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = strMap13.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x hi! added to cart." + "'", str12, "0 x hi! added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str3 = cartService0.clearCart();
        java.lang.String str6 = cartService0.addToCart("-1 x  added to cart.", 10);
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cart cleared." + "'", str3, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10 x -1 x  added to cart. added to cart." + "'", str6, "10 x -1 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass5 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass7 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("1 x hi! added to cart.", (int) ' ');
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x hi! added to cart. added to cart." + "'", str5, "32 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean16 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str14 = cartService0.addToCart("1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "-1 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.addToCart("1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "32 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.addToCart("1 x -1 x  added to cart. added to cart.", 1);
        java.lang.String str13 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x -1 x  added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x -1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.String str20 = cartService0.addToCart("97 x 52 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "-1 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97 x 97 x 52 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "97 x 97 x 52 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("1 x hi! added to cart.", (int) ' ');
        java.lang.String str4 = cartService0.clearCart();
        boolean boolean5 = cartService0.isCartEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32 x 1 x hi! added to cart. added to cart." + "'", str3, "32 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cart cleared." + "'", str4, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("", (int) (short) 10);
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        boolean boolean14 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 x  added to cart." + "'", str8, "10 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x 100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x 100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        boolean boolean16 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str15, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "97 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("-1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        boolean boolean15 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x -1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x -1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 100);
        java.lang.String str12 = cartService0.addToCart("-1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str9 = cartService0.addToCart("10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        boolean boolean10 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("", (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x  added to cart." + "'", str13, "1 x  added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass6 = cartService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str8 = cartService0.addToCart("1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str11 = cartService0.addToCart("10 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 x 10 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "1 x 10 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        boolean boolean13 = cartService0.isCartEmpty();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass12 = strMap11.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str2 = cartService0.clearCart();
        java.lang.String str5 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cart cleared." + "'", str2, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str12 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("hi!", 0);
        java.lang.String str15 = cartService0.addToCart("100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", 0);
        boolean boolean16 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x hi! added to cart." + "'", str12, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

