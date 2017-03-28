package twitter_webservice.Rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

/**
 * Created by Anna-May on 16/03/2017.
 */

@Path("/RestService")
@ApplicationPath("/resources")
public class Rest extends Application{

    // http://localhost:/kwetter1/src/main/java/twitter_webservice/Rest/Rest/sayHello
    @GET
    @Path("/sayHello")
    public String getHelloMasg(){
        return "Hello World";
    }


}
