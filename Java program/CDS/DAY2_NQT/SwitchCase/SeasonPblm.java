package CDS.DAY2_NQT.SwitchCase;

public class SeasonPblm {
    public static void main(String[] args) {
        String month="Dec";
        switch (month) {
            case "Dec":
            case "Jan":
            case "Feb":
                System.out.println("Climate: Winter Season");
                break;

            case "March":
            case "April":
            case "May":
                System.out.println("Climate: Summer Season");
                break;

            case "June":
            case "July":
            case "Aug":
            case "Oct":
                System.out.println("Climate: Monsoon Season");
                break;

            default:
                System.out.println("Invalid month! Please enter a number between 1 and 12.");
        }
    }
   

}

// output

// Climate: Summer Season