package com.google.training.ghostcast;
import com.google.training.ghostcast.model.*;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.Named;

/**
 * Defines endpoint functions APIs.
 */
@Api(name = "helloworldendpoints", version = "v1",
scopes = {Constants.EMAIL_SCOPE },
        clientIds = {Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID },
        description = "API for hello world endpoints.")

public class UserEndpoints {

   // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "sayHello", path = "sayHello",
            httpMethod = HttpMethod.GET)

    public UserClass sayHello() {
        return new UserClass();
    }

    // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "fetchUsers", path = "",
            httpMethod = HttpMethod.GET)

    public UserClass fetchUsers (@Named("name") String name) {
        return new UserClass(name);
    }
    
    // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "createUser", path = "create",
            httpMethod = HttpMethod.POST)

    public UserClass createUser (@Named("name") String name) {
        return new UserClass(name);
    }
}
