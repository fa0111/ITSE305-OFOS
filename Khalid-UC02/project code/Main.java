import com.ofos.data.RestaurantRepository;
import com.ofos.business.RestaurantService;
import com.ofos.presentation.RestaurantController;

/**
 * UC-02 Browse/Search Restaurants
 * Student: Khalid Alrashdan
 * Student ID: 202302598
 */
public class Main {

    public static void main(String[] args) {

        RestaurantRepository repository = new RestaurantRepository();

        RestaurantService service = new RestaurantService(repository);

        RestaurantController controller = new RestaurantController(service);

        controller.run();
    }
}
