import com.google.gson.Gson;
import pojoClasses.ActorGson;
import pojoClasses.Movie;
import pojoClasses.SafeRequest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class GoogleGsonTest {

    public static void main(String[] args) {

        //  Object to create
/*        SafeRequest reqObject = new SafeRequest();
        System.out.println("reqObject: " + reqObject);*/

        SimpleSerialization();
    }
//  https://www.baeldung.com/jackson-vs-gson

    public static void SimpleSerialization() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date actorDateOfBirth = null;
        try {
            actorDateOfBirth = sdf.parse("21-09-1982");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ActorGson rudyYoungblood = new ActorGson(
                "nm2199632",
                actorDateOfBirth,
                Arrays.asList("Apocalypto",
                        "Beatdown", "Wind Walkers")
        );
        Movie movie = new Movie(
                "tt0472043",
                "Mel Gibson",
                Arrays.asList(rudyYoungblood));

        String serializedMovie = new Gson().toJson(movie);
        System.out.println(serializedMovie);

    }

}
