import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadioStationOverZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(7);

        int expected = 7;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);
        radio.increaseNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(0);
        radio.decreaseNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentSoundVolume();
    }

    @Test
    public void increaseToMaxNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);
        radio.increaseNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(8);
        radio.increaseNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseToMinNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(0);
        radio.decreaseNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(2);
        radio.decreaseNumberRadioStation();

        int expected = 1;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(9);
        radio.setToMaxNumberRadioStation();

        int expected = 9;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberRadioStation(0);
        radio.setToMinNumberRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(45);

        int expected = 45;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(150);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetSoundVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.increaseSoundVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
    }

    @Test
    public void increaseSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(3);
        radio.increaseSoundVolume();

        int expected = 4;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(56);
        radio.decreaseSoundVolume();

        int expected = 55;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(100);
        radio.setToMaxSoundVolume();

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinSoundVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundVolume(0);
        radio.setToMinSoundVolume();

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
