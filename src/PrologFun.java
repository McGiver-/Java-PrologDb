import java.util.Hashtable;

import jpl.*;
import jpl.Integer;


public class PrologFun {
	public static void main(String args[]){

		Query q1 = new Query("consult(\'c:/users/george/workspace/prolog/Midterm.pl/')");
		System.out.println("consult " + (q1.hasSolution() ? "succeeded" : "failed"));
		
		BetterQuery.ask("gcd(9,3,G)","G");
		
		BetterQuery.ask("factorial(9,Q)","Q");
		
		BetterQuery.ask("rev([1,2,3,4],F)","F");
		
		BetterQuery.ask("assert(man(mario))");
		
		BetterQuery.ask("man(mario)");
	}
	public static class BetterQuery extends Query{

		public BetterQuery(String arg0) {
			super(arg0);
		}
		public static void ask(String toAsk, String... args){
			Query q4 = new Query(toAsk);
			Term listTerm1;
			for(int i = 0;i<args.length;i++){
				listTerm1= (Term)q4.oneSolution().get(args[i]);
				System.out.println();
				try{
					for (Term term1 : listTerm1.toTermArray()) {
						System.out.print(term1+" ");
					}	
					System.out.println();
				}catch(JPLException p) {
					System.out.println(listTerm1.toString());
				}
			}	
		}
		public static void ask(String toAsk){
			System.out.println(Query.hasSolution(toAsk));
		}
	}
}

