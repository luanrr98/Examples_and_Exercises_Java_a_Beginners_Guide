// Side effects can be important.
class SideEffects{
	public static void main(String[] args){
		int i;
		i = 0;
		/* Here, i is still incremented even though
		 * the is statement fails. */
		if(false & (++i < 100)){
			System.out.println("this won't be displayed");
		}
		System.out.println("if statement not executed: "+i); //displays 1);
		/* In this case, i is not incremented because
		 * the short-circuit operator skips the increment */
		if(false && (++i < 100)){
			System.out.println("this won't be displayed");
		}
		System.out.println("if statement not executed: "+i); //stills 1);
	
	}


}
