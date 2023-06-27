class Money  {
    Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }

   protected int amount;
   protected String currency;
   
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && currency().equals(money.currency());
   }

    Money times(int multiplier) {
      return new Money(amount * multiplier, currency);
   }

    static Money dollar(int amount)  {
      return new Money(amount, "USD");
   }

    static Money franc(int amount) {
      return new Money(amount, "CHF");
    }

    String currency(){
        return currency;
    }  

}