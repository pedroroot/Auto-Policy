public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDemakeAndModel() {
        return makeAndModel;
    }

    public void setDemakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;

        switch (getState()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;

            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }

    public void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("Theu Auto Policy ");
        System.out.printf("Account #: %d; Car : %s  State : %s %s a no-fault state %n%n", policy.getAccountNumber(),
                policy.getDemakeAndModel(), policy.getState(), policy.isNoFaultState() ? "is" : "is not");
    }

}
