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


public enum Pitch {
  C0, C0S, D0, D0S, E0, F0, F0S, G0, G0S, A0, A0S, B0,
  C1, C1S, D1, D1S, E1, F1, F1S, G1, G1S, A1, A1S, B1,
  C2, C2S, D2, D2S, E2, F2, F2S, G2, G2S, A2, A2S, B2,
  C3, C3S, D3, D3S, E3, F3, F3S, G3, G3S, A3, A3S, B3,
  C4, C4S, D4, D4S, E4, F4, F4S, G4, G4S, A4, A4S, B4,
  C5, C5S, D5, D5S, E5, F5, F5S, G5, G5S, A5, A5S, B5,
  C6, C6S, D6, D6S, E6, F6, F6S, G6, G6S, A6, A6S, B6,
  C7, C7S, D7, D7S, E7, F7, F7S, G7, G7S, A7, A7S, B7,
  C8, C8S, D8, D8S, E8, F8, F8S, G8, G8S, A8, A8S, B8
}


public class Note {
  private Pitch  m_pitch;
  private int    m_duration;
  private String m_type;

  private MusicXmlNode m_musicXmlNode;
  
  public Note() {
    m_pitch = new Pitch();
    m_duration = 0;
    m_type = new String();

    m_musicXmlNode = new MusicXmlNode();
  }

  public MusicXmlNode getMusicXmlNode() {
    buildMusicXmlNode();

    return m_musicXmlNode;
  }

  private void buildMusicXmlNode() {
  }
}

