import java.util.Random;

public class TestNoteFactory {
  public static void main(String[] args) {
    NoteFactory noteFactory = new NoteFactory(Note.PITCH_C4, Note.PITCH_C5, 
                                              0, 599, 16, 4, 4, true);
    
    Random random = new Random();
    Score score = new Score();
    score.setTitle("Test Score");
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
    part.setBeats(4);
    part.setBeatType(4);
    part.setMeasureDivisions(16);

    int position, type;
    for (int i = 1; i <= 12; ++i) { // start from 1
      position = i * 600/13 - 1; // total pixels / total notes (equal value)
      type = Note.TYPE_QUARTER;
      if (i == 5)
        part.addNote(noteFactory.newNote(position, type, true));
      else
        part.addNote(noteFactory.newNote(position, type, false));
    }
    part.addNote(noteFactory.newNote(600, Note.TYPE_WHOLE, false));
    score.addPart(part);
    
    System.out.println(
        "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + 
        "<!DOCTYPE score-partwise PUBLIC\n" +
        "    \"-//Recordare//DTD MusicXML 3.0 Partwise//EN\"\n" +
        "    \"http://www.musicxml.org/dtds/partwise.dtd\">");
    System.out.println(score.getMusicXmlNode().getXmlString(0));
  }
}
