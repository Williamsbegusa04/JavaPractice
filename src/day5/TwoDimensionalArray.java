package day5;

public class TwoDimensionalArray {
    public static void main(String[] args)
    {
        //Declaration of array
        //approach 1

        int a [][] = new int [3][2];
        //adding values to array
        a[0][0] = 100;
        a[0][1] = 300;
        a[1][0] = 500;
        a[1][1] = 900;
        a[2][0] = 700;
        a[2][1] = 800;
        //apprach 2
        int b[][] = {{100,200},{300,400},{500,600}};

        //find size of an array
        System.out.println("length of rows "+a.length);  //number of rows
        System.out.println("length of columns "+a[0].length); //number of columns

        //read single value from an array
        System.out.println(b[2][1]);    //600

        //read all the value from a 2-dimensional array
        //normal for loop
        System.out.println("using normal for loop ");
        for(int r = 0;r<a.length;r++)
        {
            for(int c =0;c<a[r].length;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
        //Using Enhanced for loop for each loop
        System.out.println("using enhanced for loop ");
        for(int arr[] : b)
        {
            for(int y: arr)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }


    }
}
