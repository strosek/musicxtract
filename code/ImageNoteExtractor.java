// FIXME make import more specific
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;


public class ImageNoteExtractor {
  public static final int DETECT_MODE_VERTICAL =   0;
  public static final int DETECT_MODE_HORIZONTAL = 1;
  public static final int DETECT_MODE_DIAGONAL =   2;
  
  public static final int DETECT_TRESHOLD_DEFAULT =         3;
  public static final int VERTICAL_RESOLUTION_DEFAULT =    10;
  public static final int HORIZONTAL_RESOULUTION_DEFAULT = 10;


  private BufferedImage       m_image;
  private int                 m_detectMode;
  private int                 m_detectionTreshold;
  private int                 m_verticalResolution;
  private int                 m_horizontalResolution;
  private LinkedList<Integer> m_edges;


  public ImageNoteExtractor() {
    m_image = null;
    m_detectMode = DETECT_MODE_VERTICAL;
    m_detectionTreshold = DETECT_TRESHOLD_DEFAULT;
    m_verticalResolution = VERTICAL_RESOLUTION_DEFAULT;
    m_horizontalResolution = HORIZONTAL_RESOULUTION_DEFAULT;
  }
  public ImageNoteExtractor(String fileName) {
    m_detectMode = DETECT_MODE_VERTICAL;
    m_detectionTreshold = DETECT_TRESHOLD_DEFAULT;
    m_verticalResolution = VERTICAL_RESOLUTION_DEFAULT;
    m_horizontalResolution = HORIZONTAL_RESOULUTION_DEFAULT;
    try {
      m_image = ImageIO.read(new File(fileName));
    }
    catch (IOException ioException) {
      System.err.println("ImageNoteExtractor: error opening image");
    }
  }
  
  public void setImage(BufferedImage image) {
    m_image = image;
  }
  public void setDetectionMode(int mode) {
    m_detectMode = mode;
  }
  public void setDetectionTreshold(int treshold) {
    m_detectionTreshold = treshold;
  }
  public void setVerticalResolution(int resolution) {
    m_verticalResolution = resolution;
  }
  public void setHorizontalResolution(int resolution) {
    m_horizontalResolution = resolution;
  }
  public void openImageFile(String fileName) {
    try {
      m_image = ImageIO.read(new File(fileName));
    }
    catch (IOException ioException) {
      System.err.println("ImageNoteExtractor: error opening image");
    }
  }

  public int getDetectionMode() {
    return m_detectMode;
  }
  public int getDetectionTreshold() {
    return m_detectionTreshold;
  }
  public int getVerticalResolution() {
    return m_verticalResolution;
  }
  public int getHorizontalResolution() {
    return m_horizontalResolution;
  }
  public LinkedList<Integer> getEdges() {
    return m_edges;
  }
}
