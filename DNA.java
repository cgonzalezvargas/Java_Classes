//Program that sequences a strand of DNA and determines if there's a protein
public class DNA 
{
  /*
  Variables added here are considered static
  */
  public static void main(String[] args)
  {
    DNA _dna = new DNA();
     String dna = "";
  String dna1 = "ATGCGATACGCTTGA";
  String dna2 = "ATGCGATACGTGA";
  String dna3 = "ATTAATATGTACTGA";
    _dna.scanDNA(dna1);
  }
public void scanDNA(String dna)
{
  System.out.println(dna.indexOf("ATG"));
  System.out.println(dna.indexOf("TGA"));
  System.out.println(dna.length()/3);
  if(dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1 && dna.length() % 3 == 0)
  {
    Integer start = dna.indexOf("ATG") + 1;
    Integer end = dna.indexOf("TGA");
    String protein = dna.substring(start, end);
    System.out.println(protein);
  }
  else{System.out.println("No protein bro");}
}
}