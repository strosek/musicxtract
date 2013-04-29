public class MusicXmlTest {
  public static void main(String[] args) {
    String musicXmlString = new String();
    Score score = new Score();
    musicXmlString = 
        "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + 
        "<!DOCTYPE score-partwise PUBLIC\n" +
        "    \"-//Recordare//DTD MusicXML 3.0 Partwise//EN\"\n" +
        "    \"http://www.musicxml.org/dtds/partwise.dtd\">\n";
    
    MusicXmlNode scorePartwise = new MusicXmlNode("score-partwise");
    scorePartwise.addAttribute("version", "3.0");
    
    MusicXmlNode partList = new MusicXmlNode("part-list");
    
    MusicXmlNode scorePart = new MusicXmlNode("score-part");
    scorePart.addAttribute("id", "P1");
    
    MusicXmlNode partName = new MusicXmlNode("part-name");
    partName.setText("Music");

    scorePart.addChild(partName);
    partList.addChild(scorePart);
    scorePartwise.addChild(partList);
    
    MusicXmlNode part = new MusicXmlNode("part");
    part.addAttribute("id", "P1");
    
    MusicXmlNode measure = new MusicXmlNode("measure");
    measure.addAttribute("number", "1");

    MusicXmlNode attributes = new MusicXmlNode("attributes");
    
    MusicXmlNode divisions = new MusicXmlNode("divisions");
    divisions.setText((new Integer(1)).toString());
    attributes.addChild(divisions);
    
    MusicXmlNode key = new MusicXmlNode("key");
    
    MusicXmlNode fifths = new MusicXmlNode("fifths");
    fifths.setText("0");
    key.addChild(fifths);
    
    attributes.addChild(key);
    
    MusicXmlNode time = new MusicXmlNode("time");
    
    MusicXmlNode beats = new MusicXmlNode("beats");
    beats.setText("4");
    time.addChild(beats);
    
    MusicXmlNode beatType = new MusicXmlNode("beat-type");
    beatType.setText("4");
    time.addChild(beatType);
    
    attributes.addChild(time);
    
    MusicXmlNode clef = new MusicXmlNode("clef");
    
    MusicXmlNode sign = new MusicXmlNode("sign");
    sign.setText("G");
    clef.addChild(sign);
    
    MusicXmlNode line = new MusicXmlNode("line");
    line.setText("2");
    clef.addChild(line);
    
    attributes.addChild(clef);
    
    MusicXmlNode note = new MusicXmlNode("note");
    
    MusicXmlNode pitch = new MusicXmlNode("pitch");
    
    MusicXmlNode step = new MusicXmlNode("step");
    step.setText("C");
    pitch.addChild(step);
    
    MusicXmlNode octave = new MusicXmlNode("octave");
    octave.setText("4");
    pitch.addChild(octave);
    
    note.addChild(pitch);
    
    MusicXmlNode duration = new MusicXmlNode("duration");
    duration.setText("4");
    note.addChild(duration);
    
    MusicXmlNode type = new MusicXmlNode("type");
    type.setText("whole");
    note.addChild(type);

    measure.addChild(attributes);
    measure.addChild(note);

    part.addChild(measure);

    scorePartwise.addChild(part);


    musicXmlString += scorePartwise.getXmlString(0);
    
    System.out.print(musicXmlString);
  }
}
