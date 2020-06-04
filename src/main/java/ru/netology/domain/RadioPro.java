package ru.netology.domain;

public class RadioPro {
    private int currentStation;
    private int maxNumberStation;
    private int minNumberStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private boolean on;

    public RadioPro(int currentStation, int maxNumberStation, int currentVolume) {
        this.currentStation = currentStation;
        this.maxNumberStation = maxNumberStation;
        this.currentVolume = currentVolume;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxNumberStation) {
            this.currentStation = maxNumberStation;
            return;
        }
        if (currentStation < minNumberStation) {
            this.currentStation = minNumberStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void makeNumberStationHigher() {
        if (currentStation == maxNumberStation) {
            this.currentStation = minNumberStation;
            return;
        }
        currentStation++;
    }

    public void makeNumberStationLower() {
        if (currentStation == minNumberStation) {
            this.currentStation = maxNumberStation;
            return;
        }
        currentStation--;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        return;
        }
        currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        currentVolume--;
    }
}
