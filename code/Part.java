import java.util.LinkedList;


public class Part {
  private LinkedList<Note> m_notes;
  private String           m_name;
  private String           m_id;
  private String           m_instrument;
  private int              m_measureDivisions;
  private int              m_fifths;
  private boolean          m_isModeMajor;
  private int              m_beats;
  private int              m_beatType;
  private String           m_clefSign;
  private int              m_clefLine;
  private int              m_transposeDiatonic;
  private int              m_transposeChromatic;

  public Part () {
    m_notes = new LinkedList<Note>();
    m_name = new String();
    m_id = new String();
    m_instrument = new String();
    m_measureDivisions = 12;
    m_fifths = 0;
    m_isModeMajor = true;
    m_beats = 4;
    m_beatType = 4;
    m_clefSign = "G";
    m_clefLine = 2;
    m_transposeDiatonic = 0;
    m_transposeChromatic = 0;
  }
  public Part(Part part) {
    m_notes = new LinkedList<Note>(part.getNotes());
    m_name = new String(part.getName());
    m_id = new String(part.getId());
    m_instrument = new String(part.getInstrument());
    m_measureDivisions = part.getMeasureDivisions();
    m_fifths = part.getFifths();
    m_isModeMajor = part.isModeMajor();
    m_beats = part.getBeats();
    m_beatType = part.getBeatType();
    m_clefSign = part.getClefSign();
    m_clefLine = part.getClefLine();
    m_transposeDiatonic = part.getTransposeDiatonic();
    m_transposeChromatic = part.getTransposeChromatic();
  }
  
  public void setName(String name) {
    m_name = name;
  }
  public void setId(String id) {
    m_id = id;
  }
  public void setInstrument(String instrument) {
    m_instrument = instrument;
  }
  public void setMeasureDivisions(int divisions) {
    m_measureDivisions = divisions;
  }
  public void setFifths(int fifths) {
    m_fifths = fifths;
  }
  public void setModeMajor(boolean isMajor) {
    m_isModeMajor = isMajor;
  }
  public void setBeats(int beats) {
    m_beats = beats;
  }
  public void setBeatType(int beatType) {
    m_beatType = beatType;
  }
  public void setClefSign(String sign) {
    m_clefSign = sign;
  }
  public void setClefLine(int line) {
    m_clefLine = line;
  }
  public void setTransposeDiatonic(int transpose) {
    m_transposeDiatonic = transpose;
  }
  public void setTransposeChromatic(int transpose) {
    m_transposeChromatic = transpose;
  }
  
  public void addNote(Note note) {
    m_notes.add(note);
  }

  public String getName() {
    return m_name;
  }
  public String getId() {
    return m_id;
  }
  public String getInstrument() {
    return m_instrument;
  }
  public int getMeasureDivisions() {
    return m_measureDivisions;
  }
  public int getFifths() {
    return m_fifths;
  }
  public boolean isModeMajor() {
    return m_isModeMajor;
  }
  public int getBeats() {
    return m_beats;
  }
  public int getBeatType() {
    return m_beatType;
  }
  public String getClefSign() {
    return m_clefSign;
  }
  public int getClefLine() {
    return m_clefLine;
  }
  public int getTransposeDiatonic() {
    return m_transposeDiatonic;
  }
  public int getTransposeChromatic() {
    return m_transposeChromatic;
  }
  public LinkedList<Note> getNotes() {
    return m_notes;
  }

  public MusicXmlNode getMusicXmlNode(){
    MusicXmlNode node = new MusicXmlNode("part");
    node.addAttribute("id", m_id);

    int measureNo = 0;
    MusicXmlNode measure = new MusicXmlNode("measure");
    measure.addAttribute("number", Integer.toString(measureNo));
    
    MusicXmlNode attributes = new MusicXmlNode("attributes");
      
    MusicXmlNode divisions = new MusicXmlNode("divisions");
    divisions.setText(Integer.toString(m_measureDivisions));
    attributes.addChild(divisions);
      
    MusicXmlNode key = new MusicXmlNode("key");
    MusicXmlNode fifths = new MusicXmlNode("fifths");
    fifths.setText(Integer.toString(m_fifths));
    key.addChild(fifths);
    MusicXmlNode mode = new MusicXmlNode("mode");
    if (m_isModeMajor)
      mode.setText("major");
    else
      mode.setText("minor");
    key.addChild(mode);
    attributes.addChild(key);
      
    MusicXmlNode time = new MusicXmlNode("time");
    MusicXmlNode beats = new MusicXmlNode("beats");
    beats.setText(Integer.toString(m_beats));
    time.addChild(beats);
    MusicXmlNode beatType = new MusicXmlNode("beat-type");
    beatType.setText(Integer.toString(m_beatType));
    time.addChild(beatType);
    attributes.addChild(time);
      
    MusicXmlNode clef = new MusicXmlNode("clef");
    MusicXmlNode sign = new MusicXmlNode("sign");
    sign.setText(m_clefSign);
    clef.addChild(sign);
    MusicXmlNode line = new MusicXmlNode("line");
    line.setText(Integer.toString(m_clefLine));
    clef.addChild(line);
    attributes.addChild(clef);
      
    if (m_transposeChromatic != 0 || m_transposeDiatonic != 0) {
      MusicXmlNode transpose = new MusicXmlNode("transpose");
      MusicXmlNode diatonic = new MusicXmlNode("diatonic");
      diatonic.setText(Integer.toString(m_transposeDiatonic));
      transpose.addChild(diatonic);
      MusicXmlNode chromatic = new MusicXmlNode("chromatic");
      chromatic.setText(Integer.toString(m_transposeChromatic));
      transpose.addChild(chromatic);
      attributes.addChild(transpose);
    }
      
    measure.addChild(attributes);

    int notesTotalDuration = 0;
    int noteDuration;
    int noteNo = 1;

    for (Note note : m_notes) {
      if (note.getDuration() + notesTotalDuration <= m_measureDivisions) {
        measure.addChild(note.getMusicXmlNode());
        notesTotalDuration += note.getDuration();
      }
      else {
        Note startNote = new Note(note);
        startNote.setDuration(m_measureDivisions - notesTotalDuration);
        startNote.setTie(Note.TIE_START);
        measure.addChild(startNote.getMusicXmlNode());
        node.addChild(new MusicXmlNode(measure));
        
        ++measureNo;
        measure.clearAttributes();
        measure.clearChildren();
        measure.addAttribute("number", Integer.toString(measureNo));

        Note stopNote = new Note(note);
        stopNote.setDuration(note.getDuration() - startNote.getDuration());
        stopNote.setTie(Note.TIE_STOP);
        measure.addChild(stopNote.getMusicXmlNode());
        
        notesTotalDuration = stopNote.getDuration();
      }
      
      if (m_measureDivisions == notesTotalDuration && noteNo < m_notes.size()) {
        node.addChild(new MusicXmlNode(measure));
        notesTotalDuration = 0;
        ++measureNo;

        measure.clearAttributes();
        measure.clearChildren();
        measure.addAttribute("number", Integer.toString(measureNo));
      }
      ++noteNo;
    }

    node.addChild(new MusicXmlNode(measure));

    return node;
  }
}

