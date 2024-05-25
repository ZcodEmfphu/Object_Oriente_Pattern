package lab9.ex2;

import java.util.ArrayList;

import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.Sequencer;

public class BeatModel implements BeatModelInterface, MetaEventListener {
	private Sequencer sequencer;
	private ArrayList beatObservers = new ArrayList();
	private ArrayList bpmObservers = new ArrayList();
	private int bpm = 90;

	@Override
	public void meta(MetaMessage meta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		sequencer.start();
		setBPM(90);
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		setBPM(0);
		sequencer.stop();
	}

	@Override
	public void setBPM(int bpm) {
		// TODO Auto-generated method stub
		this.bpm = bpm;
		sequencer.setTempoInBPM(getBPM());
	
	}

	@Override
	public int getBPM() {
		// TODO Auto-generated method stub
		return bpm;
	}

	@Override
	public void registerObserver(BeatObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(BeatObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerObserver(BPMObserver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(BPMObserver o) {
		// TODO Auto-generated method stub

	}

}
