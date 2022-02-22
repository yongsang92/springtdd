package com.example.springtdd;

import com.example.springtdd.pojo.Person;
import com.example.springtdd.webrepo.ItemRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class SpringtddApplicationTests {


    @Mock
    Person person;


    @Test
    public void 랜덤숫자_반환_테스트() {

        BDDMockito.given(person.getAge()).willReturn(20);

        Assertions.assertThat(person.getAge()).isEqualTo(20);



    }

}