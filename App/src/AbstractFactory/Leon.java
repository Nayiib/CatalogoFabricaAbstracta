/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import javax.swing.ImageIcon;

/**
 *
 * @author Zocalo
 */
public class Leon implements MonturaAbs{

    @Override
    public ImageIcon operation() {
        ImageIcon Leon = new ImageIcon(getClass().getResource("/img/Leon.png"));

        return Leon;}
    
}
