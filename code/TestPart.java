public class TestPart {
  public static void main(String args[]) {
    Part part = new Part();
    int partNo = 1;
    part.setId("P" + partNo);
    part.setTransposeDiatonic(-1);
    part.setTransposeChromatic(-2);
    
    System.out.print(part.getMusicXmlNode().getXmlString(0));
  }
}
