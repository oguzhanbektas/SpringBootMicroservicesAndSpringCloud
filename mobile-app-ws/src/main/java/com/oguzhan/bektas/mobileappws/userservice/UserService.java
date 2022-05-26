package com.oguzhan.bektas.mobileappws.userservice;

import com.oguzhan.bektas.mobileappws.ui.model.reponse.UserRest;
import com.oguzhan.bektas.mobileappws.ui.model.request.UserDetailsRequestModel;

public interface UserService {

    UserRest createUser(UserDetailsRequestModel userDetails);
}
