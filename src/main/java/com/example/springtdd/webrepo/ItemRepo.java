package com.example.springtdd.webrepo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

public interface ItemRepo {

    ArrayList<Integer> randomNumber();
}
