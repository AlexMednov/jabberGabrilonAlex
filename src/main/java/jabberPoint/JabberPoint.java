package jabberPoint;

import accessors.Accessor;
import accessors.XMLAccessor;
import presentation.Presentation;
import presentation.SlideViewerFrame;
import style.Style;

import javax.swing.JOptionPane;

import java.io.IOException;

public class JabberPoint {
	//These variables need to be static, because JabberPoint is not instantiated anywhere
	private static final String IOERR = "IO Error: ";
	private static final String JABERR = "Jabberpoint Error ";
	private static final String JABVERSION = "Jabberpoint 1.6 - OU version";

	//Main file of the application, it is the entry point for the JabberPoint
	public static void main(String[] argv) {
		Style.createStyles();
		Presentation presentation = new Presentation();
		new SlideViewerFrame(JABVERSION, presentation);
		try {
			//If presentation was not provided, demo presentation would be opened by default
			if (argv.length == 0) {
				Accessor.getDemoAccessor().loadFile(presentation, "");
			} else {
				new XMLAccessor().loadFile(presentation, argv[0]);
			}
			presentation.setSlideNumber(0);
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null,
					IOERR + ex, JABERR,
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
