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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.ofos.data.RestaurantRepository restaurantRepository0 = null;
        com.ofos.business.RestaurantService restaurantService1 = new com.ofos.business.RestaurantService(restaurantRepository0);
        java.lang.Class<?> wildcardClass2 = restaurantService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.ofos.data.RestaurantRepository restaurantRepository0 = null;
        com.ofos.business.RestaurantService restaurantService1 = new com.ofos.business.RestaurantService(restaurantRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.ofos.model.Restaurant> restaurantList3 = restaurantService1.searchRestaurants("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search keyword cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.ofos.data.RestaurantRepository restaurantRepository0 = null;
        com.ofos.business.RestaurantService restaurantService1 = new com.ofos.business.RestaurantService(restaurantRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.ofos.model.Restaurant restaurant3 = restaurantService1.getRestaurantById("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Restaurant ID cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.ofos.data.RestaurantRepository restaurantRepository0 = null;
        com.ofos.business.RestaurantService restaurantService1 = new com.ofos.business.RestaurantService(restaurantRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.ofos.model.Restaurant> restaurantList3 = restaurantService1.searchRestaurants("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.ofos.data.RestaurantRepository.searchByKeyword(String)\" because \"this.restaurantRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        com.ofos.data.RestaurantRepository restaurantRepository0 = null;
        com.ofos.business.RestaurantService restaurantService1 = new com.ofos.business.RestaurantService(restaurantRepository0);
        // The following exception was thrown during execution in test generation
        try {
            com.ofos.model.Restaurant restaurant3 = restaurantService1.getRestaurantById("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.ofos.data.RestaurantRepository.findById(String)\" because \"this.restaurantRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.ofos.data.RestaurantRepository restaurantRepository0 = null;
        com.ofos.business.RestaurantService restaurantService1 = new com.ofos.business.RestaurantService(restaurantRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.ofos.model.Restaurant> restaurantList2 = restaurantService1.browseOpenRestaurants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.ofos.data.RestaurantRepository.findAll()\" because \"this.restaurantRepository\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}