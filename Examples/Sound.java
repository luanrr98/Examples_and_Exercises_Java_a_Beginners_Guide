/*
    try this 2-1
    Compute the distance to a lightning
    strike whose sound takes 7.2 seconds
    to reach you.
*/

class Sound{
    public static void main(String[] args){
        double seconds = 7.2;
        double feets = 1100;

        double distance = seconds*feets;

        System.out.println("You are " + distance+ "feets away from the lightning.");

    }


}
