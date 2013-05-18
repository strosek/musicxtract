public class TestScore {
  public static void main(String[] args) {
    Score score = new Score();
    
    score.setTitle("Test score");
    score.setComposer("MusicXtract");
    score.setRights("(c) 2013 Erick Daniel Corona");
    score.setSoftware("MusicXtract 1.0");
    score.setEncodingDate("05-18-2013");

    Part part = new Part();
    int partNo = 1;
    part.setId("P" + partNo);
    part.setTransposeDiatonic(-1);
    part.setTransposeChromatic(-2);
    part.setInstrument("GrandPiano");
    part.setName("Piano");
    
    Note note = new Note();
    part.addNote(note);
    
    Note note2 = new Note(Note.PITCH_G5S, 1, 4, "eigth", true, false, Note.TIE_NONE);
    part.addNote(note2);
    part.addNote(note2);
    part.addNote(note2);
    
    Note note3 = new Note(true, 4, "eigth", true, Note.TIE_START);
    part.addNote(note3);

    score.addPart(part);
    
    System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + 
        "<!DOCTYPE score-partwise PUBLIC\n" +
        "    \"-//Recordare//DTD MusicXML 3.0 Partwise//EN\"\n" +
        "    \"http://www.musicxml.org/dtds/partwise.dtd\">");
    System.out.println(score.getMusicXmlNode().getXmlString(0));
  }
}