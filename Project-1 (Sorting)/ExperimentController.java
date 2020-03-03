
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController
{
    
    /**
     * Constructor for objects of class ExperimentController
     */
    public ExperimentController()
    {
        
    }
    
    public void almostSorted(){
        
        int numOfitems=20;
        
        int [] arr=new int[numOfitems];
        Random rand = new Random();

       for(int i=0; i<numOfitems; i=i+2){
           int max=i*10;
           int min=max-10;
            arr[i]=rand.nextInt((max - min) + 1) + min;
            arr[i+1]=rand.nextInt((max - min) + 1) + min;
       }
    }

    
}
