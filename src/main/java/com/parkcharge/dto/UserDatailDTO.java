package com.parkcharge.dto;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.social.security.SocialUser;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/**
 * Created by smatino on 01/09/2017.
 */
public class UserDatailDTO  extends SocialUser {



        private Long id;

        private String firstName;

        private String lastName;

        private Role role;

        private SocialMediaService socialSignInProvider;

        public UserDatailDTO(String username, String password, Collection<? extends GrantedAuthority> authorities) {
            super(username, password, authorities);
        }

        //Getters are omitted for the sake of clarity.

        public static class Builder {

            private Long id;

            private String username;

            private String firstName;

            private String lastName;

            private String password;

            private Role role;

            private SocialMediaService socialSignInProvider;

            private Set<GrantedAuthority> authorities;

            public Builder() {
                this.authorities = new HashSet();
            }

            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Builder password(String password) {
                if (password == null) {
                    password = "SocialUser";
                }

                this.password = password;
                return this;
            }

            public Builder role(Role role) {
                this.role = role;

                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.toString());
                this.authorities.add(authority);

                return this;
            }

            public Builder socialSignInProvider(SocialMediaService socialSignInProvider) {
                this.socialSignInProvider = socialSignInProvider;
                return this;
            }

            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public UserDatailDTO build() {
                UserDatailDTO user = new UserDatailDTO(username, password, authorities);

                user.id = id;
                user.firstName = firstName;
                user.lastName = lastName;
                user.role = role;
                user.socialSignInProvider = socialSignInProvider;

                return user;
            }
        }
    }