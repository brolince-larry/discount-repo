import javax.swing.*;
class Button {
    //main class
    public static void main(String[] args) {
        JFrame frame= new JFrame();
        //let the button display a message
        JButton button = new JButton("click me");
        //set boundaries
        button.setBounds(100, 150, 150, 130);
        frame.add(button);
        frame.setSize(500,509);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
