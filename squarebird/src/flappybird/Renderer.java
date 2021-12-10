/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flappybird;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class Renderer extends JLabel{
    private static final long serialVersionUID= 1L;
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Flappybird.flappyBird.repaint(g);
    }
    
}
