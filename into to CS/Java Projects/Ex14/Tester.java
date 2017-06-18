

public class Tester


{


    public static void main(String[] args){


        System.out.println("Question one");


        System.out.println("~~~~~~~~~~~~~\n");


        int[] a = {0, 2, 3, 1, 0};


 


        System.out.println("Giving array: {0, 2, 3, 1, 0} -- Answer should be 5. Answer: "


            + Ex14.what(a));


        a = new int[] {3, 2, 3, 3};


 


        System.out.println("Giving array: {3, 2, 3, 3} -- Answer should be 2. Answer: "


            + Ex14.what(a));


        a = new int[] {1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};


 


        System.out.println("Giving array: {1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1} "


            + "-- Answer should be 15. Answer: " + Ex14.what(a));


        a = new int[] {3, 2, 1, 1, 2, 1, 2, 1, 3, 3, 3, 3, 1, 2, 1};


        


        System.out.println("Giving array: {3, 2, 1, 1, 2, 1, 2, 1, 3, 3, 3, 3, 1, 2, 1} "


            + "-- Answer should be 13. Answer: " + Ex14.what(a));


        a = new int[] {1, 2, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3};


        


        System.out.println("Giving array: {1, 2, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3} "


            + "-- Answer should be 7. Answer: " + Ex14.what(a));


        


        System.out.println("\nQuestion two");


        System.out.println("~~~~~~~~~~~~~\n");


        a = new int[] {1, 1, 1, 1, 0, 1, 1, 1};


        Ex14.zeroDistance(a);


        


        System.out.print("Giving array: \t{1, 1, 1, 1, 0, 1, 1, 1}\n" 


            + "Should give this: {4, 3, 2, 1, 0, 1, 2, 3}\n"


            + "Giving this: \t{");


        for(int i=0; i<a.length; i++)


            System.out.print(a[i] + ", ");


        System.out.print("}\n\n");


        


        a = new int[] {1, 0, 1, 0};


        Ex14.zeroDistance(a);


        


        System.out.print("Giving array: \t{1, 0, 1, 0}\n" 


            + "Should give this: {1, 0, 1, 0}\n"


            + "Giving this: \t{");


        for(int i=0; i<a.length; i++)


            System.out.print(a[i] + ", ");


        System.out.print("}\n\n");


        


        a = new int[] {1, 1, 1, 1, 1, 1, 1, 0};


        Ex14.zeroDistance(a);


        


        System.out.print("Giving array: \t{1, 1, 1, 1, 1, 1, 1, 0}\n" 


            + "Should give this: {7, 6, 5, 4, 3, 2, 1, 0}\n"


            + "Giving this: \t{");


        for(int i=0; i<a.length; i++)


            System.out.print(a[i] + ", ");


        System.out.print("}\n\n");


            


        System.out.println("\nQuestion three");


        System.out.println("~~~~~~~~~~~~~\n");


        


        System.out.println("Calling spiderman(1). Should give: 1, Giving: " + Ex14.spiderman(1));


        System.out.println("Calling spiderman(0). Should give: 1, Giving: " + Ex14.spiderman(0));


        System.out.println("Calling spiderman(20). Should give: 10946, Giving: " + Ex14.spiderman(20));


        System.out.println("Calling spiderman(26). Should give: 196418, Giving: " + Ex14.spiderman(26));


        


        System.out.println("\nCalling spidermanPhoneBooth20(20). Should give: 10946, Giving: " + Ex14.spidermanPhoneBooth20(20));


        System.out.println("Calling spidermanPhoneBooth20(26). Should give: 65066, Giving: " + Ex14.spidermanPhoneBooth20(26));


        System.out.println("Calling spidermanPhoneBooth20(29). Should give: 240956, Giving: " + Ex14.spidermanPhoneBooth20(29));


        System.out.println("Calling spidermanPhoneBooth20(3). Should give: 3, Giving: " + Ex14.spidermanPhoneBooth20(3));


        


        System.out.println("\nQuestion four");


        System.out.println("~~~~~~~~~~~~~\n");


        


        int n = 4; //Change here if needed


        int[][] b = new int[n][n];


        


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                b[i][j] = 1;


            }


        }


        


        System.out.println("Array:");


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                System.out.print(b[i][j] + ", ");


            }


            System.out.println();


        }


        


        System.out.println("\nCalling numPaths(*array*, 0, 3, " + (n-1) + ", " + (n-1) + ")");


        System.out.print("Should give: 6, Giving: ");

        Ex14 Obj = new Ex14(); 
        System.out.println(Obj.numPaths(b, 0, 3, n-1, n-1)); //Change here if needed


        


        System.out.println("\nArray after calculation:");


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                System.out.print(b[i][j] + ", ");


            }


            System.out.println();


        }


        


        System.out.println("\n");


        


        //--------------------------------------------------------------------------------------


        


        n = 3;


        b = new int[n][n];


        


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                b[i][j] = 1;


            }


        }


        


        System.out.println("Array:");


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                System.out.print(b[i][j] + ", ");


            }


            System.out.println();


        }


        


        System.out.println("\nCalling numPaths(*array*, 1, 1, " + (n-1) + ", " + (n-1) + ")");


        System.out.print("Should give: 2, Giving: ");


        System.out.println(Obj.numPaths(b, 1, 1, n-1, n-1)); //Change here if needed


        


        System.out.println("\nArray after calculation:");


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                System.out.print(b[i][j] + ", ");


            }


            System.out.println();


        }


        


        System.out.println("\n");


        


        //--------------------------------------------------------------------------------------


        


        n = 7;


        b = new int[n][n];


        


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                b[i][j] = 1;


            }


        }


        


        System.out.println("Array:");


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                System.out.print(b[i][j] + ", ");


            }


            System.out.println();


        }


        


        System.out.println("\nCalling numPaths(*array*, 0, 0, " + (n-1) + ", " + (n-1) + ")");


        System.out.print("Should give: 5680, Giving: ");


        System.out.println(Obj.numPaths(b, 0, 0, n-1, n-1)); //Change here if needed


        


        System.out.println("\nArray after calculation:");


        for(int i = 0; i < n; i++){


            for(int j = 0; j < n; j++){


                System.out.print(b[i][j] + ", ");


            }


            System.out.println();


        }


        


        System.out.println("\n");


    }


}


//@Itamar Holder;

