//Mockito
public class PrincipalService implements  CalculatorService{
	private DataService dataService;
	 
    @Override
    public double calculateAverage() {
        int[] numbers = dataService.getListOfNumbers();
        double avg = 0;
        for (int i : numbers) {
            avg += i;
        }
        return (numbers.length > 0) ? avg / numbers.length : 0;
    }
 
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
}
