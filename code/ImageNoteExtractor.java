import java.util.LinkedList;


public class ImageNoteExtractor {
  public static final int DETECT_MODE_VERTICAL =   0;
  public static final int DETECT_MODE_HORIZONTAL = 1;
  
public static final int DETECT_TRESHOLD_DEFAULT = 100;

  public static final int VERTICAL_RESOLUTION_DEFAULT =    640;
  public static final int HORIZONTAL_RESOULUTION_DEFAULT = 380;
  
  public static final int SAMPLES_DEFAULT = 16;
  

  private int                 m_detectMode;
  private int                 m_detectionTreshold;
  private int                 m_verticalResolution;
  private int                 m_horizontalResolution;
  private int                 m_samples;
  private LinkedList<Integer> m_edges;
  private NoteFactory         m_noteFactory;


  public ImageNoteExtractor() {
    m_detectMode = DETECT_MODE_VERTICAL;
    m_detectionTreshold = DETECT_TRESHOLD_DEFAULT;
    m_verticalResolution = VERTICAL_RESOLUTION_DEFAULT;
    m_horizontalResolution = HORIZONTAL_RESOULUTION_DEFAULT;
    m_samples = SAMPLES_DEFAULT;
    m_edges = new LinkedList<Integer>();
    m_noteFactory = new NoteFactory();
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
  public void setSamples(int samples) {
    m_samples = samples;
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
  public int getSamples() {
    return m_samples;
  }
  public NoteFactory getNoteFactory() {
    return m_noteFactory;
  }

  public void computeEdges(Bitmap image) {
    int maxDeltaLuminosity = m_detectionTreshold;
    int position = -1;
    int previousLuminosity, currentLuminosity, deltaLuminosity = 0;
    Color color;
    LinkedList<Integer> edges;
    
    int verticalLimit, horizontalLimit;
    if (m_detectMode == DETECT_MODE_VERTICAL) {
      horizontalLimit = image.getWidth();
      verticalLimit = image.getHeight();
    }
    else {
      horizontalLimit = image.getHeight();
      verticalLimit = image.getWidth();
    }
    
    for (int i = 0; i < horizontalLimit; ++i) {
      for (int j = 0; j < verticalLimit; ++j) {
        if (m_detectMode == DETECT_MODE_VERTICAL)
          color = image.getPixel(i, j);
        else
          color = image.getPixel(j, i);
        currentLuminosity = color.red() + color.green() + color.blue();
        if (i > 0 || j > 0)
          deltaLuminosity = Math.abs(previousLuminosity - currentLuminosity);
        else
          deltaLuminosity = 0;
        if (deltaLuminosity > maxDeltaLuminosity) {
          maxDeltaLuminosity = deltaLuminosity;
          position = j;
        }
        previousLuminosity = currentLuminosity;
      }
      m_edges.add(position);
    }
  }
  
  public LinkedList<Note> getNotes(Bitmap image) {
    computeEdges(image);
    
    LinkedList<Note> notes;
    for (Integer edge : m_edges) {
      notes.add(m_noteFactory.newNote(edge, Note.TYPE_QUARTER, false));
    }
    
    return notes;
  }
}
