
//Main Class
public class MainClass 
{

    //Nested static class
    static class CheckClean 
    {

        //defining variable.
        int smallestNumber; 
        int largestNumber; 
    }
    

    //Method to Find Smallest and Lastest no. from given Array.
    static CheckClean Upper_LowerBound(int givenArray[], int sizeOfArray)
    {
        CheckClean objectOfCheck = new CheckClean();
        
        //Iteration variable.
        int i;
        
        if (sizeOfArray == 1)
        {
            objectOfCheck.largestNumber = givenArray[0];
            objectOfCheck.smallestNumber = givenArray[0];
            return objectOfCheck;
        }
        
        if (givenArray[0] > givenArray[1]) 
        {
            objectOfCheck.largestNumber = givenArray[0];
            objectOfCheck.smallestNumber = givenArray[1];
        } 
        else 
        {
            objectOfCheck.largestNumber = givenArray[1];
            objectOfCheck.smallestNumber = givenArray[0];
        }
        
        for (i = 2; i < sizeOfArray; i++) 
        {
            if (givenArray[i] > objectOfCheck.largestNumber) 
            {
                objectOfCheck.largestNumber = givenArray[i];
            }
            else if (givenArray[i] < objectOfCheck.smallestNumber)
            {
                objectOfCheck.smallestNumber = givenArray[i];
            }
        }
    
        return objectOfCheck;
    }
    

    //Main method
    public static void main(String args[])
    {

        //Initializing an array and assigning values
        int givenArray[] = {1000, 11, 445, 1, 330, 3000};
        int sizeOfArray = 6;

        CheckClean objectOfCheck = Upper_LowerBound(givenArray, sizeOfArray);

        System.out.printf("\n Smallest Number : %d", objectOfCheck.smallestNumber);
        System.out.printf("\n Largest Number : %d", objectOfCheck.largestNumber);
    }
}