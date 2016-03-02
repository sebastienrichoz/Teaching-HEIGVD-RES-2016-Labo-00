package ch.heigvd.res.lab00;

/**
 *
 * @author Sébastien Richoz
 */
public class Flute implements IInstrument {
    public String play() {
        return "trilili";
    }
    public String getColor() {
        return "white";
    }
    public int getSoundVolume() {
        return 50;
    }
}
