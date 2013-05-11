// FIXME make import more specific
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class ImageNoteExtractor {
  public static final int DETECT_MODE_VERTICAL =   0;
  public static final int DETECT_MODE_HORIZONTAL = 1;
  public static final int DETECT_MODE_DIAGONAL =   2;
  
  public static final int DETECT_TRESHOLD_DEFAULT =         3;
  public static final int VERTICAL_RESOLUTION_DEFAULT =    10;
  public static final int HORIZONTAL_RESOULUTION_DEFAULT = 10;


  private BufferedImage  m_image;
  private int            m_detectMode;
  private int            m_detectionTreshold;
  private int            m_verticalResolution;
  private int            m_horizontalResolution;
  private String         m_fileName;
  private ArrayList<Integer> m_edges;


  public ImageNoteExtractor() {
    m_image = null;
    m_detectMode = DETECT_MODE_VERTICAL;
    m_detectionTreshold = DETECT_TRESHOLD_DEFAULT;
    m_verticalResolution = VERTICAL_RESOLUTION_DEFAULT;
    m_horizontalResolution = HORIZONTAL_RESOULUTION_DEFAULT;
    m_fileName = null;
  }
  public ImageNoteExtractor(String fileName) {
    m_detectMode = DETECT_MODE_VERTICAL;
    m_detectionTreshold = DETECT_TRESHOLD_DEFAULT;
    m_verticalResolution = VERTICAL_RESOLUTION_DEFAULT;
    m_horizontalResolution = HORIZONTAL_RESOULUTION_DEFAULT;
    m_fileName = fileName;
    try {
      m_image = ImageIO.read(new File(m_fileName));
    }
    catch (IOException ioException) {
      System.err.println("ImageNoteExtractor: error opening image");
    }
  }
}
