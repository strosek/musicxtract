// FIXME make import more specific
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;


public class TestImage {
  public static void main(String[] args) {
    BufferedImage image = null;
    System.out.print("Enter file to read: ");
    Scanner scanner = new Scanner(System.in);
    String fileName = scanner.next();
    try {
      image = ImageIO.read(new File(fileName));
    }
    catch (IOException ioException) {
      System.err.println("ImageNoteExtractor: error opening image");
    }

    System.out.println("image height: " + image.getHeight());
    System.out.println("image width: " + image.getWidth());
    int red, green, blue;
    int previousLuminosity = 0, currentLuminosity = 0;
    int deltaLuminosity = 0;
    for (int j = 0; j < image.getWidth(); ++j) {
      for (int i = 0; i < image.getHeight(); ++i) {
        red =   image.getRGB(j, i) & 0xFF0000;
        red >>= 16;
        green = image.getRGB(j, i) &   0xFF00;
        green >>= 8;
        blue =  image.getRGB(j, i) &    0x0FF;
        currentLuminosity = red + green + blue;
        if (i > 0 || j > 0)
          deltaLuminosity = Math.abs(previousLuminosity - currentLuminosity);
        else
          deltaLuminosity = 0;
        previousLuminosity = currentLuminosity;
        System.out.printf("%3d ", deltaLuminosity);
      }
      System.out.println();
    }
    System.out.println("ToString: " + image.toString());
  }
}
