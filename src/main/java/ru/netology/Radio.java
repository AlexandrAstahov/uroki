package ru.netology;

public class Radio {
    private int numberStation;
    private int volume;

    public int getNumberStation() {
        return numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > 9) {
            return;
        }
        if (numberStation < 0) {
            return;
        }
        this.numberStation = numberStation;
    }

    public void upStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation == 0) {
            this.numberStation = numberStation + 1;
        }
        if (numberStation < 9) {
            this.numberStation = numberStation + 1;
        }
        if (numberStation == 9) {
            this.numberStation = 0;
        }
        if (numberStation > 9) {
            this.numberStation = 0;
        }
    }

    public void downStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        if (numberStation < 9) {
            this.numberStation = numberStation - 1;
        }
        if (numberStation == 0) {
            this.numberStation = 9;
        }
        if (numberStation == 9) {
            this.numberStation = numberStation - 1;
        }


    }


    public void upVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        if (volume == 10) {
            this.volume = 10;
        }
        if (volume == 0) {
            this.volume = volume + 1;
        }
        if (volume < 10) {
            this.volume = volume + 1;
        }
    }

    public void downVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        if (volume == 0) {
            return;
        }
        if (volume == 10) {
            this.volume = volume - 1;
        }
        if (volume < 10) {
            this.volume = volume - 1;
        }

    }
}

