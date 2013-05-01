import java.util.LinkedList;


public class Part {
  private LinkedList<Note> m_notes;
  private String           m_name;
  private String           m_id;
  private String           m_instrument;
  private int              m_measureDuration;

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
    m_musicXmlNode.addAttribute("id", m_id);

    Integer measureNo = 1;
    MusicXmlNode measure = new MusicXmlNode("measure");
    measure.addAttribute("number", measureNo.toString());

    int notesTotalDuration = 0;
    int noteDuration;

    for (Note note : m_notes) {
      if (note.getDuration() < m_measureDuration)
        m_musicXmlNode.addChild(note.getMusicXmlNode());
      else {
        noteDuration = note.getDuration();
      }
    }

    m_musicXmlNode.addChild(measure);
  }
}

