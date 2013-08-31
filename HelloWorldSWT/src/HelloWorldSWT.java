
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.TextLayout;
import org.eclipse.swt.internal.win32.TCHAR;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;

import static util.Calculating.*;

public class HelloWorldSWT {

	final static String longString = "The preferred size of a widget is the minimum size needed to show its content. In the case of a Composite, the preferred size is the smallest rectangle that contains all of its children. If children have been positioned by the application, the Composite computes its own preferred size based on the size and position of the children. If a Composite is using a layout class to position its children, it asks the Layout to compute the size of its clientArea, and then it adds in the trim to determine its preferred size.";

	final static String disclaimer = "The results of this window have no way of limiting the redraw of the window to less than they can display, thus setting the width too small will overflow the text from visibility. This comment is no longer true as the limit has been resolved.";

	//Color bgColor = new Color(display,randInt(0, 255),randInt(0, 255),randInt(0, 255));
	//shell.setBackground(bgColor);		
	//shell.setText("Hello world!");

	public static void main(String[] args) {
		Display display = new Display();
		final Shell shell = new Shell(display);
		
		final TextLayout layout = new TextLayout(display);
		final TextLayout layout2 = new TextLayout(display);
		
		layout.setText(longString);
		layout2.setText(disclaimer);
		
		Listener listener = new Listener() {
			public void handleEvent (Event event) {
				int vPadding = 15;
				
				switch (event.type) {
				case SWT.Paint:
					layout.draw(event.gc, vPadding, vPadding);
					layout2.draw(event.gc, vPadding, (layout.getLineCount())*15+vPadding*2);
					break;
				case SWT.Resize:
					layout.setWidth(shell.getSize().x - (15+vPadding*2));
					layout2.setWidth(shell.getSize().x - (15+vPadding*2));
					shell.setMinimumSize(0,(layout.getLineCount()+layout2.getLineCount())*15+40+vPadding*3);
					break;
				}
			}
		};
		
		shell.addListener(SWT.Paint, listener);
		shell.addListener(SWT.Resize, listener);
		shell.setMaximized(true);

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		layout.dispose();
		display.dispose();

	}

}
