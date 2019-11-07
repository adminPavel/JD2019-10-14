package by.it.bodukhin.jd01_04;

public class TaskC {
    public static void main(String[] args) {
        String line = "12 43 -21 78 -145 123 9";
        buildOneDimArray(line);
    }

    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);

        double first = array[0];
        double last = array[array.length-1];

        System.out.println("Unsorted array");
        InOut.printArray(array, "V", 5);
        double[] sortedarray = mergeSort(array);
        System.out.println("Sorted array");
        InOut.printArray(sortedarray, "V", 5);

        System.out.println("first element=" +binarySearch(sortedarray, first));
        System.out.println("last element=" +binarySearch(sortedarray, last));
    }

    static int binarySearch(double[] sortedarray, double value) {
        int firstIndex = 0;
        int lastIndex = sortedarray.length-1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if(sortedarray[middleIndex] == value) {
                return middleIndex;
            }
            else if (sortedarray[middleIndex] < value) {
                firstIndex = middleIndex + 1;
            }
            else if (sortedarray[middleIndex] > value) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    static double[] mergeSort(double[] array) {
        int right = array.length;
        if (right < 2) {
            return array;
        }
        int left = right / 2;
        double[] part1 = new double[array.length/2];
        System.arraycopy(array, 0, part1,0, left);
        double[] part2 = new double[array.length-array.length/2];
        System.arraycopy(array, left, part2,0,
                array.length-array.length/2);
        return merge((mergeSort(part1)), (mergeSort(part2)));
    }

    static double[] merge(double[] part1, double[] part2) {
        int len_1 = part1.length, len_2 = part2.length;
        int a = 0, b = 0;
        int len = len_1 + len_2;
        double[] result = new double[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (part1[a] > part2[b]) {
                    result[i] = part2[b++];
                } else result[i] = part1[a++];
            } else if (b < len_2) {
                result[i] = part2[b++];
            } else {
                result[i] = part1[a++];
            }
        }
        return result;
    }
}

