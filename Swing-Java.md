# Dynamically generating Checkboxes and accessing their content using Java SWING


```Java

package com.spconger.www;
/*
 * This class creates two arrays
 * one for a list of titles
 * and one to store dynamically created
 * checkboxes
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class CheckboxTestForm {
 
 //declare private fields
 private ArrayList titles; //arraylist for titles
 private JFrame frame;
 private ArrayListchecks; //array of checkboxes
 private JPanel panel;
 private JButton button;
 private JLabel result;
 private JCheckBox chk;
 
 //constructor that calls the methods
 //and initializes the checkbox array
 public CheckboxTestForm(){
  fillArray();
  checks = new ArrayList();
  createCheckBoxes();
 }
 
 private void fillArray(){
  //this method populates the array
  //manually--you could do this
  //dynamically with user input
  titles=new ArrayList();
  titles.add("Foundation Trilogy");
  titles.add("lord of the Rings");
  titles.add("1@84");
  titles.add("The Martian Chronicles");
 }
 
 private void createCheckBoxes(){
  //set up the frame
  JFrame frame=new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  //call the method to create the panel
  createPanel();
  //add the panel to the frame and make it visible
  frame.add(panel);
  frame.setBounds(100,100,300,300);
  frame.setVisible(true);
 }
 
 private void createPanel(){
  //initialize the panel
  panel = new JPanel();
  panel.setLayout(new GridLayout(0,1,5,5));
  //loop through the title array
  for (String s:titles){
    //create a new checkbox 
   //for each string in the array
    chk=new JCheckBox(s);
    //add the checkbox to the panel
    panel.add(chk);
    //add the checkbox to the array
    //of checkboxes
    checks.add(chk);
  }
  
  //add a button
  button=new JButton("Test");
  //assign a listener
  button.addActionListener(new buttonListener());
  //add it to the panel
  panel.add(button);
  
  //add a label to show the results
  result = new JLabel();
  panel.add(result);
  
  
 }
 
 private class buttonListener implements ActionListener{
  /*
   * (non-Javadoc)
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   * This class responds to the button click
   */
  @Override
  public void actionPerformed(ActionEvent arg0) {
   String s="";
   //loop through the array of checkboxes
   //and get the text of each checkbox
   //that is checked
   for (JCheckBox ck:checks){
    if(ck.isSelected()){
    s += ck.getText() + ", ";
    }
   }
   //display the results
   result.setText(s);
  }
  
 }

}

```
# Launcher

```Java
package com.spconger.www;

public class Program {

 /**
  * this program is an example of 
  * creating checkboxes dynamically
  * on the fly. You can use this in
  * a todo list. Add your tasks to an 
  * Array List and then dynamically display them
  * The main merely calls the class
  */
 public static void main(String[] args) {
  CheckboxTestForm c= new CheckboxTestForm();

 }

}
```
