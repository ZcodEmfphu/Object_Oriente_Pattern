package sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.HashMap;

public class GameSound {
	public static GameSound instance;

	public static final String MENU = "playgame.wav";
	public static final String PLAYGAME = "sound-game.wav";
	public static final String BOMB = "newbomb.wav";
	public static final String BOMBER_DIE = "dead.wav";
	public static final String BOMBER_DieDRINK = "quack_5.wav";
	public static final String MONSTER_DIE = "dead.wav";
	public static final String BONG_BANG = "bomb_bang.wav";
	public static final String ITEM = "pickup.wav";
	public static final String WIN = "win.wav";
	public static final String LOSE = "lose.wav";
	public static final String FOOT = "foot.wav";
	private HashMap<String, AudioClip> audioMap;

	public GameSound() {
		audioMap = new HashMap<>();
		loadAllAudio();
	}

	public static GameSound getIstance() {
		if (instance == null) {
			instance = new GameSound();
		}

		return instance;
	}

	public void loadAllAudio() {
		putAudio(MENU);
		putAudio(PLAYGAME);
		putAudio(BOMB);
		putAudio(MONSTER_DIE);
		putAudio(BOMBER_DieDRINK);
		putAudio(BOMBER_DIE);
		putAudio(BONG_BANG);
		putAudio(ITEM);
		putAudio(WIN);
		putAudio(LOSE);
		putAudio(FOOT);
	}

	public void stop() {
		getAudio(MENU).stop();
		getAudio(PLAYGAME).stop();
		getAudio(BOMB).stop();
		getAudio(MONSTER_DIE).stop();
		getAudio(BOMBER_DieDRINK).stop();
		getAudio(BOMBER_DIE).stop();
		getAudio(BONG_BANG).stop();
		getAudio(ITEM).stop();
		getAudio(WIN).stop();
		getAudio(LOSE).stop();
	}

	public void putAudio(String name) {
		AudioClip auClip = Applet.newAudioClip(GameSound.class.getResource(name));
		audioMap.put(name, auClip);
	}

	public AudioClip getAudio(String name) {
		return audioMap.get(name);
	}
}
