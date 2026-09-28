/**
 * A class of rectangles with width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a rectangle.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area.
   *
   * @return the area of the rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor scale width and height by the factor
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Compares the area of the rectangle to another rectangle.
   *
   * @param other the other rectangle used for comparison
   * @return whether the current rectangle is larger than the other rectangle
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
