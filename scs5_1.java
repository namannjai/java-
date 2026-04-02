public class scs5_1{
    public static void  main(String []args){
        // Variables are Declared here ;
        String accountNumber ="1001";
        int salary = 80000;
        int accountBalance = 250000;
        String loanType = "business";
        int loanAmountExpected = 700000;
        int emisExpected = 80 ;
        int   eligibleLoanAmount ;
        int eligibleEmis ;

        // Code starts here
        if(accountNumber.length() ==4 && 
            accountNumber.charAt(0)=='1'){

                if(accountBalance>1000){ 

                    if(loanType.equalsIgnoreCase("car")){
                        if(salary>25000){
                            if(loanAmountExpected<=500000 && emisExpected<=36){
                                    eligibleLoanAmount =500000;
                                    eligibleEmis = 36;
                                    System.out.println("eligible loan amount : "+eligibleLoanAmount + "\neligible emis : "+eligibleEmis);
                            }else{System.out.println("Loan not eligible");}
                        }
                    }else if(loanType.equalsIgnoreCase("house")){
                     if(salary>50000){
                            if(loanAmountExpected<=600000 && emisExpected<=60){
                                    eligibleLoanAmount =600000;
                                    eligibleEmis = 60;
                                    System.out.println("eligible loan amount : "+eligibleLoanAmount + "\neligible emis : "+eligibleEmis);
                            }else{System.out.println("Loan not eligible");}
                        }    
                    }else if (loanType.equalsIgnoreCase("business")){
                    if(salary>75000){
                            if(loanAmountExpected<=750000 && emisExpected<=84){
                                    eligibleLoanAmount =750000;
                                    eligibleEmis = 84;
                                    System.out.println("eligible loan amount : "+eligibleLoanAmount + "\neligible emis : "+eligibleEmis);
                            }else{System.out.println("Loan not eligible");}
                        }    
                    }

                
                }else{System.out.println("User is not eligible for loan");}
            }else{System.out.println("Invalid Account Number 'account number should be 4 digits and start with 1'");}

    }
}