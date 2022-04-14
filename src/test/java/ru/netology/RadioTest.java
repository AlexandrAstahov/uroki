package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldUpVolume(){
        Radio radio = new Radio();
        radio.upVolume(11);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldUpVolumeAboveRange(){
        Radio radio = new Radio();
        radio.upVolume(11);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldDownVolume(){
        Radio radio = new Radio();
        radio.downVolume(2);
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void shouldDownVolumeBelowRange(){
        Radio radio = new Radio();
        radio.downVolume(-1);
        assertEquals(0, radio.getVolume());
    }
}