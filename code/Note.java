public class Note {
  public static final int PITCH_C0 =   0;
  public static final int PITCH_C0S =  1;
  public static final int PITCH_D0 =   2;
  public static final int PITCH_D0S =  3;
  public static final int PITCH_E0 =   4;
  public static final int PITCH_F0 =   5;
  public static final int PITCH_F0S =  6;
  public static final int PITCH_G0 =   7;
  public static final int PITCH_G0S =  8;
  public static final int PITCH_A0 =   9;
  public static final int PITCH_A0S = 10;
  public static final int PITCH_B0 =  11;

  public static final int PITCH_C1 =  12;
  public static final int PITCH_C1S = 13;
  public static final int PITCH_D1 =  14;
  public static final int PITCH_D1S = 15;
  public static final int PITCH_E1 =  16;
  public static final int PITCH_F1 =  17;
  public static final int PITCH_F1S = 18;
  public static final int PITCH_G1 =  19;
  public static final int PITCH_G1S = 20;
  public static final int PITCH_A1 =  21;
  public static final int PITCH_A1S = 22;
  public static final int PITCH_B1 =  23;

  public static final int PITCH_C2 =  24;
  public static final int PITCH_C2S = 25;
  public static final int PITCH_D2 =  26;
  public static final int PITCH_D2S = 27;
  public static final int PITCH_E2 =  28;
  public static final int PITCH_F2 =  29;
  public static final int PITCH_F2S = 30;
  public static final int PITCH_G2 =  31;
  public static final int PITCH_G2S = 32;
  public static final int PITCH_A2 =  33;
  public static final int PITCH_A2S = 34;
  public static final int PITCH_B2 =  35;

  public static final int PITCH_C3 =  36;
  public static final int PITCH_C3S = 37;
  public static final int PITCH_D3 =  38;
  public static final int PITCH_D3S = 39;
  public static final int PITCH_E3 =  40;
  public static final int PITCH_F3 =  41;
  public static final int PITCH_F3S = 42;
  public static final int PITCH_G3 =  43;
  public static final int PITCH_G3S = 44;
  public static final int PITCH_A3 =  45;
  public static final int PITCH_A3S = 46;
  public static final int PITCH_B3 =  47;

  public static final int PITCH_C4 =  48;
  public static final int PITCH_C4S = 49;
  public static final int PITCH_D4 =  50;
  public static final int PITCH_D4S = 51;
  public static final int PITCH_E4 =  52;
  public static final int PITCH_F4 =  53;
  public static final int PITCH_F4S = 54;
  public static final int PITCH_G4 =  55;
  public static final int PITCH_G4S = 56;
  public static final int PITCH_A4 =  57;
  public static final int PITCH_A4S = 58;
  public static final int PITCH_B4 =  59;

  public static final int PITCH_C5 =  60;
  public static final int PITCH_C5S = 61;
  public static final int PITCH_D5 =  62;
  public static final int PITCH_D5S = 63;
  public static final int PITCH_E5 =  64;
  public static final int PITCH_F5 =  65;
  public static final int PITCH_F5S = 66;
  public static final int PITCH_G5 =  67;
  public static final int PITCH_G5S = 68;
  public static final int PITCH_A5 =  69;
  public static final int PITCH_A5S = 70;
  public static final int PITCH_B5 =  71;

  public static final int PITCH_C6 =  72;
  public static final int PITCH_C6S = 73;
  public static final int PITCH_D6 =  74;
  public static final int PITCH_D6S = 75;
  public static final int PITCH_E6 =  76;
  public static final int PITCH_F6 =  77;
  public static final int PITCH_F6S = 78;
  public static final int PITCH_G6 =  79;
  public static final int PITCH_G6S = 80;
  public static final int PITCH_A6 =  81;
  public static final int PITCH_A6S = 82;
  public static final int PITCH_B6 =  83;

  public static final int PITCH_C7 =  84;
  public static final int PITCH_C7S = 85;
  public static final int PITCH_D7 =  86;
  public static final int PITCH_D7S = 87;
  public static final int PITCH_E7 =  88;
  public static final int PITCH_F7 =  89;
  public static final int PITCH_F7S = 90;
  public static final int PITCH_G7 =  91;
  public static final int PITCH_G7S = 92;
  public static final int PITCH_A7 =  93;
  public static final int PITCH_A7S = 94;
  public static final int PITCH_B7 =  95;

  public static final int PITCH_C8 =  96;
  public static final int PITCH_C8S = 97;
  public static final int PITCH_D8 =  98;
  public static final int PITCH_D8S = 99;
  public static final int PITCH_E8 = 100;
  public static final int PITCH_F8 = 101;
  public static final int PITCH_F8S =102;
  public static final int PITCH_G8 = 103;
  public static final int PITCH_G8S =104;
  public static final int PITCH_A8 = 105;
  public static final int PITCH_A8S =106;
  public static final int PITCH_B8 = 107;


  private int     m_pitch;
  private int     m_alter;
  private int     m_duration;
  private String  m_type;
  private boolean m_isDotted;
  private boolean m_isRest;

  public Note() {
    m_pitch = PITCH_C4;
    m_alter = 0;
    m_duration = 0;
    m_type = "quarter";
    m_isDotted = false;
    m_isRest = false;
  }
  
  public Note(int pitch, int alter, int duration, String type, 
              boolean isDotted, boolean isRest) {
    m_pitch = pitch;
    m_alter = alter;
    m_duration = duration;
    m_type = type;
    m_isDotted = isDotted;
    m_isRest = isRest;
  }
  public Note(boolean isRest, int duration, String type, 
              boolean isDotted) {
    m_isRest = isRest;
    m_duration = duration;
    m_type = type;
    m_isDotted = isDotted;
  }

  public void setPitch(int pitch) {
    if (pitch >= PITCH_C0 && pitch <= PITCH_B8)
      m_pitch = pitch;
    else
      System.err.println("error: Note.setPitch(): pitch value out of range");
  }
  public void setAlter(int alter) {
    if (alter >= -2 && alter <= 2)
      m_alter = alter;
    else
      System.err.println("error: Note.setAlter(): alter value out of range");
  }
  public void setDuration(int duration) {
    m_duration = duration;
  }
  public void setType(String type) {
    m_type = type;
  }
  public void setIsDotted(boolean isDotted) {
    m_isDotted = isDotted;
  }
  public void setIsRest(boolean isRest) {
    m_isRest = isRest;
  }

  public int getDuration() {
    return m_duration;
  }
  public int getPitch() {
    return m_pitch;
  }
  public int getAlter() {
    return m_alter;
  }
  public String getType() {
    return m_type;
  }
  public boolean getIsDotted() {
    return m_isDotted;
  }
  public boolean isRest() {
    return m_isRest;
  }

  public MusicXmlNode getMusicXmlNode() {
    MusicXmlNode node = new MusicXmlNode();
    node.setName("note");

    if (!m_isRest) {
      MusicXmlNode pitch = new MusicXmlNode("pitch");

      MusicXmlNode step = new MusicXmlNode("step");
      switch (m_pitch) {
        case PITCH_C0 : case PITCH_C0S :
        case PITCH_C1 : case PITCH_C1S :
        case PITCH_C2 : case PITCH_C2S :
        case PITCH_C3 : case PITCH_C3S :
        case PITCH_C4 : case PITCH_C4S :
        case PITCH_C5 : case PITCH_C5S :
        case PITCH_C6 : case PITCH_C6S :
        case PITCH_C7 : case PITCH_C7S :
        case PITCH_C8 : case PITCH_C8S :
          step.setText("C");
          break;
        case PITCH_D0 : case PITCH_D0S :
        case PITCH_D1 : case PITCH_D1S :
        case PITCH_D2 : case PITCH_D2S :
        case PITCH_D3 : case PITCH_D3S :
        case PITCH_D4 : case PITCH_D4S :
        case PITCH_D5 : case PITCH_D5S :
        case PITCH_D6 : case PITCH_D6S :
        case PITCH_D7 : case PITCH_D7S :
        case PITCH_D8 : case PITCH_D8S :
          step.setText("D");
          break;
        case PITCH_E0 :
        case PITCH_E1 :
        case PITCH_E2 :
        case PITCH_E3 :
        case PITCH_E4 :
        case PITCH_E5 :
        case PITCH_E6 :
        case PITCH_E7 :
        case PITCH_E8 :
          step.setText("E");
          break;
        case PITCH_F0 : case PITCH_F0S :
        case PITCH_F1 : case PITCH_F1S :
        case PITCH_F2 : case PITCH_F2S :
        case PITCH_F3 : case PITCH_F3S :
        case PITCH_F4 : case PITCH_F4S :
        case PITCH_F5 : case PITCH_F5S :
        case PITCH_F6 : case PITCH_F6S :
        case PITCH_F7 : case PITCH_F7S :
        case PITCH_F8 : case PITCH_F8S :
          step.setText("F");
          break;
        case PITCH_G0 : case PITCH_G0S :
        case PITCH_G1 : case PITCH_G1S :
        case PITCH_G2 : case PITCH_G2S :
        case PITCH_G3 : case PITCH_G3S :
        case PITCH_G4 : case PITCH_G4S :
        case PITCH_G5 : case PITCH_G5S :
        case PITCH_G6 : case PITCH_G6S :
        case PITCH_G7 : case PITCH_G7S :
        case PITCH_G8 : case PITCH_G8S :
          step.setText("G");
          break;
        case PITCH_A0 : case PITCH_A0S :
        case PITCH_A1 : case PITCH_A1S :
        case PITCH_A2 : case PITCH_A2S :
        case PITCH_A3 : case PITCH_A3S :
        case PITCH_A4 : case PITCH_A4S :
        case PITCH_A5 : case PITCH_A5S :
        case PITCH_A6 : case PITCH_A6S :
        case PITCH_A7 : case PITCH_A7S :
        case PITCH_A8 : case PITCH_A8S :
          step.setText("A");
          break;
        case PITCH_B0 :
        case PITCH_B1 :
        case PITCH_B2 :
        case PITCH_B3 :
        case PITCH_B4 :
        case PITCH_B5 :
        case PITCH_B6 :
        case PITCH_B7 :
        case PITCH_B8 :
          step.setText("B");
          break;
        default :
          System.err.println("error: Note.buildMusicXmlNode(): Invalid pitch value");
          break;
      }
      pitch.addChild(step);
      
      if (m_alter != 0) {
        MusicXmlNode alter = new MusicXmlNode("alter");
        alter.setText(Integer.toString(m_alter));
        pitch.addChild(alter);
      }

      MusicXmlNode octave = new MusicXmlNode("octave");
      switch (m_pitch) {
        case PITCH_C0 : case PITCH_C0S :
        case PITCH_D0 : case PITCH_D0S :
        case PITCH_E0 :
        case PITCH_F0 : case PITCH_F0S :
        case PITCH_G0 : case PITCH_G0S :
        case PITCH_A0 : case PITCH_A0S :
        case PITCH_B0 :
          octave.setText("0");
          break;
        case PITCH_C1 : case PITCH_C1S :
        case PITCH_D1 : case PITCH_D1S :
        case PITCH_E1 :
        case PITCH_F1 : case PITCH_F1S :
        case PITCH_G1 : case PITCH_G1S :
        case PITCH_A1 : case PITCH_A1S :
        case PITCH_B1 :
          octave.setText("1");
          break;
        case PITCH_C2 : case PITCH_C2S :
        case PITCH_D2 : case PITCH_D2S :
        case PITCH_E2 :
        case PITCH_F2 : case PITCH_F2S :
        case PITCH_G2 : case PITCH_G2S :
        case PITCH_A2 : case PITCH_A2S :
        case PITCH_B2 :
          octave.setText("2");
          break;
        case PITCH_C3 : case PITCH_C3S :
        case PITCH_D3 : case PITCH_D3S :
        case PITCH_E3 :
        case PITCH_F3 : case PITCH_F3S :
        case PITCH_G3 : case PITCH_G3S :
        case PITCH_A3 : case PITCH_A3S :
        case PITCH_B3 :
          octave.setText("3");
          break;
        case PITCH_C4 : case PITCH_C4S :
        case PITCH_D4 : case PITCH_D4S :
        case PITCH_E4 :
        case PITCH_F4 : case PITCH_F4S :
        case PITCH_G4 : case PITCH_G4S :
        case PITCH_A4 : case PITCH_A4S :
        case PITCH_B4 :
          octave.setText("4");
          break;
        case PITCH_C5 : case PITCH_C5S :
        case PITCH_D5 : case PITCH_D5S :
        case PITCH_E5 :
        case PITCH_F5 : case PITCH_F5S :
        case PITCH_G5 : case PITCH_G5S :
        case PITCH_A5 : case PITCH_A5S :
        case PITCH_B5 :
          octave.setText("5");
          break;
        case PITCH_C6 : case PITCH_C6S :
        case PITCH_D6 : case PITCH_D6S :
        case PITCH_E6 :
        case PITCH_F6 : case PITCH_F6S :
        case PITCH_G6 : case PITCH_G6S :
        case PITCH_A6 : case PITCH_A6S :
        case PITCH_B6 :
          octave.setText("6");
          break;
        case PITCH_C7 : case PITCH_C7S :
        case PITCH_D7 : case PITCH_D7S :
        case PITCH_E7 :
        case PITCH_F7 : case PITCH_F7S :
        case PITCH_G7 : case PITCH_G7S :
        case PITCH_A7 : case PITCH_A7S :
        case PITCH_B7 :
          octave.setText("7");
          break;
        case PITCH_C8 : case PITCH_C8S :
        case PITCH_D8 : case PITCH_D8S :
        case PITCH_E8 :
        case PITCH_F8 : case PITCH_F8S :
        case PITCH_G8 : case PITCH_G8S :
        case PITCH_A8 : case PITCH_A8S :
        case PITCH_B8 :
          octave.setText("8");
          break;
        default :
          System.err.println("error: Note.buildMusicXmlNode(): Invalid pitch value");
          break;
      }
      pitch.addChild(octave);

      node.addChild(pitch);
    }
    else {
      MusicXmlNode rest = new MusicXmlNode("rest");
      node.addChild(rest);
    }
    
    MusicXmlNode duration = new MusicXmlNode("duration");
    duration.setText(Integer.toString(m_duration));
    node.addChild(duration);

    MusicXmlNode type = new MusicXmlNode("type");
    type.setText(m_type);
    node.addChild(type);
    
    if (m_isDotted) {
      MusicXmlNode dot = new MusicXmlNode("dot");
      node.addChild(dot);
    }
    return node;
  }
}

