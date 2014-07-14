import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;


public class BassScales extends JFrame {
	
	JTextArea scaleArea = new JTextArea(15, 60);
	JComboBox keyList;
	int keySelection = 0; // index of key selected
		
	public static void main(String[] args) {
		new BassScales();
	}
	
	public BassScales() {
		
		
	    
	    //setup panel to display scale
		JPanel tabPanel = new JPanel();
		this.add(tabPanel, BorderLayout.PAGE_START);
		
		// setup panel to display controls
		JPanel contPanel = new JPanel();
		this.add(contPanel, BorderLayout.PAGE_END);
		
		// area to display scale
		
		scaleArea.setEditable(false);
		scaleArea.setLineWrap(false);
		scaleArea.setText("Select a key.");
		scaleArea.setVisible(true);
		Font font = new Font("Monospaced", Font.PLAIN, 12);
		scaleArea.setFont(font);
		tabPanel.add(scaleArea);
		
		// keys to select from
		String[] keys = new String[] {
				"C Maj/A min",
				"G Maj/E min",
				"D Maj/B min",
				"A Maj/F# min",
				"E Maj/C# min",
				"B Maj/G# min",
				"Gb Maj/Eb min",
				"Db Maj/Bb min",
				"Ab Maj/F min",
				"Eb Maj/C min",
				"Bb Maj/G min",
				"F Maj/D min"
				};
		
		// setup keyList JComboBox
		keyList = new JComboBox(keys);
		keyList.setEditable(false);
		//keyList.setVisible(true);
		contPanel.add(keyList);
		
		// setup load button
		JButton loadButton = new JButton("Load");
		loadButton.setVisible(true);
		ListenForButton buttonClick = new ListenForButton();
		loadButton.addActionListener(buttonClick);
		loadButton.setVisible(true);
		contPanel.add(loadButton);
		
		// setup frame
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
	    this.setVisible(true);
		this.setTitle("Bass Scale Note Diagram");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
	}
	
	// listener class
	private class ListenForButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO
			keySelection = keyList.getSelectedIndex();
			
			if(keySelection == 0) {
				scaleArea.setText("C Major/A minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 G|| * | A | * | B | C | * | D | * | E | F | * | G |\n3 D|| * | E | F | * | G | * | A | * | B | C | * | D |\n2 A|| * | B | C | * | D | * | E | F | * | G | * | A |\n1 E|| F | * | G | * | A | * | B | C | * | D | * | E |");
			}
			
			else if(keySelection == 1) {
				scaleArea.setText("G Major/E minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 G|| * | A | * | B | C | * | D | * | E | * | F#| G |\n3 D|| * | E | * | F#| G | * | A | * | B | C | * | D |\n2 A|| * | B | C | * | D | * | E | * | F#| G | * | A |\n1 E|| * | F#| G | * | A | * | B | C | * | D | * | E |");
			}
			
			else if(keySelection == 2) {
				scaleArea.setText("D Major/B minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 G|| - | A | - | B | - | C#| D | - | E | - | F#| G |\n3 D|| - | E | - | F#| G | - | A | - | B | - | C#| D |\n2 A|| - | B | - | C#| D | - | E | - | F#| G | - | A |\n1 E|| - | F#| G | - | A | - | B | - | C#| D | - | E |");
			}
			
			else if(keySelection == 3) {
				scaleArea.setText("A Major/F# minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 -|| G#| A | - | B | - | C#| D | - | E | - | F#| - |\n3 D|| - | E | - | F#| - | G#| A | - | B | - | C#| D |\n2 A|| - | B | - | C#| D | - | E | - | F#| G | - | A |\n1 E|| - | F#| - | G#| A | - | B | - | C#| D | - | E |");
			}
			
			else if(keySelection == 4) {
				scaleArea.setText("E Major/ C# minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 -|| G#| A | - | B | - | C#| - | D#| E | - | F#| - |\n3 -|| - | E | - | F#| - | G#| A | - | B | - | C#| - |\n2 A|| - | B | - | C#| - | D#| E | - | F#| G | - | A |\n1 E|| - | F#| - | G#| A | - | B | - | C#| - | D#| E |");
			}
			
			else if(keySelection == 5) {
				scaleArea.setText("B Major/G# minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 -|| G#| - | A#| B | - | C#| - | D#| E | - | F#| - |\n3 -|| - | E | - | F#| - | G#| - | A#| B | - | C#| - |\n2 -|| - | B | - | C#| - | D#| E | - | F#| G | - | - |\n1 E|| - | F#| - | G#| - | A#| B | - | C#| - | D#| E |");
			}
			
			else if(keySelection == 6) {
				scaleArea.setText("Gb Major/Eb minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 -|| Ab| - | Bb| Cb| - | Db| - | Eb| - | F | Gb| - |\n3 -|| Eb| - | F | Gb| - | Ab| - | Bb| Cb| - | Db| - |\n2 -|| Bb| Cb| - | Db| - | Eb| - | F | Gb| - | Ab| - |\n1 -|| F | Gb| - | Ab| - | Bb| Cb| - | Db| - | Eb| - |");
			}
			
			else if(keySelection == 7) {
				scaleArea.setText("Db Major/Bb minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 -|| Ab| - | Bb| - | C | Db| - | Eb| - | F | Gb| - |\n3 -|| Eb| - | F | Gb| - | Ab| - | Bb| - | C | Db| - |\n2 -|| Bb| - | C | Db| - | Eb| - | F | Gb| - | Ab| - |\n1 -|| F | Gb| - | Ab| - | Bb| - | C | Db| - | Eb| - |");
			}
			
			else if(keySelection == 8) {
				scaleArea.setText("Ab Major/F minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 G|| Ab| - | Bb| - | C | Db| - | Eb| - | F | - | G |\n3 -|| Eb| - | F | - | G | Ab| - | Bb| - | C | Db| - |\n2 -|| Bb| - | C | Db| - | Eb| - | F | - | G | Ab| - |\n1 -|| F | - | G | Ab| - | Bb| - | C | Db| - | Eb| - |");
			}
			
			else if(keySelection == 9) {
				scaleArea.setText("Eb Major/C minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 G|| Ab| - | Bb| - | C | - | D | Eb| - | F | - | G |\n3 D|| Eb| - | F | - | G | Ab| - | Bb| - | C | - | D |\n2 -|| Bb| - | C | - | D | Eb| - | F | - | G | Ab| - |\n1 -|| F | - | G | Ab| - | Bb| - | C | - | D | Eb| - |");
			}
			
			else if(keySelection == 10) {
				scaleArea.setText("Bb Major/G minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 G|| - | A | Bb| - | C | - | D | Eb| - | F | - | G |\n3 D|| Eb| - | F | - | G | - | A | Bb| - | C | - | D |\n2 A|| Bb| - | C | - | D | Eb| - | F | - | G | - | A |\n1 -|| F | - | G | - | A | Bb| - | C | - | D | Eb| - |");
			}
			
			else if(keySelection == 11) {
				scaleArea.setText("F Major/D minor\nFret #  1   2   3   4   5   6   7   8   9   10  11  12\n4 G|| - | A | Bb| - | C | - | D | - | E | F | - | G |\n3 D|| - | E | F | - | G | - | A | Bb| - | C | - | D |\n2 A|| Bb| - | C | - | D | - | E | F | - | G | - | A |\n1 E|| F | - | G | - | A | Bb| - | C | - | D | - | E |");
			}
		}
	}

}
