package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class PlayerTestSuite {

    @Test
    public void testSetAndGetName(){
        //Given
        Player player = new Player();
        //When
        player.setPlayerName("Kamil");
        //Then
        Assert.assertEquals("Kamil", player.getPlayerName());
    }

    @Test
    public void testPlayerMoveRock(){
        //Given
        Player mockPlayerRock = mock(Player.class);

        when(mockPlayerRock.playerMove()).thenReturn(Moves.ROCK);

        //When
        Moves rock = mockPlayerRock.playerMove();

        //Then
        Assert.assertEquals(Moves.ROCK, rock);
    }

    @Test
    public void testPlayerMoveScissors(){
        //Given
        Player mockPlayerScissors = mock(Player.class);

        when(mockPlayerScissors.playerMove()).thenReturn(Moves.SCISSORS);

        //When
        Moves scissors = mockPlayerScissors.playerMove();

        //Then
        Assert.assertEquals(Moves.SCISSORS, scissors);
    }

    @Test
    public void testPlayerMovePaper(){
        //Given
        Player mockPlayerPaper = mock(Player.class);

        when(mockPlayerPaper.playerMove()).thenReturn(Moves.PAPER);

        //When
        Moves paper = mockPlayerPaper.playerMove();

        //Then
        Assert.assertEquals(Moves.PAPER, paper);
    }

    @Test
    public void testSetAndGetPoints(){
        //Given
        Player player = new Player();
        //When
        player.setPlayerPoints(5);
        //Then
        Assert.assertEquals(5, player.getPlayerPoints());
    }
}