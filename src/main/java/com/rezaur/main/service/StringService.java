package com.rezaur.main.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {
    public Integer lengths(String s) throws NullPointerException {
        if (s.length() < 5) {
            throw new NullPointerException();
        }
        return s.length();
    }

}
