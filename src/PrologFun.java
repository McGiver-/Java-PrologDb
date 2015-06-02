import java.util.Hashtable;

import jpl.*;


public class PrologFun {
	public static void main(String args[]){

		Query q1 = new Query("consult(\'c:/users/george/workspace/prolog/Midterm.pl/')");
		System.out.println("consult " + (q1.hasSolution() ? "succeeded" : "failed"));
	/*    Variable X = new Variable();
	    Query q4 =
	        new Query(
	            "edge",
	            new Term[] {new Atom("a"),X}
	        );
	*/
		Query q2 =new Query("factorial(3,X)");
		System.out.println(q2.oneSolution().get("X"));
//		Variable X = new Variable();
//		Query q2 = new Query("factorial",new Term[] {new Atom("1234"),X } );
//		java.util.Hashtable solution;
//		solution = q2.getSolution();
//		System.out.println("factorial of 1234 is"+solution.get(X));
	}
}

