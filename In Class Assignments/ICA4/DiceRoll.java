/***************
In Class Assignment #4
Due Date: 2/23/19
Names: Ryan Hays
********************/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

/**
   This class demonstrates how to use an ImageIcon
   and a JLabel to display an image.
*/

public class DiceRoll extends JFrame
{
   private JPanel imagePanel;     // To hold the label
   private JPanel buttonPanel;    // To hold a button
   private JLabel imageLabel;     // To show an image
   private JLabel imageLabel2;
   private JButton button;        // To get an image


   /**
      Constructor
   */

   public DiceRoll()
   {
      // Set the title.
      setTitle("Dice Simulator");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager.
      setLayout(new BorderLayout());

      // Build the panels.
      buildImagePanel();
      buildButtonPanel();

      // Add the panels to the content pane.
      add(imagePanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildImagePanel method adds a label to a panel.
   */

   private void buildImagePanel()
   {
      // Create a panel.
      imagePanel = new JPanel();

      // Create a label.
      imageLabel = new JLabel();
      imageLabel2 = new JLabel();

      // Add the label to the panel.
      imagePanel.add(imageLabel);
      imagePanel.add(imageLabel2);
   }

   /**
      The buildButtonPanel method adds a button
      to a panel.
   */

   private void buildButtonPanel()
   {
      // Create a panel.
      buttonPanel = new JPanel();

      // Create a button.
      button = new JButton("Roll the dice.");

      // Register an action listener with the button.
      button.addActionListener(new ButtonListener());

      // Add the button to the panel.
      buttonPanel.add(button);
   }

   /**
      Private inner class that handles the event when
      the user clicks the button.
   */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Read the image file into an ImageIcon object.
         ImageIcon die1 = new ImageIcon("Die1.png");
         ImageIcon die2 = new ImageIcon("Die2.png");
         ImageIcon die3 = new ImageIcon("Die3.png");
         ImageIcon die4 = new ImageIcon("Die4.png");
         ImageIcon die5 = new ImageIcon("Die5.png");
         ImageIcon die6 = new ImageIcon("Die6.png");

         Random rand = new Random();

         // Obtain a number between [1 - 6].
         int roll1 = rand.nextInt(6) + 1;
         int roll2 = rand.nextInt(6) + 1;

         if (roll1 == 1)
         {
           imageLabel.setIcon(die1);
         }
         else if (roll1 == 2)
         {
           imageLabel.setIcon(die2);
         }
         else if (roll1 == 3)
         {
           imageLabel.setIcon(die3);
         }
         else if (roll1 == 4)
         {
           imageLabel.setIcon(die4);
         }
         else if (roll1 == 5)
         {
           imageLabel.setIcon(die5);
         }
         else if (roll1 == 6)
         {
           imageLabel.setIcon(die6);
         }

         if (roll2 == 1)
         {
           imageLabel2.setIcon(die1);
         }
         else if (roll2 == 2)
         {
           imageLabel2.setIcon(die2);
         }
         else if (roll2 == 3)
         {
           imageLabel2.setIcon(die3);
         }
         else if (roll2 == 4)
         {
           imageLabel2.setIcon(die4);
         }
         else if (roll2 == 5)
         {
           imageLabel2.setIcon(die5);
         }
         else if (roll2 == 6)
         {
           imageLabel2.setIcon(die6);
         }

         // Remove the text from the label.
         imageLabel.setText(null);

         // Pack the frame again to accomodate the
         // new size of the label.
         pack();
      }

   }

   /**
      The main method creates an instance of the
      MyCatImage class which causes it to display
      its window.
   */
   public static void main(String[] args)
   {
      new DiceRoll();
   }
}
