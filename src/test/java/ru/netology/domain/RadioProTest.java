package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioProTest {

    @Test
    void shouldMakeNumberStationHigher() {
        RadioPro radio = new RadioPro();
        radio.setCurrentStation(0);
        radio.makeNumberStationHigher();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeNumberStationLower() {
        RadioPro radio = new RadioPro();
        radio.setCurrentStation(2);
        radio.makeNumberStationLower();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeHigher() {
        RadioPro radio = new RadioPro();
        radio.setVolume(5);
        radio.increaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeLower() {
        RadioPro radio = new RadioPro();
        radio.setVolume(8);
        radio.decreaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberStationIsMax() {
        RadioPro radio = new RadioPro();
        radio.setCurrentStation(9);
        radio.makeNumberStationHigher();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeNumberStationIsMin() {
        RadioPro radio = new RadioPro();
        radio.setCurrentStation(0);
        radio.makeNumberStationLower();
        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberStationAboveMax() {
        RadioPro radio = new RadioPro();
        radio.setCurrentStation(10);
        radio.makeNumberStationHigher();
        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void shouldMakeNumberStationBelowMin() {
        RadioPro radio = new RadioPro();
        radio.setCurrentStation(-3);
        radio.makeNumberStationLower();
        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeIsMax() {
        RadioPro radio = new RadioPro();
        radio.setVolume(10);
        radio.increaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void shouldGetVolumeIsMin() {
        RadioPro radio = new RadioPro();
        radio.setVolume(0);
        radio.decreaseCurrentVolume();
        int actual = radio.getVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
