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
  private boolean m_isSilence;

  private MusicXmlNode m_musicXmlNode;

  public Note() {
    m_pitch = PITCH_C4;
    m_duration = 0;
    m_type = new String();

    m_musicXmlNode = new MusicXmlNode();
  }

  public void setPitch(int pitch) {
    if (pitch >= C0 && pitch <= B8)
      m_pitch = pitch;
  }
  public void setAlter(int alter) {
    if (alter >= -2 && alter <= 2)
      m_alter = alter;
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
  public void setIsSilence(boolean isSilence) {
    m_isSilence = silence;
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
  public boolean isSilence() {
    return m_isSilece();
  }

  public MusicXmlNode getMusicXmlNode() {
    buildMusicXmlNode();

    return m_musicXmlNode;
  }

  private void buildMusicXmlNode() {
    MusicXmlNode pitch = new MusicXmlNode("pitch");
    MusicXmlNode step = new MusicXmlNode("step");
    switch (m_pitch) {
      case C0 : case C0S :
      case C1 : case C1S :
      case C2 : case C2S :
      case C3 : case C3S :
      case C4 : case C4S :
      case C5 : case C5S :
      case C6 : case C6S :
      case C7 : case C7S :
      case C8 : case C8S :
        step.setText("C");
        break;
      case D0 : case D0S :
      case D1 : case D1S :
      case D2 : case D2S :
      case D3 : case D3S :
      case D4 : case D4S :
      case D5 : case D5S :
      case D6 : case D6S :
      case D7 : case D7S :
      case D8 : case D8S :
        step.setText("D");
        break;
      case E0 :
      case E1 :
      case E2 :
      case E3 :
      case E4 :
      case E5 :
      case E6 :
      case E7 :
      case E8 :
        step.setText("E");
        break;
      case F0 : case F0S :
      case F1 : case F1S :
      case F2 : case F2S :
      case F3 : case F3S :
      case F4 : case F4S :
      case F5 : case F5S :
      case F6 : case F6S :
      case F7 : case F7S :
      case F8 : case F8S :
        step.setText("F");
        break;
      case G0 : case G0S :
      case G1 : case G1S :
      case G2 : case G2S :
      case G3 : case G3S :
      case G4 : case G4S :
      case G5 : case G5S :
      case G6 : case G6S :
      case G7 : case G7S :
      case G8 : case G8S :
        step.setText("G");
        break;
      case A0 : case A0S :
      case A1 : case A1S :
      case A2 : case A2S :
      case A3 : case A3S :
      case A4 : case A4S :
      case A5 : case A5S :
      case A6 : case A6S :
      case A7 : case A7S :
      case A8 : case A8S :
        step.setText("A");
        break;
      case B0 :
      case B1 :
      case B2 :
      case B3 :
      case B4 :
      case B5 :
      case B6 :
      case B7 :
      case B8 :
        step.setText("B");
        break;
    }
    pitch.addChild(step);

    MusicXmlNode octave = new MusicXmlNode("octave");
    
    if (m_pitch <= B0) {
      octave.setText("0");
    }
    else if (m_pitch <= B1) {
      octave.setText("1");
    }
    else if (m_pitch <= B2) {
      octave.setText("2");
    }
    else if (m_pitch <= B3) {
      octave.setText("3");
    }
    else if (m_pitch <= B4) {
      octave.setText("4");
    }
    else if (m_pitch <= B5) {
      octave.setText("5");
    }
    else if (m_pitch <= B6) {
      octave.setText("6");
    }
    else if (m_pitch < B7) {
      octave.setText("7");
    }
    else if (m_pitch <= B8) {
      octave.setText("8");
    }
    pitch.addChild(octave);

    m_musicXmlNode.addChild(pitch);

    MusicXmlNode duration = new MusicXmlNode("duration");
    duration.setText(Integer(m_duration).toString);
    m_musicXmlNode.addChild(duration);

    MusicXmlNode type = new MusicXmlNode("type");
    type.setText(m_type);
    m_musicXmlNode.addChild(type);
  }
}

