package com.inventory.mgmt.model;

public class Order {

	private String item;
	private int quantity;
	private String cardNumber;

	private Order(OrderBuilder orderBuilder) {
		super();
		this.item = orderBuilder.item;
		this.quantity = orderBuilder.quantity;
		this.cardNumber = orderBuilder.cardNumber;
	}

	private Order() {
		super();
	}

	public String getItem() {
		return item;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public static class OrderBuilder {
		private String item;
		private int quantity;
		private String cardNumber;

		public OrderBuilder setItem(String item) {
			this.item = item;
			return this;
		}

		public OrderBuilder setQuantity(int quantity) {
			this.quantity = quantity;
			return this;
		}

		public OrderBuilder setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
			return this;
		}

		public Order build() {
			return new Order(this);
		}
	}

	@Override
	public String toString() {
		return "Order [item=" + item + ", quantity=" + quantity + ", cardNumber=" + cardNumber + "]";
	}

}
