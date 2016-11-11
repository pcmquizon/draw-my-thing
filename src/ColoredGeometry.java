import java.awt.Color;
import java.awt.Shape;

/*
 * represents:
 * a previously drawn line or shape,
 * its respective color, and
 * its type
 */

public class ColoredGeometry {

  private Shape shape;
  private Color color;
  private Geometry type;

  ColoredGeometry(Shape s, Color c, Geometry geom){
    shape = s;
    color = c;
    type = geom;
  }

  public Shape getShape(){
    return shape;
  }

  public Color getColor(){
    return color;
  }

  public Geometry getGeometry(){
    return type;
  }

}