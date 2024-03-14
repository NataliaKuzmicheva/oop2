import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberRadiostationOverZero() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(7);

        int expected = 7;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadiostationBelowZero() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(-1);

        int expected = 0;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadiostationAboveMax() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(10);

        int expected = 0;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberRadiostationUnderMin() {
        Radio radiostation = new Radio();

        radiostation.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(9);
        radiostation.increaseNumberRadiostation();

        int expected = 0;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(0);
        radiostation.decreaseNumberRadioStation();

        int expected = 9;
        int actual = radiostation.getCurrentSoundVolume();
    }

    @Test
    public void increaseToMaxNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(9);
        radiostation.increaseNumberRadiostation();

        int expected = 0;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(8);
        radiostation.increaseNumberRadiostation();

        int expected = 9;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseToMinNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(0);
        radiostation.decreaseNumberRadioStation();

        int expected = 9;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(2);
        radiostation.decreaseNumberRadioStation();

        int expected = 1;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(9);
        radiostation.setToMaxNumberRadiostation();

        int expected = 9;
        int actual = radiostation.getCurrentNumberRadiostation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberRadiostation() {
        Radio radiostation = new Radio();

        radiostation.setCurrentNumberRadiostation(0);
        radiostation.setToMinNumberRadiostation();

        int expected = 0;
        int actual = radiostation.getCurrentNumberRadiostation();

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
