package tutorial.firstapp;

public class MusicXmlAttribute {
  private String m_name;
  private String m_value;


  public MusicXmlAttribute() {
    m_name = new String();
    m_value = new String();
  }
  public MusicXmlAttribute(String name, String value) {
    m_name = name;
    m_value = value;
  }
  public MusicXmlAttribute(MusicXmlAttribute attribute) {
    m_name = attribute.getName();
    m_value = attribute.getValue();
  }

  public void setName(String name) {
    m_name = name;
  }
  public void setValue(String value) {
    m_value = value;
  }

  public String getName() {
    return m_name;
  }
  public String getValue() {
    return m_value;
  }
}
