package conditional.Statements;

public class example1_1 {
public String checkLoanApproval(double salary,int creditScore) {
if((salary>80000) &&  (creditScore>750)) {
	return "Loan Approved Immediately";
}else if((salary>=50000 && salary<=80000)&& (creditScore>=650 && creditScore<=750)) {
	return "Loan Approved with Higher Interest Rate";
}else if((salary>=30000 && salary<50000)&& (creditScore>=500 && creditScore<650)) {
	return "Co-signer Required";
}else {
	return "Loan Rejected" ;
}

}
	public static void main(String[] args) {
		example1_1 obj = new example1_1();
		System.out.println(obj.checkLoanApproval(90000, 950));
		System.out.println(obj.checkLoanApproval(70000, 750));
		System.out.println(obj.checkLoanApproval(40000, 500));
		System.out.println(obj.checkLoanApproval(10000, 350));
	}

}
