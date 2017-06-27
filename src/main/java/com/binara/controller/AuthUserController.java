package com.binara.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by binara on 6/24/17.
 */

@RestController
public class AuthUserController {

    @RequestMapping("/auth_user/")
    public String getAuthUser(OAuth2Authentication auth) {
        StringBuffer sb = new StringBuffer();
        sb.append("{username: ");
        sb.append(auth.getName());
        sb.append(", roles: [");
        auth.getAuthorities().forEach(a -> sb.append(a.getAuthority()));
        sb.append("]");
        sb.append("}");
        return sb.toString();
    }

}
