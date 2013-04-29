//Soy Freddy otra vez
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
  private int     m_duration;
  private String  m_type;
  private boolean m_isSilence;

  private MusicXmlNode m_musicXmlNode;

  public Note() {
    m_pitch = PITCH_C4;
    m_duration = 0;
    m_type = new String();

    m_musicXmlNode = new MusicXmlNode();
  }

  public int getDuration() {
    return m_duration;
  }
  public int getPitch() {
    return m_pitch;
  }
  public String getType() {
    return m_type;
  }
  public boolean isSilence() {
    return m_isSilece();
  }
  public ArrayList<Note> split() {
    ArrayList<Note> splittedNotes;

    return splittedNotes;
  }

  public MusicXmlNode getMusicXmlNode() {
    buildMusicXmlNode();

    return m_musicXmlNode;
  }

  private void buildMusicXmlNode() {
  }
}

