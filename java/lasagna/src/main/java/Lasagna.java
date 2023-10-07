public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    private int expectedOvenTime = 40;  //in min
    private int timeToPrepareEachLayer = 2; //in min
    public int expectedMinutesInOven()
    {
//        System.out.println(40);
        return expectedOvenTime;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesLagasnaInOven)
    {
        if( minutesLagasnaInOven >= expectedOvenTime )  return 0;
        else return (expectedOvenTime - minutesLagasnaInOven);
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int noOfLayers)
    {
        return (noOfLayers * timeToPrepareEachLayer);
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int noOfLayers, int minutesLagasnaInOven)
    {
        return (preparationTimeInMinutes(noOfLayers) + minutesLagasnaInOven);
    }
}
