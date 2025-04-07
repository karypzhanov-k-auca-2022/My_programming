package practice;


public class practice {
    private boolean collarStatus = false;
    public boolean isCollarStatus() {
        return collarStatus;
    }
    public void setCollarStatus(boolean status) {
        collarStatus = status;
    }

      public static void adopt(practice practice) {
        System.out.println("Old value of \"collarStatus\" in \"adopt\" method is:" + practice.isCollarStatus());
        practice.setCollarStatus(true);
        System.out.println("New value of \"collarStatus\" in \"adopt\" method is:" + practice.isCollarStatus());
    }
    public static void main(String[] args) {
        practice kitty = new practice();
        System.out.println("Old value of \"collarStatus\" in \"main\" method is:" + kitty.isCollarStatus());
        adopt(kitty);
        System.out.println("New value of \"collarStatus\" in \"main\" method is:" + kitty.isCollarStatus());
    }
}
