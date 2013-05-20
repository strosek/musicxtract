import java.util.Random;

public class TestNoteFactory {
  public static void main(String[] args) {
    NoteFactory noteFactory = new NoteFactory(Note.PITCH_C4, Note.PITCH_C5, 
                                              0, 600, 16, 4, 4, true);
    
    Random random = new Random();
    Score score = new Score();
    score.setTitle("Test score");
    score.setComposer("MusicXtract");
    score.setRights("(c) 2013 Erick Daniel Corona");
    score.setSoftware("MusicXtract 1.0");
    score.setEncodingDate("05-18-2013");

    Part part = new Part();
    int partNo = 1;
    part.setId("P" + partNo);
    part.setTransposeDiatonic(0);
    part.setTransposeChromatic(0);
    part.setInstrument("GrandPiano");
    part.setName("Piano");

    for (int i = 0; i < 10; ++i) {
      part.addNote(noteFactory.newNote(random.nextInt() % 600, 
          Note.TYPE_WHOLE + random.nextInt((Note.TYPE_SIXTEENTH - Note.TYPE_WHOLE)), false));
    }
    score.addPart(part);
    
    System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + 
        "<!DOCTYPE score-partwise PUBLIC\n" +
        "    \"-//Recordare//DTD MusicXML 3.0 Partwise//EN\"\n" +
        "    \"http://www.musicxml.org/dtds/partwise.dtd\">");
    System.out.println(score.getMusicXmlNode().getXmlString(0));
  }
}
