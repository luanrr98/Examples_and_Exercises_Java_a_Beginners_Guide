/*
    This program attempts to declare a variabel
    in an inner scope with the same name as one
    defined in an outer scope

    ***THIS PROGRAM WILL NOT COMPILE***
*/
class NestVar{
    public static void main(String[] args){
        int count;

        for(count = 0; count < 10; count++){
        System.out.println("This is count: "+ count);

        int count; //Illegal!!
        for(count = 0; count < 2; count++){
            System.out.println("This program is in error!");

            }

        }

    }

}
