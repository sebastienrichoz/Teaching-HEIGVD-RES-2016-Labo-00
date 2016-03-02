package ch.heigvd.res.lab00;

/**
 *
 * @author Sébastien Richoz
 */
public class Trumpet  implements IInstrument {
    public String play() {
        return "pouet";
    }
    public String getColor() {
        return "golden";
    }
    public int getSoundVolume() {
        return 100;
    }
}
