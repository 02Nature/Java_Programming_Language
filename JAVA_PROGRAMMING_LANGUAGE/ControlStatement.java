package JAVA_PROGRAMMING_LANGUAGE;

class ControlStatement
{
    public static void main(String[] args) 
    {
        int x = 6;
        //if statement
        /**********************************************
        if(x>10)
             System.out.println("x is greater that 10");
        System.out.println("End of the program");
         **********************************************/

         //if-else statement
         /**********************************************
        if(x<
         10)
            System.out.println("x is greater than 10");
        else
            System.out.println("x is less than 10");
        System.out.println("End of the program");
        ************************************************/

        //if-else ladder >>equivalent to switch
        /***********************************************
        if(x==1)
            System.out.println("Tuma Pesa");
        else if(x==2)
            System.out.println("Vocha na vifurushi");
        else if(x==3)
            System.out.println("Toa pesa");
        else if(x==4)
            System.out.println("Huduma za Kibenki");
        else if(x==5)
            System.out.println("Malipo na bili");
        else if(x==6)
            System.out.println("Account yangu");
        else
            System.out.println("Umeingiza chaguo sio sahihi");
        ******************************************************/
        
        //nested if statement
        /****************************************************
        int n1=2, n2=5, n3=4, greatest;
        if(n1>n2)
        {
            if(n1>n3)
                greatest = n1;
            else
                greatest = n3;
        }
        else
        {
            if(n2>n3)
                greatest = n2;
            else
                greatest = n3;
        }
        System.out.println(greatest);
        *************************************************/

        //while statement {>> int or string}
        /***********************************************
        while (x<30)
        {
            System.out.println(x);
            x+=2;
        }
        *************************************************/
        //Do-while loop
        /*************************************************
        int y=1, sum=0;
        do 
        {
           sum += y;
           y++;
        }
        while(y<30);
        System.out.println(sum);
        *************************************************/
        //for loop
        /************************************************
        String[] names = {"Baba", "Mama", "Kaka","Dada"};
        int i;
        for(i=0; i< names.length; i++)
            System.out.println(names[i]);
        
        //for-each
         int[] arr = {1,2,3,4,5,6,7,8};
        for(int i : arr)
        {
            if(i==5)
            continue;
            System.out.println(i);
            if(i==8)
            break;
        }
        *************************************************/
        /**************************************************
         * //for loop printing the matrix
        int[][] matrix = {{1,2},{3,4}};
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix.length; j++)
            System.out.print("\t"+matrix[i][j]+"");
            System.out.print("\n");
        }

        /**************************************************
        
        //case statement
        int y=4;
        String huduma_kwa_wateja ;
        switch(y)
        {
            case 1: huduma_kwa_wateja="Tuma Pesa"; break;
            case 2: huduma_kwa_wateja= "Vocha na vifurushi"; break;
            case 3: huduma_kwa_wateja = "Toa pesa"; break;
            case 4: huduma_kwa_wateja = "Huduma za kibenki"; break;
            case 5: huduma_kwa_wateja="Malipo na bili"; break;
            case 6: huduma_kwa_wateja = "Account yangu"; break;
            default: huduma_kwa_wateja="umeingiza chaguo sio sahihi"; break;
            
        }System.out.println(huduma_kwa_wateja);
        *********************************************************/
        
        
        

        
    }
}