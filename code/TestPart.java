public class TestPart {
  public static void main(String args[]) {
    Part part = new Part();
    int partNo = 1;
    part.setId("P" + partNo);
    part.setTransposeDiatonic(-1);
    part.setTransposeChromatic(-2);
    
    Note note = new Note();
    part.addNote(note);

    
    Note note2 = new Note(Note.PITCH_G5S, 1, 4, "eigth", true, false, Note.TIE_NONE);
    part.addNote(note2);
    part.addNote(note2);
    part.addNote(note2);
    
    Note note3 = new Note(true, 4, "eigth", true, Note.TIE_START);
    part.addNote(note3);
    
    System.out.print(part.getMusicXmlNode().getXmlString(0));
  }
}
