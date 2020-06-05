package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioProTest {
    RadioPro radio = new RadioPro(5, 10, 0, 50, 100, 0);

    @Test
    void shouldMakeNumberStationHigher() {
        radio.makeNumberStationHigher();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldMakeNumberStationLower() {
        radio.makeNumberStationLower();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldGetVolumeHigher() {
        radio.increaseCurrentVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void shouldGetVolumeLower() {
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void shouldNumberStationIsMax() {
        radio.setCurrentStation(10);
        radio.makeNumberStationHigher();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldMakeNumberStationIsMin() {
        radio.setCurrentStation(0);
        radio.makeNumberStationLower();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldNumberStationAboveMax() {
        radio.setCurrentStation(20);
        radio.makeNumberStationHigher();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldMakeNumberStationBelowMin() {
        radio.setCurrentStation(-3);
        radio.makeNumberStationLower();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldGetVolumeIsMax() {
        radio.setVolume(100);
        radio.increaseCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldGetVolumeIsMin() {
        radio.setVolume(0);
        radio.decreaseCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldGetVolumeLowerMin() {
        radio.setVolume(50);
        radio.decreaseCurrentVolume();
        assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    void shouldSetNumberOfStationAndPushNext() {
        radio.setMaxNumberStation(50);
        radio.setCurrentStation(40);
        radio.makeNumberStationHigher();
        assertEquals(41, radio.getCurrentStation());
    }

    @Test
    void shouldSetNumberOfStationAndPushPrev() {
        radio.setMaxNumberStation(40);
        radio.setCurrentStation(15);
        radio.makeNumberStationLower();
        assertEquals(14, radio.getCurrentStation());
    }
}
