package com.money;

public abstract class Money {
	protected int amount;

	public static Money dollar(int amount) {
		return new Dollar(amount);
	}

	public static Money Franc(int amount) {
		return new Franc(amount);
	}

	public abstract Money times(int multiplier);

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

}