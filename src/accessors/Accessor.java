package accessors;

import java.io.IOException;

import presentation.Presentation;

public abstract class Accessor {

	public static Accessor getDemoAccessor() {
		return new DemoPresentation();
	}

	public Accessor() {
	}

	public abstract void loadFile(Presentation p, String fn) throws IOException;

	public abstract void saveFile(Presentation p, String fn) throws IOException;

}
