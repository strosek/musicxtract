//  Copyright (c) 2013 Erick Daniel Corona <edcoronag@gmail.com>
//
//  Permission is hereby granted, free of charge, to any person
//  obtaining a copy of this software and associated documentation
//  files (the Software), to deal in the Software without
//  restriction, including without limitation the rights to use,
//  copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the
//  Software is furnished to do so, subject to the following
//  conditions:
//
//  The above copyright notice and this permission notice shall be
//  included in all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED AS IS, WITHOUT WARRANTY OF ANY KIND,
//  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
//  OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
//  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
//  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
//  WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
//  OTHER DEALINGS IN THE SOFTWARE.


import java.util.LinkedList;


public class MusicXmlNode {
  private String                        m_name;
  private String                        m_text;
  private LinkedList<MusicXmlAttribute> m_attributes;
  private LinkedList<MusicXmlNode>      m_children;
  

  public MusicXmlNode() {
    m_name = new String();
    m_text = new String();
    m_attributes = new LinkedList<MusicXmlAttribute>();
    m_children = new LinkedList<MusicXmlNode>();
  }
  public MusicXmlNode(String name) {
    m_name = name;
    m_text = new String();
    m_attributes = new LinkedList<MusicXmlAttribute>();
    m_children = new LinkedList<MusicXmlNode>();
  }

  public void setName(String name) {
    m_name = name;
  }
  public void addAttribute(String name, String value) {
    m_attributes.add(new MusicXmlAttribute(name, value));
  }
  public void clearAttributes() {
    m_attributes.clear();
  }
  public void setText(String text) {
    m_text = text;
  }
  public void addChild(MusicXmlNode node) {
    m_children.add(node);
  }
  public void clearChildren() {
    m_children.clear();
  }

  public String getName() {
    return m_name;
  }
  public LinkedList<MusicXmlAttribute> getAttributes() {
    return m_attributes;
  }
  public String getText() {
    return m_text;
  }
  public LinkedList<MusicXmlNode> getChildren() {
    return m_children;
  }

  public String getXmlString(int indentationLevel) {
    String nodeString = new String();
    
    for (int i = 0; i < indentationLevel; ++i)
      nodeString += "  ";
    nodeString += "<" + m_name;
    for (MusicXmlAttribute attribute : m_attributes) {
      nodeString += " " + attribute.getName();
      if (attribute.getValue().length() != 0)
        nodeString += "=\"" + attribute.getValue() + "\"";
    }
    nodeString += ">";
    
    if (m_text.length() > 0)
      nodeString += m_text;

    if (!m_children.isEmpty())
      nodeString += "\n";
    for (MusicXmlNode child : m_children)
      nodeString += child.getXmlString(indentationLevel + 1);

    if (m_text.length() == 0 && m_children.isEmpty())
      nodeString += "/>\n";
    else {
      if (m_text.length() == 0) {
        for (int i = 0; i < indentationLevel; ++i)
          nodeString += "  ";
      }
      nodeString += "</" + m_name + ">\n";
    }

    return nodeString;
  }
}
