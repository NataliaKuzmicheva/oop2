public class Radio {
    private int currentNumberRadiostation;

    public int getCurrentNumberRadiostation() {
        return currentNumberRadiostation;
    }

    public void setCurrentNumberRadiostation(int newNumberCurrentRadiostation) {
        if (newNumberCurrentRadiostation < 0) {
            return;
        }
        if (newNumberCurrentRadiostation > 9) {
            return;
        }

        currentNumberRadiostation = newNumberCurrentRadiostation;
    }

    public void increaseNumberRadiostation() {
        if (currentNumberRadiostation < 9) {
            currentNumberRadiostation = currentNumberRadiostation + 1;
        } else {
            currentNumberRadiostation = 0;
        }
    }

    public void decreaseNumberRadioStation() {
        if (currentNumberRadiostation > 0) {
            currentNumberRadiostation = currentNumberRadiostation - 1;
        } else {
            currentNumberRadiostation = 9;
        }
    }

    public void setToMaxNumberRadiostation() {
        currentNumberRadiostation = 9;
    }

    public void setToMinNumberRadiostation() {
        currentNumberRadiostation = 0;
    }


    private int currentSoundVolume;

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
