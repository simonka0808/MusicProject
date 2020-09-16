package app.model;

import app.util.enums.BankNames;
import app.util.enums.CardType;

public class BankAcc {

	private String numberBank;
	private String nameBank;
	private double moneyIn;
	private String cardType;
	

	public BankAcc(String numberBank, String nameBank, double moneyIn, String cardType) {
		this.numberBank = numberBank;
		this.setNameBank(nameBank);
		this.moneyIn = moneyIn;
		this.setCardType(cardType);
	}

	private String getNumberBank() {
		return numberBank;
	}

	private void setNumberBank(String numberBank) {
		this.numberBank = numberBank;
	}

	public String getNameBank() {
		return nameBank;
	}

	public void setNameBank(String nameBank) {
		for (BankNames bn : BankNames.values()) {
			if (nameBank.equalsIgnoreCase(bn.name())) {
				this.nameBank = bn.name();
				break;
			}

		}
		if (nameBank == null) {
			this.nameBank = nameBank;
		}
	}

	public double getMoneyIn() {
		return moneyIn;
	}

	public void setMoneyIn(double moneyIn) {
		this.moneyIn = moneyIn;
	}

	public String getCardType() {
		return cardType;
	}

	private void setCardType(String cardType) {
		for (CardType ctype : CardType.values()) {
			if (cardType.equalsIgnoreCase(ctype.name())) {
				this.cardType = ctype.name();
				break;
			}
			if (this.cardType == null) {
				this.cardType = cardType;
			}
		}
	}

}
