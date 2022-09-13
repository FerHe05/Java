public class BusinessAccount extends Account{/*Define que a classe BusinessAccount vai 
    ter todos os dados de comportamento da minha classe Account */
    
    private Double loanLimit;

    public BusinessAccount(){
        super();/*Executar a lógica do contrutor da classe base ou super base */
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);/*nãp é necessário repetir os argumentos */
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount);
        }
    }
}
