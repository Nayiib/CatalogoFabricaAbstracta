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
public class Arco implements ArmaAbs{

    @Override
    public ImageIcon operation() {
        ImageIcon arco = new ImageIcon(getClass().getResource("/img/Arco.png"));

        return arco;}
    
}
