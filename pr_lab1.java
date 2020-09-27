import java.lang.Math;
import static java.lang.Double.POSITIVE_INFINITY;

public class pr_lab1 {
  
  public static void main(String[ ] args)
{

     short[] d = new short[12];
     for (int i = 5; i < 17; i++)
     {
         d[i-5] =(short) i;
     }
     float[] x = new float[17];
     for (int i = 0; i < 17; i++)
     {
         x[i] =(float) Math.random() * 29 - 14;
     }
     float[][] dd = new float[12][17];
     for (int i = 0; i < 12; i++)
     {
         if (d[i] == 11)
         {
               for (int j = 0; j < 17; j++)
               {
                      dd[i][j] = (float) Math.asin( Math.cos( Math.cos( Math.pow( x[j], 0.25*(x[j] + 1) ) ) ) );
                      
                      
               }
         }
         else if (d[i] == 5 || d[i] == 7 || d[i] == 10 || d[i] == 13 || d[i] == 15 || d[i] == 16)
         {
               for (int j = 0; j < 17; j++)
               {
                      dd[i][j] = (float) Math.pow( Math.E, Math.pow( Math.atan( (x[j] + 0.5)/29 ), 1.0/3.0 ) );
                      
               }
         }
         else 
         {
               for (int j = 0; j < 17; j++)
               {
                      dd[i][j] = (float) Math.pow( Math.E, Math.pow(Math.pow( (Math.atan( (x[j] + 0.5)/29 ) + 1)/Math.pow(x[j]/2, 3) , 2), Math.pow( (1 - Math.asin( (x[j] + 0.5)/29 )/Math.sin( x[j] ) ), 2 )/Math.PI) );
                      
//1 Math.pow( (Math.atan( (x[j] + 0.5)/29 ) + 1)/Math.pow(x[j]/2, 3) , 2)
//2 Math.pow( (1 - Math.asin( (x[j] + 0,5)/29 )/sin( x[j] ), 2 )/Math.PI
//3 Math.pow( Math.E, Math.pow(Math.pow( (Math.atan( (x[j] + 0.5)/29 ) + 1)/Math.pow(x[j]/2, 3) , 2), Math.pow( (1 - Math.asin( (x[j] + 0.5)/29 )/sin( x[j] ), 2 )/Math.PI) )
               }
         }
    }

    for (int i = 0; i < 17; i++)
    {
         for (int j = 0; j < 12; j++)
         {
            if(dd[j][i]>99999999.99){
            System.out.printf("%8s", "Infinity");
            }
            else{
            System.out.printf("%8.2f", dd[j][i]);
            }
            System.out.printf("  ");
         }
         System.out.printf(System.lineSeparator());
    }

}
}
