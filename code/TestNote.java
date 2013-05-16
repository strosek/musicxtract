public class TestNote {
  public static void main(String args[]) {
    Note note = new Note();
    System.out.print(note.getMusicXmlNode().getXmlString(0));

    Note note2 = new Note(Note.PITCH_G5S, 1, 4, "eigth", true, false, Note.TIE_NONE);
    System.out.print(note2.getMusicXmlNode().getXmlString(0));
    
    Note note3 = new Note(true, 4, "eigth", true, Note.TIE_START);
    System.out.print(note3.getMusicXmlNode().getXmlString(0));
  }
}
