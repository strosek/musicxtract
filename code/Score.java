import java.util.LinkedList;

public class Score {
  private LinkedList<Part> m_parts;

  private MusicXmlNode m_musicXmlNode;

  public MusicXmlNode getMusicXmlNode() {
    buildMusicXmlNode();

    return m_musicXmlNode;
  }
  
  private void buildMusicXmlNode() {
  }
}

