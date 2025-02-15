package Programs.Strings;

public class BinarySearchStrings {

    public static void main(String[] args) {
        // TODO: Implement the solution for BinarySearchStrings
        System.out.println("This is the BinarySearchStrings class.");

        String[] words = {"zebra", "apple", "Monkey", "banana", "Cherry", "grape", "Orange", "peach", "dog", "elephant"};

        String target = "zeb";

        int left = 0 ;
        int right = words.length-1;

        while(left <=  right)
        {
            int mid = (left + (right - left))/2;
            int com = words[mid].compareTo(target);

            if(com == 0)
            {
                System.out.println(mid);
                break;
            }
            else if(com < 0)
            {
                right = mid -1;
            }
            else {
                left = mid +1;
            }

            }
    }
}
