package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void switchToNextStation(){
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        rad.increaseStation();
        assertEquals(6,rad.getCurrentStation());

    }
    @Test
    public void switchToPreviousStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.decreaseStation();
        assertEquals(7, rad.getCurrentStation());
    }

    @Test
    public void pressForwardToSwitchToTheNextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);
        rad.increaseStation();
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void pressBackToSwitchToThePreviousStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);
        rad.decreaseStation();
        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void afterClickingNextOnTheLastStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);
        rad.increaseStation();
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void afterPushingBackWhileAtMinimumStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.decreaseStation();
        assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void shouldIncreaseTheVolumeOneNotch() {
        Radio rad = new Radio();

        rad.setCurrentVolume(4);
        rad.increaseVolume();
        assertEquals(5, rad.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseTheVolumeByOneDivision() {
        Radio rad = new Radio();

        rad.setCurrentVolume(4);
        rad.decreaseVolume();
        assertEquals(3, rad.getCurrentVolume());
    }

    @Test
    public void atMaxVolumeFurtherIncreaseDoesNotLeadToAnything() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();
        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void atMinVolumeFurtherReductionDoesNotLeadToAnything() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();
        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void mustPutAnyStationOfUserChoice() {
        Radio rad = new Radio();

        rad.setCurrentStation(6);
        assertEquals(6, rad.getCurrentStation());
    }


    @Test
    public void creationOfARadioWithMoreStationsThanTheMaximum() {
        Radio rad = new Radio();

        rad.setCurrentStation(15);
        rad.nextStation();
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void switchStationBackWhenItIsMinimum() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prevStation();
        assertEquals(10, rad.getCurrentStation());
    }

}
