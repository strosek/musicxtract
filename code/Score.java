package tutorial.firstapp;

import java.util.LinkedList;

public class Score {
  private String           m_title;
  private String           m_composer;
  private String           m_rights;
  private String           m_software;
  private String           m_encodingDate;
  private LinkedList<Part> m_parts;

  
  public Score() {
    m_title = new String();
    m_composer = new String();
    m_rights = new String();
    m_software = new String();
    m_encodingDate = new String();
    m_parts = new LinkedList<Part>();
  }
  public Score(String title, String composer, String rights, String software, 
               String encodingDate, LinkedList<Part> parts) {
    m_title = title;
    m_composer = composer;
    m_rights = rights;
    m_software = software;
    m_encodingDate = encodingDate;
    m_parts = parts;
  }
  public Score(Score score) {
    m_title = score.getTitle();
    m_composer = score.getComposer();
    m_rights = score.getRights();
    m_software = score.getSoftware();
    m_encodingDate = score.getEncodingDate();
    m_parts = score.getParts();
  }

  
  void setTitle(String title) {
    m_title = title;
  }
  void setComposer(String composer) {
    m_composer = composer;
  }
  void setRights(String rights) {
    m_rights = rights;
  }
  void setSoftware(String software) {
    m_software = software;
  }
  void setEncodingDate(String date) {
    m_encodingDate = date;
  }
  void setParts(LinkedList<Part> parts) {
    m_parts = parts;
  }
  
  String getTitle() {
    return m_title;
  }
  String getComposer() {
    return m_composer;
  }
  String getRights() {
    return m_rights;
  }
  String getSoftware() {
    return m_software;
  }
  String getEncodingDate() {
    return m_encodingDate;
  }
  LinkedList<Part> getParts() {
    return m_parts;
  }


  void addPart(Part part) {
    m_parts.add(part);
  }

  public MusicXmlNode getMusicXmlNode() {
    MusicXmlNode score = new MusicXmlNode("score-partwise");
    score.addAttribute("version", "3.0");
    
    MusicXmlNode title = new MusicXmlNode("movement-title");
    title.setText(m_title);
    score.addChild(title);
    
    MusicXmlNode identification = new MusicXmlNode("identification");
    
    MusicXmlNode creator = new MusicXmlNode("creator");
    creator.addAttribute("type", "composer");
    creator.setText(m_composer);
    identification.addChild(creator);
    
    MusicXmlNode rights = new MusicXmlNode("rights");
    rights.setText(m_rights);
    identification.addChild(rights);
    
    MusicXmlNode encoding = new MusicXmlNode("encoding");
    MusicXmlNode software = new MusicXmlNode("software");
    software.setText(m_software);
    encoding.addChild(software);
    
    MusicXmlNode encodingDate = new MusicXmlNode("encoding-date");
    encodingDate.setText(m_encodingDate);
    encoding.addChild(encodingDate);
    
    score.addChild(identification);
    
    MusicXmlNode partList = new MusicXmlNode("part-list");
    
    MusicXmlNode scorePart = new MusicXmlNode("score-part");
    MusicXmlNode partName = new MusicXmlNode("part-name");
    for (Part part : m_parts) {
      scorePart.addAttribute("id", part.getId());
      partName.setText(part.getName());
      scorePart.addChild(partName);
      
      partList.addChild(new MusicXmlNode(scorePart));
      scorePart.clearAttributes();
      scorePart.clearChildren();
    }
    score.addChild(partList);
    
    for (Part part : m_parts)
      score.addChild(part.getMusicXmlNode());

    return score;
  }
}

