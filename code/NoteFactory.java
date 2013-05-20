public class NoteFactory {
  private int     m_lowestPitch;
  private int     m_highestPitch;
  private int     m_lowestPosition;
  private int     m_highestPosition;
  private int     m_measureDivisions;
  private int     m_beats;
  private int     m_beatType;
  private boolean m_isKeySharp;
  
  public NoteFactory() {
    m_lowestPitch = Note.PITCH_C3;
    m_highestPitch = Note.PITCH_C5;
    m_lowestPosition =    0;
    m_highestPosition = 600;
    m_measureDivisions = 12;
  }
  public NoteFactory(int lowestPitch, int highestPitch, int lowestPosition,
                     int highestPosition, int measureDivisions, int beats, 
                     int beatType, boolean isKeySharp) {
    m_lowestPitch = lowestPitch;
    m_highestPitch = highestPitch;
    m_lowestPosition = lowestPosition;
    m_highestPosition = highestPosition;
    m_measureDivisions = measureDivisions;
    m_beats = beats;
    m_beatType = beatType;
    m_isKeySharp = isKeySharp;
  }


  void setLowestPitch(int lowestPitch) {
    m_lowestPitch = lowestPitch;
  }
  void setHighestPitch(int highestPitch) {
    m_highestPitch = highestPitch;
  }
  void setLowestPosition(int lowestPosition) {
    m_lowestPosition = lowestPosition;
  }
  void setHighestPosition(int highestPosition) {
    m_highestPosition = highestPosition;
  }
  void setMeasureDivisions(int measureDivisions) {
    m_measureDivisions = measureDivisions;
  }
  void setBeats(int beats) {
    m_beats = beats;
  }
  void setBeatType(int beatType) {
    m_beatType = beatType;
  }
  void setIsKeySharp(boolean isKeySharp) {
    m_isKeySharp = isKeySharp;
  }

  int getLowestPitch() {
    return m_lowestPitch;
  }
  int getHighestPitch() {
    return m_highestPitch;
  }
  int getLowestPosition() {
    return m_lowestPosition;
  }
  int getHighestPosition() {
    return m_highestPosition;
  }
  int getMeasureDivisions() {
    return m_measureDivisions;
  }
  int getBeats() {
    return m_beats;
  }
  int getBeatType() {
    return m_beatType;
  }
  boolean isKeySharp() {
    return m_isKeySharp;
  }
  
  
  Note newNote(int position, int type, boolean isRest) {
    Note note = new Note();

    int notesPerMeasure, noteNumerator, noteDenominator;
    switch (type) {
      case Note.TYPE_MAXIMA :
        note.setType("maxima");
        noteNumerator =   8;
        noteDenominator = 1;
        break;
      case Note.TYPE_LONG :
        note.setType("long");
        noteNumerator =   4;
        noteDenominator = 1;
        break;
      case Note.TYPE_LONG_DOTTED :
        note.setType("long");
        note.setIsDotted(true);
        noteNumerator =   6;
        noteDenominator = 1;
        break;
      case Note.TYPE_BREVE :
        note.setType("breve");
        noteNumerator =   2;
        noteDenominator = 1;
        break;
      case Note.TYPE_BREVE_DOTTED :
        note.setType("breve");
        note.setIsDotted(true);
        noteNumerator =   3;
        noteDenominator = 1;
        break;
      case Note.TYPE_WHOLE :
        note.setType("whole");
        noteNumerator =   1;
        noteDenominator = 1;
        break;
      case Note.TYPE_WHOLE_DOTTED :
        note.setType("whole");
        note.setIsDotted(true);
        noteNumerator =   3;
        noteDenominator = 2;
        break;
      case Note.TYPE_HALF :
        note.setType("half");
        noteNumerator =   1;
        noteDenominator = 2;
        break;
      case Note.TYPE_HALF_DOTTED :
        note.setType("half");
        note.setIsDotted(true);
        noteNumerator =   3;
        noteDenominator = 4;
        break;
      case Note.TYPE_QUARTER :
        note.setType("quarter");
        noteNumerator =   1;
        noteDenominator = 4;
        break;
      case Note.TYPE_QUARTER_DOTTED :
        note.setType("quarter");
        note.setIsDotted(true);
        noteNumerator =   3;
        noteDenominator = 8;
        break;
      case Note.TYPE_EIGHTH :
        note.setType("eighth");
        noteNumerator =   1;
        noteDenominator = 8;
        break;
      case Note.TYPE_EIGHTH_DOTTED :
        note.setType("eighth");
        note.setIsDotted(true);
        noteNumerator =    3;
        noteDenominator = 16;
        break;
      case Note.TYPE_SIXTEENTH :
        note.setType("16th");
        noteNumerator =    1;
        noteDenominator = 16;
        break;
      case Note.TYPE_SIXTEENTH_DOTTED :
        note.setType("16th");
        note.setIsDotted(true);
        noteNumerator =    3;
        noteDenominator = 32;
        break;
      case Note.TYPE_THIRTYSECOND :
        note.setType("32th");
        noteNumerator =    1;
        noteDenominator = 32;
        break;
      case Note.TYPE_THIRTYSECOND_DOTTED :
        note.setType("32th");
        note.setIsDotted(true);
        noteNumerator =    3;
        noteDenominator = 64;
        break;
      case Note.TYPE_SIXTYFOURTH :
        note.setType("64th");
        noteNumerator =    1;
        noteDenominator = 64;
        break;
      default :
        noteNumerator   = 1;
        noteDenominator = 1;
        break;
    }
    // TODO: Raise exception if note is longer than measure.
    notesPerMeasure = (m_beats * noteDenominator) / (m_beatType * noteNumerator);
    note.setDuration(m_measureDivisions / notesPerMeasure);
    
    int semitonesInRange = m_highestPitch - m_lowestPitch;
    int noteStep = (m_highestPosition - m_lowestPosition) / semitonesInRange;
    int pitch = m_lowestPitch + (position / noteStep);

    note.setPitch(pitch);

    if (!isRest) {
      switch (pitch) {
        case Note.PITCH_C0S : case Note.PITCH_D0S : case Note.PITCH_F0S : 
        case Note.PITCH_G0S : case Note.PITCH_A0S :
        case Note.PITCH_C1S : case Note.PITCH_D1S : case Note.PITCH_F1S : 
        case Note.PITCH_G1S : case Note.PITCH_A1S :
        case Note.PITCH_C2S : case Note.PITCH_D2S : case Note.PITCH_F2S : 
        case Note.PITCH_G2S : case Note.PITCH_A2S :
        case Note.PITCH_C3S : case Note.PITCH_D3S : case Note.PITCH_F3S :
        case Note.PITCH_G3S : case Note.PITCH_A3S :
        case Note.PITCH_C4S : case Note.PITCH_D4S : case Note.PITCH_F4S :
        case Note.PITCH_G4S : case Note.PITCH_A4S :
        case Note.PITCH_C5S : case Note.PITCH_D5S : case Note.PITCH_F5S :
        case Note.PITCH_G5S : case Note.PITCH_A5S :
        case Note.PITCH_C6S : case Note.PITCH_D6S : case Note.PITCH_F6S :
        case Note.PITCH_G6S : case Note.PITCH_A6S :
        case Note.PITCH_C7S : case Note.PITCH_D7S : case Note.PITCH_F7S :
        case Note.PITCH_G7S : case Note.PITCH_A7S :
        case Note.PITCH_C8S : case Note.PITCH_D8S : case Note.PITCH_F8S :
        case Note.PITCH_G8S : case Note.PITCH_A8S :
          if (m_isKeySharp)
            note.setAlter(1);
          else
            note.setAlter(-1);
          break;
      }
    }

    return note;
  }
}