public class PastCommittee extends IConCommittee {
    private int advisory_Meet;
    private boolean stay_Back;

    public PastCommittee(String committee_ID, String committee_Name,
            String committee_Category, String commission_Date,
            int advisory_Meet, boolean stay_Back) {

        super(committee_ID, committee_Name, committee_Category, commission_Date);
        this.advisory_Meet = advisory_Meet;
        this.stay_Back = stay_Back;
    }

    @Override
    public void displayWorkSummary() {
        System.out.println("----- Past Committee Summary -----");
        System.out.println("Advisory Meetings: " + advisory_Meet);
        System.out.println("Willing to Stay Back as Advisor: " + stay_Back);
    }
}
