package JAVA_PROGRAMMING_LANGUAGE;

class ControlStatement
{
    public static void main(String[] args) 
    {
        int x = 10;
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
        do 
        {
            System.out.println(x);
            x+=2;
        }
        while(x<30);
        *************************************************/
        //for loop
        /************************************************
        for(x=10; x<30; x+=2)
        {
            System.out.println(x);
        }
        *************************************************/

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
        

        
    }
}