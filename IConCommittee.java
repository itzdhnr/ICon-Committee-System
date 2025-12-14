public abstract class IConCommittee {
    protected String committee_ID;
    protected String committee_Name;
    protected String committee_Category;
    protected String commission_Date;

    public IConCommittee(String committee_ID, String committee_Name,
            String committee_Category, String commission_Date) {

        this.committee_ID = committee_ID;
        this.committee_Name = committee_Name;
        this.committee_Category = committee_Category;
        this.commission_Date = commission_Date;
    }

    public abstract void displayWorkSummary();

    public void displayBasicInfo() {
        System.out.println("Committee ID: " + committee_ID);
        System.out.println("Name: " + committee_Name);
        System.out.println("Category: " + committee_Category);
        System.out.println("Commission Date: " + commission_Date);
    }

    // Complete display method that shows all committee information
    public void display() {
        displayBasicInfo();
        displayWorkSummary();
    }

    // Getter methods
    public String getCommitteeID() {
        return committee_ID;
    }

    public String getCommitteeName() {
        return committee_Name;
    }

    public String getCommitteeCategory() {
        return committee_Category;
    }

    public String getCommissionDate() {
        return commission_Date;
    }
}
