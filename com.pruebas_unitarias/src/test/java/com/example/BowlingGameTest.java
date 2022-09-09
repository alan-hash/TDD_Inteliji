package com.example;

import com.example.BowlingGame.BowlingGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @BeforeEach
    public void setUp() throws Exception{
        bowlingGame=new BowlingGame();


    }

    @Test
    public  void testGutterGame()   throws Exception {
        rolMany(20,0);
        assertEquals(0,bowlingGame.score());
        }


    @Test
    public  void testAllOnes()   throws Exception {
        rolMany(20,1);
        assertEquals(20, bowlingGame.score());
    }

    @Test
    public  void testAllOneSpare()   throws Exception {
        rolSpace();
        bowlingGame.roll(3);

        rolMany(17,0);
        assertEquals(16,bowlingGame.score());
    }

    @Test
    public  void testAllOneStrike()   throws Exception {
        bowlingGame.roll(10);
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        bowlingGame.roll(0);
        rolMany(16,0);
        assertEquals(24,bowlingGame.score());
    }




    private void rolMany(int n,int pins){
        for (int i = 0; i < n ; i++) {
            bowlingGame.roll(pins);
        }
    }

    private void rolSpace(){
        bowlingGame.roll(5);
        bowlingGame.roll(5);

    }


}
