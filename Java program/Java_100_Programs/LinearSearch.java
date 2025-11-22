package Java_100_Programs;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = { 1, 4, 6, 8, 12, 3 };
        int search_element = 8;
        
        boolean flag=false;
        for (int i = 0; i < a.length; i++) {
            if (search_element == a[i]) {
                System.out.println("The Search element Found at: " + i);
                flag=true;
                break;
            } 
        }

        if(!flag){
            System.out.println("The Element is Not Found");
        }
    }

}
