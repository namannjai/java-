public class chatgpt1 {

    public static String getNextDate(int day, int month, int year) {

        int maxDays = 31;

        if (month == 2) {
            if (year % 4 == 0) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        }

        day++;

        if (day > maxDays) {
            day = 1;
            month++;

            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return day + "-" + month + "-" + (2000 + year);
    }

    public static void main(String[] args) {

        // Test cases
        int[][] testCases = {
            {1, 9, 15},
            {30, 4, 21},
            {31, 7, 22},
            {28, 2, 21},
            {28, 2, 20},
            {29, 2, 20},
            {31, 12, 15},
            {9, 1, 3},
            {30, 9, 10},
            {31, 1, 5}
        };

        String[] expected = {
            "2-9-2015",
            "1-5-2021",
            "1-8-2022",
            "1-3-2021",
            "29-2-2020",
            "1-3-2020",
            "1-1-2016",
            "10-1-2003",
            "1-10-2010",
            "1-2-2005"
        };

        // Run tests
        for (int i = 0; i < testCases.length; i++) {
            int d = testCases[i][0];
            int m = testCases[i][1];
            int y = testCases[i][2];

            String result = getNextDate(d, m, y);

            if (result.equals(expected[i])) {
                System.out.println("✅ Test " + (i+1) + " Passed: " + result);
            } else {
                System.out.println("❌ Test " + (i+1) + " Failed: Got " + result + ", Expected " + expected[i]);
            }
        }
    }
}