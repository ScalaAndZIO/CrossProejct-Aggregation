package mycore

import java.awt._
import javax.swing._

object MyGui extends App {

  // create the frame with MyApp title
  val frame = new JFrame("My App")

  // setting close operation
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

  // creates instance of JButton
  val button = new JButton("Click me ! ")
  button.setBackground(new Color(204,0,153))


  // create label 1
  val label1 = new JLabel("Text1 ")

  //create text box field 1
  val txtBox1 = new JTextField()

  // create label 2
  val label2 = new JLabel("Text2 ")

  //Adding text box field 2
  val txtBox2 = new JTextField()
  val tabbedPane = new JTabbedPane

  // create panel
  val panel = new JPanel()

  // customize the layout for panel
  panel.setLayout(new GridLayout(3,2))

  //add elements to panel (labels, txtboxes , button)
  panel.add(label1)
  panel.add(txtBox1)
  panel.add(label2)
  panel.add(txtBox2)
  panel.add(button)
  frame.getContentPane.setBackground(new Color(119,119,119))

  // add panel to tab
  tabbedPane.addTab("Tab 1 " ,panel)

  //add tab to frame
  frame.add(tabbedPane)

  frame.pack()
  frame.setLayout(null)

  //set size for th frame
  frame.setSize(500,500)

  // makes the frame visible1
  frame.setVisible(true)
}

