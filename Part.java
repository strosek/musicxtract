import java.util.LinkedList;


public class Part {
  private LinkedList<Note> m_notes;
  private String           m_name;
  private String           m_id;
  private String           m_instrument;

  private MusicXmlNode     m_musicXmlNode;

  public MusicXmlNode getMusicXmlNode(){
    buildMusicXmlNode();

    return m_musicXmlNode;
  }

  public LinkedList<Note> getNotes() {
    return m_notes;
  }

  public void buildMusicXmlNode() {
  }
}

