import java.util.LinkedList;


public class Part {
  private LinkedList<Note> m_notes;
  private String           m_name;
  private String           m_id;
  private String           m_instrument;

  private MusicXmlNode     m_musicXmlNode;

  public void insertNote(Note note) {
    m_notes.add(note);
  }

  public MusicXmlNode getMusicXmlNode(){
    buildMusicXmlNode();

    return m_musicXmlNode;
  }

  public LinkedList<Note> getNotes() {
    return m_notes;
  }

  public void buildMusicXmlNode() {
    m_musicXmlNode.setName("part");

    Integer measureNo;
    MusicXmlNode measure("measure");
    measure.addAttribute("number", measureNo.toString());

    m_musicXmlNode.addChild(measure);
    for (note : m_notes) {
      m_musicXmlNode.addChild(note.getXmlNode());
    }

    m_musicXmlNode.addChild(measure);
  }
}

