package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldUpVolume(){
        Radio radio = new Radio();
        radio.upVolume(6);
        assertEquals(7, radio.getVolume());
    }

    @Test
    public void shouldUpVolumeBelowRange(){
        Radio radio = new Radio();
        radio.upVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldUpVolumeAboveRange(){
        Radio radio = new Radio();
        radio.upVolume(11);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldUpVolumeMax(){
        Radio radio = new Radio();
        radio.upVolume(10);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldUpVolumeMin(){
        Radio radio = new Radio();
        radio.upVolume(0);
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void shouldDownVolume(){
        Radio radio = new Radio();
        radio.downVolume(8);
        assertEquals(7, radio.getVolume());
    }

    @Test
    public void shouldDownVolumeBelowRange(){
        Radio radio = new Radio();
        radio.downVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldDownVolumeAboveRange(){
        Radio radio = new Radio();
        radio.downVolume(11);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldDownVolumeMax(){
        Radio radio = new Radio();
        radio.downVolume(10);
        assertEquals(9, radio.getVolume());
    }

    @Test
    public void shouldDownVolumeMin(){
        Radio radio = new Radio();
        radio.downVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldSetNumberStation (){
        Radio radio = new Radio();
        radio.setNumberStation(4);
        assertEquals(4,radio.getNumberStation());
    }

    @Test
    public void shouldSetNumberStationBelowRange (){
        Radio radio = new Radio();
        radio.setNumberStation(-1);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    public void shouldSetNumberStationAboveRange (){
        Radio radio = new Radio();
        radio.setNumberStation(10);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    public void shouldUpStation (){
        Radio radio = new Radio();
        radio.upStation(7);
        assertEquals(8,radio.getNumberStation());
    }

    @Test
    public void shouldUpStationMax (){
        Radio radio = new Radio();
        radio.upStation(9);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    public void shouldUpStationMin (){
        Radio radio = new Radio();
        radio.upStation(0);
        assertEquals(1,radio.getNumberStation());
    }

    @Test
    public void shouldUpStationBelowRange (){
        Radio radio = new Radio();
        radio.upStation(-1);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    public void shouldUpStationAboveRange (){
        Radio radio = new Radio();
        radio.upStation(10);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    public void shouldDownStation (){
        Radio radio = new Radio();
        radio.downStation(7);
        assertEquals(6,radio.getNumberStation());
    }

    @Test
    public void shouldDownStationMax (){
        Radio radio = new Radio();
        radio.downStation(9);
        assertEquals(8,radio.getNumberStation());
    }

    @Test
    public void shouldDownStationMin (){
        Radio radio = new Radio();
        radio.downStation(0);
        assertEquals(9,radio.getNumberStation());
    }

    @Test
    public void shouldDownStationBelowRange (){
        Radio radio = new Radio();
        radio.downStation(-1);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    public void shouldDownStationAboveRange (){
        Radio radio = new Radio();
        radio.downStation(10);
        assertEquals(0,radio.getNumberStation());
    }
}