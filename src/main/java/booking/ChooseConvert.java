package booking;

//strategy design pattern

public class ChooseConvert {
	CashConvert choose(int pref){
		if(pref==0){
			return new ToPLN();
		}
		else if(pref==1){
			return new ToUSD();
		}
		else if(pref==2){
			return new ToGBP();
		}
		else if(pref==3){
			return new ToEUR();
		}
		else{
			return null;
		}
	}
}