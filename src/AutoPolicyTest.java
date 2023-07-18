public class AutoPolicyTest {
    public static void main(String[] args) throws Exception {
        AutoPolicy policy1 = new AutoPolicy(111, "Ford Fusion", "NY");

        policy1.policyInNoFaultState(policy1);

    }

}
