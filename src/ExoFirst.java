import java.util.Date;



/*@author PastorGuillaume
 *@since Mardi 20 Février 2023
 *@params Exos Execption
 *@return Le programme suivant présente des problèmes, trouver lesquels et utiliser
tous les moyens permettant l’affichage des 2 instructions en utilisant notamment le
mécanisme d’exception (au passage, d’où sort la méthode getClass() ?)
 */


// Exo 1.1

public class ExoFirst {


	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		try {
			System.out.println(date.getClass().getName());
		}catch (java.lang.NullPointerException e){
			System.out.println(today.getClass().getName());	
		}finally {
			System.out.println();
		}

	}

}

