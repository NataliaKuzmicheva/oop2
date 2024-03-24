public class Radio {
    private int currentNumberRadioStation;
    private int currentSoundVolume;
    private int countOfStation;

    public Radio() {
        this.countOfStation = 10;
    }

    public Radio(int countOfStation) {
        this.countOfStation = countOfStation;
    }

    public int getCurrentNumberRadioStation() {
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newNumberCurrentRadioStation) {
        if (newNumberCurrentRadioStation < 0) {
            return;
        }
        if (newNumberCurrentRadioStation > (countOfStation - 1)) {
            return;
        }

        currentNumberRadioStation = newNumberCurrentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }

        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseNumberRadioStation() {
        if (currentNumberRadioStation < (countOfStation - 1)) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else {
            currentNumberRadioStation = 0;
        }
    }

    public void decreaseNumberRadioStation() {
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
        } else {
            currentNumberRadioStation = 9;
        }
    }


    public void setToMaxNumberRadioStation() {
        currentNumberRadioStation = 9;
    }

    public void setToMinNumberRadioStation() {
        currentNumberRadioStation = 0;
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }

    public void setToMaxSoundVolume() {
        currentSoundVolume = 100;
    }

    public void setToMinSoundVolume() {
        currentSoundVolume = 0;
    }
}
