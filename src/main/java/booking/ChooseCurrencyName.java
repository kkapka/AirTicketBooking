package booking;

public class ChooseCurrencyName {
	public String get(int i) {
		if(i==0){
			return new ToPLN().getName();
		}
		else if(i==1){
			return new ToUSD().getName();
		}
		else if(i==2){
			return new ToGBP().getName();
		}
		else if(i==3){
			return new ToEUR().getName();
		}
		else{
			return null;
		}
	}
}
