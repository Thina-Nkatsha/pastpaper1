public abstract class Staff implements iStaff
{
    protected int staffNumber;
    protected String staffLocation;

    public Staff(int staffNumber, String staffLocation)
    {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    public int getStaffNumber()
    {
        return staffNumber;
    }

    public String getStaffLocation()
    {
        return staffLocation;
    }

    public String getStaffHiringProcess()
    {
        if (staffNumber < 20)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
    }
}
