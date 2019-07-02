/***************
In Class Assignment #3
Due Date: 2/15/19
Names: Ryan Hays
********************/

import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface

/**
   This class demonstrates how to retrieve the action command
   from an event object.
*/

public class LatinTranslator extends JFrame
{
   private JButton latin1;    // Button 1
   private JButton latin2;    // Button 2
   private JButton latin3;    // Button 3
   private JPanel panel;       // A panel to hold components
   private final int WINDOW_WIDTH = 300; // Window width
   private final int WINDOW_HEIGHT = 150; // Window height

   /**
      Constructor
   */

   public LatinTranslator()
   {
      setTitle("Latin Translator");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the three buttons.
      latin1 = new JButton("Sinister");
      latin2 = new JButton("Medium");
      latin3 = new JButton("Dexter");

      // Register an event listener with all 3 buttons.
      latin1.addActionListener(new ButtonListener());
      latin2.addActionListener(new ButtonListener());
      latin3.addActionListener(new ButtonListener());

      // Create a panel and add the buttons to it.
      panel = new JPanel();
      panel.add(latin1);
      panel.add(latin2);
      panel.add(latin3);

      // Add the panel to the content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }
   /**
      Private inner class that handles the event when
      the user clicks a button.
   */
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Get the action command.
         String actionCommand = e.getActionCommand();

         // Determine which button was clicked and display
         // a message.
         if (actionCommand.equals("Sinister"))
         {
            JOptionPane.showMessageDialog(null, "Left");
         }
         else if (actionCommand.equals("Medium"))
         {
            JOptionPane.showMessageDialog(null, "Center");
         }
         else if (actionCommand.equals("Dexter"))
         {
            JOptionPane.showMessageDialog(null, "Right");
         }
      }
   }

   /**
      main method
   */

   public static void main(String[] args)
   {
      new LatinTranslator();
   }
}
