/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Zocalo
 */
public class Personaje implements fabricaAbstracta {

    @Override
    public ArmaAbs crearArma() {
        return new Espada();
    }

    @Override
    public ArmaduraAbs crearArmadura() {
        return new Armadura();
    }

    @Override
    public MonturaAbs crearMontura() {
        return new Caballo();
    }

}
