public class currentCommittee extends IConCommittee {
    private int committee_Meet;
    private int duty_Amount;

    public currentCommittee(String committee_ID, String committee_Name,
                            String committee_Category, String commission_Date,
                            int committee_Meet, int duty_Amount) {

        super(committee_ID, committee_Name, committee_Category, commission_Date);
        this.committee_Meet = committee_Meet;
        this.duty_Amount = duty_Amount;
    }

    @Override
    public void displayWorkSummary() {
        System.out.println("----- Current Committee Summary -----");
        System.out.println("Meetings Completed: " + committee_Meet);
        System.out.println("Duty Amount Completed: " + duty_Amount);
    }
}


