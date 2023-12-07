package by.it.yaroshenko.testing;


    class ThisParametor {
        int a;
        int b;

        // Default constructor
        ThisParametor()
        {
            a = 10;
            b = 20;
        }

        // Method that receives 'this' keyword as parameter
        void display(ThisParametor obje)
        {
            System.out.println("a = " + obje.a
                    + "  b = " + obje.b);
        }

        // Method that returns current class instance
        void get() { display(this); }

        // main function
        public static void main(String[] args)
        {
            ThisParametor object = new ThisParametor();
            object.get();
        }
    }

