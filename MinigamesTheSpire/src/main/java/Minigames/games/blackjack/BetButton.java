package Minigames.games.blackjack;

import Minigames.util.TextureLoader;
import com.badlogic.gdx.graphics.Texture;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.megacrit.cardcrawl.ui.buttons.Button;

import static Minigames.Minigames.makeGamePath;

public class BetButton extends Button {
    private static final Texture texture = ImageMaster.loadImage(makeGamePath("Blackjack/Cards/cardBack_blue1.png"));
    private BlackjackMinigame parent;
    private int betAmount = 50;

    public BetButton(float x, float y, BlackjackMinigame parent) {
        super(x, y, texture);
        this.parent = parent;
    }

    public void update() {
        super.update();
        if (pressed) {
            parent.setPhase(BlackjackMinigame.PLAYER_TURN);
            parent.dealInitialCards();
            pressed = false;
        }
    }
}
