package abstract_components;

import java.io.Serializable;

import game_objects.GameObject;

/**
 * Placeable allows children to define placements of the game object.
 *
 * I read this Game Programming Patterns textbook chapter to help me design the abstract classes of each component:
 * http://gameprogrammingpatterns.com/component.html
 *
 * Specifically, the idea of having an abstract class is helpful to define different types of children behavior later.
 *
 * @author jeremypark
 *
 */
public abstract class Placeable implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // method to set a location of the game object
    public abstract void setLocation(GameObject obj, int x, int y);
}
