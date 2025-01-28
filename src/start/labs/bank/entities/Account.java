package src.start.labs.bank.entities;

public class Account {
        private Integer numberId;
        private String holder;
        private double balance;

        public Account(int number, String holder){
            this.numberId = number;
            this.holder = holder;
        }

        public Account(int number, String holder, double initialDeposit){
            this.numberId = number;
            this.holder = holder;
            deposit(initialDeposit);
        }

        public int getNumber(){
            return numberId;
        }

        public String getHolder(){
            return holder;
        }

        public void setHolder(String holder){
            this.holder = holder;
        }

        public double getBalance(){
            return balance;
        }

        public void deposit(double amount){
            balance += amount;
        }

        public void withdraw(double amount){
            balance -= amount + 5.0;
        }

        public String toString(){
            return " Account: "
                    + numberId
                    + " , Holder: " + holder
                    + " , Balance: $ " + String.format("%.2f", balance);
        }
}
