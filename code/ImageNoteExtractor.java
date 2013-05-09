// FIXME make import more specific
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;


public class ImageNoteExtractor {
  private static BufferedImage m_image;
  
  public ImageNoteExtractor() {
    
  }
  public ImageNoteExtractor(String fileName) {
    try {
      m_image = ImageIO.read(new File("strawberry.jpg"));
    }
    catch (IOException ioException) {
      System.err.println("ImageNoteExtractor: error opening image");
    }
  }
  
  // TODO: remove main method
  public static void main(String[] args) {
    try {
      m_image = ImageIO.read(new File("../tests/strawberry.jpg"));
    }
    catch (IOException ioException) {
      System.err.println("ImageNoteExtractor: error opening image");
    }
    System.out.println("image height: " + m_image.getHeight());
    System.out.println("image width: " + m_image.getWidth());
    for (int i = 0; i < m_image.getHeight() / 2; ++i) {
      for (int j = 0; j < m_image.getWidth() / 2; ++j) {
        System.out.println("pixel at: [" + i +", " + j + "]: " + 
                           m_image.getRGB(i, j));
      }
    }
    System.out.println("ToString: " + m_image.toString());
  }
}
