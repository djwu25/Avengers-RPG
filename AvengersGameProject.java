/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengersgameproject;

/**
 *
 * @author DukeWu
 */
public class AvengersGameProject {

    /**
     * @param args the command line arguments
     */
    public static Avenger Antman = new Avenger("Antman", 300, 50);
    public static Avenger Thanos = new Avenger("Thanos", 1000, 200);
    
    public static void main(String[] args) {
        Title title = new Title();
        title.setBounds(0, 0, 646, 658);
        title.setVisible(true);
        AntmanScreen game = new AntmanScreen();
        game.setVisible(false);
        EndDefeatScreen defeat = new EndDefeatScreen();
        defeat.setVisible(false);
        EndVictoryScreen victory = new EndVictoryScreen();
        victory.setVisible(false);
        CharacterSelect characters = new CharacterSelect();
        characters.setVisible(false);
    }
    
}
