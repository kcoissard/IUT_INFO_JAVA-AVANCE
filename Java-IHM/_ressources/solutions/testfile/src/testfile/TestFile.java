
/** TestFile.java pour r�cup�rer des infos syst�me sur un fichier
 * � partir du SGF.
 *
 * On utilise la classe File du package java.io
 *
 * AUTEUR : M.RAMBURRUN
 */

package testfile;

import java.io.*;
import java.util.*;

public class TestFile
{
 public static void main( String args[] ) throws IOException
 {
  Scanner s = new Scanner( System.in );
  String nomfich;
  boolean ok;
  File fich1; // d�finition d'une r�f�rence
  
  do
  {
   do
   {
    ok = true;
    System.out.print( "Entrer le nom d'un objet du SGF : " );
    nomfich = s.nextLine();
    fich1 = new File( nomfich) ;
    if ( ! fich1.exists() )
    {
		ok = false;
		System.out.println( "L'objet \"" + nomfich + "\" n'existe pas!!!" );
    }
   }while ( nomfich.length() == 0 || !ok );

   System.out.println( "\nL'objet \"" + fich1.getName() + "\"" +
(fich1.isFile()?" est bien enregistr� comme type \"fichier\"(dans SGF)\n":
    " est un r�pertoire ou un canal nomm�\n") );

   System.out.println( "TAILLE : " + fich1.length() + " octets\n" );

   System.out.println( "CHEMIN RELATIF : " + fich1.getPath() + "\n" );

   System.out.println( "CHEMIN ABSOLUE : " + fich1.getAbsolutePath()+"\n" );

   System.out.println( fich1.canRead() ?
     "La lecture est autoris�e\n":
     "La lecture n'est pas autoris�e\n" );

   System.out.println( fich1.canWrite() ? "L'�criture est autoris�e\n" :
     "L'�criture n'est pas autoris�e\n" );

   System.out.println( fich1.isDirectory() ? "L'objet est un r�pertoire\n":
     "L'objet n'est pas un r�pertoire\n" );

   System.out.print( "Recommencer (o/n) ? " );


  }while ( ! s.nextLine().equalsIgnoreCase( "n" ) );

 }// fin main

}// fin TestFile
