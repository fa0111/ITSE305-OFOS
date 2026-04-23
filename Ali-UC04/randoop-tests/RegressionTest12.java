import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
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
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass13 = cartService0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("100 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str19 = cartService0.addToCart("", (int) ' ');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 100 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 100 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32 x  added to cart." + "'", str19, "32 x  added to cart.");
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("-1 x 0 x  added to cart. added to cart.", (int) (short) 10);
        java.lang.String str14 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 x -1 x 0 x  added to cart. added to cart. added to cart." + "'", str13, "10 x -1 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
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
        java.lang.String str18 = cartService0.addToCart("", (int) (short) 100);
        java.lang.String str21 = cartService0.addToCart("1 x 100 x 100 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x hi! added to cart." + "'", str12, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 x  added to cart." + "'", str18, "100 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97 x 1 x 100 x 100 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "97 x 1 x 100 x 100 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str17 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "35 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        boolean boolean15 = cartService0.isCartEmpty();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str19 = cartService0.addToCart("0 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str22 = cartService0.addToCart("1 x 10 x 97 x  added to cart. added to cart. added to cart.", (int) (byte) 1);
        boolean boolean23 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = cartService0.viewCart();
        java.lang.String str26 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 x 0 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "10 x 0 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 x 1 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str22, "1 x 1 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cart cleared." + "'", str26, "Cart cleared.");
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
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
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.String str16 = cartService0.clearCart();
        boolean boolean17 = cartService0.isCartEmpty();
        java.lang.String str20 = cartService0.addToCart("52 x 0 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 x 52 x 0 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "1 x 52 x 0 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("1 x hi! added to cart.", (int) ' ');
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass10 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x hi! added to cart. added to cart." + "'", str5, "32 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 1);
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.String str19 = cartService0.addToCart("-1 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1 x -1 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "-1 x -1 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.String str23 = cartService0.addToCart("", (int) (byte) 0);
        java.lang.String str26 = cartService0.addToCart("100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap27 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap28 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = cartService0.viewCart();
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0 x  added to cart." + "'", str23, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1 x 100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str26, "1 x 100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("", (int) 'a');
        java.lang.String str13 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97 x  added to cart." + "'", str12, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
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
        java.lang.String str20 = cartService0.addToCart("0 x 100 x 97 x  added to cart. added to cart. added to cart.", (int) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cartService0.viewCart();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str20, "35 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
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
        java.lang.String str19 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cartService0.viewCart();
        java.lang.String str22 = cartService0.clearCart();
        boolean boolean23 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = cartService0.viewCart();
        java.lang.String str27 = cartService0.addToCart("32 x 0 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cart cleared." + "'", str19, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cart cleared." + "'", str22, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100 x 32 x 0 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str27, "100 x 32 x 0 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.addToCart("hi!", 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x hi! added to cart." + "'", str15, "0 x hi! added to cart.");
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
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
        java.lang.String str19 = cartService0.addToCart("0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str22 = cartService0.addToCart("100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str25 = cartService0.addToCart("100 x -1 x 1 x 1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = cartService0.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str22, "10 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0 x 100 x -1 x 1 x 1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "0 x 100 x -1 x 1 x 1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("97 x  added to cart.", 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str14 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 x 97 x  added to cart. added to cart." + "'", str11, "10 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str16 = cartService0.clearCart();
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
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str14 = cartService0.clearCart();
        java.lang.String str15 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("0 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass17 = strMap16.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str7, "52 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32 x 0 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "32 x 0 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str14 = cartService0.addToCart("-1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        boolean boolean15 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x -1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x -1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
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
        java.lang.String str17 = cartService0.addToCart("35 x -1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str20 = cartService0.addToCart("1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        boolean boolean21 = cartService0.isCartEmpty();
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
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 35 x -1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 35 x -1 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "10 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cart cleared." + "'", str22, "Cart cleared.");
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("100 x 100 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
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
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97 x 100 x 100 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "97 x 100 x 100 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
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
        java.lang.String str15 = cartService0.addToCart("1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str18 = cartService0.addToCart("10 x  added to cart.", 1);
        java.lang.String str21 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.String str22 = cartService0.clearCart();
        java.lang.String str25 = cartService0.addToCart("100 x 1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.Class<?> wildcardClass26 = cartService0.getClass();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "100 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 x 10 x  added to cart. added to cart." + "'", str18, "1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0 x Cart cleared. added to cart." + "'", str21, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cart cleared." + "'", str22, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 x 100 x 1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "1 x 100 x 1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
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
        java.lang.String str24 = cartService0.addToCart("100 x 32 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str25 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = cartService0.viewCart();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "35 x 100 x 32 x hi! added to cart. added to cart. added to cart." + "'", str24, "35 x 100 x 32 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cart cleared." + "'", str25, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("0 x hi! added to cart.", (-1));
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str16 = cartService0.addToCart("0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.String str17 = cartService0.clearCart();
        boolean boolean18 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 0 x hi! added to cart. added to cart." + "'", str10, "-1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 x 0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "-1 x 0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x  added to cart.", (int) (byte) 100);
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 1 x 10 x 100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str15 = cartService0.addToCart("0 x 0 x 10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str8, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x 1 x 10 x 100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x 1 x 10 x 100 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52 x 0 x 0 x 10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "52 x 0 x 0 x 10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("10 x 35 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str9 = cartService0.addToCart("0 x -1 x 0 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.String str12 = cartService0.addToCart("97 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 x 10 x 35 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "10 x 10 x 35 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 x 0 x -1 x 0 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "10 x 0 x -1 x 0 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 x 97 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "32 x 97 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.clearCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("0 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 97 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x 52 x 1 x 97 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "-1 x 52 x 1 x 97 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
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
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("10 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        java.lang.String str19 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.String str23 = cartService0.addToCart("10 x 100 x 1 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str17, "-1 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cart cleared." + "'", str19, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1 x 10 x 100 x 1 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "1 x 10 x 100 x 1 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("1 x hi! added to cart.", (int) ' ');
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x hi! added to cart. added to cart." + "'", str5, "32 x 1 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
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
        boolean boolean13 = cartService0.isCartEmpty();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("10 x 100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 x 10 x 100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "1 x 10 x 100 x -1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
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
        java.lang.String str20 = cartService0.addToCart("", (int) (byte) -1);
        java.lang.String str23 = cartService0.addToCart("0 x -1 x 97 x 0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1 x  added to cart." + "'", str20, "-1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "52 x 0 x -1 x 97 x 0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "52 x 0 x -1 x 97 x 0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
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
        java.lang.String str21 = cartService0.addToCart("", 0);
        boolean boolean22 = cartService0.isCartEmpty();
        java.lang.String str25 = cartService0.addToCart("-1 x 100 x 0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = cartService0.viewCart();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0 x  added to cart." + "'", str21, "0 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "52 x -1 x 100 x 0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "52 x -1 x 100 x 0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.String str15 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str18 = cartService0.addToCart("10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.String str22 = cartService0.addToCart("1 x 52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        boolean boolean23 = cartService0.isCartEmpty();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str15, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 x 1 x 52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "-1 x 1 x 52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str14 = cartService0.clearCart();
        java.lang.String str17 = cartService0.addToCart("0 x 52 x 10 x Cart cleared. added to cart. added to cart. added to cart.", 100);
        java.lang.String str18 = cartService0.clearCart();
        java.lang.String str21 = cartService0.addToCart("10 x 0 x 32 x -1 x 10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "100 x 32 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 x 0 x 52 x 10 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str17, "100 x 0 x 52 x 10 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0 x 10 x 0 x 32 x -1 x 10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "0 x 10 x 0 x 32 x -1 x 10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        boolean boolean13 = cartService0.isCartEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 x 0 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "1 x 0 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str13 = cartService0.addToCart("1 x 0 x 32 x -1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 x 10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "10 x 10 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97 x 1 x 0 x 32 x -1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "97 x 1 x 0 x 32 x -1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("97 x  added to cart.", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1 x 97 x  added to cart. added to cart." + "'", str15, "-1 x 97 x  added to cart. added to cart.");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("0 x Cart cleared. added to cart.", (int) '4');
        java.lang.String str11 = cartService0.addToCart("10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("1 x -1 x 100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str19 = cartService0.addToCart("1 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.String str23 = cartService0.addToCart("52 x 1 x 0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52 x 0 x Cart cleared. added to cart. added to cart." + "'", str8, "52 x 0 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32 x 10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "32 x 10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1 x 1 x -1 x 100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "-1 x 1 x -1 x 100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1 x 1 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "1 x 1 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0 x 52 x 1 x 0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "0 x 52 x 1 x 0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
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
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str19 = cartService0.addToCart("32 x 97 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str20 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cartService0.viewCart();
        boolean boolean22 = cartService0.isCartEmpty();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 x 32 x 97 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "100 x 32 x 97 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cart cleared." + "'", str20, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("97 x 100 x 97 x  added to cart. added to cart. added to cart.", (-1));
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str8, "-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
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
        java.lang.String str17 = cartService0.clearCart();
        java.lang.String str18 = cartService0.clearCart();
        java.lang.String str21 = cartService0.addToCart("52 x 100 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        boolean boolean22 = cartService0.isCartEmpty();
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
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10 x 52 x 100 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "10 x 52 x 100 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("0 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str17 = cartService0.addToCart("1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.String str20 = cartService0.addToCart("-1 x 1 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        boolean boolean21 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x 0 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x 0 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "-1 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0 x -1 x 1 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "0 x -1 x 1 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str12, "0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.String str22 = cartService0.addToCart("1 x 0 x  added to cart. added to cart.", (int) ' ');
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
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32 x 1 x 0 x  added to cart. added to cart. added to cart." + "'", str22, "32 x 1 x 0 x  added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass9 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("1 x 1 x  added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str12 = cartService0.clearCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97 x 1 x 1 x  added to cart. added to cart. added to cart." + "'", str10, "97 x 1 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.addToCart("1 x 0 x 0 x  added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("35 x 97 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str8, "32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 35 x 97 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "0 x 35 x 97 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str16 = cartService0.addToCart("100 x 10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 x 10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "10 x 10 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 x 100 x 10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "10 x 100 x 10 x 0 x 0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
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
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.clearCart();
        boolean boolean18 = cartService0.isCartEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
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
        java.lang.String str19 = cartService0.addToCart("hi!", (int) ' ');
        boolean boolean20 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cartService0.viewCart();
        boolean boolean22 = cartService0.isCartEmpty();
        java.lang.String str23 = cartService0.clearCart();
        java.lang.String str24 = cartService0.clearCart();
        java.lang.String str25 = cartService0.clearCart();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32 x hi! added to cart." + "'", str19, "32 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cart cleared." + "'", str23, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cart cleared." + "'", str24, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cart cleared." + "'", str25, "Cart cleared.");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("10 x 1 x  added to cart. added to cart.", (int) '4');
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52 x 10 x 1 x  added to cart. added to cart. added to cart." + "'", str11, "52 x 10 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
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
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("10 x 10 x 1 x 0 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str17 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 10 x 10 x 1 x 0 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "10 x 10 x 10 x 1 x 0 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("97 x 100 x 97 x  added to cart. added to cart. added to cart.", (-1));
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("10 x 10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass16 = strMap15.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str8, "-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x 10 x 10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "1 x 10 x 10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.String str13 = cartService0.addToCart("10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str18 = cartService0.addToCart("0 x 1 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) '#');
        boolean boolean19 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x Cart cleared. added to cart." + "'", str10, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x 10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x 10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35 x 0 x 1 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "35 x 0 x 1 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str8 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str13 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "10 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str8, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        java.lang.String str15 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.String str20 = cartService0.addToCart("35 x 10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cartService0.viewCart();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32 x 35 x 10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "32 x 35 x 10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) (short) 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("52 x 0 x -1 x 1 x -1 x 100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.String str14 = cartService0.addToCart("", 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 x  added to cart." + "'", str5, "10 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 x 52 x 0 x -1 x 1 x -1 x 100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "10 x 52 x 0 x -1 x 1 x -1 x 100 x 0 x 32 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 x  added to cart." + "'", str14, "100 x  added to cart.");
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        boolean boolean17 = cartService0.isCartEmpty();
        java.lang.String str20 = cartService0.addToCart("32 x 97 x 0 x  added to cart. added to cart. added to cart.", (int) (byte) 100);
        boolean boolean21 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass23 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100 x 32 x 97 x 0 x  added to cart. added to cart. added to cart. added to cart." + "'", str20, "100 x 32 x 97 x 0 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        boolean boolean3 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass12 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("-1 x 1 x -1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        boolean boolean12 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 x -1 x 1 x -1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "1 x -1 x 1 x -1 x -1 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("0 x hi! added to cart.", (-1));
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str16 = cartService0.addToCart("0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 0 x hi! added to cart. added to cart." + "'", str10, "-1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 x 0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "-1 x 0 x 35 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("0 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("1 x 32 x 1 x hi! added to cart. added to cart. added to cart.", (int) (byte) 1);
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.clearCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str18 = cartService0.addToCart("100 x 0 x 0 x 100 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.lang.String str19 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 100 x 0 x 0 x 100 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "0 x 100 x 0 x 0 x 100 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cart cleared." + "'", str19, "Cart cleared.");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
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
        boolean boolean13 = cartService0.isCartEmpty();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str18 = cartService0.addToCart("52 x -1 x 10 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1 x 52 x -1 x 10 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "-1 x 52 x -1 x 10 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.addToCart("52 x 10 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.String str17 = cartService0.addToCart("52 x 52 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97 x 52 x 10 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "97 x 52 x 10 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 52 x 52 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 52 x 52 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("", (int) (short) 10);
        boolean boolean9 = cartService0.isCartEmpty();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 x  added to cart." + "'", str8, "10 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
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
        java.lang.String str19 = cartService0.clearCart();
        java.lang.String str22 = cartService0.addToCart("0 x 35 x 100 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cart cleared." + "'", str19, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10 x 0 x 35 x 100 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "10 x 0 x 35 x 100 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
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
        java.lang.String str20 = cartService0.addToCart("10 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str23 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x  added to cart." + "'", str15, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0 x 10 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "0 x 10 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "-1 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cart cleared." + "'", str24, "Cart cleared.");
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str9 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("-1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        java.lang.String str17 = cartService0.addToCart("100 x 0 x 100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str20 = cartService0.addToCart("0 x -1 x -1 x -1 x 97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.String str23 = cartService0.addToCart("52 x 35 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x Cart cleared. added to cart." + "'", str9, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 x 100 x 0 x 100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "10 x 100 x 0 x 100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35 x 0 x -1 x -1 x -1 x 97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "35 x 0 x -1 x -1 x -1 x 97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100 x 52 x 35 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "100 x 52 x 35 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        boolean boolean19 = cartService0.isCartEmpty();
        java.lang.String str22 = cartService0.addToCart("100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.String str25 = cartService0.addToCart("10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap26 = cartService0.viewCart();
        java.lang.String str29 = cartService0.addToCart("97 x 1 x 100 x 0 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str32 = cartService0.addToCart("100 x -1 x -1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "35 x 100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "35 x 100 x 100 x 32 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "-1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "100 x 97 x 1 x 100 x 0 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str29, "100 x 97 x 1 x 100 x 0 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0 x 100 x -1 x -1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str32, "0 x 100 x -1 x -1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str2 = cartService0.clearCart();
        java.lang.String str5 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cart cleared." + "'", str2, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 0);
        java.lang.String str13 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 0);
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str18 = cartService0.addToCart("1 x 0 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 x 1 x 0 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "100 x 1 x 0 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str15 = cartService0.addToCart("97 x -1 x 0 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "-1 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 97 x -1 x 0 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "10 x 97 x -1 x 0 x 10 x 0 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
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
        java.lang.String str16 = cartService0.addToCart("0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean17 = cartService0.isCartEmpty();
        boolean boolean18 = cartService0.isCartEmpty();
        java.lang.String str21 = cartService0.addToCart("", 1);
        java.lang.String str24 = cartService0.addToCart("1 x 52 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "0 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 x  added to cart." + "'", str21, "1 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "97 x 1 x 52 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str24, "97 x 1 x 52 x -1 x 100 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str8 = cartService0.addToCart("10 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35 x 10 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "35 x 10 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str12 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.String str15 = cartService0.addToCart("100 x 100 x 97 x  added to cart. added to cart. added to cart.", 10);
        java.lang.String str16 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str15, "10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.String str13 = cartService0.addToCart("10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str18 = cartService0.addToCart("10 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.String str21 = cartService0.addToCart("100 x 0 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.String str22 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x Cart cleared. added to cart." + "'", str10, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x 10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x 10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str18, "-1 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "35 x 100 x 0 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "35 x 100 x 0 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cart cleared." + "'", str22, "Cart cleared.");
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str16 = cartService0.addToCart("0 x 0 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0 x 0 x 0 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "0 x 0 x 0 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x Cart cleared. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("10 x 100 x -1 x 100 x 0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str15 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x Cart cleared. added to cart. added to cart." + "'", str10, "0 x 0 x Cart cleared. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 x 10 x 100 x -1 x 100 x 0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "100 x 10 x 100 x -1 x 100 x 0 x 0 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str14 = cartService0.addToCart("-1 x 10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "-1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x -1 x 10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "-1 x -1 x 10 x 1 x 0 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("0 x 0 x 32 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 0 x 0 x 32 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "100 x 0 x 0 x 32 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
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
        boolean boolean22 = cartService0.isCartEmpty();
        java.lang.String str25 = cartService0.addToCart("100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str28 = cartService0.addToCart("0 x -1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap29 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass30 = strMap29.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "1 x 100 x -1 x 10 x 1 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1 x 0 x -1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str28, "1 x 0 x -1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        boolean boolean10 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        boolean boolean12 = cartService0.isCartEmpty();
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
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
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("10 x 35 x 100 x 32 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        boolean boolean18 = cartService0.isCartEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 x 10 x 35 x 100 x 32 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "10 x 10 x 35 x 100 x 32 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("hi!", (int) (byte) 0);
        java.lang.String str11 = cartService0.clearCart();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.addToCart("97 x 1 x 1 x  added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str18 = cartService0.addToCart("1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x hi! added to cart." + "'", str10, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart." + "'", str15, "1 x 97 x 1 x 1 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32 x 1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "32 x 1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.lang.String str4 = cartService0.clearCart();
        java.lang.String str5 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cart cleared." + "'", str4, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.String str11 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str16 = cartService0.addToCart("1 x 100 x 1 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str17 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x Cart cleared. added to cart." + "'", str10, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 x 1 x 100 x 1 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "100 x 1 x 100 x 1 x -1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.lang.String str5 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", (int) (short) 1);
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", 0);
        boolean boolean10 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.addToCart("52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.lang.String str14 = cartService0.clearCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str18 = cartService0.addToCart("100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.lang.String str21 = cartService0.addToCart("-1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.lang.String str22 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52 x 52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "52 x 52 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97 x 100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "97 x 100 x 0 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "52 x -1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "52 x -1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cart cleared." + "'", str22, "Cart cleared.");
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str2 = cartService0.clearCart();
        java.lang.String str5 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str6 = cartService0.clearCart();
        boolean boolean7 = cartService0.isCartEmpty();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("97 x 97 x  added to cart. added to cart.", (int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cart cleared." + "'", str2, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "32 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 97 x 97 x  added to cart. added to cart. added to cart." + "'", str11, "35 x 97 x 97 x  added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str14 = cartService0.addToCart("-1 x  added to cart.", (int) (short) 1);
        java.lang.String str15 = cartService0.clearCart();
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass17 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x -1 x  added to cart. added to cart." + "'", str14, "1 x -1 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "97 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97 x -1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "97 x -1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
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
        java.lang.String str15 = cartService0.addToCart("-1 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str19 = cartService0.addToCart("1 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str22 = cartService0.addToCart("100 x 100 x 0 x 1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.lang.String str23 = cartService0.clearCart();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x -1 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "100 x -1 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 x 1 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "100 x 1 x 10 x 10 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "52 x 100 x 100 x 0 x 1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "52 x 100 x 100 x 0 x 1 x 97 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cart cleared." + "'", str23, "Cart cleared.");
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("-1 x 100 x Cart cleared. added to cart. added to cart.", (int) (short) 0);
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart." + "'", str10, "0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("0 x 1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 0 x 1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 0 x 1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
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
        java.lang.String str20 = cartService0.addToCart("", (int) (short) 1);
        boolean boolean21 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass22 = cartService0.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 x  added to cart." + "'", str20, "1 x  added to cart.");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
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
        java.lang.String str21 = cartService0.addToCart("0 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str24 = cartService0.addToCart("0 x 32 x 100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str25 = cartService0.clearCart();
        java.lang.String str26 = cartService0.clearCart();
        boolean boolean27 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass28 = cartService0.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100 x 0 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "100 x 0 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100 x 0 x 32 x 100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str24, "100 x 0 x 32 x 100 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cart cleared." + "'", str25, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cart cleared." + "'", str26, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x  added to cart.", 0);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str13 = cartService0.addToCart("1 x 1 x -1 x  added to cart. added to cart. added to cart.", 0);
        boolean boolean14 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 x 0 x  added to cart. added to cart." + "'", str4, "0 x 0 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x -1 x  added to cart. added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x -1 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str14 = cartService0.addToCart("-1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str18 = cartService0.addToCart("35 x 0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass20 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "-1 x -1 x 32 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "52 x 35 x 0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "52 x 35 x 0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.lang.String str11 = cartService0.addToCart("1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str12 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str16 = cartService0.addToCart("1 x 1 x 35 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 x 1 x 1 x 35 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "1 x 1 x 1 x 35 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
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
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.addToCart("10 x 1 x 1 x hi! added to cart. added to cart. added to cart.", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        boolean boolean19 = cartService0.isCartEmpty();
        boolean boolean20 = cartService0.isCartEmpty();
        java.lang.String str23 = cartService0.addToCart("-1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.String str26 = cartService0.addToCart("0 x 0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str17, "-1 x 10 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1 x -1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "-1 x -1 x 100 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0 x 0 x 0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str26, "0 x 0 x 0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.String str21 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cartService0.viewCart();
        java.lang.String str25 = cartService0.addToCart("100 x 97 x -1 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cart cleared." + "'", str21, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1 x 100 x 97 x -1 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "-1 x 100 x 97 x -1 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str7 = cartService0.addToCart("10 x  added to cart.", (int) (short) -1);
        java.lang.String str10 = cartService0.addToCart("", (int) (byte) 100);
        java.lang.String str13 = cartService0.addToCart("0 x 10 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.lang.String str16 = cartService0.addToCart("0 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 x 10 x  added to cart. added to cart." + "'", str7, "-1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x  added to cart." + "'", str10, "100 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x 0 x 10 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x 0 x 10 x 52 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "97 x 0 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "97 x 0 x 97 x 10 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str11 = cartService0.addToCart("1 x 0 x hi! added to cart. added to cart.", (int) '#');
        java.lang.String str14 = cartService0.addToCart("1 x 1 x hi! added to cart. added to cart.", (int) (byte) 1);
        java.lang.String str15 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.String str17 = cartService0.clearCart();
        boolean boolean18 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 x 1 x 0 x hi! added to cart. added to cart. added to cart." + "'", str11, "35 x 1 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str14, "1 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (short) 100);
        java.lang.String str10 = cartService0.clearCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str14 = cartService0.addToCart("0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str16 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.String str18 = cartService0.clearCart();
        java.lang.String str19 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Cart cleared." + "'", str19, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str7 = cartService0.addToCart("0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '4');
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 x 0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "100 x 0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "52 x 0 x -1 x 1 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("Cart cleared.", (int) (short) 100);
        java.lang.String str9 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        java.lang.String str11 = cartService0.clearCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str13 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x Cart cleared. added to cart." + "'", str8, "100 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str8 = cartService0.addToCart("10 x  added to cart.", (int) (byte) 100);
        java.lang.String str11 = cartService0.addToCart("97 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str12 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str16 = cartService0.addToCart("100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str19 = cartService0.addToCart("97 x 100 x 35 x 100 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.String str22 = cartService0.addToCart("1 x 100 x 35 x 10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 x 10 x  added to cart. added to cart." + "'", str8, "100 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 97 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 97 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 x 100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "10 x 100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1 x 97 x 100 x 35 x 100 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "-1 x 97 x 100 x 35 x 100 x 1 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 x 1 x 100 x 35 x 10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "-1 x 1 x 100 x 35 x 10 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str12 = cartService0.addToCart("0 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str18 = cartService0.addToCart("32 x 1 x 100 x 1 x -1 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0 x 32 x 1 x 100 x 1 x -1 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "0 x 32 x 1 x 100 x 1 x -1 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str4 = cartService0.addToCart("0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "-1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("10 x 97 x  added to cart. added to cart.", 0);
        java.lang.String str16 = cartService0.clearCart();
        boolean boolean17 = cartService0.isCartEmpty();
        java.lang.String str18 = cartService0.clearCart();
        boolean boolean19 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "0 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 10 x 97 x  added to cart. added to cart. added to cart." + "'", str15, "0 x 10 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        boolean boolean8 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cartService0.viewCart();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("10 x 52 x 35 x 0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str16 = cartService0.addToCart("32 x 1 x 100 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 x 10 x 52 x 35 x 0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "10 x 10 x 52 x 35 x 0 x 1 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 x 32 x 1 x 100 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "100 x 32 x 1 x 100 x 1 x 32 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 0);
        java.lang.String str14 = cartService0.addToCart("100 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str18 = cartService0.addToCart("10 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass21 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 x 10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "0 x 10 x -1 x 100 x 0 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x 100 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "-1 x 100 x 10 x -1 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32 x 10 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "32 x 10 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str16 = cartService0.clearCart();
        java.lang.String str19 = cartService0.addToCart("100 x 1 x 32 x 10 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) '#');
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35 x 100 x 1 x 32 x 10 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "35 x 100 x 1 x 32 x 10 x 10 x 100 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
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
        java.lang.String str15 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.String str17 = cartService0.clearCart();
        java.lang.String str18 = cartService0.clearCart();
        boolean boolean19 = cartService0.isCartEmpty();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str7 = cartService0.addToCart("100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str10 = cartService0.addToCart("52 x 35 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 x 100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "1 x 100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97 x 52 x 35 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "97 x 52 x 35 x 100 x 100 x -1 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str10 = cartService0.addToCart("1 x 1 x  added to cart. added to cart.", (int) 'a');
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str18 = cartService0.addToCart("-1 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", 1);
        boolean boolean19 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97 x 1 x 1 x  added to cart. added to cart. added to cart." + "'", str10, "97 x 1 x 1 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1 x 100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "1 x 100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 x -1 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "1 x -1 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.String str22 = cartService0.addToCart("10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str10, "0 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0 x 1 x 1 x hi! added to cart. added to cart. added to cart." + "'", str13, "0 x 1 x 1 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "0 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1 x 10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str22, "1 x 10 x -1 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap2 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        boolean boolean5 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.lang.String str14 = cartService0.addToCart("0 x 1 x 100 x -1 x 10 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        boolean boolean15 = cartService0.isCartEmpty();
        java.lang.String str16 = cartService0.clearCart();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 10 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 x 0 x 1 x 100 x -1 x 10 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "10 x 0 x 1 x 100 x -1 x 10 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        java.lang.String str18 = cartService0.addToCart("32 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 x 32 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "100 x 32 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str12 = cartService0.addToCart("0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str9, "100 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1 x 0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "1 x 0 x 0 x 10 x 0 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.lang.String str18 = cartService0.clearCart();
        boolean boolean19 = cartService0.isCartEmpty();
        boolean boolean20 = cartService0.isCartEmpty();
        boolean boolean21 = cartService0.isCartEmpty();
        boolean boolean22 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cart cleared." + "'", str11, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cart cleared." + "'", str18, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
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
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.clearCart();
        java.lang.String str20 = cartService0.addToCart("10 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str23 = cartService0.addToCart("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x hi! added to cart." + "'", str10, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "0 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 x 10 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "10 x 10 x 100 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10 x  added to cart." + "'", str23, "10 x  added to cart.");
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
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
        java.util.Map<java.lang.String, java.lang.Integer> strMap16 = cartService0.viewCart();
        java.lang.String str17 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
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
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
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
        java.lang.String str21 = cartService0.addToCart("0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str24 = cartService0.addToCart("100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart.", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = cartService0.viewCart();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100 x 0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "100 x 0 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart." + "'", str24, "0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("-1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.", (int) '#');
        java.lang.String str14 = cartService0.clearCart();
        boolean boolean15 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "35 x -1 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("0 x hi! added to cart.", (-1));
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.lang.String str13 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.Class<?> wildcardClass15 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 x 0 x hi! added to cart. added to cart." + "'", str10, "-1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        boolean boolean3 = cartService0.isCartEmpty();
        java.lang.String str6 = cartService0.addToCart("0 x hi! added to cart.", (int) (short) 1);
        boolean boolean7 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str11 = cartService0.addToCart("52 x 1 x 0 x hi! added to cart. added to cart. added to cart.", 100);
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str15 = cartService0.addToCart("97 x 100 x 97 x  added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str16 = cartService0.clearCart();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 x 0 x hi! added to cart. added to cart." + "'", str6, "1 x 0 x hi! added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart." + "'", str11, "100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart." + "'", str15, "100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
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
        java.lang.String str18 = cartService0.addToCart("1 x -1 x Cart cleared. added to cart. added to cart.", (int) '#');
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        boolean boolean20 = cartService0.isCartEmpty();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35 x 1 x -1 x Cart cleared. added to cart. added to cart. added to cart." + "'", str18, "35 x 1 x -1 x Cart cleared. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str1 = cartService0.clearCart();
        java.lang.String str4 = cartService0.addToCart("0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.util.Map<java.lang.String, java.lang.Integer> strMap5 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap6 = cartService0.viewCart();
        java.lang.String str7 = cartService0.clearCart();
        boolean boolean8 = cartService0.isCartEmpty();
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str12 = cartService0.addToCart("100 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
        java.lang.String str15 = cartService0.addToCart("1 x 1 x 100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cart cleared." + "'", str1, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "-1 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 x 100 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "100 x 100 x 35 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x 1 x 1 x 100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "100 x 1 x 1 x 100 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        business.CartService cartService0 = new business.CartService();
        boolean boolean1 = cartService0.isCartEmpty();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) (short) 10);
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("10 x -1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10 x  added to cart." + "'", str5, "10 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32 x 10 x -1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "32 x 10 x -1 x 10 x 1 x 0 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap3 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap4 = cartService0.viewCart();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("0 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) -1);
        java.lang.String str12 = cartService0.clearCart();
        java.lang.String str13 = cartService0.clearCart();
        boolean boolean14 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 x 0 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "-1 x 0 x 1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cart cleared." + "'", str12, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        boolean boolean7 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.addToCart("Cart cleared.", 0);
        java.lang.String str13 = cartService0.addToCart("10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart.", (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap15 = cartService0.viewCart();
        boolean boolean16 = cartService0.isCartEmpty();
        boolean boolean17 = cartService0.isCartEmpty();
        boolean boolean18 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 x Cart cleared. added to cart." + "'", str10, "0 x Cart cleared. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 x 10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "-1 x 10 x 1 x 52 x 0 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
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
        java.lang.String str17 = cartService0.clearCart();
        boolean boolean18 = cartService0.isCartEmpty();
        java.lang.String str21 = cartService0.addToCart("52 x 10 x 100 x 1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cartService0.viewCart();
        java.lang.String str25 = cartService0.addToCart("32 x 32 x 35 x 100 x 32 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str28 = cartService0.addToCart("", (-1));
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100 x 52 x 10 x 100 x 1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "100 x 52 x 10 x 100 x 1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10 x 32 x 32 x 35 x 100 x 32 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "10 x 32 x 32 x 35 x 100 x 32 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1 x  added to cart." + "'", str28, "-1 x  added to cart.");
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str7 = cartService0.clearCart();
        java.lang.String str8 = cartService0.clearCart();
        java.lang.String str11 = cartService0.addToCart("97 x 0 x 0 x -1 x 97 x 0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", 1);
        java.lang.String str14 = cartService0.addToCart("97 x 1 x 100 x 0 x -1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cart cleared." + "'", str7, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cart cleared." + "'", str8, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 x 97 x 0 x 0 x -1 x 97 x 0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "1 x 97 x 0 x 0 x -1 x 97 x 0 x 97 x 0 x 100 x -1 x 100 x Cart cleared. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 x 97 x 1 x 100 x 0 x -1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "-1 x 97 x 1 x 100 x 0 x -1 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        java.lang.String str18 = cartService0.addToCart("10 x 100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        java.lang.String str21 = cartService0.addToCart("100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        java.lang.String str22 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = cartService0.viewCart();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32 x 10 x 100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "32 x 10 x 100 x 10 x 10 x 97 x 100 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "10 x 100 x 0 x 1 x 1 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cart cleared." + "'", str22, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        java.lang.String str6 = cartService0.clearCart();
        java.lang.String str9 = cartService0.addToCart("100 x 97 x  added to cart. added to cart.", (int) (short) 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cartService0.viewCart();
        boolean boolean11 = cartService0.isCartEmpty();
        boolean boolean12 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        java.lang.String str16 = cartService0.addToCart("97 x 0 x 100 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 100);
        java.lang.String str19 = cartService0.addToCart("0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (short) 10);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cart cleared." + "'", str6, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 x 100 x 97 x  added to cart. added to cart. added to cart." + "'", str9, "0 x 100 x 97 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 x 97 x 0 x 100 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "100 x 97 x 0 x 100 x 0 x 100 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 x 0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "10 x 0 x 10 x 100 x 1 x 100 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        boolean boolean5 = cartService0.isCartEmpty();
        boolean boolean6 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cartService0.viewCart();
        java.lang.String str9 = cartService0.clearCart();
        java.lang.String str12 = cartService0.addToCart("10 x 100 x 100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) ' ');
        boolean boolean13 = cartService0.isCartEmpty();
        java.lang.Class<?> wildcardClass14 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cart cleared." + "'", str9, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 x 10 x 100 x 100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "32 x 10 x 100 x 100 x 52 x 100 x 10 x -1 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        boolean boolean4 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("97 x  added to cart.", (int) (byte) 100);
        java.lang.String str12 = cartService0.addToCart("1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (-1));
        java.lang.String str13 = cartService0.clearCart();
        java.lang.String str14 = cartService0.clearCart();
        java.lang.String str17 = cartService0.addToCart("97 x 52 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.", (int) (byte) 10);
        boolean boolean18 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.lang.String str20 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cartService0.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 x 97 x  added to cart. added to cart." + "'", str9, "100 x 97 x  added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "-1 x 1 x 1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cart cleared." + "'", str13, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cart cleared." + "'", str14, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 x 97 x 52 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "10 x 97 x 52 x 0 x 1 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cart cleared." + "'", str20, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        business.CartService cartService0 = new business.CartService();
        java.lang.String str3 = cartService0.addToCart("hi!", 0);
        java.lang.String str6 = cartService0.addToCart("", 0);
        java.util.Map<java.lang.String, java.lang.Integer> strMap7 = cartService0.viewCart();
        java.lang.String str10 = cartService0.addToCart("0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 100);
        boolean boolean11 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = cartService0.viewCart();
        boolean boolean14 = cartService0.isCartEmpty();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.Class<?> wildcardClass16 = cartService0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 x hi! added to cart." + "'", str3, "0 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0 x  added to cart." + "'", str6, "0 x  added to cart.");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "100 x 0 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        java.lang.String str4 = cartService0.addToCart("hi!", 1);
        java.lang.String str5 = cartService0.clearCart();
        boolean boolean6 = cartService0.isCartEmpty();
        java.lang.String str9 = cartService0.addToCart("32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart.", (int) (short) 1);
        java.lang.String str10 = cartService0.clearCart();
        java.lang.String str13 = cartService0.addToCart("10 x 0 x hi! added to cart. added to cart.", (int) (short) 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        boolean boolean15 = cartService0.isCartEmpty();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1 x hi! added to cart." + "'", str4, "1 x hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cart cleared." + "'", str5, "Cart cleared.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "1 x 32 x 1 x 0 x 0 x  added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1 x 10 x 0 x hi! added to cart. added to cart. added to cart." + "'", str13, "1 x 10 x 0 x hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        business.CartService cartService0 = new business.CartService();
        java.util.Map<java.lang.String, java.lang.Integer> strMap1 = cartService0.viewCart();
        boolean boolean2 = cartService0.isCartEmpty();
        java.lang.String str5 = cartService0.addToCart("", (int) 'a');
        java.lang.String str8 = cartService0.addToCart("0 x 0 x  added to cart. added to cart.", (int) (byte) 1);
        boolean boolean9 = cartService0.isCartEmpty();
        java.lang.String str10 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap12 = cartService0.viewCart();
        boolean boolean13 = cartService0.isCartEmpty();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cartService0.viewCart();
        java.lang.String str15 = cartService0.clearCart();
        java.lang.String str16 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap17 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cartService0.viewCart();
        java.lang.String str21 = cartService0.addToCart("1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.", 10);
        java.lang.Class<?> wildcardClass22 = cartService0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "97 x  added to cart." + "'", str5, "97 x  added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 x 0 x 0 x  added to cart. added to cart. added to cart." + "'", str8, "1 x 0 x 0 x  added to cart. added to cart. added to cart.");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cart cleared." + "'", str10, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cart cleared." + "'", str15, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cart cleared." + "'", str16, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "10 x 1 x 1 x 52 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
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
        boolean boolean16 = cartService0.isCartEmpty();
        java.lang.String str17 = cartService0.clearCart();
        java.lang.String str20 = cartService0.addToCart("0 x 1 x 0 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart.", 100);
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
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cart cleared." + "'", str17, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100 x 0 x 1 x 0 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "100 x 0 x 1 x 0 x 10 x 97 x  added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
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
        boolean boolean17 = cartService0.isCartEmpty();
        boolean boolean18 = cartService0.isCartEmpty();
        boolean boolean19 = cartService0.isCartEmpty();
        java.lang.String str20 = cartService0.clearCart();
        java.lang.String str21 = cartService0.clearCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap22 = cartService0.viewCart();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cart cleared." + "'", str20, "Cart cleared.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cart cleared." + "'", str21, "Cart cleared.");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
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
        java.lang.String str15 = cartService0.addToCart("1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", (int) (byte) 100);
        java.lang.String str18 = cartService0.addToCart("10 x  added to cart.", 1);
        java.util.Map<java.lang.String, java.lang.Integer> strMap19 = cartService0.viewCart();
        java.util.Map<java.lang.String, java.lang.Integer> strMap20 = cartService0.viewCart();
        java.lang.String str23 = cartService0.addToCart("100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart.", 10);
        java.util.Map<java.lang.String, java.lang.Integer> strMap24 = cartService0.viewCart();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "100 x 1 x 100 x 10 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1 x 10 x  added to cart. added to cart." + "'", str18, "1 x 10 x  added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10 x 100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "10 x 100 x 0 x 1 x 0 x hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strMap24);
    }
}

