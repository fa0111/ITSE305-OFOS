import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        business.AuthService authService0 = new business.AuthService();
        java.lang.Class<?> wildcardClass1 = authService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("hi!", "", "");
        java.lang.Class<?> wildcardClass5 = authService0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        java.lang.String str4 = userRepository0.findByUsername("hi!");
        java.lang.Class<?> wildcardClass5 = userRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.Class<?> wildcardClass1 = userRepository0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        data.UserRepository userRepository0 = new data.UserRepository();
        userRepository0.saveUser("hi!", "ERROR: Password must be at least 6 characters.");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        java.lang.String str4 = userRepository0.findByUsername("hi!");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "hi!");
        userRepository0.saveUser("", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        java.lang.Class<?> wildcardClass3 = userRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("hi!", "", "");
        java.lang.String str8 = authService0.register("", "ERROR: Password cannot be empty.", "hi!");
        java.lang.Class<?> wildcardClass9 = authService0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR: Username cannot be empty." + "'", str8, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("ERROR: Username cannot be empty.");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str10 = userRepository0.findByUsername("");
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..", "ERROR: Password cannot be empty.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str10, "ERROR: Password must be at least 6 characters.");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        boolean boolean10 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("ERROR: Invalid credentials. User not found.", "ERROR: Invalid credentials. User not found.");
        boolean boolean15 = userRepository0.userExists("ERROR: Password cannot be empty.");
        java.lang.String str17 = userRepository0.findByUsername("ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str10 = userRepository0.findByUsername("ERROR: Password must be at least 6 characters.");
        java.lang.String str12 = userRepository0.findByUsername("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Invalid credentials. User not found.");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str3 = authService0.login("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ERROR: Password cannot be empty." + "'", str3, "ERROR: Password cannot be empty.");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean2 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        boolean boolean4 = userRepository0.userExists("");
        boolean boolean6 = userRepository0.userExists("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("hi!", "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        boolean boolean10 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        boolean boolean12 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("ERROR: Password must be at least 6 characters.", "ERROR: Username cannot be empty.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("hi!", "", "");
        java.lang.String str7 = authService0.login("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..", "ERROR: Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str7, "ERROR: Invalid credentials. User not found.");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        java.lang.String str4 = userRepository0.findByUsername("hi!");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "hi!");
        userRepository0.saveUser("", "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..");
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..", "hi!");
        java.lang.Class<?> wildcardClass14 = userRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str8 = authService0.register("", "hi!", "");
        java.lang.String str11 = authService0.login("hi!", "ERROR: Role must be selected.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR: Username cannot be empty." + "'", str8, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str11, "ERROR: Invalid credentials. User not found.");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        java.lang.String str7 = userRepository0.findByUsername("ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str10 = userRepository0.findByUsername("ERROR: Password must be at least 6 characters.");
        java.lang.String str12 = userRepository0.findByUsername("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..");
        boolean boolean14 = userRepository0.userExists("ERROR: Password cannot be empty.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        java.lang.String str4 = userRepository0.findByUsername("hi!");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "hi!");
        userRepository0.saveUser("", "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..");
        userRepository0.saveUser("", "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str8 = authService0.register("", "hi!", "");
        java.lang.String str12 = authService0.register("ERROR: Role must be selected.", "ERROR: Password cannot be empty.", "ERROR: Username cannot be empty.");
        java.lang.String str15 = authService0.login("ERROR: Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR: Username cannot be empty." + "'", str8, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SUCCESS: Account created for ERROR: Role must be selected. as ERROR: Username cannot be empty.." + "'", str12, "SUCCESS: Account created for ERROR: Role must be selected. as ERROR: Username cannot be empty..");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ERROR: Password cannot be empty." + "'", str15, "ERROR: Password cannot be empty.");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str10 = userRepository0.findByUsername("ERROR: Password must be at least 6 characters.");
        java.lang.String str12 = userRepository0.findByUsername("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..", "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str10 = userRepository0.findByUsername("ERROR: Username cannot be empty.");
        java.lang.String str12 = userRepository0.findByUsername("hi!");
        boolean boolean14 = userRepository0.userExists("ERROR: Password cannot be empty.");
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str3 = authService0.login("", "");
        java.lang.String str6 = authService0.login("", "ERROR: Username cannot be empty.");
        java.lang.String str9 = authService0.login("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..", "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ERROR: Username cannot be empty." + "'", str3, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR: Username cannot be empty." + "'", str6, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str9, "ERROR: Invalid credentials. User not found.");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str10 = userRepository0.findByUsername("");
        java.lang.String str12 = userRepository0.findByUsername("");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password cannot be empty.");
        java.lang.Class<?> wildcardClass16 = userRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str10, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str12, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        data.UserRepository userRepository0 = new data.UserRepository();
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..", "SUCCESS: Account created for ERROR: Role must be selected. as ERROR: Username cannot be empty..");
        java.lang.String str5 = userRepository0.findByUsername("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        boolean boolean10 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("ERROR: Invalid credentials. User not found.", "ERROR: Invalid credentials. User not found.");
        boolean boolean15 = userRepository0.userExists("SUCCESS: Account created for ERROR: Role must be selected. as ERROR: Username cannot be empty..");
        userRepository0.saveUser("", "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str8 = authService0.register("", "hi!", "");
        java.lang.String str11 = authService0.login("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..", "ERROR: Invalid credentials. User not found.");
        java.lang.String str15 = authService0.register("ERROR: Username cannot be empty.", "ERROR: Password must be at least 6 characters.", "SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR: Username cannot be empty." + "'", str8, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str11, "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SUCCESS: Account created for ERROR: Username cannot be empty. as SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..." + "'", str15, "SUCCESS: Account created for ERROR: Username cannot be empty. as SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters...");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        boolean boolean10 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("ERROR: Invalid credentials. User not found.", "ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("ERROR: Password must be at least 6 characters.", "ERROR: Password must be at least 6 characters.");
        boolean boolean18 = userRepository0.userExists("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..");
        boolean boolean20 = userRepository0.userExists("SUCCESS: Account created for ERROR: Username cannot be empty. as SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters...");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str8 = authService0.register("ERROR: Username cannot be empty.", "ERROR: Username cannot be empty.", "ERROR: Username cannot be empty.");
        java.lang.String str11 = authService0.login("hi!", "ERROR: Invalid credentials. User not found.");
        java.lang.String str14 = authService0.login("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty.." + "'", str8, "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str11, "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str14, "ERROR: Invalid credentials. User not found.");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str7 = authService0.login("ERROR: Username cannot be empty.", "");
        java.lang.String str10 = authService0.login("hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str14 = authService0.register("ERROR: Password must be at least 6 characters.", "ERROR: Password must be at least 6 characters.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str17 = authService0.login("ERROR: Role must be selected.", "SUCCESS: Account created for ERROR: Username cannot be empty. as SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters...");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ERROR: Password cannot be empty." + "'", str7, "ERROR: Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str10, "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters.." + "'", str14, "SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str17, "ERROR: Invalid credentials. User not found.");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str3 = authService0.login("", "hi!");
        java.lang.String str6 = authService0.login("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ERROR: Username cannot be empty." + "'", str3, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR: Password cannot be empty." + "'", str6, "ERROR: Password cannot be empty.");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean2 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Username cannot be empty. as SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        data.UserRepository userRepository0 = new data.UserRepository();
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..", "ERROR: Password cannot be empty.");
        userRepository0.saveUser("ERROR: Role must be selected.", "hi!");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        boolean boolean10 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        boolean boolean12 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        java.lang.Class<?> wildcardClass13 = userRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        boolean boolean10 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("ERROR: Invalid credentials. User not found.", "ERROR: Invalid credentials. User not found.");
        userRepository0.saveUser("ERROR: Password must be at least 6 characters.", "ERROR: Password must be at least 6 characters.");
        boolean boolean18 = userRepository0.userExists("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..");
        userRepository0.saveUser("ERROR: Role must be selected.", "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        data.UserRepository userRepository0 = new data.UserRepository();
        boolean boolean2 = userRepository0.userExists("ERROR: Invalid credentials. User not found.");
        boolean boolean4 = userRepository0.userExists("");
        userRepository0.saveUser("hi!", "hi!");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "SUCCESS: Account created for ERROR: Username cannot be empty. as SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        userRepository0.saveUser("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..", "SUCCESS: Account created for ERROR: Role must be selected. as ERROR: Username cannot be empty..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str8 = authService0.register("ERROR: Username cannot be empty.", "ERROR: Username cannot be empty.", "ERROR: Username cannot be empty.");
        java.lang.String str11 = authService0.login("hi!", "ERROR: Invalid credentials. User not found.");
        java.lang.Class<?> wildcardClass12 = authService0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty.." + "'", str8, "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str11, "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str7 = authService0.login("ERROR: Username cannot be empty.", "");
        java.lang.String str11 = authService0.register("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..", "", "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..");
        java.lang.String str15 = authService0.register("", "", "");
        java.lang.String str19 = authService0.register("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..", "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..", "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ERROR: Password cannot be empty." + "'", str7, "ERROR: Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str11, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ERROR: Username cannot be empty." + "'", str15, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "SUCCESS: Account created for SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters.. as SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..." + "'", str19, "SUCCESS: Account created for SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters.. as SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters...");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str3 = authService0.login("", "hi!");
        java.lang.String str6 = authService0.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ERROR: Username cannot be empty." + "'", str3, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ERROR: Password cannot be empty." + "'", str6, "ERROR: Password cannot be empty.");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str8 = authService0.register("", "hi!", "");
        java.lang.String str12 = authService0.register("ERROR: Username cannot be empty.", "ERROR: Password cannot be empty.", "ERROR: Password must be at least 6 characters.");
        java.lang.String str16 = authService0.register("ERROR: Username cannot be empty.", "SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..", "");
        java.lang.String str20 = authService0.register("ERROR: Username cannot be empty.", "ERROR: Password cannot be empty.", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ERROR: Username cannot be empty." + "'", str8, "ERROR: Username cannot be empty.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters.." + "'", str12, "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Password must be at least 6 characters..");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ERROR: Role must be selected." + "'", str16, "ERROR: Role must be selected.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ERROR: Role must be selected." + "'", str20, "ERROR: Role must be selected.");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        java.lang.String str4 = userRepository0.findByUsername("hi!");
        userRepository0.saveUser("ERROR: Password cannot be empty.", "hi!");
        java.lang.Class<?> wildcardClass8 = userRepository0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        java.lang.String str4 = userRepository0.findByUsername("hi!");
        java.lang.String str6 = userRepository0.findByUsername("ERROR: Invalid credentials. User not found.");
        boolean boolean8 = userRepository0.userExists("SUCCESS: Account created for ERROR: Role must be selected. as ERROR: Username cannot be empty..");
        java.lang.String str10 = userRepository0.findByUsername("SUCCESS: Account created for ERROR: Password must be at least 6 characters. as ERROR: Password must be at least 6 characters..");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        data.UserRepository userRepository0 = new data.UserRepository();
        java.lang.String str2 = userRepository0.findByUsername("");
        userRepository0.saveUser("", "SUCCESS: Account created for ERROR: Role must be selected. as ERROR: Username cannot be empty..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str7 = authService0.login("ERROR: Username cannot be empty.", "");
        java.lang.String str10 = authService0.login("hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str13 = authService0.login("ERROR: Role must be selected.", "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ERROR: Password cannot be empty." + "'", str7, "ERROR: Password cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str10, "ERROR: Invalid credentials. User not found.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ERROR: Invalid credentials. User not found." + "'", str13, "ERROR: Invalid credentials. User not found.");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        business.AuthService authService0 = new business.AuthService();
        java.lang.String str4 = authService0.register("ERROR: Password must be at least 6 characters.", "hi!", "ERROR: Password must be at least 6 characters.");
        java.lang.String str8 = authService0.register("ERROR: Username cannot be empty.", "ERROR: Username cannot be empty.", "ERROR: Username cannot be empty.");
        java.lang.String str12 = authService0.register("SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..", "hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str4, "ERROR: Password must be at least 6 characters.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty.." + "'", str8, "SUCCESS: Account created for ERROR: Username cannot be empty. as ERROR: Username cannot be empty..");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ERROR: Password must be at least 6 characters." + "'", str12, "ERROR: Password must be at least 6 characters.");
    }
}

