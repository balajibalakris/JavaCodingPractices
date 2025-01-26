import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaClassCreator {

    public static void main(String[] args) {
        // Grouping class names by topic
        String[][] topics = {
                // Arrays (10 Questions)
                {"Arrays", "TwoSum", "MissingNumber", "SortArray", "KthLargest", "IntersectionArrays", "MergeSortedArrays", "SortColors", "PeakElement",
                        "MaxProductThree", "SearchInsert"},

                // Strings (10 Questions)
                {"Strings", "ReverseWords", "LongestPrefix", "CheckAnagram", "SortStringsByLength", "FindAnagrams", "FirstUniqueChar", "BinarySearchStrings",
                        "StringCompression", "SortByFrequency", "MinWindowSubstring"},

                // Two Pointers (10 Questions)
                {"TwoPointers", "PairWithTargetSum", "ThreeSum", "MaxWaterContainer", "SortWithTwoPointers", "KClosestElements", "LongestKDistinct",
                        "BinarySearchPair", "RemoveDuplicates", "MinInRotatedArray", "SearchInRotatedArray"},

                // Sorting & Searching Combined (10 Questions)
                {"SortingSearching", "MedianTwoSortedArrays", "MissingRepeatingNumber", "SortByFrequency", "SearchInRotatedArray", "KthLargestUnsorted",
                        "BinarySearchMatrix", "AllocateMinPages", "SmallestRange", "SortByCharFrequency", "SearchInsertPosition"},

                // Java Collections (10 Questions)
                {"JavaCollections", "GroupAnagrams", "FrequencyCount", "SortMapByValues", "TopKFrequent", "IntersectionArrays", "LongestConsecutiveSequence",
                        "SortListOfMaps", "RemoveDuplicatesList", "CustomSortComparator", "MergeKSortedLists"},

                // Sliding Window (10 Questions)
                {"SlidingWindow", "MaxSumSubarrayK", "LongestUniqueSubstring", "SlidingWindowMax", "SortSlidingWindow", "FindAnagramsSliding",
                        "SmallestSubarrayGreaterSum", "SlidingWindowMedian", "MaxVowelsInSubstring", "LongestOnesAfterReplacement", "KthLargestSliding"},

                // Streams and Lambdas (10 Questions)
                {"StreamsLambdas", "FilterEvenNumbers", "MaxInList", "GroupByKey", "SortWithStreams", "ConvertListToMap", "CountFrequency", "FirstUniqueCharStream",
                        "TopNElements", "FindPalindromes", "CheckAllMatch"},

                // Matrix (10 Questions)
                {"Matrix", "SearchInSortedMatrix", "RotateMatrix", "SpiralMatrix", "TransposeMatrix", "SetMatrixZeroes", "RowWithMaxOnes", "SortMatrixDiagonally",
                        "WordSearch", "MatrixMultiplication", "KthSmallestMatrix"},

                // Greedy (10 Questions)
                {"Greedy", "ActivitySelection", "MinCoins", "FractionalKnapsack", "JobSequencing", "GasStationProblem", "CandyDistribution",
                        "MaxSumAfterKNegations", "MinPlatforms", "LargestNumber", "AssignCookies"},

                // Miscellaneous (10 Questions)
                {"Miscellaneous", "LRUCache", "DesignHashMap", "WordLadder", "SnakeAndLadder", "FlattenNestedList", "FindCelebrity", "LargestRectangleHistogram",
                        "EvaluateRPN", "CountSubarraysSumK", "ValidSudoku"}
        };

        // Directory to save the generated Java classes
        String baseDirectoryPath = "./generatedClasses/";

        // Create the base directory if it doesn't exist
        File baseDirectory = new File(baseDirectoryPath);
        if (!baseDirectory.exists()) {
            baseDirectory.mkdir();
        }

        // Loop through each topic and its associated class names
        for (String[] topic : topics) {
            String topicName = topic[0]; // Topic name
            String[] classNames = new String[topic.length - 1]; // Class names (excluding the topic name)
            System.arraycopy(topic, 1, classNames, 0, topic.length - 1);

            // Create the folder for the topic
            File topicDirectory = new File(baseDirectoryPath + topicName);
            if (!topicDirectory.exists()) {
                topicDirectory.mkdir();
            }

            // Create Java classes inside the topic folder
            for (String className : classNames) {
                createJavaClass(topicDirectory.getPath(), className);
            }
        }

        System.out.println("Java classes created successfully.");
    }

    // Method to create a Java class file
    public static void createJavaClass(String directoryPath, String className) {
        String classContent = "public class " + className + " {\n\n"
                + "    public static void main(String[] args) {\n"
                + "        // TODO: Implement the solution for " + className + "\n"
                + "        System.out.println(\"This is the " + className + " class.\");\n"
                + "    }\n"
                + "}\n";

        // Define the file path
        File file = new File(directoryPath + "/" + className + ".java");

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(classContent);
            System.out.println("Class " + className + " created in " + directoryPath);
        } catch (IOException e) {
            System.out.println("Error creating class " + className + ": " + e.getMessage());
        }
    }
}
