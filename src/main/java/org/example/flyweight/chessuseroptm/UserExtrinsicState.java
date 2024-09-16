package org.example.flyweight.chessuseroptm;

import lombok.Getter;

@ExtrinsicState
@Getter
public class UserExtrinsicState {


    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState user;
}