package org.example.flyweight.chessuseroptm;

import lombok.Getter;

@IntrinsicState
@Getter
public class UserIntrinsicState {

    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;
}