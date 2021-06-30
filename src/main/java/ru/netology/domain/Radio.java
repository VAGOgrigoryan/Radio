package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int maxStation = 10;
    private int minStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {

    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public Radio(int maxStation, int minStation, int currentStation, int maxVolume, int minVolume, int currentVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }
    public Radio (int currentStation, int currentVolume){
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;

    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int newMaxStation) {
        this.maxStation = newMaxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int newMinStation) {
        this.minStation = newMinStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        this.currentStation = newCurrentStation;
    }

    public void increaseStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void decreaseStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int newMaxVolume) {
        this.maxVolume = newMaxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int newMinVolume) {
        this.minVolume = newMinVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
