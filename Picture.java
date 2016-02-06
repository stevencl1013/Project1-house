/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square podium1;
    private Square podium2;
    private Square podium3;
    private Square ground;
    private Square sky;
    private Circle sun;
    private Person first;
    private Person second;
    private Person third;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeSize(500);
        sky.moveVertical(-120);
        sky.moveHorizontal(-310);
        sky.changeColor("skyBlue");
        sky.makeVisible();
        
        ground = new Square();
        ground.changeSize(500);
        ground.changeColor("green");
        ground.moveVertical(60);
        ground.moveHorizontal(-310);
        ground.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveVertical(-60);
        sun.moveHorizontal(-150);
        sun.makeVisible();
        
        podium1 = new Square();
        podium1.moveHorizontal(-120);
        podium1.moveVertical(-10);
        podium1.changeColor("silver");
        podium1.changeSize(70);
        podium1.makeVisible();
        
        podium2 = new Square();
        podium2.moveHorizontal(-50);
        podium2.moveVertical(-20);
        podium2.changeColor("gold");
        podium2.changeSize(80);
        podium2.makeVisible();
        
        podium3 = new Square();
        podium3.changeColor("bronze");
        podium3.moveHorizontal(30);
        podium3.makeVisible();
        
        first = new Person();
        first.moveVertical(-132);
        first.moveHorizontal(18);
        first.makeVisible();
        
        second = new Person();
        second.moveVertical(-122);
        second.moveHorizontal(-57);
        second.makeVisible();
        
        third = new Person();
        third.moveVertical(-112);
        third.moveHorizontal(88);
        third.makeVisible();
        
    }

//     /**
//      * Change this picture to black/white display
//      */
//     public void setBlackAndWhite()
//     {
//         if (wall != null)   // only if it's painted already...
//         {
//             wall.changeColor("black");
//             window.changeColor("white");
//             roof.changeColor("black");
//             sun.changeColor("black");
//         }
//     }
// 
//     /**
//      * Change this picture to use color display
//      */
//     public void setColor()
//     {
//         if (wall != null)   // only if it's painted already...
//         {
//             wall.changeColor("red");
//             window.changeColor("black");
//             roof.changeColor("green");
//             sun.changeColor("yellow");
//         }
//     }
}
