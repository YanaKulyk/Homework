package yana.kulyk.theme5;

public class HomeworkTask1 {
    public static void main(String[] args) {
        System.out.println(isMyTicketLucky("157238"));
    }

    public static boolean isMyTicketLucky(String ticketNumber) {
        int blockLength = ticketNumber.length() / 2;
//        int sum = 0;
//        for (int i = 0; i < blockLength; i++) {
//            sum += ticketNumber.charAt(i) - ticketNumber.charAt(blockLength + i);
//        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < blockLength; i++) {
            sum1 += Integer.valueOf(String.valueOf(ticketNumber.charAt(i)));
            sum2 += Integer.valueOf(String.valueOf(ticketNumber.charAt(blockLength + i)));
        }
        return sum1 == sum2;

    }
}
