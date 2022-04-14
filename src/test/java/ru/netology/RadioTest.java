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

    @Test
    public void shouldUpStation (){
        Radio radio = new Radio();
        radio.upStation(0);
        assertEquals(1,radio.getNumberStation());
    }

    @Test
    public void shouldUpStationMax (){
        Radio radio = new Radio();
        radio.upStation(10);
        assertEquals(0,radio.getNumberStation());
    }

    @Test
    public void shouldDownStation (){
        Radio radio = new Radio();
        radio.downStation(8);
        assertEquals(7,radio.getNumberStation());
    }

    @Test
    public void shouldDownStationMin (){
        Radio radio = new Radio();
        radio.downStation(0);
        assertEquals(10,radio.getNumberStation());
    }

    @Test
    public void shouldsetNumberStation (){
        Radio radio = new Radio();
        radio.setNumberStation(4);
        assertEquals(4,radio.getNumberStation());
    }

    @Test
    public void shouldsetNumberStationAboveTheLimit () {
        Radio radio = new Radio();
        radio.setNumberStation(10);
        assertEquals(0, radio.getNumberStation());
    }

    @Test
    public void shouldsetNumberStationBelowLimit () {
        Radio radio = new Radio();
        radio.setNumberStation(-1);
        assertEquals(0, radio.getNumberStation());
    }

}