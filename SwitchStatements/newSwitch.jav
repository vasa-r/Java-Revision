class Switch{
    public static void main(String[] arg){
        int day = 3;

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println("The day is: " + dayName);

    }
}