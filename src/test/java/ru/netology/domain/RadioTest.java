package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void increaseVolume() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getCurrentVolume());
        int expected = radio.getCurrentVolume() + 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getCurrentVolume() + 5);
        int expected = radio.getCurrentVolume() - 1;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenCurrentVolumeNull() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        int expected = 0;
        radio.decreaseVolume();
        radio.setCurrentVolume(radio.getCurrentVolume());
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenCurrentVolumeMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeLessMin() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMinVolume() - 1);
        int expected = radio.getCurrentVolume();
        int actual = radio.getMinVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMoreMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMaxVolume());
        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
        //сигнальный тест проверки максимальной громкости
    void volumeMax() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        int expected = radio.getMaxVolume();
        int actual = 10;
        assertEquals(expected, actual);
    }

    @Test
        //сигнальный тест проверки минимальной громкости
    void volumeMin() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        int expected = radio.getMinVolume();
        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolumeMoreMax1() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setCurrentVolume(radio.getMaxVolume()+1);
        radio.increaseVolume();
        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStation() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getRadioStation());
        int expected = radio.getRadioStation() + 1;
        radio.nextRadioStation();
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevRadioStation() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getRadioStation() + 5);
        int expected = radio.getRadioStation() - 1;
        radio.prevRadioStation();
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenMax() {
        Radio radio = new Radio();
        radio.setRadioStation(radio.getMaxRadioStation());
        int expected = radio.getMinRadioStation();
        radio.nextRadioStation();
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenMax1() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getMaxRadioStation() + 1);
        int expected = radio.getMinRadioStation();
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenMix() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getMinRadioStation());
        int expected = radio.getMaxRadioStation();
        radio.prevRadioStation();
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextRadioStationWhenMix1() {
        ru.netology.domain.Radio radio = new ru.netology.domain.Radio();
        radio.setRadioStation(radio.getMinRadioStation() - 1);
        int expected = radio.getMaxRadioStation();
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }


}