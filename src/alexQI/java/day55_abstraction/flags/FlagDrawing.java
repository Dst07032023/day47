package alexQI.java.day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkrainianFlag ukraine = new UkrainianFlag();
        ukraine.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();
    }
}
