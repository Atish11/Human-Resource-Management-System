/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atish.HumanResourceManagementSystem.configuration;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Atish Ojha
 */

//this is used to make passwordencoder
public class MyPasswordEncoder implements PasswordEncoder{
    
    @Override
    public String encode(CharSequence cs)
    {
        return cs.toString();
    }

    @Override
    public boolean matches(CharSequence cs, String string) {
        return cs.toString().equals(string);
    }
    
}
